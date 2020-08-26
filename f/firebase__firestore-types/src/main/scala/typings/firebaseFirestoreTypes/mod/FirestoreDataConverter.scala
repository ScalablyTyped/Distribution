package typings.firebaseFirestoreTypes.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirestoreDataConverter[T] extends js.Object {
  def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData], options: SnapshotOptions): T = js.native
  def toFirestore(modelObject: T): DocumentData = js.native
  def toFirestore(modelObject: Partial[T], options: SetOptions): DocumentData = js.native
}

