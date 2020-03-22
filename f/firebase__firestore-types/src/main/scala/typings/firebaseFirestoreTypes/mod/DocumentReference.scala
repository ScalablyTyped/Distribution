package typings.firebaseFirestoreTypes.mod

import typings.firebaseFirestoreTypes.AnonError
import typings.firebaseFirestoreTypes.AnonNext
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "DocumentReference")
@js.native
class DocumentReference[T] protected () extends js.Object {
  val firestore: FirebaseFirestore = js.native
  val id: String = js.native
  val parent: CollectionReference[T] = js.native
  val path: String = js.native
  def collection(collectionPath: String): CollectionReference[DocumentData] = js.native
  def delete(): js.Promise[Unit] = js.native
  def get(): js.Promise[DocumentSnapshot[T]] = js.native
  def get(options: GetOptions): js.Promise[DocumentSnapshot[T]] = js.native
  def isEqual(other: DocumentReference[T]): Boolean = js.native
  def onSnapshot(observer: AnonError[T]): js.Function0[Unit] = js.native
  def onSnapshot(onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ Error, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(options: SnapshotListenOptions, observer: AnonNext[T]): js.Function0[Unit] = js.native
  def onSnapshot(options: SnapshotListenOptions, onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ Error, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def set(data: T): js.Promise[Unit] = js.native
  def set(data: T, options: SetOptions): js.Promise[Unit] = js.native
  def update(data: UpdateData): js.Promise[Unit] = js.native
  def update(field: String, value: js.Any, moreFieldsAndValues: js.Any*): js.Promise[Unit] = js.native
  def update(field: FieldPath, value: js.Any, moreFieldsAndValues: js.Any*): js.Promise[Unit] = js.native
  def withConverter[U](converter: FirestoreDataConverter[U]): DocumentReference[U] = js.native
}

