package typings.dexie.mod.Dexie

import org.scalablytyped.runtime.StringDictionary
import typings.dexie.dexieStrings.abort
import typings.dexie.dexieStrings.complete
import typings.dexie.dexieStrings.error_
import typings.std.IDBTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  var active: Boolean = js.native
  var db: typings.dexie.mod.Dexie = js.native
  var idbtrans: IDBTransaction = js.native
  var mode: String = js.native
  @JSName("on")
  var on_Original: TransactionEvents = js.native
  var storeNames: js.Array[String] = js.native
  var tables: StringDictionary[Table[_, _]] = js.native
  def abort(): Unit = js.native
  def on(eventName: String): DexieEvent = js.native
  @JSName("on")
  def on_abort(eventName: abort, subscriber: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_complete(eventName: complete, subscriber: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_error(eventName: error_, subscriber: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def table(tableName: String): Table[_, _] = js.native
  @JSName("table")
  def table_T[T](tableName: String): Table[T, _] = js.native
  @JSName("table")
  def table_TKey[T, Key](tableName: String): Table[T, Key] = js.native
}

