package typings.firebaseFirestore.liteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/internal", "DocumentReference")
@js.native
open class DocumentReference[T] protected () extends StObject {
  def this(
    firestore: Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: Null,
    _key: DocumentKey
  ) = this()
  /** @hideconstructor */
  def this(
    firestore: Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: FirestoreDataConverter[T],
    _key: DocumentKey
  ) = this()
  
  val _key: DocumentKey = js.native
  
  def _path: ResourcePath = js.native
  
  /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  val converter: FirestoreDataConverter[T] | Null = js.native
  
  /**
    * The {@link Firestore} instance the document is in.
    * This is useful for performing transactions, for example.
    */
  val firestore: Firestore = js.native
  
  /**
    * The document's identifier within its collection.
    */
  def id: String = js.native
  
  /**
    * The collection this `DocumentReference` belongs to.
    */
  def parent: CollectionReference[T] = js.native
  
  /**
    * A string representing the path of the referenced document (relative
    * to the root of the database).
    */
  def path: String = js.native
  
  /** The type of this Firestore reference. */
  val `type`: /* "document" */ String = js.native
  
  /**
    * Removes the current converter.
    *
    * @param converter - `null` removes the current converter.
    * @returns A `DocumentReference<DocumentData>` that does not use a converter.
    */
  def withConverter(converter: Null): DocumentReference[DocumentData] = js.native
  /**
    * Applies a custom data converter to this `DocumentReference`, allowing you
    * to use your own custom model objects with Firestore. When you call {@link
    * @firebase/firestore/lite#(setDoc:1)}, {@link @firebase/firestore/lite#getDoc}, etc. with the returned `DocumentReference`
    * instance, the provided converter will convert between Firestore data and
    * your custom type `U`.
    *
    * @param converter - Converts objects to and from Firestore.
    * @returns A `DocumentReference<U>` that uses the provided converter.
    */
  def withConverter[U](converter: FirestoreDataConverter[U]): DocumentReference[U] = js.native
}
