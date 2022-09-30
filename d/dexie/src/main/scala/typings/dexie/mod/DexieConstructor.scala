package typings.dexie.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.dexie.dexieStrings.storagemutated
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DexieConstructor
  extends StObject
     with DexieExceptionClasses
     with Instantiable1[/* databaseName */ String, Dexie]
     with Instantiable2[/* databaseName */ String, /* options */ DexieOptions, Dexie] {
  
  var default: Dexie = js.native
  
  //TableSchema: {}; // Deprecate!
  //IndexSpec: {new():IndexSpec}; //? Deprecate
  def Events(): DexieEventSet = js.native
  def Events(ctx: Any): DexieEventSet = js.native
  
  // Work-around for different build tools handling default imports differently.
  var Promise: PromiseExtendedConstructor = js.native
  
  var addons: js.Array[js.Function1[/* db */ Dexie, Unit]] = js.native
  
  def asap(fn: js.Function): Unit = js.native
  
  var currentTransaction: Transaction = js.native
  
  def deepClone[T](obj: T): T = js.native
  
  def delByKeyPath(obj: js.Object, keyPath: String): Unit = js.native
  
  def delete(dbName: String): js.Promise[Unit] = js.native
  
  var dependencies: DexieDOMDependencies = js.native
  
  var errnames: DexieErrors = js.native
  
  def exists(dbName: String): js.Promise[Boolean] = js.native
  
  def extendObservabilitySet(target: ObservabilitySet, newSet: ObservabilitySet): ObservabilitySet = js.native
  
  // ?
  def getByKeyPath(obj: js.Object, keyPath: String): Any = js.native
  
  def getDatabaseNames(): js.Promise[js.Array[String]] = js.native
  def getDatabaseNames[R](thenShortcut: ThenShortcut[js.Array[String], R]): js.Promise[R] = js.native
  
  def ignoreTransaction[U](fn: js.Function0[U]): U = js.native
  
  def liveQuery[T](fn: js.Function0[T | js.Promise[T]]): Observable[T] = js.native
  
  //?
  var maxKey: js.Array[js.Array[Unit]] | String = js.native
  
  var minKey: Double = js.native
  
  def on(eventName: String): DexieEvent = js.native
  @JSName("on")
  var on_Original: GlobalDexieEvents = js.native
  @JSName("on")
  def on_storagemutated(eventName: storagemutated, subscriber: js.Function1[/* parts */ ObservabilitySet, Any]): Unit = js.native
  
  def `override`[F](origFunc: F, overridedFactory: js.Function1[/* fn */ Any, Any]): F = js.native
  
  var semVer: String = js.native
  
  def setByKeyPath(obj: js.Object, keyPath: String, value: Any): Unit = js.native
  
  def shallowClone[T](obj: T): T = js.native
  
  var version: Double = js.native
  
  def vip[U](scopeFunction: js.Function0[U]): U = js.native
  
  def waitFor[T](promise: T): js.Promise[T] = js.native
  def waitFor[T](promise: T, timeoutMilliseconds: Double): js.Promise[T] = js.native
  def waitFor[T](promise: PromiseLike[T]): js.Promise[T] = js.native
  def waitFor[T](promise: PromiseLike[T], timeoutMilliseconds: Double): js.Promise[T] = js.native
}
