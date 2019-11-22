package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "Transaction")
@js.native
class Transaction protected () extends js.Object {
  def delete(documentRef: DocumentReference): Transaction = js.native
  def get(documentRef: DocumentReference): js.Promise[DocumentSnapshot] = js.native
  def set(documentRef: DocumentReference, data: DocumentData): Transaction = js.native
  def set(documentRef: DocumentReference, data: DocumentData, options: SetOptions): Transaction = js.native
  def update(documentRef: DocumentReference, data: UpdateData): Transaction = js.native
  def update(documentRef: DocumentReference, field: String, value: js.Any, moreFieldsAndValues: js.Any*): Transaction = js.native
  def update(documentRef: DocumentReference, field: FieldPath, value: js.Any, moreFieldsAndValues: js.Any*): Transaction = js.native
}

