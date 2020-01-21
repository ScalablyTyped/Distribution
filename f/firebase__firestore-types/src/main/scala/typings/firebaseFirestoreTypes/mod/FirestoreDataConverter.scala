package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirestoreDataConverter[T] extends js.Object {
  def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData], options: SnapshotOptions): T
  def toFirestore(modelObject: T): DocumentData
}

object FirestoreDataConverter {
  @scala.inline
  def apply[T](
    fromFirestore: (QueryDocumentSnapshot[DocumentData], SnapshotOptions) => T,
    toFirestore: T => DocumentData
  ): FirestoreDataConverter[T] = {
    val __obj = js.Dynamic.literal(fromFirestore = js.Any.fromFunction2(fromFirestore), toFirestore = js.Any.fromFunction1(toFirestore))
  
    __obj.asInstanceOf[FirestoreDataConverter[T]]
  }
}

