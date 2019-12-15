package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "CollectionReference")
@js.native
class CollectionReference[T] protected () extends Query[T] {
  val id: String = js.native
  val parent: DocumentReference[DocumentData] | Null = js.native
  val path: String = js.native
  def add(data: T): js.Promise[DocumentReference[T]] = js.native
  def doc(): DocumentReference[T] = js.native
  def doc(documentPath: String): DocumentReference[T] = js.native
  def isEqual(other: CollectionReference[T]): Boolean = js.native
}

