package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "storage")
@js.native
object storageNs extends js.Object {
  /**
    * The full set of object metadata, including read-only properties.
    */
  trait FullMetadata extends UploadMetadata {
    /**
      * The bucket this object is contained in.
      */
    var bucket: java.lang.String
    /**
      * @deprecated
      * Use Reference.getDownloadURL instead. This property will be removed in a
      * future release.
      */
    var downloadURLs: js.Array[java.lang.String]
    /**
      * The full path of this object.
      */
    var fullPath: java.lang.String
    /**
      * The object's generation.
      * @see {@link https://cloud.google.com/storage/docs/generations-preconditions}
      */
    var generation: java.lang.String
    /**
      * The object's metageneration.
      * @see {@link https://cloud.google.com/storage/docs/generations-preconditions}
      */
    var metageneration: java.lang.String
    /**
      * The short name of this object, which is the last component of the full path.
      * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
      */
    var name: java.lang.String
    /**
      * The size of this object, in bytes.
      */
    var size: scala.Double
    /**
      * A date string representing when this object was created.
      */
    var timeCreated: java.lang.String
    /**
      * A date string representing when this object was last updated.
      */
    var updated: java.lang.String
  }
  
  /**
    * Represents a reference to a Google Cloud Storage object. Developers can
    * upload, download, and delete objects, as well as get/set object metadata.
    */
  @js.native
  trait Reference extends js.Object {
    /**
      * The name of the bucket containing this reference's object.
      */
    var bucket: java.lang.String = js.native
    /**
      * The full path of this object.
      */
    var fullPath: java.lang.String = js.native
    /**
      * The short name of this object, which is the last component of the full path.
      * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
      */
    var name: java.lang.String = js.native
    /**
      * A reference pointing to the parent location of this reference, or null if
      * this reference is the root.
      */
    var parent: Reference | scala.Null = js.native
    /**
      * A reference to the root of this reference's bucket.
      */
    var root: Reference = js.native
    /**
      * The storage service associated with this reference.
      */
    var storage: Storage = js.native
    /**
      * Returns a reference to a relative path from this reference.
      * @param path The relative path from this reference.
      *     Leading, trailing, and consecutive slashes are removed.
      * @return The reference to the given path.
      */
    def child(path: java.lang.String): Reference = js.native
    /**
      * Deletes the object at this reference's location.
      * @return A Promise that resolves if the deletion
      *     succeeded and rejects if it failed, including if the object didn't exist.
      */
    def delete(): js.Promise[_] = js.native
    /**
      * Fetches a long lived download URL for this object.
      * @return A Promise that resolves with the download
      *     URL or rejects if the fetch failed, including if the object did not
      *     exist.
      */
    def getDownloadURL(): js.Promise[_] = js.native
    /**
      * Fetches metadata for the object at this location, if one exists.
      * @return A Promise that
      *     resolves with the metadata, or rejects if the fetch failed, including if
      *     the object did not exist.
      */
    def getMetadata(): js.Promise[_] = js.native
    /**
      * Uploads data to this reference's location.
      * @param data The data to upload.
      * @param metadata Metadata for the newly
      *     uploaded object.
      * @return An object that can be used to monitor
      *     and manage the upload.
      */
    def put(data: js.Any): UploadTask = js.native
    def put(data: js.Any, metadata: UploadMetadata): UploadTask = js.native
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
    def putString(data: java.lang.String): UploadTask = js.native
    def putString(data: java.lang.String, format: StringFormat): UploadTask = js.native
    def putString(data: java.lang.String, format: StringFormat, metadata: UploadMetadata): UploadTask = js.native
    /**
      * Updates the metadata for the object at this location, if one exists.
      * @param metadata The new metadata.
      *     Setting a property to 'null' removes it on the server, while leaving
      *     a property as 'undefined' has no effect.
      * @return A Promise that
      *     resolves with the full updated metadata or rejects if the updated failed,
      *     including if the object did not exist.
      */
    def updateMetadata(metadata: SettableMetadata): js.Promise[_] = js.native
  }
  
