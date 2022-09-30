package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirestoreDataConverter[T] extends StObject {
  
  /**
    * Called by the Firestore SDK to convert Firestore data into an object of
    * type T.
    */
  def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData]): T = js.native
  
  /**
    * Called by the Firestore SDK to convert a custom model object of type T
    * into a plain Javascript object (suitable for writing directly to the
    * Firestore database). To use set() with `merge` and `mergeFields`,
    * toFirestore() must be defined with `Partial<T>`.
    *
    * The `PartialWithFieldValue<T>` type extends `Partial<T>` to allow
    * FieldValues such as `FieldValue.delete()` to be used as property values.
    * It also supports nested `Partial` by allowing nested fields to be
    * omitted.
    */
  def toFirestore(modelObject: PartialWithFieldValue[T], options: SetOptions): DocumentData = js.native
  /**
    * Called by the Firestore SDK to convert a custom model object of type T
    * into a plain Javascript object (suitable for writing directly to the
    * Firestore database). To use set() with `merge` and `mergeFields`,
    * toFirestore() must be defined with `Partial<T>`.
    *
    * The `WithFieldValue<T>` type extends `T` to also allow FieldValues such
    * as `FieldValue.delete()` to be used as property values.
    */
  def toFirestore(modelObject: WithFieldValue[T]): DocumentData = js.native
}
