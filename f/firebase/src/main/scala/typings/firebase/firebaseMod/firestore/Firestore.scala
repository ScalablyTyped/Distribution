package typings.firebase.firebaseMod.firestore

import typings.firebase.Anon_Complete
import typings.firebase.Anon_Delete
import typings.firebase.firebaseMod.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "firestore.Firestore")
@js.native
class Firestore protected () extends js.Object {
  /**
    * @hidden
    */
  var INTERNAL: Anon_Delete = js.native
  /**
    * The {@link firebase.app.App app} associated with this `Firestore` service
    * instance.
    */
  var app: App = js.native
  /**
    * Creates a write batch, used for performing multiple writes as a single
    * atomic operation. The maximum number of writes allowed in a single WriteBatch
    * is 500, but note that each usage of `FieldValue.serverTimestamp()`,
    * `FieldValue.arrayUnion()`, `FieldValue.arrayRemove()`, or
    * `FieldValue.increment()` inside a WriteBatch counts as an additional write.
    *
    * @return
    *   A `WriteBatch` that can be used to atomically execute multiple writes.
    */
  def batch(): WriteBatch = js.native
  /**
    * Clears the persistent storage. This includes pending writes and cached
    * documents.
    *
    * Must be called while the firestore instance is not started (after the app
    * is shutdown or when the app is first initialized). On startup, this
    * method must be called before other methods (other than settings()). If
    * the firestore instance is still running, the promise will be rejected
    * with the error code of `failed-precondition`.
    *
    * Note: clearPersistence() is primarily intended to help write reliable
    * tests that use Cloud Firestore. It uses an efficient mechanism for
    * dropping existing data but does not attempt to securely overwrite or
    * otherwise make cached data unrecoverable. For applications that are
    * sensitive to the disclosure of cached data in between user sessions, we
    * strongly recommend not enabling persistence at all.
    *
    * @return A promise that is resolved when the persistent storage is
    * cleared. Otherwise, the promise is rejected with an error.
    */
  def clearPersistence(): js.Promise[Unit] = js.native
  /**
    * Gets a `CollectionReference` instance that refers to the collection at
    * the specified path.
    *
    * @param collectionPath A slash-separated path to a collection.
    * @return The `CollectionReference` instance.
    */
  def collection(collectionPath: String): CollectionReference = js.native
  /**
    * Creates and returns a new Query that includes all documents in the
    * database that are contained in a collection or subcollection with the
    * given collectionId.
    *
    * @param collectionId Identifies the collections to query over. Every
    * collection or subcollection with this ID as the last segment of its path
    * will be included. Cannot contain a slash.
    * @return The created Query.
    */
  def collectionGroup(collectionId: String): Query = js.native
  /**
    * Disables network usage for this instance. It can be re-enabled via
    * {@link firebase.firestore.Firestore.enableNetwork `enableNetwork()`}. While
    * the network is disabled, any snapshot listeners or get() calls will return
    * results from cache, and any write operations will be queued until the network
    * is restored.
    *
    * @return A promise that is resolved once the network has been
    *   disabled.
    */
  def disableNetwork(): js.Promise[Unit] = js.native
  /**
    * Gets a `DocumentReference` instance that refers to the document at the
    * specified path.
    *
    * @param documentPath A slash-separated path to a document.
    * @return The `DocumentReference` instance.
    */
  def doc(documentPath: String): DocumentReference = js.native
  /**
    * Re-enables use of the network for this Firestore instance after a prior
    * call to {@link firebase.firestore.Firestore.disableNetwork
    * `disableNetwork()`}.
    *
    * @return A promise that is resolved once the network has been
    *   enabled.
    */
  def enableNetwork(): js.Promise[Unit] = js.native
  /**
    * Attempts to enable persistent storage, if possible.
    *
    * Must be called before any other methods (other than settings() and
    * clearPersistence()).
    *
    * If this fails, enablePersistence() will reject the promise it returns.
    * Note that even after this failure, the firestore instance will remain
    * usable, however offline persistence will be disabled.
    *
    * There are several reasons why this can fail, which can be identified by
    * the `code` on the error.
    *
    *   * failed-precondition: The app is already open in another browser tab.
    *   * unimplemented: The browser is incompatible with the offline
    *     persistence implementation.
    *
    * @param settings Optional settings object to configure persistence.
    * @return A promise that represents successfully enabling persistent
    * storage.
    */
  def enablePersistence(): js.Promise[Unit] = js.native
  def enablePersistence(settings: PersistenceSettings): js.Promise[Unit] = js.native
  /**
    * Attaches a listener for a snapshots-in-sync event. The snapshots-in-sync
    * event indicates that all listeners affected by a given change have fired,
    * even if a single server-generated change affects multiple listeners.
    *
    * NOTE: The snapshots-in-sync event only indicates that listeners are in sync
    * with each other, but does not relate to whether those snapshots are in sync
    * with the server. Use SnapshotMetadata in the individual listeners to
    * determine if a snapshot is from the cache or the server.
    *
    * @param observer A single object containing `next` and `error` callbacks.
    * @return An unsubscribe function that can be called to cancel the snapshot
    * listener.
    */
  def onSnapshotsInSync(observer: Anon_Complete): js.Function0[Unit] = js.native
  /**
    * Attaches a listener for a snapshots-in-sync event. The snapshots-in-sync
    * event indicates that all listeners affected by a given change have fired,
    * even if a single server-generated change affects multiple listeners.
    *
    * NOTE: The snapshots-in-sync event only indicates that listeners are in sync
    * with each other, but does not relate to whether those snapshots are in sync
    * with the server. Use SnapshotMetadata in the individual listeners to
    * determine if a snapshot is from the cache or the server.
    *
    * @param onSync A callback to be called every time all snapshot listeners are
    * in sync with each other.
    * @return An unsubscribe function that can be called to cancel the snapshot
    * listener.
    */
  def onSnapshotsInSync(onSync: js.Function0[Unit]): js.Function0[Unit] = js.native
  /**
    * Executes the given `updateFunction` and then attempts to commit the changes
    * applied within the transaction. If any document read within the transaction
    * has changed, Cloud Firestore retries the `updateFunction`. If it fails to
    * commit after 5 attempts, the transaction fails.
    *
    * The maximum number of writes allowed in a single transaction is 500, but
    * note that each usage of `FieldValue.serverTimestamp()`,
    * `FieldValue.arrayUnion()`, `FieldValue.arrayRemove()`, or
    * `FieldValue.increment()` inside a transaction counts as an additional write.
    *
    * @param updateFunction
    *   The function to execute within the transaction context.
    *
    * @return
    *   If the transaction completed successfully or was explicitly aborted
    *   (the `updateFunction` returned a failed promise),
    *   the promise returned by the updateFunction is returned here. Else, if the
    *   transaction failed, a rejected promise with the corresponding failure
    *   error will be returned.
    */
  def runTransaction[T](updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]]): js.Promise[T] = js.native
  /**
    * Specifies custom settings to be used to configure the `Firestore`
    * instance. Must be set before invoking any other methods.
    *
    * @param settings The settings to use.
    */
  def settings(settings: Settings): Unit = js.native
  /**
    * Terminates this Firestore instance.
    *
    * After calling `terminate()` only the `clearPersistence()` method may be used. Any other method
    * will throw a `FirestoreError`.
    *
    * To restart after termination, create a new instance of FirebaseFirestore with
    * `firebase.firestore()`.
    *
    * Termination does not cancel any pending writes, and any promises that are awaiting a response
    * from the server will not be resolved. If you have persistence enabled, the next time you
    * start this instance, it will resume sending these writes to the server.
    *
    * Note: Under normal circumstances, calling `terminate()` is not required. This
    * method is useful only when you want to force this instance to release all of its resources or
    * in combination with `clearPersistence()` to ensure that all local state is destroyed
    * between test runs.
    *
    * @return A promise that is resolved when the instance has been successfully terminated.
    */
  def terminate(): js.Promise[Unit] = js.native
  /**
    * Waits until all currently pending writes for the active user have been acknowledged by the
    * backend.
    *
    * The returned Promise resolves immediately if there are no outstanding writes. Otherwise, the
    * Promise waits for all previously issued writes (including those written in a previous app
    * session), but it does not wait for writes that were added after the method is called. If you
    * want to wait for additional writes, call `waitForPendingWrites()` again.
    *
    * Any outstanding `waitForPendingWrites()` Promises are rejected during user changes.
    *
    * @return A Promise which resolves when all currently pending writes have been
    * acknowledged by the backend.
    */
  def waitForPendingWrites(): js.Promise[Unit] = js.native
}