  /**
    * Object metadata that can be set at any time.
    */
  trait SettableMetadata extends js.Object {
    /**
      * Served as the 'Cache-Control' header on object download.
      */
    var cacheControl: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    var contentDisposition: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /**
      * Served as the 'Content-Encoding' header on object download.
      */
    var contentEncoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /**
      * Served as the 'Content-Language' header on object download.
      */
    var contentLanguage: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /**
      * Served as the 'Content-Type' header on object download.
      */
    var contentType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /**
      * Additional user-defined custom metadata.
      */
    var customMetadata: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
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
  trait Storage extends js.Object {
    /**
      * The {@link firebase.app.App app} associated with the `Storage` service
      * instance.
      *
      * @example
      * ```javascript
      * var app = storage.app;
      * ```
      */
    var app: firebaseLib.firebaseMod.appNs.App = js.native
    /**
      * The maximum time to retry operations other than uploads or downloads in
      * milliseconds.
      */
    var maxOperationRetryTime: scala.Double = js.native
    /**
      * The maximum time to retry uploads in milliseconds.
      */
    var maxUploadRetryTime: scala.Double = js.native
    /**
      * Returns a reference for the given path in the default bucket.
      * @param path A relative path to initialize the reference with,
      *     for example `path/to/image.jpg`. If not passed, the returned reference
      *     points to the bucket root.
      * @return A reference for the given path.
      */
    def ref(): Reference = js.native
    def ref(path: java.lang.String): Reference = js.native
    /**
      * Returns a reference for the given absolute URL.
      * @param url A URL in the form: <br />
      *     1) a gs:// URL, for example `gs://bucket/files/image.png` <br />
      *     2) a download URL taken from object metadata. <br />
      *     @see {@link firebase.storage.FullMetadata.prototype.downloadURLs}
      * @return A reference for the given URL.
      */
    def refFromURL(url: java.lang.String): Reference = js.native
    /**
      * @param time The new maximum operation retry time in milliseconds.
      * @see {@link firebase.storage.Storage.prototype.maxOperationRetryTime}
      */
    def setMaxOperationRetryTime(time: scala.Double): js.Any = js.native
    /**
      * @param time The new maximum upload retry time in milliseconds.
      * @see {@link firebase.storage.Storage.prototype.maxUploadRetryTime}
      */
    def setMaxUploadRetryTime(time: scala.Double): js.Any = js.native
  }
  
  /**
    * Object metadata that can be set at upload.
    */
  trait UploadMetadata extends SettableMetadata {
    /**
      * A Base64-encoded MD5 hash of the object being uploaded.
      */
    var md5Hash: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  }
  
