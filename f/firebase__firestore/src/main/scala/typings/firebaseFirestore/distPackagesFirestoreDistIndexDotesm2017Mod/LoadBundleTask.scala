package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.firebaseFirestore.anon.BytesLoaded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "LoadBundleTask")
@js.native
open class LoadBundleTask ()
  extends StObject
     with Ma {
  
  /**
    * Notifies all observers that bundle loading has completed, with a provided
    * `LoadBundleTaskProgress` object.
    *
    * @private
    */ /* private */ /* CompleteClass */
  var _completeWith: Any = js.native
  
  /**
    * Notifies all observers that bundle loading has failed, with a provided
    * `Error` as the reason.
    *
    * @private
    */ /* private */ /* CompleteClass */
  var _failWith: Any = js.native
  
  /* CompleteClass */
  var _lastProgress: BytesLoaded = js.native
  
  /* CompleteClass */
  var _taskCompletionResolver: U = js.native
  
  /**
    * Notifies a progress update of loading a bundle.
    * @param progress - The new progress.
    *
    * @private
    */ /* private */ /* CompleteClass */
  var _updateProgress: Any = js.native
  
  /**
    * Implements the `Promise<LoadBundleTaskProgress>.catch` interface.
    *
    * @param onRejected - Called when an error occurs during bundle loading.
    */ /* CompleteClass */
  override def `catch`(t: Any): js.Promise[Any] = js.native
  
  /**
    * Registers functions to listen to bundle loading progress events.
    * @param next - Called when there is a progress update from bundle loading. Typically `next` calls occur
    *   each time a Firestore document is loaded from the bundle.
    * @param error - Called when an error occurs during bundle loading. The task aborts after reporting the
    *   error, and there should be no more updates after this.
    * @param complete - Called when the loading task is complete.
    */ /* CompleteClass */
  override def onProgress(t: Any, e: Any, n: Any): Unit = js.native
  
  /**
    * Implements the `Promise<LoadBundleTaskProgress>.then` interface.
    *
    * @param onFulfilled - Called on the completion of the loading task with a final `LoadBundleTaskProgress` update.
    *   The update will always have its `taskState` set to `"Success"`.
    * @param onRejected - Called when an error occurs during bundle loading.
    */ /* CompleteClass */
  override def `then`(t: Any, e: Any): js.Promise[Any] = js.native
}
