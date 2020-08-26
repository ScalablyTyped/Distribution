package typings.firebase.mod.firestore

import typings.firebase.anon.Error
import typings.firebase.anon.Next
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "firestore.DocumentReference")
@js.native
class DocumentReference[T] protected () extends js.Object {
  /**
    * The {@link firebase.firestore.Firestore} the document is in.
    * This is useful for performing transactions, for example.
    */
  val firestore: Firestore = js.native
  /**
    * The document's identifier within its collection.
    */
  val id: String = js.native
  /**
    * The Collection this `DocumentReference` belongs to.
    */
  val parent: CollectionReference[T] = js.native
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
  def collection(collectionPath: String): CollectionReference[DocumentData] = js.native
  /**
    * Deletes the document referred to by this `DocumentReference`.
    *
    * @return A Promise resolved once the document has been successfully
    * deleted from the backend (Note that it won't resolve while you're
    * offline).
    */
  def delete(): js.Promise[Unit] = js.native
  /**
    * Reads the document referred to by this `DocumentReference`.
    *
    * Note: By default, get() attempts to provide up-to-date data when possible
    * by waiting for data from the server, but it may return cached data or fail
    * if you are offline and the server cannot be reached. This behavior can be
    * altered via the `GetOptions` parameter.
    *
    * @param options An object to configure the get behavior.
    * @return A Promise resolved with a DocumentSnapshot containing the
    * current document contents.
    */
  def get(): js.Promise[DocumentSnapshot[T]] = js.native
  def get(options: GetOptions): js.Promise[DocumentSnapshot[T]] = js.native
  /**
    * Returns true if this `DocumentReference` is equal to the provided one.
    *
    * @param other The `DocumentReference` to compare against.
    * @return true if this `DocumentReference` is equal to the provided one.
    */
  def isEqual(other: DocumentReference[T]): Boolean = js.native
  /**
    * Attaches a listener for DocumentSnapshot events. You may either pass
    * individual `onNext` and `onError` callbacks or pass a single observer
    * object with `next` and `error` callbacks.
    *
    * NOTE: Although an `onCompletion` callback can be provided, it will
    * never be called because the snapshot stream is never-ending.
    *
    * @param observer A single object containing `next` and `error` callbacks.
    * @return An unsubscribe function that can be called to cancel
    * the snapshot listener.
    */
  def onSnapshot(observer: Error[T]): js.Function0[Unit] = js.native
  /**
    * Attaches a listener for DocumentSnapshot events. You may either pass
    * individual `onNext` and `onError` callbacks or pass a single observer
    * object with `next` and `error` callbacks.
    *
    * NOTE: Although an `onCompletion` callback can be provided, it will
    * never be called because the snapshot stream is never-ending.
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
    onError: js.UndefOr[scala.Nothing],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.std.Error, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.std.Error, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  /**
    * Attaches a listener for DocumentSnapshot events. You may either pass
    * individual `onNext` and `onError` callbacks or pass a single observer
    * object with `next` and `error` callbacks.
    *
    * NOTE: Although an `onCompletion` callback can be provided, it will
    * never be called because the snapshot stream is never-ending.
    *
    * @param options Options controlling the listen behavior.
    * @param observer A single object containing `next` and `error` callbacks.
    * @return An unsubscribe function that can be called to cancel
    * the snapshot listener.
    */
  def onSnapshot(options: SnapshotListenOptions, observer: Next[T]): js.Function0[Unit] = js.native
  /**
    * Attaches a listener for DocumentSnapshot events. You may either pass
    * individual `onNext` and `onError` callbacks or pass a single observer
    * object with `next` and `error` callbacks.
    *
    * NOTE: Although an `onCompletion` callback can be provided, it will
    * never be called because the snapshot stream is never-ending.
    *
    * @param options Options controlling the listen behavior.
    * @param onNext A callback to be called every time a new `DocumentSnapshot`
    * is available.
    * @param onError A callback to be called if the listen fails or is
    * cancelled. No further callbacks will occur.
    * @return An unsubscribe function that can be called to cancel
    * the snapshot listener.
    */
  def onSnapshot(options: SnapshotListenOptions, onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.std.Error, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.std.Error, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  /**
    * Writes to the document referred to by this `DocumentReference`. If the
    * document does not yet exist, it will be created. If you pass
    * `SetOptions`, the provided data can be merged into an existing document.
    *
    * @param data A map of the fields and values for the document.
    * @return A Promise resolved once the data has been successfully written
    * to the backend (Note that it won't resolve while you're offline).
    */
  def set(data: T): js.Promise[Unit] = js.native
  /**
    * Writes to the document referred to by this `DocumentReference`. If the
    * document does not yet exist, it will be created. If you pass
    * `SetOptions`, the provided data can be merged into an existing document.
    *
    * @param data A map of the fields and values for the document.
    * @param options An object to configure the set behavior.
    * @return A Promise resolved once the data has been successfully written
    * to the backend (Note that it won't resolve while you're offline).
    */
  def set(data: Partial[T], options: SetOptions): js.Promise[Unit] = js.native
  /**
    * Updates fields in the document referred to by this `DocumentReference`.
    * The update will fail if applied to a document that does not exist.
    *
    * @param data An object containing the fields and values with which to
    * update the document. Fields can contain dots to reference nested fields
    * within the document.
    * @return A Promise resolved once the data has been successfully written
    * to the backend (Note that it won't resolve while you're offline).
    */
  def update(data: UpdateData): js.Promise[Unit] = js.native
  /**
    * Updates fields in the document referred to by this `DocumentReference`.
    * The update will fail if applied to a document that does not exist.
    *
    * Nested fields can be updated by providing dot-separated field path
    * strings or by providing FieldPath objects.
    *
    * @param field The first field to update.
    * @param value The first value.
    * @param moreFieldsAndValues Additional key value pairs.
    * @return A Promise resolved once the data has been successfully written
    * to the backend (Note that it won't resolve while you're offline).
    */
  def update(field: String, value: js.Any, moreFieldsAndValues: js.Any*): js.Promise[Unit] = js.native
  def update(field: FieldPath, value: js.Any, moreFieldsAndValues: js.Any*): js.Promise[Unit] = js.native
  /**
    * Applies a custom data converter to this DocumentReference, allowing you
    * to use your own custom model objects with Firestore. When you call
    * set(), get(), etc. on the returned DocumentReference instance, the
    * provided converter will convert between Firestore data and your custom
    * type U.
    *
    * @param converter Converts objects to and from Firestore.
    * @return A DocumentReference<U> that uses the provided converter.
    */
  def withConverter[U](converter: FirestoreDataConverter[U]): DocumentReference[U] = js.native
}

