package typings.firebaseStorage

import typings.firebaseStorage.blobMod.FbsBlob
import typings.firebaseStorage.errorMod.FirebaseStorageError
import typings.firebaseStorage.observerMod.CompleteFn
import typings.firebaseStorage.observerMod.ErrorFn
import typings.firebaseStorage.observerMod.StorageObserver
import typings.firebaseStorage.observerMod.Subscribe
import typings.firebaseStorage.observerMod.Unsubscribe
import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.srcReferenceMod.Reference
import typings.firebaseStorage.srcTasksnapshotMod.UploadTaskSnapshot
import typings.firebaseStorage.taskenumsMod.InternalTaskState
import typings.firebaseStorage.taskenumsMod.TaskEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTaskMod {
  
  @JSImport("@firebase/storage/dist/src/task", "UploadTask")
  @js.native
  class UploadTask protected () extends StObject {
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
    var _addObserver: js.Any = js.native
    
    /**
      * @internal
      */
    var _blob: FbsBlob = js.native
    
    var _chunkMultiplier: js.Any = js.native
    
    var _continueUpload: js.Any = js.native
    
    var _createResumable: js.Any = js.native
    
    var _error: js.Any = js.native
    
    var _errorHandler: js.Any = js.native
    
    var _fetchMetadata: js.Any = js.native
    
    var _fetchStatus: js.Any = js.native
    
    var _finishPromise: js.Any = js.native
    
    var _increaseMultiplier: js.Any = js.native
    
    var _makeProgressCallback: js.Any = js.native
    
    var _mappings: js.Any = js.native
    
    /**
      * @internal
      */
    var _metadata: Metadata | Null = js.native
    
    var _metadataErrorHandler: js.Any = js.native
    
    var _needToFetchMetadata: js.Any = js.native
    
    var _needToFetchStatus: js.Any = js.native
    
    var _notifyObserver: js.Any = js.native
    
    var _notifyObservers: js.Any = js.native
    
    var _observers: js.Any = js.native
    
    var _oneShotUpload: js.Any = js.native
    
    var _promise: js.Any = js.native
    
    var _ref: js.Any = js.native
    
    var _reject: js.Any = js.native
    
    /**
      * Removes the given observer.
      */
    var _removeObserver: js.Any = js.native
    
    var _request: js.Any = js.native
    
    var _resolve: js.Any = js.native
    
    var _resolveToken: js.Any = js.native
    
    var _resumable: js.Any = js.native
    
    var _shouldDoResumable: js.Any = js.native
    
    var _start: js.Any = js.native
    
    /**
      * @internal
      */
    var _state: InternalTaskState = js.native
    
    /**
      * @internal
      */
    var _transferred: Double = js.native
    
    var _transition: js.Any = js.native
    
    var _updateProgress: js.Any = js.native
    
    var _uploadUrl: js.Any = js.native
    
    /**
      * Cancels a currently running or paused task. Has no effect on a complete or
      * failed task.
      * @returns True if the operation took effect, false if ignored.
      */
    def cancel(): Boolean = js.native
    
    /**
      * Equivalent to calling `then(null, onRejected)`.
      */
    def `catch`[T](onRejected: js.Function1[/* p1 */ FirebaseStorageError, T | js.Promise[T]]): js.Promise[T] = js.native
    
    var completeTransitions_ : js.Any = js.native
    
    /**
      * Adds a callback for an event.
      * @param type - The type of event to listen for.
      */
    def on(`type`: TaskEvent): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, js.Any]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, js.Any],
      error: Unit,
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, js.Any],
      error: ErrorFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, js.Any],
      error: ErrorFn,
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Unit, error: Unit, completed: CompleteFn): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Unit, error: ErrorFn): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Unit, error: ErrorFn, completed: CompleteFn): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: StorageObserver[UploadTaskSnapshot]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: Unit,
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: StorageObserver[UploadTaskSnapshot], error: ErrorFn): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: ErrorFn,
      completed: CompleteFn
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
      onRejected: js.Function1[/* error */ FirebaseStorageError, U | js.Promise[U]]
    ): js.Promise[U] = js.native
    def `then`[U](onFulfilled: Null, onRejected: js.Function1[/* error */ FirebaseStorageError, U | js.Promise[U]]): js.Promise[U] = js.native
    def `then`[U](onFulfilled: Unit, onRejected: js.Function1[/* error */ FirebaseStorageError, U | js.Promise[U]]): js.Promise[U] = js.native
  }
}
