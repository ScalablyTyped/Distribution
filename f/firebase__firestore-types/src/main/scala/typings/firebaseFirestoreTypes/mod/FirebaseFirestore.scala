package typings.firebaseFirestoreTypes.mod

import typings.firebaseFirestoreTypes.anon.Delete
import typings.firebaseFirestoreTypes.anon.Error
import typings.firebaseFirestoreTypes.anon.MockUserToken
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "FirebaseFirestore")
@js.native
/* private */ open class FirebaseFirestore () extends StObject {
  
  var INTERNAL: Delete = js.native
  
  var app: Any = js.native
  
  def batch(): WriteBatch = js.native
  
  def clearPersistence(): js.Promise[Unit] = js.native
  
  def collection(collectionPath: String): CollectionReference[DocumentData] = js.native
  
  def collectionGroup(collectionId: String): Query[DocumentData] = js.native
  
  def disableNetwork(): js.Promise[Unit] = js.native
  
  def doc(documentPath: String): DocumentReference[DocumentData] = js.native
  
  def enableNetwork(): js.Promise[Unit] = js.native
  
  def enablePersistence(): js.Promise[Unit] = js.native
  def enablePersistence(settings: PersistenceSettings): js.Promise[Unit] = js.native
  
  def loadBundle(bundleData: String): LoadBundleTask = js.native
  def loadBundle(bundleData: js.typedarray.ArrayBuffer): LoadBundleTask = js.native
  def loadBundle(bundleData: ReadableStream[js.typedarray.Uint8Array]): LoadBundleTask = js.native
  
  def namedQuery(name: String): js.Promise[Query[DocumentData] | Null] = js.native
  
  def onSnapshotsInSync(observer: Error): js.Function0[Unit] = js.native
  def onSnapshotsInSync(onSync: js.Function0[Unit]): js.Function0[Unit] = js.native
  
  def runTransaction[T](updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]]): js.Promise[T] = js.native
  
  def settings(settings: Settings): Unit = js.native
  
  def terminate(): js.Promise[Unit] = js.native
  
  def useEmulator(host: String, port: Double): Unit = js.native
  def useEmulator(host: String, port: Double, options: MockUserToken): Unit = js.native
  
  def waitForPendingWrites(): js.Promise[Unit] = js.native
}
