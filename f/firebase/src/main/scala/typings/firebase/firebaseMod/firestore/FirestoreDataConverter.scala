package typings.firebase.firebaseMod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirestoreDataConverter[T] extends js.Object {
  /**
    * Called by the Firestore SDK to convert Firestore data into an object of
    * type T. You can access your data by calling: `snapshot.data(options)`.
    *
    * @param snapshot A QueryDocumentSnapshot containing your data and metadata.
    * @param options The SnapshotOptions from the initial call to `data()`.
    */
  def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData], options: SnapshotOptions): T
  /**
    * Called by the Firestore SDK to convert a custom model object of type T
    * into a plain Javascript object (suitable for writing directly to the
    * Firestore database).
    */
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

