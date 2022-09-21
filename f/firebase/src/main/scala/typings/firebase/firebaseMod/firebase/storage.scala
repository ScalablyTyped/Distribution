package typings.firebase.firebaseMod.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.anon.`0`
import typings.firebase.firebaseMod.firebase.app.App
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storage {
  
  /**
    * An error returned by the Firebase Storage SDK.
    */
  trait FirebaseStorageError
    extends StObject
       with FirebaseError {
    
    var serverResponse: String | Null
  }
  object FirebaseStorageError {
    
    inline def apply(code: String, message: String): FirebaseStorageError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = "FirebaseError", serverResponse = null)
      __obj.asInstanceOf[FirebaseStorageError]
    }
    
    extension [Self <: FirebaseStorageError](x: Self) {
      
      inline def setServerResponse(value: String): Self = StObject.set(x, "serverResponse", value.asInstanceOf[js.Any])
      
      inline def setServerResponseNull: Self = StObject.set(x, "serverResponse", null)
    }
  }
  
  /**
    * The full set of object metadata, including read-only properties.
    */
  trait FullMetadata
    extends StObject
       with UploadMetadata {
    
    /**
      * The bucket this object is contained in.
      */
    var bucket: String
    
    /**
      * The full path of this object.
      */
    var fullPath: String
    
    /**
      * The object's generation.
      * @see {@link https://cloud.google.com/storage/docs/generations-preconditions}
      */
    var generation: String
    
    /**
      * The object's metageneration.
      * @see {@link https://cloud.google.com/storage/docs/generations-preconditions}
      */
    var metageneration: String
    
    /**
      * The short name of this object, which is the last component of the full path.
      * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
      */
    var name: String
    
    /**
      * The size of this object, in bytes.
      */
    var size: Double
    
    /**
      * A date string representing when this object was created.
      */
    var timeCreated: String
    
    /**
      * A date string representing when this object was last updated.
      */
    var updated: String
  }
  object FullMetadata {
    
    inline def apply(
      bucket: String,
      fullPath: String,
      generation: String,
      metageneration: String,
      name: String,
      size: Double,
      timeCreated: String,
      updated: String
    ): FullMetadata = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], metageneration = metageneration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullMetadata]
    }
    
    extension [Self <: FullMetadata](x: Self) {
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      inline def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The options `list()` accepts.
    */
  trait ListOptions extends StObject {
    
    /**
      * If set, limits the total number of `prefixes` and `items` to return.
      * The default and maximum maxResults is 1000.
      */
    var maxResults: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The `nextPageToken` from a previous call to `list()`. If provided,
      * listing is resumed from the previous position.
      */
    var pageToken: js.UndefOr[String | Null] = js.undefined
  }
  object ListOptions {
    
    inline def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
    }
    
    extension [Self <: ListOptions](x: Self) {
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsNull: Self = StObject.set(x, "maxResults", null)
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /**
    * Result returned by list().
    */
  trait ListResult extends StObject {
    
    /**
      * Objects in this directory.
      * You can call getMetadata() and getDownloadUrl() on them.
      */
    var items: js.Array[Reference]
    
    /**
      * If set, there might be more results for this list. Use this token to resume the list.
      */
    var nextPageToken: String | Null
    
    /**
      * References to prefixes (sub-folders). You can call list() on them to
      * get its contents.
      *
      * Folders are implicit based on '/' in the object paths.
      * For example, if a bucket has two objects '/a/b/1' and '/a/b/2', list('/a')
      * will return '/a/b' as a prefix.
      */
    var prefixes: js.Array[Reference]
  }
  object ListResult {
    
    inline def apply(items: js.Array[Reference], prefixes: js.Array[Reference]): ListResult = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any], nextPageToken = null)
      __obj.asInstanceOf[ListResult]
    }
    
    extension [Self <: ListResult](x: Self) {
      
      inline def setItems(value: js.Array[Reference]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Reference*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
      
      inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
      
      inline def setPrefixes(value: js.Array[Reference]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      inline def setPrefixesVarargs(value: Reference*): Self = StObject.set(x, "prefixes", js.Array(value*))
    }
  }
  
  /**
    * Represents a reference to a Google Cloud Storage object. Developers can
    * upload, download, and delete objects, as well as get/set object metadata.
    */
  @js.native
  trait Reference extends StObject {
    
    /**
      * The name of the bucket containing this reference's object.
      */
    var bucket: String = js.native
    
    /**
      * Returns a reference to a relative path from this reference.
      * @param path The relative path from this reference.
      *     Leading, trailing, and consecutive slashes are removed.
      * @return The reference to the given path.
      */
    def child(path: String): Reference = js.native
    
    /**
      * Deletes the object at this reference's location.
      * @return A Promise that resolves if the deletion
      *     succeeded and rejects if it failed, including if the object didn't exist.
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * The full path of this object.
      */
    var fullPath: String = js.native
    
    /**
      * Fetches a long lived download URL for this object.
      * @return A Promise that resolves with the download
      *     URL or rejects if the fetch failed, including if the object did not
      *     exist.
      */
    def getDownloadURL(): js.Promise[String] = js.native
    
    /**
      * Fetches metadata for the object at this location, if one exists.
      * @return A Promise that
      *     resolves with the metadata, or rejects if the fetch failed, including if
      *     the object did not exist.
      */
    def getMetadata(): js.Promise[FullMetadata] = js.native
    
    /**
      * List items (files) and prefixes (folders) under this storage reference.
      *
      * List API is only available for Firebase Rules Version 2.
      *
      * GCS is a key-blob store. Firebase Storage imposes the semantic of '/'
      * delimited folder structure.
      * Refer to GCS's List API if you want to learn more.
      *
      * To adhere to Firebase Rules's Semantics, Firebase Storage does not
      * support objects whose paths end with "/" or contain two consecutive
      * "/"s. Firebase Storage List API will filter these unsupported objects.
      * `list()` may fail if there are too many unsupported objects in the bucket.
      *
      * @param options See `ListOptions` for details.
      * @return A Promise that resolves with the items and prefixes.
      *      `prefixes` contains references to sub-folders and `items`
      *      contains references to objects in this folder. `nextPageToken`
      *      can be used to get the rest of the results.
      */
    def list(): js.Promise[ListResult] = js.native
    def list(options: ListOptions): js.Promise[ListResult] = js.native
    
    /**
      * List all items (files) and prefixes (folders) under this storage reference.
      *
      * This is a helper method for calling `list()` repeatedly until there are
      * no more results. The default pagination size is 1000.
      *
      * Note: The results may not be consistent if objects are changed while this
      * operation is running.
      *
      * Warning: `listAll` may potentially consume too many resources if there are
      * too many results.
      *
      * @return A Promise that resolves with all the items and prefixes under
      *      the current storage reference. `prefixes` contains references to
      *      sub-directories and `items` contains references to objects in this
      *      folder. `nextPageToken` is never returned.
      */
    def listAll(): js.Promise[ListResult] = js.native
    
    /**
      * The short name of this object, which is the last component of the full path.
      * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
      */
    var name: String = js.native
    
    /**
      * A reference pointing to the parent location of this reference, or null if
      * this reference is the root.
      */
    var parent: Reference | Null = js.native
    
    def put(data: js.typedarray.ArrayBuffer): UploadTask = js.native
    def put(data: js.typedarray.ArrayBuffer, metadata: UploadMetadata): UploadTask = js.native
    def put(data: js.typedarray.Uint8Array): UploadTask = js.native
    def put(data: js.typedarray.Uint8Array, metadata: UploadMetadata): UploadTask = js.native
    /**
      * Uploads data to this reference's location.
      * @param data The data to upload.
      * @param metadata Metadata for the newly
      *     uploaded object.
      * @return An object that can be used to monitor
      *     and manage the upload.
      */
    def put(data: Blob): UploadTask = js.native
    def put(data: Blob, metadata: UploadMetadata): UploadTask = js.native
    
    /**
      * Uploads string data to this reference's location.
      * @param data The string to upload.
      * @param format The format of the string to
      *     upload.
      * @param metadata Metadata for the newly
      *     uploaded object.
      * @throws If the format is not an allowed format, or if the given string
      *     doesn't conform to the specified format.
      */
    def putString(data: String): UploadTask = js.native
    def putString(data: String, format: Unit, metadata: UploadMetadata): UploadTask = js.native
    def putString(data: String, format: StringFormat): UploadTask = js.native
    def putString(data: String, format: StringFormat, metadata: UploadMetadata): UploadTask = js.native
    
    /**
      * A reference to the root of this reference's bucket.
      */
    var root: Reference = js.native
    
    /**
      * The storage service associated with this reference.
      */
    var storage: Storage = js.native
    
    /**
      * Updates the metadata for the object at this location, if one exists.
      * @param metadata The new metadata.
      *     Setting a property to 'null' removes it on the server, while leaving
      *     a property as 'undefined' has no effect.
      * @return A Promise that
      *     resolves with the full updated metadata or rejects if the updated failed,
      *     including if the object did not exist.
      */
    def updateMetadata(metadata: SettableMetadata): js.Promise[FullMetadata] = js.native
  }
  
  /**
    * Object metadata that can be set at any time.
    */
  trait SettableMetadata extends StObject {
    
    /**
      * Served as the 'Cache-Control' header on object download.
      */
    var cacheControl: js.UndefOr[String | Null] = js.undefined
    
    var contentDisposition: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Served as the 'Content-Encoding' header on object download.
      */
    var contentEncoding: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Served as the 'Content-Language' header on object download.
      */
    var contentLanguage: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Served as the 'Content-Type' header on object download.
      */
    var contentType: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Additional user-defined custom metadata.
      */
    var customMetadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  }
  object SettableMetadata {
    
    inline def apply(): SettableMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettableMetadata]
    }
    
    extension [Self <: SettableMetadata](x: Self) {
      
      inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      inline def setCacheControlNull: Self = StObject.set(x, "cacheControl", null)
      
      inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentDispositionNull: Self = StObject.set(x, "contentDisposition", null)
      
      inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
      
      inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      inline def setContentEncodingNull: Self = StObject.set(x, "contentEncoding", null)
      
      inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
      
      inline def setContentLanguageNull: Self = StObject.set(x, "contentLanguage", null)
      
      inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCustomMetadata(value: StringDictionary[String]): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
      
      inline def setCustomMetadataNull: Self = StObject.set(x, "customMetadata", null)
      
      inline def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
    }
  }
  
  /**
    * The Firebase Storage service interface.
    *
    * Do not call this constructor directly. Instead, use
    * {@link firebase.storage `firebase.storage()`}.
    *
    * See
    * {@link
    *   https://firebase.google.com/docs/storage/web/start/
    *   Get Started on Web}
    * for a full guide on how to use the Firebase Storage service.
    */
  @js.native
  trait Storage extends StObject {
    
    /**
      * The {@link firebase.app.App app} associated with the `Storage` service
      * instance.
      *
      * @example
      * ```javascript
      * var app = storage.app;
      * ```
      */
    var app: App = js.native
    
    /**
      * The maximum time to retry operations other than uploads or downloads in
      * milliseconds.
      */
    var maxOperationRetryTime: Double = js.native
    
    /**
      * The maximum time to retry uploads in milliseconds.
      */
    var maxUploadRetryTime: Double = js.native
    
    /**
      * Returns a reference for the given path in the default bucket.
      * @param path A relative path to initialize the reference with,
      *     for example `path/to/image.jpg`. If not passed, the returned reference
      *     points to the bucket root.
      * @return A reference for the given path.
      */
    def ref(): Reference = js.native
    def ref(path: String): Reference = js.native
    
    /**
      * Returns a reference for the given absolute URL.
      * @param url A URL in the form: <br />
      *     1) a gs:// URL, for example `gs://bucket/files/image.png` <br />
      *     2) a download URL taken from object metadata. <br />
      * @return A reference for the given URL.
      */
    def refFromURL(url: String): Reference = js.native
    
    /**
      * @param time The new maximum operation retry time in milliseconds.
      * @see {@link firebase.storage.Storage.maxOperationRetryTime}
      */
    def setMaxOperationRetryTime(time: Double): Any = js.native
    
    /**
      * @param time The new maximum upload retry time in milliseconds.
      * @see {@link firebase.storage.Storage.maxUploadRetryTime}
      */
    def setMaxUploadRetryTime(time: Double): Any = js.native
    
    /**
      * Modify this `Storage` instance to communicate with the Cloud Storage emulator.
      *
      * @param host - The emulator host (ex: localhost)
      * @param port - The emulator port (ex: 5001)
      * @param options.mockUserToken the mock auth token to use for unit testing Security Rules
      */
    def useEmulator(host: String, port: Double): Unit = js.native
    def useEmulator(host: String, port: Double, options: `0`): Unit = js.native
  }
  
  trait StorageObserver[T] extends StObject {
    
    var complete: js.UndefOr[CompleteFn | Null] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* error */ FirebaseStorageError, Unit | Null]] = js.undefined
    
    var next: js.UndefOr[NextFn[T] | Null] = js.undefined
  }
  object StorageObserver {
    
    inline def apply[T](): StorageObserver[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageObserver[T]]
    }
    
    extension [Self <: StorageObserver[?], T](x: Self & StorageObserver[T]) {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteNull: Self = StObject.set(x, "complete", null)
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ FirebaseStorageError => Unit | Null): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  /**
    * @enum {string}
    * An enumeration of the possible string formats for upload.
    */
  type StringFormat = String
  
  /**
    * An event that is triggered on a task.
    * @enum {string}
    * @see {@link firebase.storage.UploadTask.on}
    */
  type TaskEvent = String
  
  /**
    * Represents the current state of a running upload.
    * @enum {string}
    */
  type TaskState = String
  
  /**
    * Object metadata that can be set at upload.
    */
  trait UploadMetadata
    extends StObject
       with SettableMetadata {
    
    /**
      * A Base64-encoded MD5 hash of the object being uploaded.
      */
    var md5Hash: js.UndefOr[String | Null] = js.undefined
  }
  object UploadMetadata {
    
    inline def apply(): UploadMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadMetadata]
    }
    
    extension [Self <: UploadMetadata](x: Self) {
      
      inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
      
      inline def setMd5HashNull: Self = StObject.set(x, "md5Hash", null)
      
      inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    }
  }
  
  /**
    * Represents the process of uploading an object. Allows you to monitor and
    * manage the upload.
    */
  @js.native
  trait UploadTask extends StObject {
    
    /**
      * Cancels a running task. Has no effect on a complete or failed task.
      * @return True if the cancel had an effect.
      */
    def cancel(): Boolean = js.native
    
    /**
      * Equivalent to calling `then(null, onRejected)`.
      */
    def `catch`(onRejected: js.Function1[/* error */ FirebaseStorageError, Any]): js.Promise[Any] = js.native
    
    /**
      * Listens for events on this task.
      *
      * Events have three callback functions (referred to as `next`, `error`, and
      * `complete`).
      *
      * If only the event is passed, a function that can be used to register the
      * callbacks is returned. Otherwise, the callbacks are passed after the event.
      *
      * Callbacks can be passed either as three separate arguments <em>or</em> as the
      * `next`, `error`, and `complete` properties of an object. Any of the three
      * callbacks is optional, as long as at least one is specified. In addition,
      * when you add your callbacks, you get a function back. You can call this
      * function to unregister the associated callbacks.
      *
      * @example **Pass callbacks separately or in an object.**
      * ```javascript
      * var next = function(snapshot) {};
      * var error = function(error) {};
      * var complete = function() {};
      *
      * // The first example.
      * uploadTask.on(
      *     firebase.storage.TaskEvent.STATE_CHANGED,
      *     next,
      *     error,
      *     complete);
      *
      * // This is equivalent to the first example.
      * uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED, {
      *   'next': next,
      *   'error': error,
      *   'complete': complete
      * });
      *
      * // This is equivalent to the first example.
      * var subscribe = uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED);
      * subscribe(next, error, complete);
      *
      * // This is equivalent to the first example.
      * var subscribe = uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED);
      * subscribe({
      *   'next': next,
      *   'error': error,
      *   'complete': complete
      * });
      * ```
      *
      * @example **Any callback is optional.**
      * ```javascript
      * // Just listening for completion, this is legal.
      * uploadTask.on(
      *     firebase.storage.TaskEvent.STATE_CHANGED,
      *     null,
      *     null,
      *     function() {
      *       console.log('upload complete!');
      *     });
      *
      * // Just listening for progress/state changes, this is legal.
      * uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED, function(snapshot) {
      *   var percent = snapshot.bytesTransferred / snapshot.totalBytes * 100;
      *   console.log(percent + "% done");
      * });
      *
      * // This is also legal.
      * uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED, {
      *   'complete': function() {
      *     console.log('upload complete!');
      *   }
      * });
      * ```
      *
      * @example **Use the returned function to remove callbacks.**
      * ```javascript
      * var unsubscribe = uploadTask.on(
      *     firebase.storage.TaskEvent.STATE_CHANGED,
      *     function(snapshot) {
      *       var percent = snapshot.bytesTransferred / snapshot.totalBytes * 100;
      *       console.log(percent + "% done");
      *       // Stop after receiving one update.
      *       unsubscribe();
      *     });
      *
      * // This code is equivalent to the above.
      * var handle = uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED);
      * unsubscribe = handle(function(snapshot) {
      *   var percent = snapshot.bytesTransferred / snapshot.totalBytes * 100;
      *   console.log(percent + "% done");
      *   // Stop after receiving one update.
      *   unsubscribe();
      * });
      * ```
      *
      * @param event The event to listen for.
      * @param nextOrObserver
      *     The `next` function, which gets called for each item in
      *     the event stream, or an observer object with some or all of these three
      *     properties (`next`, `error`, `complete`).
      * @param error A function that gets called with a `FirebaseStorageError`
      *     if the event stream ends due to an error.
      * @param complete A function that gets called if the
      *     event stream ends normally.
      * @return
      *     If only the event argument is passed, returns a function you can use to
      *     add callbacks (see the examples above). If more than just the event
      *     argument is passed, returns a function you can call to unregister the
      *     callbacks.
      */
    def on(event: TaskEvent): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any]): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: js.Function1[/* error */ FirebaseStorageError, Any]
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: js.Function1[/* error */ FirebaseStorageError, Any],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: Null,
      complete: Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: Unit,
      complete: Unsubscribe
    ): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Null, error: js.Function1[/* error */ FirebaseStorageError, Any]): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: Null,
      error: js.Function1[/* error */ FirebaseStorageError, Any],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Null, error: Null, complete: Unsubscribe): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Null, error: Unit, complete: Unsubscribe): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Unit, error: js.Function1[/* error */ FirebaseStorageError, Any]): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: Unit,
      error: js.Function1[/* error */ FirebaseStorageError, Any],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Unit, error: Null, complete: Unsubscribe): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Unit, error: Unit, complete: Unsubscribe): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: StorageObserver[UploadTaskSnapshot]): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: js.Function1[/* error */ FirebaseStorageError, Any]
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: js.Function1[/* error */ FirebaseStorageError, Any],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: Null,
      complete: Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: Unit,
      complete: Unsubscribe
    ): js.Function = js.native
    
    /**
      * Pauses a running task. Has no effect on a paused or failed task.
      * @return True if the pause had an effect.
      */
    def pause(): Boolean = js.native
    
    /**
      * Resumes a paused task. Has no effect on a running or failed task.
      * @return True if the resume had an effect.
      */
    def resume(): Boolean = js.native
    
    /**
      * A snapshot of the current task state.
      */
    var snapshot: UploadTaskSnapshot = js.native
    
    /**
      * This object behaves like a Promise, and resolves with its snapshot data when
      * the upload completes.
      * @param onFulfilled
      *     The fulfillment callback. Promise chaining works as normal.
      * @param onRejected The rejection callback.
      */
    def `then`(): js.Promise[Any] = js.native
    def `then`(onFulfilled: js.Function1[/* snapshot */ UploadTaskSnapshot, Any]): js.Promise[Any] = js.native
    def `then`(
      onFulfilled: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      onRejected: js.Function1[/* error */ FirebaseStorageError, Any]
    ): js.Promise[Any] = js.native
    def `then`(onFulfilled: Null, onRejected: js.Function1[/* error */ FirebaseStorageError, Any]): js.Promise[Any] = js.native
    def `then`(onFulfilled: Unit, onRejected: js.Function1[/* error */ FirebaseStorageError, Any]): js.Promise[Any] = js.native
  }
  
  /**
    * Holds data about the current state of the upload task.
    */
  trait UploadTaskSnapshot extends StObject {
    
    /**
      * The number of bytes that have been successfully uploaded so far.
      */
    var bytesTransferred: Double
    
    /**
      * Before the upload completes, contains the metadata sent to the server.
      * After the upload completes, contains the metadata sent back from the server.
      */
    var metadata: FullMetadata
    
    /**
      * The reference that spawned this snapshot's upload task.
      */
    var ref: Reference
    
    /**
      * The current state of the task.
      */
    var state: TaskState
    
    /**
      * The task of which this is a snapshot.
      */
    var task: UploadTask
    
    /**
      * The total number of bytes to be uploaded.
      */
    var totalBytes: Double
  }
  object UploadTaskSnapshot {
    
    inline def apply(
      bytesTransferred: Double,
      metadata: FullMetadata,
      ref: Reference,
      state: TaskState,
      task: UploadTask,
      totalBytes: Double
    ): UploadTaskSnapshot = {
      val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadTaskSnapshot]
    }
    
    extension [Self <: UploadTaskSnapshot](x: Self) {
      
      inline def setBytesTransferred(value: Double): Self = StObject.set(x, "bytesTransferred", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: FullMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setState(value: TaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTask(value: UploadTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
}
