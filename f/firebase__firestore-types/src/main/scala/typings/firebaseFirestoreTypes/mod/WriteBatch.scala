package typings.firebaseFirestoreTypes.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "WriteBatch")
@js.native
/* private */ class WriteBatch () extends StObject {
  
  def commit(): js.Promise[Unit] = js.native
  
  def delete(documentRef: DocumentReference[js.Any]): WriteBatch = js.native
  
  def set[T](documentRef: DocumentReference[T], data: T): WriteBatch = js.native
  def set[T](documentRef: DocumentReference[T], data: Partial[T], options: SetOptions): WriteBatch = js.native
  
  def update(documentRef: DocumentReference[js.Any], data: UpdateData): WriteBatch = js.native
  def update(documentRef: DocumentReference[js.Any], field: String, value: js.Any, moreFieldsAndValues: js.Any*): WriteBatch = js.native
  def update(
    documentRef: DocumentReference[js.Any],
    field: FieldPath,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): WriteBatch = js.native
}
