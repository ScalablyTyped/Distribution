package typings.dexie.dexieMod.Dexie

import org.scalablytyped.runtime.Instantiable0
import typings.dexie.Anon_IDBKeyRangeIndexedDB
import typings.dexie.dexieMod.ThenShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "Dexie")
@js.native
object ^ extends js.Object {
  var Promise: DexiePromiseConstructor = js.native
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(IndexSpec, Events) */ var TableSchema: Instantiable0[typings.dexie.dexieMod.Dexie.TableSchema] = js.native
  var addons: js.Array[js.Function1[/* db */ this.type, Unit]] = js.native
  var currentTransaction: Transaction = js.native
  var default: typings.dexie.dexieMod.Dexie = js.native
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

