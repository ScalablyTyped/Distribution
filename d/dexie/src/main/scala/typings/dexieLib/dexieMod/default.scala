package typings
package dexieLib.dexieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", JSImport.Default)
@js.native
class default protected () extends Dexie {
  def this(databaseName: java.lang.String) = this()
  def this(databaseName: java.lang.String, options: dexieLib.Anon_Addons) = this()
}

/* static members */
@JSImport("dexie", JSImport.Default)
@js.native
object default extends js.Object {
  var addons: js.Array[js.Function1[/* db */ dexieLib.dexieMod.Dexie, scala.Unit]] = js.native
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
  def getDatabaseNames[R](thenShortcut: dexieLib.dexieMod.ThenShortcut[js.Array[java.lang.String], R]): dexieLib.dexieMod.DexieNs.Promise[R] = js.native
  def `override`[F](origFunc: F, overridedFactory: js.Function1[/* fn */ js.Any, _]): F = js.native
  def setByKeyPath(obj: js.Object, keyPath: java.lang.String, value: js.Any): scala.Unit = js.native
  def shallowClone[T](obj: T): T = js.native
  def waitFor[T](promise: T): dexieLib.dexieMod.DexieNs.Promise[T] = js.native
  def waitFor[T](promise: T, timeoutMilliseconds: scala.Double): dexieLib.dexieMod.DexieNs.Promise[T] = js.native
  def waitFor[T](promise: js.Thenable[T]): dexieLib.dexieMod.DexieNs.Promise[T] = js.native
  def waitFor[T](promise: js.Thenable[T], timeoutMilliseconds: scala.Double): dexieLib.dexieMod.DexieNs.Promise[T] = js.native
}

