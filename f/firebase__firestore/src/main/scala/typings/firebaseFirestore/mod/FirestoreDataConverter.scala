package typings.firebaseFirestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirestoreDataConverter[T] extends StObject {
  
  /**
    * Called by the Firestore SDK to convert Firestore data into an object of
    * type T. You can access your data by calling: `snapshot.data(options)`.
    *
    * @param snapshot - A `QueryDocumentSnapshot` containing your data and metadata.
    * @param options - The `SnapshotOptions` from the initial call to `data()`.
    */
  def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData]): T = js.native
  def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData], options: SnapshotOptions): T = js.native
  
  /**
    * Called by the Firestore SDK to convert a custom model object of type `T`
    * into a plain JavaScript object (suitable for writing directly to the
    * Firestore database). Used with {@link (setDoc:1)}, {@link (WriteBatch.set:1)}
    * and {@link (Transaction.set:1)} with `merge:true` or `mergeFields`.
    *
    * The `PartialWithFieldValue<T>` type extends `Partial<T>` to allow
    * FieldValues such as {@link (arrayUnion:1)} to be used as property values.
    * It also supports nested `Partial` by allowing nested fields to be
    * omitted.
    */
  def toFirestore(modelObject: PartialWithFieldValue[T], options: SetOptions): DocumentData = js.native
  /**
    * Called by the Firestore SDK to convert a custom model object of type `T`
    * into a plain JavaScript object (suitable for writing directly to the
    * Firestore database). To use `set()` with `merge` and `mergeFields`,
    * `toFirestore()` must be defined with `PartialWithFieldValue<T>`.
    *
    * The `WithFieldValue<T>` type extends `T` to also allow FieldValues such as
    * {@link (deleteField:1)} to be used as property values.
    */
  def toFirestore(modelObject: WithFieldValue[T]): DocumentData = js.native
}
