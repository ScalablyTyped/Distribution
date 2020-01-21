package typings.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirestoreDataConverter[T] extends js.Object {
  /**
    * Called by the Firestore SDK to convert Firestore data into an object of
    * type T.
    */
  def fromFirestore(data: DocumentData): T
  /**
    * Called by the Firestore SDK to convert a custom model object of type T
    * into a plain Javascript object (suitable for writing directly to the
    * Firestore database).
    */
  def toFirestore(modelObject: T): DocumentData
}

object FirestoreDataConverter {
  @scala.inline
  def apply[T](fromFirestore: DocumentData => T, toFirestore: T => DocumentData): FirestoreDataConverter[T] = {
    val __obj = js.Dynamic.literal(fromFirestore = js.Any.fromFunction1(fromFirestore), toFirestore = js.Any.fromFunction1(toFirestore))
  
    __obj.asInstanceOf[FirestoreDataConverter[T]]
  }
}

