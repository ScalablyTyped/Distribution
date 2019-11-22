package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "WriteBatch")
@js.native
class WriteBatch protected () extends js.Object {
  def commit(): js.Promise[Unit] = js.native
  def delete(documentRef: DocumentReference): WriteBatch = js.native
  def set(documentRef: DocumentReference, data: DocumentData): WriteBatch = js.native
  def set(documentRef: DocumentReference, data: DocumentData, options: SetOptions): WriteBatch = js.native
  def update(documentRef: DocumentReference, data: UpdateData): WriteBatch = js.native
  def update(documentRef: DocumentReference, field: String, value: js.Any, moreFieldsAndValues: js.Any*): WriteBatch = js.native
  def update(documentRef: DocumentReference, field: FieldPath, value: js.Any, moreFieldsAndValues: js.Any*): WriteBatch = js.native
}

