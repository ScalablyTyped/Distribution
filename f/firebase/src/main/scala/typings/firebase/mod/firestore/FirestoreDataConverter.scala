package typings.firebase.mod.firestore

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirestoreDataConverter[T] extends js.Object {
  /**
    * Called by the Firestore SDK to convert Firestore data into an object of
    * type T. You can access your data by calling: `snapshot.data(options)`.
    *
    * @param snapshot A QueryDocumentSnapshot containing your data and metadata.
    * @param options The SnapshotOptions from the initial call to `data()`.
    */
  def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData], options: SnapshotOptions): T = js.native
  /**
    * Called by the Firestore SDK to convert a custom model object of type T
    * into a plain Javascript object (suitable for writing directly to the
    * Firestore database). To use `set()` with `merge` and `mergeFields`,
    * `toFirestore()` must be defined with `Partial<T>`.
    */
  def toFirestore(modelObject: T): DocumentData = js.native
  def toFirestore(modelObject: Partial[T], options: SetOptions): DocumentData = js.native
}

