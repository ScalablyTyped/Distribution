package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "Transaction")
@js.native
class Transaction protected () extends js.Object {
  def delete(documentRef: DocumentReference[_]): Transaction = js.native
  def get[T](documentRef: DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = js.native
  def set[T](documentRef: DocumentReference[T], data: T): Transaction = js.native
  def set[T](documentRef: DocumentReference[T], data: T, options: SetOptions): Transaction = js.native
  def update(documentRef: DocumentReference[_], data: UpdateData): Transaction = js.native
  def update(documentRef: DocumentReference[_], field: String, value: js.Any, moreFieldsAndValues: js.Any*): Transaction = js.native
  def update(documentRef: DocumentReference[_], field: FieldPath, value: js.Any, moreFieldsAndValues: js.Any*): Transaction = js.native
}

