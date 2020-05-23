package typings.dexie.mod

import org.scalablytyped.runtime.Instantiable0
import typings.dexie.anon.Addons
import typings.dexie.dexieStrings.blocked
import typings.dexie.dexieStrings.populate
import typings.dexie.dexieStrings.ready
import typings.dexie.dexieStrings.versionchange
import typings.dexie.mod.Dexie.Collection
import typings.dexie.mod.Dexie.DbEvents
import typings.dexie.mod.Dexie.DexieEvent
import typings.dexie.mod.Dexie.Promise
import typings.dexie.mod.Dexie.Table
import typings.dexie.mod.Dexie.Transaction
import typings.dexie.mod.Dexie.Version
import typings.dexie.mod.Dexie.WhereClause
import typings.std.IDBDatabase
import typings.std.IDBVersionChangeEvent
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "Dexie")
@js.native
class Dexie_ protected () extends js.Object {
  def this(databaseName: String) = this()
  def this(databaseName: String, options: Addons) = this()
  var Collection: Instantiable0[Collection[js.Any, js.Any]] = js.native
  // Make it possible to touch physical class constructors where they reside - as properties on db instance.
  // For example, checking if (x instanceof db.Table). Can't do (x instanceof Dexie.Table because it's just a virtual interface)
  var Table: Instantiable0[Table[js.Any, js.Any]] = js.native
  var Transaction: Instantiable0[Transaction] = js.native
  var Version: Instantiable0[Version] = js.native
  var WhereClause: Instantiable0[WhereClause[js.Any, js.Any]] = js.native
  val name: String = js.native
  @JSName("on")
  var on_Original: DbEvents = js.native
  val tables: js.Array[Table[_, _]] = js.native
  val verno: Double = js.native
  def backendDB(): IDBDatabase = js.native
  def close(): Unit = js.native
  def delete(): Promise[Unit] = js.native
  def dynamicallyOpened(): Boolean = js.native
  def hasBeenClosed(): Boolean = js.native
  def hasFailed(): Boolean = js.native
  def isOpen(): Boolean = js.native
  def on(eventName: String): DexieEvent = js.native
  @JSName("on")
  def on_blocked(eventName: blocked, subscriber: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_populate(eventName: populate, subscriber: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_ready(eventName: ready, subscriber: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_ready(eventName: ready, subscriber: js.Function0[_], bSticky: Boolean): Unit = js.native
  @JSName("on")
  def on_versionchange(eventName: versionchange, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
  def open(): Promise[Dexie] = js.native
  def table(tableName: String): Table[_, _] = js.native
  @JSName("table")
  def table_T[T](tableName: String): Table[T, _] = js.native
  @JSName("table")
  def table_TKey[T, Key](tableName: String): Table[T, Key] = js.native
  def transaction[U](mode: TransactionMode, tables: js.Array[Table[_, _]], scope: js.Function0[js.Thenable[U] | U]): Promise[U] = js.native
  def transaction[U](mode: TransactionMode, table: Table[_, _], scope: js.Function0[js.Thenable[U] | U]): Promise[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, _],
    table2: Table[_, _],
    scope: js.Function0[js.Thenable[U] | U]
  ): Promise[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, _],
    table2: Table[_, _],
    table3: Table[_, _],
    scope: js.Function0[js.Thenable[U] | U]
  ): Promise[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, _],
    table2: Table[_, _],
    table3: Table[_, _],
    table4: Table[_, _],
    scope: js.Function0[js.Thenable[U] | U]
  ): Promise[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, _],
    table2: Table[_, _],
    table3: Table[_, _],
    table4: Table[_, _],
    table5: Table[_, _],
    scope: js.Function0[js.Thenable[U] | U]
  ): Promise[U] = js.native
  def version(versionNumber: Number): Version = js.native
  def vip[U](scopeFunction: js.Function0[U]): U = js.native
}

