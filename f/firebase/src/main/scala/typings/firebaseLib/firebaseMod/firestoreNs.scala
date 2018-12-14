package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "firestore")
@js.native
object firestoreNs extends js.Object {
  @js.native
  class Blob protected () extends js.Object {
    /**
         * Returns true if this `Blob` is equal to the provided one.
         *
         * @param other The `Blob` to compare against.
         * @return true if this `Blob` is equal to the provided one.
         */
    def isEqual(other: firebaseLib.firebaseMod.firebaseNs.firestoreNs.Blob): scala.Boolean = js.native
    /**
         * Returns the bytes of this Blob as a Base64-encoded string.
         */
    def toBase64(): java.lang.String = js.native
    /**
         * Returns the bytes of this Blob in a new Uint8Array.
         */
    def toUint8Array(): stdLib.Uint8Array = js.native
  }
  
  @js.native
  class CollectionReference protected ()
    extends firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query {
    /** The identifier of the collection. */
    val id: java.lang.String = js.native
    /**
         * A reference to the containing Document if this is a subcollection, else
         * null.
         */
    val parent: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference | scala.Null = js.native
    /**
         * A string representing the path of the referenced collection (relative
         * to the root of the database).
         */
    val path: java.lang.String = js.native
    /**
         * Add a new document to this collection with the specified data, assigning
         * it a document ID automatically.
         *
         * @param data An Object containing the data for the new document.
         * @return A Promise resolved with a `DocumentReference` pointing to the
         * newly created document after it has been written to the backend.
         */
    def add(data: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentData): js.Promise[firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference] = js.native
    /**
         * Get a `DocumentReference` for the document within the collection at the
         * specified path. If no path is specified, an automatically-generated
         * unique ID will be used for the returned DocumentReference.
         *
         * @param documentPath A slash-separated path to a document.
         * @return The `DocumentReference` instance.
         */
    def doc(): firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference = js.native
    /**
         * Get a `DocumentReference` for the document within the collection at the
         * specified path. If no path is specified, an automatically-generated
         * unique ID will be used for the returned DocumentReference.
         *
         * @param documentPath A slash-separated path to a document.
         * @return The `DocumentReference` instance.
         */
    def doc(documentPath: java.lang.String): firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference = js.native
    /**
         * Returns true if this `CollectionReference` is equal to the provided one.
         *
         * @param other The `CollectionReference` to compare against.
         * @return true if this `CollectionReference` is equal to the provided one.
         */
    def isEqual(other: firebaseLib.firebaseMod.firebaseNs.firestoreNs.CollectionReference): scala.Boolean = js.native
  }
  
  
  trait DocumentChange extends js.Object {
    /** The document affected by this change. */
    val doc: firebaseLib.firebaseMod.firebaseNs.firestoreNs.QueryDocumentSnapshot
    /**
         * The index of the changed document in the result set immediately after
         * this DocumentChange (i.e. supposing that all prior DocumentChange
         * objects and the current DocumentChange object have been applied).
         * Is -1 for 'removed' events.
         */
    val newIndex: scala.Double
    /**
         * The index of the changed document in the result set immediately prior to
         * this DocumentChange (i.e. supposing that all prior DocumentChange objects
         * have been applied). Is -1 for 'added' events.
         */
    val oldIndex: scala.Double
    /** The type of change ('added', 'modified', or 'removed'). */
    val `type`: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentChangeType
  }
  
  
  trait DocumentData
    extends /* field */ org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @js.native
  class DocumentReference protected () extends js.Object {
    /**
         * The `Firestore` for the Firestore database (useful for performing
         * transactions, etc.).
         */
    val firestore: firebaseLib.firebaseMod.firebaseNs.firestoreNs.Firestore = js.native
    /** The identifier of the document within its collection. */
    val id: java.lang.String = js.native
    /**
         * A reference to the Collection to which this DocumentReference belongs.
         */
    val parent: firebaseLib.firebaseMod.firebaseNs.firestoreNs.CollectionReference = js.native
    /**
         * A string representing the path of the referenced document (relative
         * to the root of the database).
         */
    val path: java.lang.String = js.native
    /**
         * Gets a `CollectionReference` instance that refers to the collection at
         * the specified path.
         *
         * @param collectionPath A slash-separated path to a collection.
         * @return The `CollectionReference` instance.
         */
    def collection(collectionPath: java.lang.String): firebaseLib.firebaseMod.firebaseNs.firestoreNs.CollectionReference = js.native
    /**
         * Deletes the document referred to by this `DocumentReference`.
         *
         * @return A Promise resolved once the document has been successfully
         * deleted from the backend (Note that it won't resolve while you're
         * offline).
         */
    def delete(): js.Promise[scala.Unit] = js.native
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
    def get(): js.Promise[firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot] = js.native
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
    def get(options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.GetOptions): js.Promise[firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot] = js.native
    /**
         * Returns true if this `DocumentReference` is equal to the provided one.
         *
         * @param other The `DocumentReference` to compare against.
         * @return true if this `DocumentReference` is equal to the provided one.
         */
    def isEqual(other: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference): scala.Boolean = js.native
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
         * @param observer A single object containing `next` and `error` callbacks.
         * @return An unsubscribe function that can be called to cancel
         * the snapshot listener.
         */
    def onSnapshot(observer: firebaseLib.Anon_Next): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      onNext: js.Function1[
          /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot, 
          scala.Unit
        ]
    ): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      onNext: js.Function1[
          /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot, 
          scala.Unit
        ],
      onError: js.Function1[/* error */ nodeLib.Error, scala.Unit]
    ): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      onNext: js.Function1[
          /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot, 
          scala.Unit
        ],
      onError: js.Function1[/* error */ nodeLib.Error, scala.Unit],
      onCompletion: js.Function0[scala.Unit]
    ): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotListenOptions,
      observer: firebaseLib.Anon_NextSnapshot
    ): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotListenOptions,
      onNext: js.Function1[
          /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot, 
          scala.Unit
        ]
    ): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotListenOptions,
      onNext: js.Function1[
          /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot, 
          scala.Unit
        ],
      onError: js.Function1[/* error */ nodeLib.Error, scala.Unit]
    ): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotListenOptions,
      onNext: js.Function1[
          /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot, 
          scala.Unit
        ],
      onError: js.Function1[/* error */ nodeLib.Error, scala.Unit],
      onCompletion: js.Function0[scala.Unit]
    ): js.Function0[scala.Unit] = js.native
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
    def set(data: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentData): js.Promise[scala.Unit] = js.native
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
    def set(
      data: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentData,
      options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SetOptions
    ): js.Promise[scala.Unit] = js.native
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
    def update(data: firebaseLib.firebaseMod.firebaseNs.firestoreNs.UpdateData): js.Promise[scala.Unit] = js.native
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
    def update(
      field: firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldPath,
      value: js.Any,
      moreFieldsAndValues: js.Any*
    ): js.Promise[scala.Unit] = js.native
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
    def update(field: java.lang.String, value: js.Any, moreFieldsAndValues: js.Any*): js.Promise[scala.Unit] = js.native
  }
  
  @js.native
  class DocumentSnapshot protected () extends js.Object {
    /** True if the document exists. */
    val exists: scala.Boolean = js.native
    /**
         * The ID of the document for which this `DocumentSnapshot` contains data.
         */
    val id: java.lang.String = js.native
    /**
         * Metadata about this snapshot, concerning its source and if it has local
         * modifications.
         */
    val metadata: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotMetadata = js.native
    /** A `DocumentReference` to the document location. */
    val ref: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference = js.native
    /**
         * Retrieves all fields in the document as an Object. Returns 'undefined' if
         * the document doesn't exist.
         *
         * By default, `FieldValue.serverTimestamp()` values that have not yet been
         * set to their final value will be returned as `null`. You can override
         * this by passing an options object.
         *
         * @param options An options object to configure how data is retrieved from
         * the snapshot (e.g. the desired behavior for server timestamps that have
         * not yet been set to their final value).
         * @return An Object containing all fields in the document or 'undefined' if
         * the document doesn't exist.
         */
    def data(): js.UndefOr[firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentData] = js.native
    /**
         * Retrieves all fields in the document as an Object. Returns 'undefined' if
         * the document doesn't exist.
         *
         * By default, `FieldValue.serverTimestamp()` values that have not yet been
         * set to their final value will be returned as `null`. You can override
         * this by passing an options object.
         *
         * @param options An options object to configure how data is retrieved from
         * the snapshot (e.g. the desired behavior for server timestamps that have
         * not yet been set to their final value).
         * @return An Object containing all fields in the document or 'undefined' if
         * the document doesn't exist.
         */
    def data(options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotOptions): js.UndefOr[firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentData] = js.native
    /**
         * Retrieves the field specified by `fieldPath`. Returns 'undefined' if the
         * document or field doesn't exist.
         *
         * By default, a `FieldValue.serverTimestamp()` that has not yet been set to
         * its final value will be returned as `null`. You can override this by
         * passing an options object.
         *
         * @param fieldPath The path (e.g. 'foo' or 'foo.bar') to a specific field.
         * @param options An options object to configure how the field is retrieved
         * from the snapshot (e.g. the desired behavior for server timestamps that have
         * not yet been set to their final value).
         * @return The data at the specified field location or undefined if no such
         * field exists in the document.
         */
    def get(fieldPath: firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldPath): js.Any = js.native
    /**
         * Retrieves the field specified by `fieldPath`. Returns 'undefined' if the
         * document or field doesn't exist.
         *
         * By default, a `FieldValue.serverTimestamp()` that has not yet been set to
         * its final value will be returned as `null`. You can override this by
         * passing an options object.
         *
         * @param fieldPath The path (e.g. 'foo' or 'foo.bar') to a specific field.
         * @param options An options object to configure how the field is retrieved
         * from the snapshot (e.g. the desired behavior for server timestamps that have
         * not yet been set to their final value).
         * @return The data at the specified field location or undefined if no such
         * field exists in the document.
         */
    def get(
      fieldPath: firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldPath,
      options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotOptions
    ): js.Any = js.native
    /**
         * Retrieves the field specified by `fieldPath`. Returns 'undefined' if the
         * document or field doesn't exist.
         *
         * By default, a `FieldValue.serverTimestamp()` that has not yet been set to
         * its final value will be returned as `null`. You can override this by
         * passing an options object.
         *
         * @param fieldPath The path (e.g. 'foo' or 'foo.bar') to a specific field.
         * @param options An options object to configure how the field is retrieved
         * from the snapshot (e.g. the desired behavior for server timestamps that have
         * not yet been set to their final value).
         * @return The data at the specified field location or undefined if no such
         * field exists in the document.
         */
    def get(fieldPath: java.lang.String): js.Any = js.native
    /**
         * Retrieves the field specified by `fieldPath`. Returns 'undefined' if the
         * document or field doesn't exist.
         *
         * By default, a `FieldValue.serverTimestamp()` that has not yet been set to
         * its final value will be returned as `null`. You can override this by
         * passing an options object.
         *
         * @param fieldPath The path (e.g. 'foo' or 'foo.bar') to a specific field.
         * @param options An options object to configure how the field is retrieved
         * from the snapshot (e.g. the desired behavior for server timestamps that have
         * not yet been set to their final value).
         * @return The data at the specified field location or undefined if no such
         * field exists in the document.
         */
    def get(
      fieldPath: java.lang.String,
      options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotOptions
    ): js.Any = js.native
    /**
         * Returns true if this `DocumentSnapshot` is equal to the provided one.
         *
         * @param other The `DocumentSnapshot` to compare against.
         * @return true if this `DocumentSnapshot` is equal to the provided one.
         */
    def isEqual(other: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot): scala.Boolean = js.native
  }
  
  @js.native
  class FieldPath protected () extends js.Object {
    /**
         * Creates a FieldPath from the provided field names. If more than one field
         * name is provided, the path will point to a nested field in a document.
         *
         * @param fieldNames A list of field names.
         */
    def this(fieldNames: java.lang.String*) = this()
    /**
         * Returns true if this `FieldPath` is equal to the provided one.
         *
         * @param other The `FieldPath` to compare against.
         * @return true if this `FieldPath` is equal to the provided one.
         */
    def isEqual(other: firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldPath): scala.Boolean = js.native
  }
  
  @js.native
  class FieldValue protected () extends js.Object {
    /**
         * Returns true if this `FieldValue` is equal to the provided one.
         *
         * @param other The `FieldValue` to compare against.
         * @return true if this `FieldValue` is equal to the provided one.
         */
    def isEqual(other: firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldValue): scala.Boolean = js.native
  }
  
  @js.native
  class Firestore protected () extends js.Object {
    var INTERNAL: firebaseLib.Anon_Delete = js.native
    /**
         * The `FirebaseApp` associated with this `Firestore` instance.
         */
    var app: firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
    /**
         * Creates a write batch, used for performing multiple writes as a single
         * atomic operation.
         */
    def batch(): firebaseLib.firebaseMod.firebaseNs.firestoreNs.WriteBatch = js.native
    /**
         * Gets a `CollectionReference` instance that refers to the collection at
         * the specified path.
         *
         * @param collectionPath A slash-separated path to a collection.
         * @return The `CollectionReference` instance.
         */
    def collection(collectionPath: java.lang.String): firebaseLib.firebaseMod.firebaseNs.firestoreNs.CollectionReference = js.native
    /**
         * Disables network usage for this instance. It can be re-enabled via
         * enableNetwork(). While the network is disabled, any snapshot listeners or
         * get() calls will return results from cache, and any write operations will
         * be queued until the network is restored.
         *
         * @return A promise that is resolved once the network has been disabled.
         */
    def disableNetwork(): js.Promise[scala.Unit] = js.native
    /**
         * Gets a `DocumentReference` instance that refers to the document at the
         * specified path.
         *
         * @param documentPath A slash-separated path to a document.
         * @return The `DocumentReference` instance.
         */
    def doc(documentPath: java.lang.String): firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference = js.native
    /**
         * Re-enables use of the network for this Firestore instance after a prior
         * call to disableNetwork().
         *
         * @return A promise that is resolved once the network has been enabled.
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
    def enablePersistence(settings: firebaseLib.firebaseMod.firebaseNs.firestoreNs.PersistenceSettings): js.Promise[scala.Unit] = js.native
    /**
         * Executes the given updateFunction and then attempts to commit the
         * changes applied within the transaction. If any document read within the
         * transaction has changed, the updateFunction will be retried. If it fails
         * to commit after 5 attempts, the transaction will fail.
         *
         * @param updateFunction The function to execute within the transaction
         * context.
         * @return If the transaction completed successfully or was explicitly
         * aborted (by the updateFunction returning a failed Promise), the Promise
         * returned by the updateFunction will be returned here. Else if the
         * transaction failed, a rejected Promise with the corresponding failure
         * error will be returned.
         */
    def runTransaction[T](
      updateFunction: js.Function1[
          /* transaction */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.Transaction, 
          js.Promise[T]
        ]
    ): js.Promise[T] = js.native
    /**
         * Specifies custom settings to be used to configure the `Firestore`
         * instance. Must be set before invoking any other methods.
         *
         * @param settings The settings to use.
         */
    def settings(settings: firebaseLib.firebaseMod.firebaseNs.firestoreNs.Settings): scala.Unit = js.native
  }
  
  
  trait FirestoreError extends js.Object {
    var code: firebaseLib.firebaseMod.firebaseNs.firestoreNs.FirestoreErrorCode
    var message: java.lang.String
    var name: java.lang.String
    var stack: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  class GeoPoint protected () extends js.Object {
    /**
         * Creates a new immutable GeoPoint object with the provided latitude and
         * longitude values.
         * @param latitude The latitude as number between -90 and 90.
         * @param longitude The longitude as number between -180 and 180.
         */
    def this(latitude: scala.Double, longitude: scala.Double) = this()
    val latitude: scala.Double = js.native
    val longitude: scala.Double = js.native
    /**
         * Returns true if this `GeoPoint` is equal to the provided one.
         *
         * @param other The `GeoPoint` to compare against.
         * @return true if this `GeoPoint` is equal to the provided one.
         */
    def isEqual(other: firebaseLib.firebaseMod.firebaseNs.firestoreNs.GeoPoint): scala.Boolean = js.native
  }
  
  
  trait GetOptions extends js.Object {
    /**
         * Describes whether we should get from server or cache.
         *
         * Setting to 'default' (or not setting at all), causes Firestore to try to
         * retrieve an up-to-date (server-retrieved) snapshot, but fall back to
         * returning cached data if the server can't be reached.
         *
         * Setting to 'server' causes Firestore to avoid the cache, generating an
         * error if the server cannot be reached. Note that the cache will still be
         * updated if the server request succeeds. Also note that latency-compensation
         * still takes effect, so any pending write operations will be visible in the
         * returned data (merged into the server-provided data).
         *
         * Setting to 'cache' causes Firestore to immediately return a value from the
         * cache, ignoring the server completely (implying that the returned value
         * may be stale with respect to the value on the server.) If there is no data
         * in the cache to satisfy the `get()` call, `DocumentReference.get()` will
         * return an error and `QuerySnapshot.get()` will return an empty
         * `QuerySnapshot` with no documents.
         */
    val source: js.UndefOr[
        firebaseLib.firebaseLibStrings.default | firebaseLib.firebaseLibStrings.server | firebaseLib.firebaseLibStrings.cache
      ] = js.undefined
  }
  
  
  trait PersistenceSettings extends js.Object {
    /**
         * Whether to synchronize the in-memory state of multiple tabs. Setting this
         * to 'true' in all open tabs enables shared access to local persistence,
         * shared execution of queries and latency-compensated local document updates
         * across all connected instances.
         *
         * To enable this mode, `experimentalTabSynchronization:true` needs to be set
         * globally in all active tabs. If omitted or set to 'false',
         * `enablePersistence()` will fail in all but the first tab.
         *
         * NOTE: This mode is not yet recommended for production use.
         */
    var experimentalTabSynchronization: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  @js.native
  class Query protected () extends js.Object {
    /**
         * The `Firestore` for the Firestore database (useful for performing
         * transactions, etc.).
         */
    val firestore: firebaseLib.firebaseMod.firebaseNs.firestoreNs.Firestore = js.native
    /**
         * Creates and returns a new Query that ends at the provided fields
         * relative to the order of the query. The order of the field values
         * must match the order of the order by clauses of the query.
         *
         * @param fieldValues The field values to end this query at, in order
         * of the query's order by.
         * @return The created Query.
         */
    def endAt(fieldValues: js.Any*): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Creates and returns a new Query that ends at the provided document
         * (inclusive). The end position is relative to the order of the query. The
         * document must contain all of the fields provided in the orderBy of this
         * query.
         *
         * @param snapshot The snapshot of the document to end at.
         * @return The created Query.
         */
    def endAt(snapshot: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Creates and returns a new Query that ends before the provided fields
         * relative to the order of the query. The order of the field values
         * must match the order of the order by clauses of the query.
         *
         * @param fieldValues The field values to end this query before, in order
         * of the query's order by.
         * @return The created Query.
         */
    def endBefore(fieldValues: js.Any*): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Creates and returns a new Query that ends before the provided document
         * (exclusive). The end position is relative to the order of the query. The
         * document must contain all of the fields provided in the orderBy of this
         * query.
         *
         * @param snapshot The snapshot of the document to end before.
         * @return The created Query.
         */
    def endBefore(snapshot: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Executes the query and returns the results as a QuerySnapshot.
         *
         * Note: By default, get() attempts to provide up-to-date data when possible
         * by waiting for data from the server, but it may return cached data or fail
         * if you are offline and the server cannot be reached. This behavior can be
         * altered via the `GetOptions` parameter.
         *
         * @param options An object to configure the get behavior.
         * @return A Promise that will be resolved with the results of the Query.
         */
    def get(): js.Promise[firebaseLib.firebaseMod.firebaseNs.firestoreNs.QuerySnapshot] = js.native
    /**
         * Executes the query and returns the results as a QuerySnapshot.
         *
         * Note: By default, get() attempts to provide up-to-date data when possible
         * by waiting for data from the server, but it may return cached data or fail
         * if you are offline and the server cannot be reached. This behavior can be
         * altered via the `GetOptions` parameter.
         *
         * @param options An object to configure the get behavior.
         * @return A Promise that will be resolved with the results of the Query.
         */
    def get(options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.GetOptions): js.Promise[firebaseLib.firebaseMod.firebaseNs.firestoreNs.QuerySnapshot] = js.native
    /**
         * Returns true if this `Query` is equal to the provided one.
         *
         * @param other The `Query` to compare against.
         * @return true if this `Query` is equal to the provided one.
         */
    def isEqual(other: firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query): scala.Boolean = js.native
    /**
         * Creates and returns a new Query that's additionally limited to only
         * return up to the specified number of documents.
         *
         * @param limit The maximum number of items to return.
         * @return The created Query.
         */
    def limit(limit: scala.Double): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Attaches a listener for QuerySnapshot events. You may either pass
         * individual `onNext` and `onError` callbacks or pass a single observer
         * object with `next` and `error` callbacks.
         *
         * NOTE: Although an `onCompletion` callback can be provided, it will
         * never be called because the snapshot stream is never-ending.
         *
         * @param options Options controlling the listen behavior.
         * @param onNext A callback to be called every time a new `QuerySnapshot`
         * is available.
         * @param onError A callback to be called if the listen fails or is
         * cancelled. No further callbacks will occur.
         * @param observer A single object containing `next` and `error` callbacks.
         * @return An unsubscribe function that can be called to cancel
         * the snapshot listener.
         */
    def onSnapshot(observer: firebaseLib.Anon_NextSnapshotError): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      onNext: js.Function1[
          /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.QuerySnapshot, 
          scala.Unit
        ]
    ): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      onNext: js.Function1[
          /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.QuerySnapshot, 
          scala.Unit
        ],
      onError: js.Function1[/* error */ nodeLib.Error, scala.Unit]
    ): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      onNext: js.Function1[
          /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.QuerySnapshot, 
          scala.Unit
        ],
      onError: js.Function1[/* error */ nodeLib.Error, scala.Unit],
      onCompletion: js.Function0[scala.Unit]
    ): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotListenOptions,
      observer: firebaseLib.Anon_NextSnapshotError
    ): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotListenOptions,
      onNext: js.Function1[
          /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.QuerySnapshot, 
          scala.Unit
        ]
    ): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotListenOptions,
      onNext: js.Function1[
          /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.QuerySnapshot, 
          scala.Unit
        ],
      onError: js.Function1[/* error */ nodeLib.Error, scala.Unit]
    ): js.Function0[scala.Unit] = js.native
    def onSnapshot(
      options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotListenOptions,
      onNext: js.Function1[
          /* snapshot */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.QuerySnapshot, 
          scala.Unit
        ],
      onError: js.Function1[/* error */ nodeLib.Error, scala.Unit],
      onCompletion: js.Function0[scala.Unit]
    ): js.Function0[scala.Unit] = js.native
    /**
         * Creates and returns a new Query that's additionally sorted by the
         * specified field, optionally in descending order instead of ascending.
         *
         * @param fieldPath The field to sort by.
         * @param directionStr Optional direction to sort by ('asc' or 'desc'). If
         * not specified, order will be ascending.
         * @return The created Query.
         */
    def orderBy(fieldPath: firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldPath): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Creates and returns a new Query that's additionally sorted by the
         * specified field, optionally in descending order instead of ascending.
         *
         * @param fieldPath The field to sort by.
         * @param directionStr Optional direction to sort by ('asc' or 'desc'). If
         * not specified, order will be ascending.
         * @return The created Query.
         */
    def orderBy(
      fieldPath: firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldPath,
      directionStr: firebaseLib.firebaseMod.firebaseNs.firestoreNs.OrderByDirection
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Creates and returns a new Query that's additionally sorted by the
         * specified field, optionally in descending order instead of ascending.
         *
         * @param fieldPath The field to sort by.
         * @param directionStr Optional direction to sort by ('asc' or 'desc'). If
         * not specified, order will be ascending.
         * @return The created Query.
         */
    def orderBy(fieldPath: java.lang.String): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Creates and returns a new Query that's additionally sorted by the
         * specified field, optionally in descending order instead of ascending.
         *
         * @param fieldPath The field to sort by.
         * @param directionStr Optional direction to sort by ('asc' or 'desc'). If
         * not specified, order will be ascending.
         * @return The created Query.
         */
    def orderBy(
      fieldPath: java.lang.String,
      directionStr: firebaseLib.firebaseMod.firebaseNs.firestoreNs.OrderByDirection
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Creates and returns a new Query that starts after the provided fields
         * relative to the order of the query. The order of the field values
         * must match the order of the order by clauses of the query.
         *
         * @param fieldValues The field values to start this query after, in order
         * of the query's order by.
         * @return The created Query.
         */
    def startAfter(fieldValues: js.Any*): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Creates and returns a new Query that starts after the provided document
         * (exclusive). The starting position is relative to the order of the query.
         * The document must contain all of the fields provided in the orderBy of
         * this query.
         *
         * @param snapshot The snapshot of the document to start after.
         * @return The created Query.
         */
    def startAfter(snapshot: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Creates and returns a new Query that starts at the provided fields
         * relative to the order of the query. The order of the field values
         * must match the order of the order by clauses of the query.
         *
         * @param fieldValues The field values to start this query at, in order
         * of the query's order by.
         * @return The created Query.
         */
    def startAt(fieldValues: js.Any*): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Creates and returns a new Query that starts at the provided document
         * (inclusive). The starting position is relative to the order of the query.
         * The document must contain all of the fields provided in the orderBy of
         * this query.
         *
         * @param snapshot The snapshot of the document to start at.
         * @return The created Query.
         */
    def startAt(snapshot: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Creates and returns a new Query with the additional filter that documents
         * must contain the specified field and the value should satisfy the
         * relation constraint provided.
         *
         * @param fieldPath The path to compare
         * @param opStr The operation string (e.g "<", "<=", "==", ">", ">=").
         * @param value The value for comparison
         * @return The created Query.
         */
    def where(
      fieldPath: firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldPath,
      opStr: firebaseLib.firebaseMod.firebaseNs.firestoreNs.WhereFilterOp,
      value: js.Any
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /**
         * Creates and returns a new Query with the additional filter that documents
         * must contain the specified field and the value should satisfy the
         * relation constraint provided.
         *
         * @param fieldPath The path to compare
         * @param opStr The operation string (e.g "<", "<=", "==", ">", ">=").
         * @param value The value for comparison
         * @return The created Query.
         */
    def where(
      fieldPath: java.lang.String,
      opStr: firebaseLib.firebaseMod.firebaseNs.firestoreNs.WhereFilterOp,
      value: js.Any
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
  }
  
  @js.native
  class QueryDocumentSnapshot protected ()
    extends firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot
  
  @js.native
  class QuerySnapshot protected () extends js.Object {
    /** An array of all the documents in the QuerySnapshot. */
    val docs: coreDashJsLib.Array[firebaseLib.firebaseMod.firebaseNs.firestoreNs.QueryDocumentSnapshot] = js.native
    /** True if there are no documents in the QuerySnapshot. */
    val empty: scala.Boolean = js.native
    /**
         * Metadata about this snapshot, concerning its source and if it has local
         * modifications.
         */
    val metadata: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotMetadata = js.native
    /**
         * The query on which you called `get` or `onSnapshot` in order to get this
         * `QuerySnapshot`.
         */
    val query: firebaseLib.firebaseMod.firebaseNs.firestoreNs.Query = js.native
    /** The number of documents in the QuerySnapshot. */
    val size: scala.Double = js.native
    /**
         * Returns an array of the documents changes since the last snapshot. If this
         * is the first snapshot, all documents will be in the list as added changes.
         *
         * @param options `SnapshotListenOptions` that control whether metadata-only
         * changes (i.e. only `DocumentSnapshot.metadata` changed) should trigger
         * snapshot events.
         */
    def docChanges(): coreDashJsLib.Array[firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentChange] = js.native
    /**
         * Returns an array of the documents changes since the last snapshot. If this
         * is the first snapshot, all documents will be in the list as added changes.
         *
         * @param options `SnapshotListenOptions` that control whether metadata-only
         * changes (i.e. only `DocumentSnapshot.metadata` changed) should trigger
         * snapshot events.
         */
    def docChanges(options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotListenOptions): coreDashJsLib.Array[firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentChange] = js.native
    /**
         * Enumerates all of the documents in the QuerySnapshot.
         *
         * @param callback A callback to be called with a `QueryDocumentSnapshot` for
         * each document in the snapshot.
         * @param thisArg The `this` binding for the callback.
         */
    def forEach(
      callback: js.Function1[
          /* result */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.QueryDocumentSnapshot, 
          scala.Unit
        ]
    ): scala.Unit = js.native
    /**
         * Enumerates all of the documents in the QuerySnapshot.
         *
         * @param callback A callback to be called with a `QueryDocumentSnapshot` for
         * each document in the snapshot.
         * @param thisArg The `this` binding for the callback.
         */
    def forEach(
      callback: js.Function1[
          /* result */ firebaseLib.firebaseMod.firebaseNs.firestoreNs.QueryDocumentSnapshot, 
          scala.Unit
        ],
      thisArg: js.Any
    ): scala.Unit = js.native
    /**
         * Returns true if this `QuerySnapshot` is equal to the provided one.
         *
         * @param other The `QuerySnapshot` to compare against.
         * @return true if this `QuerySnapshot` is equal to the provided one.
         */
    def isEqual(other: firebaseLib.firebaseMod.firebaseNs.firestoreNs.QuerySnapshot): scala.Boolean = js.native
  }
  
  
  trait SetOptions extends js.Object {
    /**
         * Changes the behavior of a set() call to only replace the values specified
         * in its data argument. Fields omitted from the set() call remain
         * untouched.
         */
    val merge: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * Changes the behavior of set() calls to only replace the specified field
         * paths. Any field path that is not specified is ignored and remains
         * untouched.
         */
    val mergeFields: js.UndefOr[
        coreDashJsLib.Array[java.lang.String | firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldPath]
      ] = js.undefined
  }
  
  
  trait Settings extends js.Object {
    /**
         * An approximate cache size threshold for the on-disk data. If the cache grows beyond this
         * size, Firestore will start removing data that hasn't been recently used. The size is not a
         * guarantee that the cache will stay below that size, only that if the cache exceeds the given
         * size, cleanup will be attempted.
         *
         * The default value is 40 MB. The threshold must be set to at least 1 MB, and can be set to
         * CACHE_SIZE_UNLIMITED to disable garbage collection.
         */
    var cacheSizeBytes: js.UndefOr[scala.Double] = js.undefined
    /** The hostname to connect to. */
    var host: js.UndefOr[java.lang.String] = js.undefined
    /** Whether to use SSL when connecting. */
    var ssl: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * Enables the use of `Timestamp`s for timestamp fields in
         * `DocumentSnapshot`s.
         *
         * Currently, Firestore returns timestamp fields as `Date` but `Date` only
         * supports millisecond precision, which leads to truncation and causes
         * unexpected behavior when using a timestamp from a snapshot as a part
         * of a subsequent query.
         *
         * Setting `timestampsInSnapshots` to true will cause Firestore to return
         * `Timestamp` values instead of `Date` avoiding this kind of problem. To make
         * this work you must also change any code that uses `Date` to use `Timestamp`
         * instead.
         *
         * NOTE: in the future `timestampsInSnapshots: true` will become the
         * default and this option will be removed so you should change your code to
         * use Timestamp now and opt-in to this new behavior as soon as you can.
         */
    var timestampsInSnapshots: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  
  trait SnapshotListenOptions extends js.Object {
    /**
         * Include a change even if only the metadata of the query or of a document
         * changed. Default is false.
         */
    val includeMetadataChanges: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  
  trait SnapshotMetadata extends js.Object {
    /**
         * True if the snapshot was created from cached data rather than
         * guaranteed up-to-date server data. If your listener has opted into
         * metadata updates (via `DocumentListenOptions` or `QueryListenOptions`)
         * you will receive another snapshot with `fromCache` equal to false once
         * the client has received up-to-date data from the backend.
         */
    val fromCache: scala.Boolean
    /**
         * True if the snapshot contains the result of local writes (e.g. set() or
         * update() calls) that have not yet been committed to the backend.
         * If your listener has opted into metadata updates (via
         * `DocumentListenOptions` or `QueryListenOptions`) you will receive another
         * snapshot with `hasPendingWrites` equal to false once the writes have been
         * committed to the backend.
         */
    val hasPendingWrites: scala.Boolean
    /**
         * Returns true if this `SnapshotMetadata` is equal to the provided one.
         *
         * @param other The `SnapshotMetadata` to compare against.
         * @return true if this `SnapshotMetadata` is equal to the provided one.
         */
    def isEqual(other: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SnapshotMetadata): scala.Boolean
  }
  
  
  trait SnapshotOptions extends js.Object {
    /**
         * If set, controls the return value for server timestamps that have not yet
         * been set to their final value.
         *
         * By specifying 'estimate', pending server timestamps return an estimate
         * based on the local clock. This estimate will differ from the final value
         * and cause these values to change once the server result becomes available.
         *
         * By specifying 'previous', pending timestamps will be ignored and return
         * their previous value instead.
         *
         * If omitted or set to 'none', `null` will be returned by default until the
         * server value becomes available.
         */
    val serverTimestamps: js.UndefOr[
        firebaseLib.firebaseLibStrings.estimate | firebaseLib.firebaseLibStrings.previous | firebaseLib.firebaseLibStrings.none
      ] = js.undefined
  }
  
  @js.native
  class Timestamp protected () extends js.Object {
    /**
         * Creates a new timestamp.
         *
         * @param seconds The number of seconds of UTC time since Unix epoch
         *     1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
         *     9999-12-31T23:59:59Z inclusive.
         * @param nanoseconds The non-negative fractions of a second at nanosecond
         *     resolution. Negative second values with fractions must still have
         *     non-negative nanoseconds values that count forward in time. Must be
         *     from 0 to 999,999,999 inclusive.
         */
    def this(seconds: scala.Double, nanoseconds: scala.Double) = this()
    val nanoseconds: scala.Double = js.native
    val seconds: scala.Double = js.native
    /**
         * Returns true if this `Timestamp` is equal to the provided one.
         *
         * @param other The `Timestamp` to compare against.
         * @return true if this `Timestamp` is equal to the provided one.
         */
    def isEqual(other: firebaseLib.firebaseMod.firebaseNs.firestoreNs.Timestamp): scala.Boolean = js.native
    /**
         * Returns a new `Date` corresponding to this timestamp. This may lose
         * precision.
         *
         * @return JavaScript `Date` object representing the same point in time as
         *     this `Timestamp`, with millisecond precision.
         */
    def toDate(): coreDashJsLib.Date = js.native
    /**
         * Returns the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
         *
         * @return The point in time corresponding to this timestamp, represented as
         *     the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
         */
    def toMillis(): scala.Double = js.native
  }
  
  @js.native
  class Transaction protected () extends js.Object {
    /**
         * Deletes the document referred to by the provided `DocumentReference`.
         *
         * @param documentRef A reference to the document to be deleted.
         * @return This `Transaction` instance. Used for chaining method calls.
         */
    def delete(documentRef: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Transaction = js.native
    /**
         * Reads the document referenced by the provided `DocumentReference.`
         *
         * @param documentRef A reference to the document to be read.
         * @return A DocumentSnapshot for the read data.
         */
    def get(documentRef: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference): js.Promise[firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentSnapshot] = js.native
    /**
         * Writes to the document referred to by the provided `DocumentReference`.
         * If the document does not exist yet, it will be created. If you pass
         * `SetOptions`, the provided data can be merged into the existing document.
         *
         * @param documentRef A reference to the document to be set.
         * @param data An object of the fields and values for the document.
         * @param options An object to configure the set behavior.
         * @return This `Transaction` instance. Used for chaining method calls.
         */
    def set(
      documentRef: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference,
      data: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentData
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Transaction = js.native
    /**
         * Writes to the document referred to by the provided `DocumentReference`.
         * If the document does not exist yet, it will be created. If you pass
         * `SetOptions`, the provided data can be merged into the existing document.
         *
         * @param documentRef A reference to the document to be set.
         * @param data An object of the fields and values for the document.
         * @param options An object to configure the set behavior.
         * @return This `Transaction` instance. Used for chaining method calls.
         */
    def set(
      documentRef: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference,
      data: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentData,
      options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SetOptions
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Transaction = js.native
    /**
         * Updates fields in the document referred to by the provided
         * `DocumentReference`. The update will fail if applied to a document that
         * does not exist.
         *
         * @param documentRef A reference to the document to be updated.
         * @param data An object containing the fields and values with which to
         * update the document. Fields can contain dots to reference nested fields
         * within the document.
         * @return This `Transaction` instance. Used for chaining method calls.
         */
    def update(
      documentRef: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference,
      data: firebaseLib.firebaseMod.firebaseNs.firestoreNs.UpdateData
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Transaction = js.native
    /**
         * Updates fields in the document referred to by the provided
         * `DocumentReference`. The update will fail if applied to a document that
         * does not exist.
         *
         * Nested fields can be updated by providing dot-separated field path
         * strings or by providing FieldPath objects.
         *
         * @param documentRef A reference to the document to be updated.
         * @param field The first field to update.
         * @param value The first value.
         * @param moreFieldsAndValues Additional key/value pairs.
         * @return A Promise resolved once the data has been successfully written
         * to the backend (Note that it won't resolve while you're offline).
         */
    def update(
      documentRef: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference,
      field: firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldPath,
      value: js.Any,
      moreFieldsAndValues: js.Any*
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Transaction = js.native
    /**
         * Updates fields in the document referred to by the provided
         * `DocumentReference`. The update will fail if applied to a document that
         * does not exist.
         *
         * Nested fields can be updated by providing dot-separated field path
         * strings or by providing FieldPath objects.
         *
         * @param documentRef A reference to the document to be updated.
         * @param field The first field to update.
         * @param value The first value.
         * @param moreFieldsAndValues Additional key/value pairs.
         * @return A Promise resolved once the data has been successfully written
         * to the backend (Note that it won't resolve while you're offline).
         */
    def update(
      documentRef: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference,
      field: java.lang.String,
      value: js.Any,
      moreFieldsAndValues: js.Any*
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Transaction = js.native
  }
  
  
  trait UpdateData
    extends /* fieldPath */ org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @js.native
  class WriteBatch protected () extends js.Object {
    /**
         * Commits all of the writes in this write batch as a single atomic unit.
         *
         * @return A Promise resolved once all of the writes in the batch have been
         * successfully written to the backend as an atomic unit. Note that it won't
         * resolve while you're offline.
         */
    def commit(): js.Promise[scala.Unit] = js.native
    /**
         * Deletes the document referred to by the provided `DocumentReference`.
         *
         * @param documentRef A reference to the document to be deleted.
         * @return This `WriteBatch` instance. Used for chaining method calls.
         */
    def delete(documentRef: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference): firebaseLib.firebaseMod.firebaseNs.firestoreNs.WriteBatch = js.native
    /**
         * Writes to the document referred to by the provided `DocumentReference`.
         * If the document does not exist yet, it will be created. If you pass
         * `SetOptions`, the provided data can be merged into the existing document.
         *
         * @param documentRef A reference to the document to be set.
         * @param data An object of the fields and values for the document.
         * @param options An object to configure the set behavior.
         * @return This `WriteBatch` instance. Used for chaining method calls.
         */
    def set(
      documentRef: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference,
      data: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentData
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.WriteBatch = js.native
    /**
         * Writes to the document referred to by the provided `DocumentReference`.
         * If the document does not exist yet, it will be created. If you pass
         * `SetOptions`, the provided data can be merged into the existing document.
         *
         * @param documentRef A reference to the document to be set.
         * @param data An object of the fields and values for the document.
         * @param options An object to configure the set behavior.
         * @return This `WriteBatch` instance. Used for chaining method calls.
         */
    def set(
      documentRef: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference,
      data: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentData,
      options: firebaseLib.firebaseMod.firebaseNs.firestoreNs.SetOptions
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.WriteBatch = js.native
    /**
         * Updates fields in the document referred to by the provided
         * `DocumentReference`. The update will fail if applied to a document that
         * does not exist.
         *
         * @param documentRef A reference to the document to be updated.
         * @param data An object containing the fields and values with which to
         * update the document. Fields can contain dots to reference nested fields
         * within the document.
         * @return This `WriteBatch` instance. Used for chaining method calls.
         */
    def update(
      documentRef: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference,
      data: firebaseLib.firebaseMod.firebaseNs.firestoreNs.UpdateData
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.WriteBatch = js.native
    /**
         * Updates fields in the document referred to by this `DocumentReference`.
         * The update will fail if applied to a document that does not exist.
         *
         * Nested fields can be update by providing dot-separated field path strings
         * or by providing FieldPath objects.
         *
         * @param documentRef A reference to the document to be updated.
         * @param field The first field to update.
         * @param value The first value.
         * @param moreFieldsAndValues Additional key value pairs.
         * @return A Promise resolved once the data has been successfully written
         * to the backend (Note that it won't resolve while you're offline).
         */
    def update(
      documentRef: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference,
      field: firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldPath,
      value: js.Any,
      moreFieldsAndValues: js.Any*
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.WriteBatch = js.native
    /**
         * Updates fields in the document referred to by this `DocumentReference`.
         * The update will fail if applied to a document that does not exist.
         *
         * Nested fields can be update by providing dot-separated field path strings
         * or by providing FieldPath objects.
         *
         * @param documentRef A reference to the document to be updated.
         * @param field The first field to update.
         * @param value The first value.
         * @param moreFieldsAndValues Additional key value pairs.
         * @return A Promise resolved once the data has been successfully written
         * to the backend (Note that it won't resolve while you're offline).
         */
    def update(
      documentRef: firebaseLib.firebaseMod.firebaseNs.firestoreNs.DocumentReference,
      field: java.lang.String,
      value: js.Any,
      moreFieldsAndValues: js.Any*
    ): firebaseLib.firebaseMod.firebaseNs.firestoreNs.WriteBatch = js.native
  }
  
  val CACHE_SIZE_UNLIMITED: scala.Double = js.native
  def setLogLevel(logLevel: firebaseLib.firebaseMod.firebaseNs.firestoreNs.LogLevel): scala.Unit = js.native
  @js.native
  object Blob extends js.Object {
    /**
         * Creates a new Blob from the given Base64 string, converting it to
         * bytes.
         */
    def fromBase64String(base64: java.lang.String): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Blob = js.native
    /**
         * Creates a new Blob from the given Uint8Array.
         */
    def fromUint8Array(array: stdLib.Uint8Array): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Blob = js.native
  }
  
  @js.native
  object FieldPath extends js.Object {
    /**
         * Returns a special sentinel FieldPath to refer to the ID of a document.
         * It can be used in queries to sort or filter by the document ID.
         */
    def documentId(): firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldPath = js.native
  }
  
  @js.native
  object FieldValue extends js.Object {
    /**
         * Returns a special value that can be used with set() or update() that tells
         * the server to remove the given elements from any array value that already
         * exists on the server. All instances of each element specified will be
         * removed from the array. If the field being modified is not already an
         * array it will be overwritten with an empty array.
         *
         * @param elements The elements to remove from the array.
         * @return The FieldValue sentinel for use in a call to set() or update().
         */
    def arrayRemove(elements: js.Any*): firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldValue = js.native
    /**
         * Returns a special value that can be used with set() or update() that tells
         * the server to union the given elements with any array value that already
         * exists on the server. Each specified element that doesn't already exist in
         * the array will be added to the end. If the field being modified is not
         * already an array it will be overwritten with an array containing exactly
         * the specified elements.
         *
         * @param elements The elements to union into the array.
         * @return The FieldValue sentinel for use in a call to set() or update().
         */
    def arrayUnion(elements: js.Any*): firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldValue = js.native
    /**
         * Returns a sentinel for use with update() to mark a field for deletion.
         */
    def delete(): firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldValue = js.native
    /**
         * Returns a sentinel used with set() or update() to include a
         * server-generated timestamp in the written data.
         */
    def serverTimestamp(): firebaseLib.firebaseMod.firebaseNs.firestoreNs.FieldValue = js.native
  }
  
  @js.native
  object Timestamp extends js.Object {
    /**
         * Creates a new timestamp from the given date.
         *
         * @param date The date to initialize the `Timestamp` from.
         * @return A new `Timestamp` representing the same point in time as the given
         *     date.
         */
    def fromDate(date: coreDashJsLib.Date): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Timestamp = js.native
    /**
         * Creates a new timestamp from the given number of milliseconds.
         *
         * @param milliseconds Number of milliseconds since Unix epoch
         *     1970-01-01T00:00:00Z.
         * @return A new `Timestamp` representing the same point in time as the given
         *     number of milliseconds.
         */
    def fromMillis(milliseconds: scala.Double): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Timestamp = js.native
    /**
         * Creates a new timestamp with the current date, with millisecond precision.
         *
         * @return a new timestamp representing the current date.
         */
    def now(): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Timestamp = js.native
  }
  
  type DocumentChangeType = firebaseLib.firebaseLibStrings.added | firebaseLib.firebaseLibStrings.removed | firebaseLib.firebaseLibStrings.modified
  type FirestoreErrorCode = firebaseLib.firebaseLibStrings.cancelled | firebaseLib.firebaseLibStrings.unknown | firebaseLib.firebaseLibStrings.`invalid-argument` | firebaseLib.firebaseLibStrings.`deadline-exceeded` | firebaseLib.firebaseLibStrings.`not-found` | firebaseLib.firebaseLibStrings.`already-exists` | firebaseLib.firebaseLibStrings.`permission-denied` | firebaseLib.firebaseLibStrings.`resource-exhausted` | firebaseLib.firebaseLibStrings.`failed-precondition` | firebaseLib.firebaseLibStrings.aborted | firebaseLib.firebaseLibStrings.`out-of-range` | firebaseLib.firebaseLibStrings.unimplemented | firebaseLib.firebaseLibStrings.internal | firebaseLib.firebaseLibStrings.unavailable | firebaseLib.firebaseLibStrings.`data-loss` | firebaseLib.firebaseLibStrings.unauthenticated
  type LogLevel = firebaseLib.firebaseLibStrings.debug | firebaseLib.firebaseLibStrings.error | firebaseLib.firebaseLibStrings.silent
  type OrderByDirection = firebaseLib.firebaseLibStrings.desc | firebaseLib.firebaseLibStrings.asc
  type WhereFilterOp = firebaseLib.firebaseLibStrings.`<` | firebaseLib.firebaseLibStrings.`<=` | firebaseLib.firebaseLibStrings.`==` | firebaseLib.firebaseLibStrings.`>=` | firebaseLib.firebaseLibStrings.`>` | firebaseLib.firebaseLibStrings.`array-contains`
}

