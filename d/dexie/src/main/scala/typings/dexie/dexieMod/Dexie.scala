package typings.dexie.dexieMod

import org.scalablytyped.runtime.Instantiable0
import typings.dexie.Anon_Addons
import typings.dexie.Anon_IDBKeyRangeIndexedDB
import typings.dexie.dexieMod.DexieNs.DbEvents
import typings.dexie.dexieMod.DexieNs.DexieEvent
import typings.dexie.dexieMod.DexieNs.Promise
import typings.dexie.dexieMod.DexieNs.Table
import typings.dexie.dexieMod.DexieNs.Transaction
import typings.dexie.dexieMod.DexieNs.Version
import typings.dexie.dexieStrings.blocked
import typings.dexie.dexieStrings.populate
import typings.dexie.dexieStrings.ready
import typings.dexie.dexieStrings.versionchange
import typings.std.IDBDatabase
import typings.std.IDBVersionChangeEvent
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "Dexie")
@js.native
class Dexie protected () extends js.Object {
  def this(databaseName: String) = this()
  def this(databaseName: String, options: Anon_Addons) = this()
  var Collection: Instantiable0[typings.dexie.dexieMod.DexieNs.Collection[js.Any, js.Any]] = js.native
  // Make it possible to touch physical class constructors where they reside - as properties on db instance.
  // For example, checking if (x instanceof db.Table). Can't do (x instanceof Dexie.Table because it's just a virtual interface)
  var Table: Instantiable0[typings.dexie.dexieMod.DexieNs.Table[js.Any, js.Any]] = js.native
  var Transaction: Instantiable0[typings.dexie.dexieMod.DexieNs.Transaction] = js.native
  var Version: Instantiable0[typings.dexie.dexieMod.DexieNs.Version] = js.native
  var WhereClause: Instantiable0[typings.dexie.dexieMod.DexieNs.WhereClause[js.Any, js.Any]] = js.native
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

/* static members */
@JSImport("dexie", "Dexie")
@js.native
object Dexie extends js.Object {
  var addons: js.Array[js.Function1[/* db */ this.type, Unit]] = js.native
  var currentTransaction: Transaction = js.native
  var default: Dexie = js.native
  var dependencies: Anon_IDBKeyRangeIndexedDB = js.native
  var maxKey: js.Array[js.Array[Unit]] | String = js.native
  var minKey: Double = js.native
  var semVer: String = js.native
  var version: Double = js.native
  def asap(fn: js.Function): Unit = js.native
  def deepClone[T](obj: T): T = js.native
  def delByKeyPath(obj: js.Object, keyPath: String): Unit = js.native
  def delete(dbName: String): Promise[Unit] = js.native
  def exists(dbName: String): Promise[Boolean] = js.native
  def getByKeyPath(obj: js.Object, keyPath: String): js.Any = js.native
  def getDatabaseNames(): Promise[js.Array[String]] = js.native
  def getDatabaseNames[R](thenShortcut: ThenShortcut[js.Array[String], R]): Promise[R] = js.native
  def `override`[F](origFunc: F, overridedFactory: js.Function1[/* fn */ js.Any, _]): F = js.native
  def setByKeyPath(obj: js.Object, keyPath: String, value: js.Any): Unit = js.native
  def shallowClone[T](obj: T): T = js.native
  def waitFor[T](promise: T): Promise[T] = js.native
  def waitFor[T](promise: T, timeoutMilliseconds: Double): Promise[T] = js.native
  def waitFor[T](promise: js.Thenable[T]): Promise[T] = js.native
  def waitFor[T](promise: js.Thenable[T], timeoutMilliseconds: Double): Promise[T] = js.native
}

