package typings.firebaseFirestore.privateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/private", "Query")
@js.native
open class Query_[T] protected () extends StObject {
  def this(
    firestore: Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: Null,
    _query: Query2
  ) = this()
  /** @hideconstructor protected */
  def this(
    firestore: Firestore,
    /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  converter: FirestoreDataConverter[T],
    _query: Query2
  ) = this()
  
  val _query: Query2 = js.native
  
  /**
    * If provided, the `FirestoreDataConverter` associated with this instance.
    */
  val converter: FirestoreDataConverter[T] | Null = js.native
  
  /**
    * The `Firestore` instance for the Firestore database (useful for performing
    * transactions, etc.).
    */
  val firestore: Firestore = js.native
  
  /** The type of this Firestore reference. */
  val `type`: typings.firebaseFirestore.firebaseFirestoreStrings.query | typings.firebaseFirestore.firebaseFirestoreStrings.collection = js.native
  
  /**
    * Removes the current converter.
    *
    * @param converter - `null` removes the current converter.
    * @returns A `Query<DocumentData>` that does not use a converter.
    */
  def withConverter(converter: Null): Query_[DocumentData] = js.native
  /**
    * Applies a custom data converter to this query, allowing you to use your own
    * custom model objects with Firestore. When you call {@link getDocs} with
    * the returned query, the provided converter will convert between Firestore
    * data and your custom type `U`.
    *
    * @param converter - Converts objects to and from Firestore.
    * @returns A `Query<U>` that uses the provided converter.
    */
  def withConverter[U](converter: FirestoreDataConverter[U]): Query_[U] = js.native
}
