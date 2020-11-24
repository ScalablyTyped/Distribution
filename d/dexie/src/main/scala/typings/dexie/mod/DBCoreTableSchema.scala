package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBCoreTableSchema extends js.Object {
  
  def getIndexByKeyPath(): js.UndefOr[DBCoreIndex] = js.native
  def getIndexByKeyPath(keyPath: String): js.UndefOr[DBCoreIndex] = js.native
  def getIndexByKeyPath(keyPath: js.Array[String]): js.UndefOr[DBCoreIndex] = js.native
  
  val indexes: js.Array[DBCoreIndex] = js.native
  
  val name: String = js.native
  
  val primaryKey: DBCoreIndex = js.native
}
