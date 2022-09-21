package typings.firebaseFirestore.privateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirestoreDataConverter[T] extends StObject {
  
  /**
    * Called by the Firestore SDK to convert Firestore data into an object of
    * type T. You can access your data by calling: `snapshot.data()`.
    *
    * @param snapshot - A `QueryDocumentSnapshot` containing your data and
    * metadata.
    */
  def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData]): T = js.native
  
  /**
    * Called by the Firestore SDK to convert a custom model object of type `T`
    * into a plain Javascript object (suitable for writing directly to the
    * Firestore database). Used with {@link @firebase/firestore/lite#(setDoc:1)}, {@link @firebase/firestore/lite#(WriteBatch.set:1)}
    * and {@link @firebase/firestore/lite#(Transaction.set:1)} with `merge:true` or `mergeFields`.
    *
    * The `PartialWithFieldValue<T>` type extends `Partial<T>` to allow
    * FieldValues such as {@link (arrayUnion:1)} to be used as property values.
    * It also supports nested `Partial` by allowing nested fields to be
    * omitted.
    */
  def toFirestore(modelObject: PartialWithFieldValue[T], options: SetOptions): DocumentData = js.native
  /**
    * Called by the Firestore SDK to convert a custom model object of type `T`
    * into a plain Javascript object (suitable for writing directly to the
    * Firestore database). Used with {@link @firebase/firestore/lite#(setDoc:1)}, {@link @firebase/firestore/lite#(WriteBatch.set:1)}
    * and {@link @firebase/firestore/lite#(Transaction.set:1)}.
    *
    * The `WithFieldValue<T>` type extends `T` to also allow FieldValues such as
    * {@link (deleteField:1)} to be used as property values.
    */
  def toFirestore(modelObject: WithFieldValue[T]): DocumentData = js.native
}
