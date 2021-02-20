package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "CollectionReference")
@js.native
class CollectionReference[T] protected () extends Query[T] {
  
  def add(data: T): js.Promise[DocumentReference[T]] = js.native
  
  def doc(): DocumentReference[T] = js.native
  def doc(documentPath: String): DocumentReference[T] = js.native
  
  val id: String = js.native
  
  def isEqual(other: CollectionReference[T]): Boolean = js.native
  
  val parent: DocumentReference[DocumentData] | Null = js.native
  
  val path: String = js.native
}
