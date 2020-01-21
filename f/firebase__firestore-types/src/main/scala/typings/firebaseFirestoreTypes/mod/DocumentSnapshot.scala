package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "DocumentSnapshot")
@js.native
class DocumentSnapshot[T] protected () extends js.Object {
  val exists: Boolean = js.native
  val id: String = js.native
  val metadata: SnapshotMetadata = js.native
  val ref: DocumentReference[T] = js.native
  def data(): js.UndefOr[T] = js.native
  def data(options: SnapshotOptions): js.UndefOr[T] = js.native
  def get(fieldPath: String): js.Any = js.native
  def get(fieldPath: String, options: SnapshotOptions): js.Any = js.native
  def get(fieldPath: FieldPath): js.Any = js.native
  def get(fieldPath: FieldPath, options: SnapshotOptions): js.Any = js.native
  def isEqual(other: DocumentSnapshot[T]): Boolean = js.native
}

