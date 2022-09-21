package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "DocumentSnapshot")
@js.native
/* protected */ open class DocumentSnapshot[T] () extends StObject {
  
  def data(): js.UndefOr[T] = js.native
  def data(options: SnapshotOptions): js.UndefOr[T] = js.native
  
  val exists: Boolean = js.native
  
  def get(fieldPath: String): Any = js.native
  def get(fieldPath: String, options: SnapshotOptions): Any = js.native
  def get(fieldPath: FieldPath): Any = js.native
  def get(fieldPath: FieldPath, options: SnapshotOptions): Any = js.native
  
  val id: String = js.native
  
  def isEqual(other: DocumentSnapshot[T]): Boolean = js.native
  
  val metadata: SnapshotMetadata = js.native
  
  val ref: DocumentReference[T] = js.native
}
