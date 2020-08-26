package typings.firebaseStorage

import typings.firebaseStorage.blobMod.FbsBlob
import typings.firebaseStorage.locationMod.Location
import typings.firebaseStorage.metadataMod.Mappings
import typings.firebaseStorage.observerMod.CompleteFn
import typings.firebaseStorage.observerMod.ErrorFn
import typings.firebaseStorage.observerMod.NextFn
import typings.firebaseStorage.observerMod.StorageObserver
import typings.firebaseStorage.observerMod.Subscribe
import typings.firebaseStorage.observerMod.Unsubscribe
import typings.firebaseStorage.referenceMod.Reference
import typings.firebaseStorage.serviceMod.StorageService
import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.taskenumsMod.TaskEvent
import typings.firebaseStorage.tasksnapshotMod.UploadTaskSnapshot
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/task", JSImport.Namespace)
@js.native
object taskMod extends js.Object {
  @js.native
  class UploadTask protected () extends js.Object {
    /**
      * @param ref The firebaseStorage.Reference object this task came
      *     from, untyped to avoid cyclic dependencies.
      * @param blob The blob to upload.
      */
    def this(ref: Reference, service: StorageService, location: Location, mappings: Mappings, blob: FbsBlob) = this()
    def this(
      ref: Reference,
      service: StorageService,
      location: Location,
      mappings: Mappings,
      blob: FbsBlob,
      metadata: Metadata
    ) = this()
    /**
      * Adds the given observer.
      */
    var addObserver_ : js.Any = js.native
    var blob_ : js.Any = js.native
    var chunkMultiplier_ : js.Any = js.native
    var completeTransitions_ : js.Any = js.native
    var continueUpload_ : js.Any = js.native
    var createResumable_ : js.Any = js.native
    var errorHandler_ : js.Any = js.native
    var error_ : js.Any = js.native
    var fetchMetadata_ : js.Any = js.native
    var fetchStatus_ : js.Any = js.native
    var finishPromise_ : js.Any = js.native
    var increaseMultiplier_ : js.Any = js.native
    var location_ : js.Any = js.native
    var makeProgressCallback_ : js.Any = js.native
    var mappings_ : js.Any = js.native
    var metadataErrorHandler_ : js.Any = js.native
    var metadata_ : js.Any = js.native
    var needToFetchMetadata_ : js.Any = js.native
    var needToFetchStatus_ : js.Any = js.native
    var notifyObserver_ : js.Any = js.native
    var notifyObservers_ : js.Any = js.native
    var observers_ : js.Any = js.native
    var oneShotUpload_ : js.Any = js.native
    var promise_ : js.Any = js.native
    var ref_ : js.Any = js.native
    var reject_ : js.Any = js.native
    /**
      * Removes the given observer.
      */
    var removeObserver_ : js.Any = js.native
    var request_ : js.Any = js.native
    var resolveToken_ : js.Any = js.native
    var resolve_ : js.Any = js.native
    var resumable_ : js.Any = js.native
    var service_ : js.Any = js.native
    var shouldDoResumable_ : js.Any = js.native
    var start_ : js.Any = js.native
    var state_ : js.Any = js.native
    var transferred_ : js.Any = js.native
    var transition_ : js.Any = js.native
    var updateProgress_ : js.Any = js.native
    var uploadUrl_ : js.Any = js.native
    /**
      * Cancels a currently running or paused task. Has no effect on a complete or
      * failed task.
      * @return True if the operation took effect, false if ignored.
      */
    def cancel(): Boolean = js.native
    /**
      * Equivalent to calling `then(null, onRejected)`.
      */
    def `catch`[T](onRejected: js.Function1[/* p1 */ Error, T | js.Promise[T]]): js.Promise[T] = js.native
    /**
      * Adds a callback for an event.
      * @param type The type of event to listen for.
      */
    def on(`type`: TaskEvent): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: js.UndefOr[scala.Nothing],
      error: js.UndefOr[scala.Nothing],
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: js.UndefOr[scala.Nothing], error: Null, completed: CompleteFn): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: js.UndefOr[scala.Nothing], error: ErrorFn): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: js.UndefOr[scala.Nothing],
      error: ErrorFn,
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Null, error: js.UndefOr[scala.Nothing], completed: CompleteFn): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Null, error: Null, completed: CompleteFn): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Null, error: ErrorFn): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Null, error: ErrorFn, completed: CompleteFn): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: NextFn[UploadTaskSnapshot]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: NextFn[UploadTaskSnapshot],
      error: js.UndefOr[scala.Nothing],
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: NextFn[UploadTaskSnapshot], error: Null, completed: CompleteFn): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: NextFn[UploadTaskSnapshot], error: ErrorFn): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: NextFn[UploadTaskSnapshot],
      error: ErrorFn,
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(`type`: TaskEvent, nextOrObserver: StorageObserver[UploadTaskSnapshot]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: js.UndefOr[scala.Nothing],
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: Null,
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
      * @return True if the operation took effect, false if ignored.
      */
    def pause(): Boolean = js.native
    /**
      * Resumes a paused task. Has no effect on a currently running or failed task.
      * @return True if the operation took effect, false if ignored.
      */
    def resume(): Boolean = js.native
    def snapshot: UploadTaskSnapshot = js.native
    /**
      * This object behaves like a Promise, and resolves with its snapshot data
      * when the upload completes.
      * @param onFulfilled The fulfillment callback. Promise chaining works as normal.
      * @param onRejected The rejection callback.
      */
    def `then`[U](): js.Promise[U] = js.native
    def `then`[U](
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.Function1[/* error */ Error, U | js.Promise[U]]
    ): js.Promise[U] = js.native
    def `then`[U](onFulfilled: js.Function1[/* value */ UploadTaskSnapshot, U | js.Promise[U]]): js.Promise[U] = js.native
    def `then`[U](
      onFulfilled: js.Function1[/* value */ UploadTaskSnapshot, U | js.Promise[U]],
      onRejected: js.Function1[/* error */ Error, U | js.Promise[U]]
    ): js.Promise[U] = js.native
    def `then`[U](onFulfilled: Null, onRejected: js.Function1[/* error */ Error, U | js.Promise[U]]): js.Promise[U] = js.native
  }
  
}

