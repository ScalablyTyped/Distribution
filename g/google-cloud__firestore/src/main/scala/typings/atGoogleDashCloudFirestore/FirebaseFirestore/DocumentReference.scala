package typings.atGoogleDashCloudFirestore.FirebaseFirestore

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FirebaseFirestore.DocumentReference")
@js.native
class DocumentReference protected () extends js.Object {
  /**
    * The `Firestore` for the Firestore database (useful for performing
    * transactions, etc.).
    */
  val firestore: Firestore = js.native
  /** The identifier of the document within its collection. */
  val id: String = js.native
  /**
    * A reference to the Collection to which this DocumentReference belongs.
    */
  val parent: CollectionReference = js.native
  /**
    * A string representing the path of the referenced document (relative
    * to the root of the database).
    */
  val path: String = js.native
  /**
    * Gets a `CollectionReference` instance that refers to the collection at
    * the specified path.
    *
    * @param collectionPath A slash-separated path to a collection.
    * @return The `CollectionReference` instance.
    */
  def collection(collectionPath: String): CollectionReference = js.native
  /**
    * Creates a document referred to by this `DocumentReference` with the
    * provided object values. The write fails if the document already exists
    *
    * @param data The object data to serialize as the document.
    * @return A Promise resolved with the write time of this create.
    */
  def create(data: DocumentData): js.Promise[WriteResult] = js.native
  /**
    * Deletes the document referred to by this `DocumentReference`.
    *
    * @param precondition A Precondition to enforce for this delete.
    * @return A Promise resolved with the write time of this delete.
    */
  def delete(): js.Promise[WriteResult] = js.native
  def delete(precondition: Precondition): js.Promise[WriteResult] = js.native
  /**
    * Reads the document referred to by this `DocumentReference`.
    *
    * @return A Promise resolved with a DocumentSnapshot containing the
    * current document contents.
    */
  def get(): js.Promise[DocumentSnapshot] = js.native
  /**
    * Returns true if this `DocumentReference` is equal to the provided one.
    *
    * @param other The `DocumentReference` to compare against.
    * @return true if this `DocumentReference` is equal to the provided one.
    */
  def isEqual(other: DocumentReference): Boolean = js.native
  /**
    * Fetches the subcollections that are direct children of this document.
    *
    * @returns A Promise that resolves with an array of CollectionReferences.
    */
  def listCollections(): js.Promise[js.Array[CollectionReference]] = js.native
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
  def onSnapshot(onNext: js.Function1[/* snapshot */ DocumentSnapshot, Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ DocumentSnapshot, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): js.Function0[Unit] = js.native
  /**
    * Writes to the document referred to by this `DocumentReference`. If the
    * document does not yet exist, it will be created. If you pass
    * `SetOptions`, the provided data can be merged into an existing document.
    *
    * @param data A map of the fields and values for the document.
    * @param options An object to configure the set behavior.
    * @return A Promise resolved with the write time of this set.
    */
  def set(data: DocumentData): js.Promise[WriteResult] = js.native
  def set(data: DocumentData, options: SetOptions): js.Promise[WriteResult] = js.native
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
    * @return A Promise resolved with the write time of this update.
    */
  def update(data: UpdateData): js.Promise[WriteResult] = js.native
  def update(data: UpdateData, precondition: Precondition): js.Promise[WriteResult] = js.native
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
    * @return A Promise resolved with the write time of this update.
    */
  def update(field: String, value: js.Any, moreFieldsOrPrecondition: js.Any*): js.Promise[WriteResult] = js.native
  def update(field: FieldPath, value: js.Any, moreFieldsOrPrecondition: js.Any*): js.Promise[WriteResult] = js.native
}

