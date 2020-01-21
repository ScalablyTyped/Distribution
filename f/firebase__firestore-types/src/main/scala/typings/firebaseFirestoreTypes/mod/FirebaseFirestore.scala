package typings.firebaseFirestoreTypes.mod

import typings.firebaseFirestoreTypes.AnonComplete
import typings.firebaseFirestoreTypes.AnonDelete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "FirebaseFirestore")
@js.native
class FirebaseFirestore protected () extends js.Object {
  var INTERNAL: AnonDelete = js.native
  var app: js.Any = js.native
  def batch(): WriteBatch = js.native
  def clearPersistence(): js.Promise[Unit] = js.native
  def collection(collectionPath: String): CollectionReference[DocumentData] = js.native
  def collectionGroup(collectionId: String): Query[DocumentData] = js.native
  def disableNetwork(): js.Promise[Unit] = js.native
  def doc(documentPath: String): DocumentReference[DocumentData] = js.native
  def enableNetwork(): js.Promise[Unit] = js.native
  def enablePersistence(): js.Promise[Unit] = js.native
  def enablePersistence(settings: PersistenceSettings): js.Promise[Unit] = js.native
  def onSnapshotsInSync(observer: AnonComplete): js.Function0[Unit] = js.native
  def onSnapshotsInSync(onSync: js.Function0[Unit]): js.Function0[Unit] = js.native
  def runTransaction[T](updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]]): js.Promise[T] = js.native
  def settings(settings: Settings): Unit = js.native
  def terminate(): js.Promise[Unit] = js.native
  def waitForPendingWrites(): js.Promise[Unit] = js.native
}

