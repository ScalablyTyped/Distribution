package typings.firebaseFirestoreTypes.mod

import typings.firebaseFirestoreTypes.anon.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "DocumentReference")
@js.native
class DocumentReference[T] protected () extends js.Object {
  
  def collection(collectionPath: String): CollectionReference[DocumentData] = js.native
  
  def delete(): js.Promise[Unit] = js.native
  
  val firestore: FirebaseFirestore = js.native
  
  def get(): js.Promise[DocumentSnapshot[T]] = js.native
  def get(options: GetOptions): js.Promise[DocumentSnapshot[T]] = js.native
  
  val id: String = js.native
  
  def isEqual(other: DocumentReference[T]): Boolean = js.native
  
  def onSnapshot(observer: Error[T]): js.Function0[Unit] = js.native
  def onSnapshot(onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ FirestoreError, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(options: SnapshotListenOptions, observer: Error[T]): js.Function0[Unit] = js.native
  def onSnapshot(options: SnapshotListenOptions, onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ FirestoreError, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  
  val parent: CollectionReference[T] = js.native
  
  val path: String = js.native
  
  def set(data: T): js.Promise[Unit] = js.native
  def set(data: Partial[T], options: SetOptions): js.Promise[Unit] = js.native
  
  def update(data: UpdateData): js.Promise[Unit] = js.native
  def update(field: String, value: js.Any, moreFieldsAndValues: js.Any*): js.Promise[Unit] = js.native
  def update(field: FieldPath, value: js.Any, moreFieldsAndValues: js.Any*): js.Promise[Unit] = js.native
  
  def withConverter[U](converter: FirestoreDataConverter[U]): DocumentReference[U] = js.native
}
