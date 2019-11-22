package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "CollectionReference")
@js.native
class CollectionReference protected () extends Query {
  val id: String = js.native
  val parent: DocumentReference | Null = js.native
  val path: String = js.native
  def add(data: DocumentData): js.Promise[DocumentReference] = js.native
  def doc(): DocumentReference = js.native
  def doc(documentPath: String): DocumentReference = js.native
  def isEqual(other: CollectionReference): Boolean = js.native
}

