package typings.dexie.mod

import typings.dexie.dexieStrings.dbcore
import typings.dexie.dexieStrings.readonly
import typings.dexie.dexieStrings.readwrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBCore extends StObject {
  
  val MAX_KEY: Any = js.native
  
  // Utility methods
  val MIN_KEY: Any = js.native
  
  val schema: DBCoreSchema = js.native
  
  var stack: dbcore = js.native
  
  def table(name: String): DBCoreTable = js.native
  
  // Transaction and Object Store
  def transaction(stores: js.Array[String], mode: readonly | readwrite): DBCoreTransaction = js.native
  def transaction(stores: js.Array[String], mode: readonly | readwrite, options: DbCoreTransactionOptions): DBCoreTransaction = js.native
}
