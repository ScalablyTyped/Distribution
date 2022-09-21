package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/private", "DocumentReference")
@js.native
open class DocumentReference[T] protected () extends StObject {
  def this(
    firestore: Firestore2,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: Null,
    _key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any
  ) = this()
  /** @hideconstructor */
  def this(
    firestore: Firestore2,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: FirestoreDataConverter2[T],
    _key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any
  ) = this()
  
  val _key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any = js.native
  
  def _path: Any = js.native
  
  /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  val converter: FirestoreDataConverter2[T] | Null = js.native
  
  /**
    * The {@link Firestore} instance the document is in.
    * This is useful for performing transactions, for example.
    */
  val firestore: Firestore2 = js.native
  
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
  def withConverter[U](converter: FirestoreDataConverter2[U]): DocumentReference[U] = js.native
}
