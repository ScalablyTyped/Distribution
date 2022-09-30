package typings.dexie.mod

import typings.dexie.dexieStrings.abort
import typings.dexie.dexieStrings.complete
import typings.dexie.dexieStrings.error
import typings.std.IDBTransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends StObject {
  
  def abort(): Unit = js.native
  
  var active: Boolean = js.native
  
  var db: Database = js.native
  
  var mode: IDBTransactionMode = js.native
  
  def on(eventName: String): DexieEvent = js.native
  @JSName("on")
  var on_Original: TransactionEvents = js.native
  @JSName("on")
  def on_abort(eventName: abort, subscriber: js.Function0[Any]): Unit = js.native
  @JSName("on")
  def on_complete(eventName: complete, subscriber: js.Function0[Any]): Unit = js.native
  @JSName("on")
  def on_error(eventName: error, subscriber: js.Function1[/* error */ Any, Any]): Unit = js.native
  
  var parent: js.UndefOr[Transaction] = js.native
  
  //tables: { [type: string]: Table<any, any> }; Deprecated since 2.0. Obsolete from v3.0.
  var storeNames: js.Array[String] = js.native
  
  def table(tableName: String): Table[Any, Any] = js.native
  @JSName("table")
  def table_T[T](tableName: String): Table[T, Any] = js.native
  @JSName("table")
  def table_TKey[T, Key](tableName: String): Table[T, Key] = js.native
}
