package typings
package dexieLib.dexieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "Dexie")
@js.native
class Dexie protected () extends js.Object {
  def this(databaseName: java.lang.String) = this()
  def this(databaseName: java.lang.String, options: dexieLib.Anon_Addons) = this()
  var Collection: org.scalablytyped.runtime.Instantiable0[dexieLib.dexieMod.DexieNs.Collection[js.Any, js.Any]] = js.native
  // Make it possible to touch physical class constructors where they reside - as properties on db instance.
  // For example, checking if (x instanceof db.Table). Can't do (x instanceof Dexie.Table because it's just a virtual interface)
  var Table: org.scalablytyped.runtime.Instantiable0[dexieLib.dexieMod.DexieNs.Table[js.Any, js.Any]] = js.native
  var Transaction: org.scalablytyped.runtime.Instantiable0[dexieLib.dexieMod.DexieNs.Transaction] = js.native
  var Version: org.scalablytyped.runtime.Instantiable0[dexieLib.dexieMod.DexieNs.Version] = js.native
  var WhereClause: org.scalablytyped.runtime.Instantiable0[dexieLib.dexieMod.DexieNs.WhereClause[js.Any, js.Any]] = js.native
  val name: java.lang.String = js.native
  @JSName("on")
  var on_Original: dexieLib.dexieMod.DexieNs.DbEvents = js.native
  val tables: js.Array[dexieLib.dexieMod.DexieNs.Table[_, _]] = js.native
  val verno: scala.Double = js.native
  def backendDB(): stdLib.IDBDatabase = js.native
  def close(): scala.Unit = js.native
  def delete(): dexieLib.dexieMod.DexieNs.Promise[scala.Unit] = js.native
  def dynamicallyOpened(): scala.Boolean = js.native
  def hasBeenClosed(): scala.Boolean = js.native
  def hasFailed(): scala.Boolean = js.native
  def isOpen(): scala.Boolean = js.native
  def on(eventName: java.lang.String): dexieLib.dexieMod.DexieNs.DexieEvent = js.native
  @JSName("on")
  def on_blocked(eventName: dexieLib.dexieLibStrings.blocked, subscriber: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_populate(eventName: dexieLib.dexieLibStrings.populate, subscriber: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_ready(eventName: dexieLib.dexieLibStrings.ready, subscriber: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_ready(eventName: dexieLib.dexieLibStrings.ready, subscriber: js.Function0[_], bSticky: scala.Boolean): scala.Unit = js.native
  @JSName("on")
  def on_versionchange(
    eventName: dexieLib.dexieLibStrings.versionchange,
    subscriber: js.Function1[/* event */ stdLib.IDBVersionChangeEvent, _]
  ): scala.Unit = js.native
  def open(): dexieLib.dexieMod.DexieNs.Promise[Dexie] = js.native
  def table(tableName: java.lang.String): dexieLib.dexieMod.DexieNs.Table[_, _] = js.native
  @JSName("table")
  def table_T[T](tableName: java.lang.String): dexieLib.dexieMod.DexieNs.Table[T, _] = js.native
  @JSName("table")
  def table_TKey[T, Key](tableName: java.lang.String): dexieLib.dexieMod.DexieNs.Table[T, Key] = js.native
  def transaction[U](
    mode: dexieLib.TransactionMode,
    table: dexieLib.dexieMod.DexieNs.Table[_, _],
    scope: js.Function0[js.Thenable[U] | U]
  ): dexieLib.dexieMod.DexieNs.Promise[U] = js.native
  def transaction[U](
    mode: dexieLib.TransactionMode,
    table: dexieLib.dexieMod.DexieNs.Table[_, _],
    table2: dexieLib.dexieMod.DexieNs.Table[_, _],
    scope: js.Function0[js.Thenable[U] | U]
  ): dexieLib.dexieMod.DexieNs.Promise[U] = js.native
  def transaction[U](
    mode: dexieLib.TransactionMode,
    table: dexieLib.dexieMod.DexieNs.Table[_, _],
    table2: dexieLib.dexieMod.DexieNs.Table[_, _],
    table3: dexieLib.dexieMod.DexieNs.Table[_, _],
    scope: js.Function0[js.Thenable[U] | U]
  ): dexieLib.dexieMod.DexieNs.Promise[U] = js.native
  def transaction[U](
    mode: dexieLib.TransactionMode,
    table: dexieLib.dexieMod.DexieNs.Table[_, _],
    table2: dexieLib.dexieMod.DexieNs.Table[_, _],
    table3: dexieLib.dexieMod.DexieNs.Table[_, _],
    table4: dexieLib.dexieMod.DexieNs.Table[_, _],
    scope: js.Function0[js.Thenable[U] | U]
  ): dexieLib.dexieMod.DexieNs.Promise[U] = js.native
  def transaction[U](
    mode: dexieLib.TransactionMode,
    table: dexieLib.dexieMod.DexieNs.Table[_, _],
    table2: dexieLib.dexieMod.DexieNs.Table[_, _],
    table3: dexieLib.dexieMod.DexieNs.Table[_, _],
    table4: dexieLib.dexieMod.DexieNs.Table[_, _],
    table5: dexieLib.dexieMod.DexieNs.Table[_, _],
    scope: js.Function0[js.Thenable[U] | U]
  ): dexieLib.dexieMod.DexieNs.Promise[U] = js.native
  def transaction[U](
    mode: dexieLib.TransactionMode,
    tables: js.Array[dexieLib.dexieMod.DexieNs.Table[_, _]],
    scope: js.Function0[js.Thenable[U] | U]
  ): dexieLib.dexieMod.DexieNs.Promise[U] = js.native
  def version(versionNumber: stdLib.Number): dexieLib.dexieMod.DexieNs.Version = js.native
  def vip[U](scopeFunction: js.Function0[U]): U = js.native
}

/* static members */
@JSImport("dexie", "Dexie")
@js.native
object Dexie extends js.Object {
  var addons: js.Array[js.Function1[/* db */ this.type, scala.Unit]] = js.native
  var currentTransaction: dexieLib.dexieMod.DexieNs.Transaction = js.native
  var default: dexieLib.dexieMod.Dexie = js.native
  var dependencies: dexieLib.Anon_IDBKeyRangeIndexedDB = js.native
  var maxKey: js.Array[js.Array[scala.Unit]] | java.lang.String = js.native
  var minKey: scala.Double = js.native
  var semVer: java.lang.String = js.native
  var version: scala.Double = js.native
  def asap(fn: js.Function): scala.Unit = js.native
  def deepClone[T](obj: T): T = js.native
  def delByKeyPath(obj: js.Object, keyPath: java.lang.String): scala.Unit = js.native
  def delete(dbName: java.lang.String): dexieLib.dexieMod.DexieNs.Promise[scala.Unit] = js.native
  def exists(dbName: java.lang.String): dexieLib.dexieMod.DexieNs.Promise[scala.Boolean] = js.native
  def getByKeyPath(obj: js.Object, keyPath: java.lang.String): js.Any = js.native
  def getDatabaseNames(): dexieLib.dexieMod.DexieNs.Promise[js.Array[java.lang.String]] = js.native
  def getDatabaseNames[R](thenShortcut: dexieLib.ThenShortcut[js.Array[java.lang.String], R]): dexieLib.dexieMod.DexieNs.Promise[R] = js.native
  def `override`[F](origFunc: F, overridedFactory: js.Function1[/* fn */ js.Any, _]): F = js.native
  def setByKeyPath(obj: js.Object, keyPath: java.lang.String, value: js.Any): scala.Unit = js.native
  def shallowClone[T](obj: T): T = js.native
  def waitFor[T](promise: T): dexieLib.dexieMod.DexieNs.Promise[T] = js.native
  def waitFor[T](promise: T, timeoutMilliseconds: scala.Double): dexieLib.dexieMod.DexieNs.Promise[T] = js.native
  def waitFor[T](promise: js.Thenable[T]): dexieLib.dexieMod.DexieNs.Promise[T] = js.native
  def waitFor[T](promise: js.Thenable[T], timeoutMilliseconds: scala.Double): dexieLib.dexieMod.DexieNs.Promise[T] = js.native
}

