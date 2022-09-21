package typings.firebaseStorage

import typings.firebaseStorage.blobMod.FbsBlob
import typings.firebaseStorage.errorMod.StorageError
import typings.firebaseStorage.observerMod.Subscribe
import typings.firebaseStorage.observerMod.Unsubscribe
import typings.firebaseStorage.publicTypesMod.StorageObserver
import typings.firebaseStorage.publicTypesMod.UploadTaskSnapshot
import typings.firebaseStorage.referenceMod.Reference
import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.taskenumsMod.InternalTaskState
import typings.firebaseStorage.taskenumsMod.TaskEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/task", "UploadTask")
  @js.native
  open class UploadTask protected () extends StObject {
    /**
      * @param ref - The firebaseStorage.Reference object this task came
      *     from, untyped to avoid cyclic dependencies.
      * @param blob - The blob to upload.
      */
    def this(ref: Reference, blob: FbsBlob) = this()
    def this(ref: Reference, blob: FbsBlob, metadata: Metadata) = this()
    
    /**
      * Adds the given observer.
      */
    /* private */ var _addObserver: Any = js.native
    
    /**
      * The data to be uploaded.
      */
    var _blob: FbsBlob = js.native
    
    /* private */ var _chunkMultiplier: Any = js.native
    
    /* private */ var _continueUpload: Any = js.native
    
    /* private */ var _createResumable: Any = js.native
    
    /* private */ var _error: Any = js.native
    
    /* private */ var _errorHandler: Any = js.native
    
    /* private */ var _fetchMetadata: Any = js.native
    
    /* private */ var _fetchStatus: Any = js.native
    
    /* private */ var _finishPromise: Any = js.native
    
    /* private */ var _increaseMultiplier: Any = js.native
    
    /* private */ var _makeProgressCallback: Any = js.native
    
    /* private */ var _mappings: Any = js.native
    
    /**
      * Metadata related to the upload.
      */
    var _metadata: Metadata | Null = js.native
    
    /* private */ var _metadataErrorHandler: Any = js.native
    
    /* private */ var _needToFetchMetadata: Any = js.native
    
    /* private */ var _needToFetchStatus: Any = js.native
    
    /* private */ var _notifyObserver: Any = js.native
    
    /* private */ var _notifyObservers: Any = js.native
    
    /* private */ var _observers: Any = js.native
    
    /* private */ var _oneShotUpload: Any = js.native
    
    /* private */ var _promise: Any = js.native
    
    /* private */ var _ref: Any = js.native
    
    /* private */ var _reject: Any = js.native
    
    /**
      * Removes the given observer.
      */
    /* private */ var _removeObserver: Any = js.native
    
    /* private */ var _request: Any = js.native
    
    /* private */ var _resolve: Any = js.native
    
    /* private */ var _resolveToken: Any = js.native
    
    /* private */ var _resumable: Any = js.native
    
    /* private */ var _shouldDoResumable: Any = js.native
    
    /* private */ var _start: Any = js.native
    
    /**
      * Upload state.
      */
    var _state: InternalTaskState = js.native
    
    /**
      * Number of bytes transferred so far.
      */
    var _transferred: Double = js.native
    
    /* private */ var _transition: Any = js.native
    
    /* private */ var _updateProgress: Any = js.native
    
    /* private */ var _uploadUrl: Any = js.native
    
    /**
      * Cancels a currently running or paused task. Has no effect on a complete or
      * failed task.
      * @returns True if the operation took effect, false if ignored.
      */
    def cancel(): Boolean = js.native
    
    /**
      * Equivalent to calling `then(null, onRejected)`.
      */
    def `catch`[T](onRejected: js.Function1[/* p1 */ StorageError, T | js.Promise[T]]): js.Promise[T] = js.native
    
    /* private */ var completeTransitions_ : Any = js.native
    
    /**
      * Adds a callback for an event.
      * @param type - The type of event to listen for.
      * @param nextOrObserver -
      *     The `next` function, which gets called for each item in
      *     the event stream, or an observer object with some or all of these three
      *     properties (`next`, `error`, `complete`).
      * @param error - A function that gets called with a `StorageError`
      *     if the event stream ends due to an error.
      * @param completed - A function that gets called if the
      *     event stream ends normally.
      * @returns
      *     If only the event argument is passed, returns a function you can use to
      *     add callbacks (see the examples above). If more than just the event
      *     argument is passed, returns a function you can call to unregister the
      *     callbacks.
      */
    def on(`type`: TaskEvent): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: js.Function1[/* a */ StorageError, Any]
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: js.Function1[/* a */ StorageError, Any],
      completed: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: Null,
      completed: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: Unit,
      completed: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Null, error: js.Function1[/* a */ StorageError, Any]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: Null,
      error: js.Function1[/* a */ StorageError, Any],
      completed: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Null, error: Null, completed: Unsubscribe): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Null, error: Unit, completed: Unsubscribe): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Unit, error: js.Function1[/* a */ StorageError, Any]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: Unit,
      error: js.Function1[/* a */ StorageError, Any],
      completed: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Unit, error: Null, completed: Unsubscribe): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Unit, error: Unit, completed: Unsubscribe): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: StorageObserver[UploadTaskSnapshot]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: js.Function1[/* a */ StorageError, Any]
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: js.Function1[/* a */ StorageError, Any],
      completed: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: Null,
      completed: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: Unit,
      completed: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    
    /**
      * Pauses a currently running task. Has no effect on a paused or failed task.
      * @returns True if the operation took effect, false if ignored.
      */
    def pause(): Boolean = js.native
    
    /**
      * Resumes a paused task. Has no effect on a currently running or failed task.
      * @returns True if the operation took effect, false if ignored.
      */
    def resume(): Boolean = js.native
    
    /**
      * A snapshot of the current task state.
      */
    def snapshot: UploadTaskSnapshot = js.native
    
    /**
      * This object behaves like a Promise, and resolves with its snapshot data
      * when the upload completes.
      * @param onFulfilled - The fulfillment callback. Promise chaining works as normal.
      * @param onRejected - The rejection callback.
      */
    def `then`[U](): js.Promise[U] = js.native
    def `then`[U](onFulfilled: js.Function1[/* value */ UploadTaskSnapshot, U | js.Promise[U]]): js.Promise[U] = js.native
    def `then`[U](
      onFulfilled: js.Function1[/* value */ UploadTaskSnapshot, U | js.Promise[U]],
      onRejected: js.Function1[/* error */ StorageError, U | js.Promise[U]]
    ): js.Promise[U] = js.native
    def `then`[U](onFulfilled: Null, onRejected: js.Function1[/* error */ StorageError, U | js.Promise[U]]): js.Promise[U] = js.native
    def `then`[U](onFulfilled: Unit, onRejected: js.Function1[/* error */ StorageError, U | js.Promise[U]]): js.Promise[U] = js.native
  }
}
