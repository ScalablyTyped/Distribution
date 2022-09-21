package typings.firebaseFirestoreTypes.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "Transaction")
@js.native
/* private */ open class Transaction () extends StObject {
  
  def delete(documentRef: DocumentReference[Any]): Transaction = js.native
  
  def get[T](documentRef: DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = js.native
  
  def set[T](documentRef: DocumentReference[T], data: T): Transaction = js.native
  def set[T](documentRef: DocumentReference[T], data: Partial[T], options: SetOptions): Transaction = js.native
  
  def update(documentRef: DocumentReference[Any], data: UpdateData): Transaction = js.native
  def update(documentRef: DocumentReference[Any], field: String, value: Any, moreFieldsAndValues: Any*): Transaction = js.native
  def update(documentRef: DocumentReference[Any], field: FieldPath, value: Any, moreFieldsAndValues: Any*): Transaction = js.native
}
