package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentReference[T] extends StObject {
  
  /**
    * Gets a `CollectionReference` instance that refers to the collection at
    * the specified path.
    *
    * @param collectionPath A slash-separated path to a collection.
    * @return The `CollectionReference` instance.
    */
  def collection(collectionPath: String): CollectionReference[DocumentData] = js.native
  
  /**
    * Creates a document referred to by this `DocumentReference` with the
    * provided object values. The write fails if the document already exists
    *
    * @param data The object data to serialize as the document.
    * @throws Error If the provided input is not a valid Firestore document.
    * @return A Promise resolved with the write time of this create.
    */
  def create(data: WithFieldValue[T]): js.Promise[WriteResult] = js.native
  
  /**
    * Deletes the document referred to by this `DocumentReference`.
    *
    * @param precondition A Precondition to enforce for this delete.
    * @return A Promise resolved with the write time of this delete.
    */
  def delete(): js.Promise[WriteResult] = js.native
  def delete(precondition: Precondition): js.Promise[WriteResult] = js.native
  
  /**
    * The `Firestore` for the Firestore database (useful for performing
    * transactions, etc.).
    */
  val firestore: Firestore = js.native
  
  /**
    * Reads the document referred to by this `DocumentReference`.
    *
    * @return A Promise resolved with a DocumentSnapshot containing the
    * current document contents.
    */
  def get(): js.Promise[DocumentSnapshot[T]] = js.native
  
  /** The identifier of the document within its collection. */
  val id: String = js.native
  
  /**
    * Returns true if this `DocumentReference` is equal to the provided one.
    *
    * @param other The `DocumentReference` to compare against.
    * @return true if this `DocumentReference` is equal to the provided one.
    */
  def isEqual(other: DocumentReference[T]): Boolean = js.native
  
  /**
    * Fetches the subcollections that are direct children of this document.
    *
    * @returns A Promise that resolves with an array of CollectionReferences.
    */
  def listCollections(): js.Promise[js.Array[CollectionReference[DocumentData]]] = js.native
  
  /**
    * Attaches a listener for DocumentSnapshot events.
    *
    * @param onNext A callback to be called every time a new `DocumentSnapshot`
    * is available.
    * @param onError A callback to be called if the listen fails or is
    * cancelled. No further callbacks will occur.
    * @return An unsubscribe function that can be called to cancel
    * the snapshot listener.
    */
  def onSnapshot(onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): js.Function0[Unit] = js.native
  
  /**
    * A reference to the Collection to which this DocumentReference belongs.
    */
  val parent: CollectionReference[T] = js.native
  
  /**
    * A string representing the path of the referenced document (relative
    * to the root of the database).
    */
  val path: String = js.native
  
  /**
    * Writes to the document referred to by this `DocumentReference`. If the
    * document does not yet exist, it will be created. If you pass
    * `SetOptions`, the provided data can be merged into an existing document.
    *
    * @param data A map of the fields and values for the document.
    * @param options An object to configure the set behavior.
    * @param  options.merge - If true, set() merges the values specified in its
    * data argument. Fields omitted from this set() call remain untouched. If
    * your input sets any field to an empty map, all nested fields are
    * overwritten.
    * @param options.mergeFields - If provided, set() only replaces the
    * specified field paths. Any field path that is not specified is ignored
    * and remains untouched. If your input sets any field to an empty map, all
    * nested fields are overwritten.
    * @throws Error If the provided input is not a valid Firestore document.
    * @return A Promise resolved with the write time of this set.
    */
  def set(data: PartialWithFieldValue[T], options: SetOptions): js.Promise[WriteResult] = js.native
  def set(data: WithFieldValue[T]): js.Promise[WriteResult] = js.native
  
  /**
    * Updates fields in the document referred to by this `DocumentReference`.
    * The update will fail if applied to a document that does not exist.
    *
    * Nested fields can be updated by providing dot-separated field path
    * strings.
    *
    * @param data An object containing the fields and values with which to
    * update the document.
    * @param precondition A Precondition to enforce on this update.
    * @throws Error If the provided input is not valid Firestore data.
    * @return A Promise resolved with the write time of this update.
    */
  def update(data: UpdateData[T]): js.Promise[WriteResult] = js.native
  def update(data: UpdateData[T], precondition: Precondition): js.Promise[WriteResult] = js.native
  /**
    * Updates fields in the document referred to by this `DocumentReference`.
    * The update will fail if applied to a document that does not exist.
    *
    * Nested fields can be updated by providing dot-separated field path
    * strings or by providing FieldPath objects.
    *
    * A `Precondition` restricting this update can be specified as the last
    * argument.
    *
    * @param field The first field to update.
    * @param value The first value.
    * @param moreFieldsOrPrecondition An alternating list of field paths and
    * values to update, optionally followed by a `Precondition` to enforce on
    * this update.
    * @throws Error If the provided input is not valid Firestore data.
    * @return A Promise resolved with the write time of this update.
    */
  def update(field: String, value: Any, moreFieldsOrPrecondition: Any*): js.Promise[WriteResult] = js.native
  def update(field: FieldPath, value: Any, moreFieldsOrPrecondition: Any*): js.Promise[WriteResult] = js.native
  
  def withConverter(converter: Null): DocumentReference[DocumentData] = js.native
  /**
    * Applies a custom data converter to this DocumentReference, allowing you
    * to use your own custom model objects with Firestore. When you call
    * set(), get(), etc. on the returned DocumentReference instance, the
    * provided converter will convert between Firestore data and your custom
    * type U.
    *
    * @param converter Converts objects to and from Firestore. Passing in
    * `null` removes the current converter.
    * @return A DocumentReference<U> that uses the provided converter.
    */
  def withConverter[U](converter: FirestoreDataConverter[U]): DocumentReference[U] = js.native
}
