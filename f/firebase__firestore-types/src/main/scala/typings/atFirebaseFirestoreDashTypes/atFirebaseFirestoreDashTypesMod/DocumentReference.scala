package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import typings.atFirebaseFirestoreDashTypes.Anon_CompleteError
import typings.atFirebaseFirestoreDashTypes.Anon_CompleteErrorNext
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "DocumentReference")
@js.native
class DocumentReference protected () extends js.Object {
  val firestore: FirebaseFirestore = js.native
  val id: String = js.native
  val parent: CollectionReference = js.native
  val path: String = js.native
  def collection(collectionPath: String): CollectionReference = js.native
  def delete(): js.Promise[Unit] = js.native
  def get(): js.Promise[DocumentSnapshot] = js.native
  def get(options: GetOptions): js.Promise[DocumentSnapshot] = js.native
  def isEqual(other: DocumentReference): Boolean = js.native
  def onSnapshot(observer: Anon_CompleteError): js.Function0[Unit] = js.native
  def onSnapshot(onNext: js.Function1[/* snapshot */ DocumentSnapshot, Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ DocumentSnapshot, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ DocumentSnapshot, Unit],
    onError: js.Function1[/* error */ Error, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(options: SnapshotListenOptions, observer: Anon_CompleteErrorNext): js.Function0[Unit] = js.native
  def onSnapshot(options: SnapshotListenOptions, onNext: js.Function1[/* snapshot */ DocumentSnapshot, Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ DocumentSnapshot, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ DocumentSnapshot, Unit],
    onError: js.Function1[/* error */ Error, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def set(data: DocumentData): js.Promise[Unit] = js.native
  def set(data: DocumentData, options: SetOptions): js.Promise[Unit] = js.native
  def update(data: UpdateData): js.Promise[Unit] = js.native
  def update(field: String, value: js.Any, moreFieldsAndValues: js.Any*): js.Promise[Unit] = js.native
  def update(field: FieldPath, value: js.Any, moreFieldsAndValues: js.Any*): js.Promise[Unit] = js.native
}

