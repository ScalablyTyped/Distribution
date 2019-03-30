package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Firestore extends js.Object {
  /**
    * @hidden
    */
  var INTERNAL: firebaseLib.Anon_Delete = js.native
  /**
    * The {@link firebase.app.App app} associated with this `Firestore` service
    * instance.
    */
  var app: firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
  /**
    * Creates a write batch, used for performing multiple writes as a single
    * atomic operation.
    *
    * @return
    *   A `WriteBatch` that can be used to atomically execute multiple writes.
    */
  def batch(): WriteBatch = js.native
  /**
    * Gets a `CollectionReference` instance that refers to the collection at
    * the specified path.
    *
    * @param collectionPath A slash-separated path to a collection.
    * @return The `CollectionReference` instance.
    */
  def collection(collectionPath: java.lang.String): CollectionReference = js.native
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
  def disableNetwork(): js.Promise[scala.Unit] = js.native
  /**
    * Gets a `DocumentReference` instance that refers to the document at the
    * specified path.
    *
    * @param documentPath A slash-separated path to a document.
    * @return The `DocumentReference` instance.
    */
  def doc(documentPath: java.lang.String): DocumentReference = js.native
  /**
    * Re-enables use of the network for this Firestore instance after a prior
    * call to {@link firebase.firestore.Firestore.disableNetwork
    * `disableNetwork()`}.
    *
    * @return A promise that is resolved once the network has been
    *   enabled.
    */
  def enableNetwork(): js.Promise[scala.Unit] = js.native
  /**
    * Attempts to enable persistent storage, if possible.
    *
    * Must be called before any other methods (other than settings()).
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
  def enablePersistence(): js.Promise[scala.Unit] = js.native
  def enablePersistence(settings: PersistenceSettings): js.Promise[scala.Unit] = js.native
  /**
    * Executes the given `updateFunction` and then attempts to commit the changes
    * applied within the transaction. If any document read within the transaction
    * has changed, Cloud Firestore retries the `updateFunction`. If it fails to
    * commit after 5 attempts, the transaction fails.
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
  def settings(settings: Settings): scala.Unit = js.native
}