  /**
    * Represents the process of uploading an object. Allows you to monitor and
    * manage the upload.
    */
  @js.native
  trait UploadTask extends js.Object {
    /**
      * A snapshot of the current task state.
      */
    var snapshot: UploadTaskSnapshot = js.native
    /**
      * Cancels a running task. Has no effect on a complete or failed task.
      * @return True if the cancel had an effect.
      */
    def cancel(): scala.Boolean = js.native
    /**
      * Equivalent to calling `then(null, onRejected)`.
      */
    def `catch`(onRejected: js.Function1[/* a */ stdLib.Error, _]): js.Promise[_] = js.native
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
      * @param error A function that gets called with an Error
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
    def on(
      event: TaskEvent,
      nextOrObserver: firebaseLib.firebaseMod.Observer[UploadTaskSnapshot, stdLib.Error]
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: firebaseLib.firebaseMod.Observer[UploadTaskSnapshot, stdLib.Error],
      error: js.Function1[/* a */ stdLib.Error, _]
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: firebaseLib.firebaseMod.Observer[UploadTaskSnapshot, stdLib.Error],
      error: js.Function1[/* a */ stdLib.Error, _],
      complete: firebaseLib.firebaseMod.Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: firebaseLib.firebaseMod.Observer[UploadTaskSnapshot, stdLib.Error],
      error: scala.Null,
      complete: firebaseLib.firebaseMod.Unsubscribe
    ): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _]): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
      error: js.Function1[/* a */ stdLib.Error, _]
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
      error: js.Function1[/* a */ stdLib.Error, _],
      complete: firebaseLib.firebaseMod.Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
      error: scala.Null,
      complete: firebaseLib.firebaseMod.Unsubscribe
    ): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: scala.Null, error: js.Function1[/* a */ stdLib.Error, _]): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: scala.Null,
      error: js.Function1[/* a */ stdLib.Error, _],
      complete: firebaseLib.firebaseMod.Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: scala.Null,
      error: scala.Null,
      complete: firebaseLib.firebaseMod.Unsubscribe
    ): js.Function = js.native
    /**
      * Pauses a running task. Has no effect on a paused or failed task.
      * @return True if the pause had an effect.
      */
    def pause(): scala.Boolean = js.native
    /**
      * Resumes a paused task. Has no effect on a running or failed task.
      * @return True if the resume had an effect.
      */
    def resume(): scala.Boolean = js.native
    /**
      * This object behaves like a Promise, and resolves with its snapshot data when
      * the upload completes.
      * @param onFulfilled
      *     The fulfillment callback. Promise chaining works as normal.
      * @param onRejected The rejection callback.
      */
    def `then`(): js.Promise[_] = js.native
    def `then`(onFulfilled: js.Function1[/* a */ UploadTaskSnapshot, _]): js.Promise[_] = js.native
    def `then`(
      onFulfilled: js.Function1[/* a */ UploadTaskSnapshot, _],
      onRejected: js.Function1[/* a */ stdLib.Error, _]
    ): js.Promise[_] = js.native
    def `then`(onFulfilled: scala.Null, onRejected: js.Function1[/* a */ stdLib.Error, _]): js.Promise[_] = js.native
  }
  
  /**
    * Holds data about the current state of the upload task.
    */
  trait UploadTaskSnapshot extends js.Object {
    /**
      * The number of bytes that have been successfully uploaded so far.
      */
    var bytesTransferred: scala.Double
    /**
      * @deprecated
      * Use Reference.getDownloadURL instead. This property will be removed in a
      * future release.
      */
    var downloadURL: java.lang.String | scala.Null
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
    var totalBytes: scala.Double
  }
  
  @js.native
  object StringFormat extends js.Object {
    /**
      * Indicates the string should be interpreted as base64-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO++E6t7/rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    var BASE64: firebaseLib.firebaseMod.storageNs.StringFormat = js.native
    /**
      * Indicates the string should be interpreted as base64url-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO--E6t7_rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    var BASE64URL: firebaseLib.firebaseMod.storageNs.StringFormat = js.native
    /**
      * Indicates the string is a data URL, such as one obtained from
      * canvas.toDataURL().
      * Example: the string 'data:application/octet-stream;base64,aaaa'
      * becomes the byte sequence
      * 69 a6 9a
      * (the content-type "application/octet-stream" is also applied, but can
      * be overridden in the metadata object).
      */
    var DATA_URL: firebaseLib.firebaseMod.storageNs.StringFormat = js.native
    /**
      * Indicates the string should be interpreted "raw", that is, as normal text.
      * The string will be interpreted as UTF-16, then uploaded as a UTF-8 byte
      * sequence.
      * Example: The string 'Hello! \\ud83d\\ude0a' becomes the byte sequence
      * 48 65 6c 6c 6f 21 20 f0 9f 98 8a
      */
    var RAW: firebaseLib.firebaseMod.storageNs.StringFormat = js.native
  }
  
  @js.native
  object TaskEvent extends js.Object {
    /**
      * For this event,
      * <ul>
      *   <li>The `next` function is triggered on progress updates and when the
      *       task is paused/resumed with a
      *       {@link firebase.storage.UploadTaskSnapshot} as the first
      *       argument.</li>
      *   <li>The `error` function is triggered if the upload is canceled or fails
      *       for another reason.</li>
      *   <li>The `complete` function is triggered if the upload completes
      *       successfully.</li>
      * </ul>
      */
    var STATE_CHANGED: firebaseLib.firebaseMod.storageNs.TaskEvent = js.native
  }
  
  @js.native
  object TaskState extends js.Object {
    var CANCELED: firebaseLib.firebaseMod.storageNs.TaskState = js.native
    var ERROR: firebaseLib.firebaseMod.storageNs.TaskState = js.native
    var PAUSED: firebaseLib.firebaseMod.storageNs.TaskState = js.native
    var RUNNING: firebaseLib.firebaseMod.storageNs.TaskState = js.native
    var SUCCESS: firebaseLib.firebaseMod.storageNs.TaskState = js.native
  }
  
  /**
    * @enum {string}
    * An enumeration of the possible string formats for upload.
    */
  type StringFormat = java.lang.String
  /**
    * An event that is triggered on a task.
    * @enum {string}
    * @see {@link firebase.storage.UploadTask.prototype.on}
    */
  type TaskEvent = java.lang.String
  /**
    * Represents the current state of a running upload.
    * @enum {string}
    */
  type TaskState = java.lang.String
}

