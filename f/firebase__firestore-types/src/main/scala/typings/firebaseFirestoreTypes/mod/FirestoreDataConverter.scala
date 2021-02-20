package typings.firebaseFirestoreTypes.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirestoreDataConverter[T] extends StObject {
  
  def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData], options: SnapshotOptions): T = js.native
  
  def toFirestore(modelObject: T): DocumentData = js.native
  def toFirestore(modelObject: Partial[T], options: SetOptions): DocumentData = js.native
}
