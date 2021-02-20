package typings.firebaseFirestoreTypes.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "Transaction")
@js.native
class Transaction protected () extends StObject {
  
  def delete(documentRef: DocumentReference[_]): Transaction = js.native
  
  def get[T](documentRef: DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = js.native
  
  def set[T](documentRef: DocumentReference[T], data: T): Transaction = js.native
  def set[T](documentRef: DocumentReference[T], data: Partial[T], options: SetOptions): Transaction = js.native
  
  def update(documentRef: DocumentReference[_], data: UpdateData): Transaction = js.native
  def update(documentRef: DocumentReference[_], field: String, value: js.Any, moreFieldsAndValues: js.Any*): Transaction = js.native
  def update(documentRef: DocumentReference[_], field: FieldPath, value: js.Any, moreFieldsAndValues: js.Any*): Transaction = js.native
}
