package typings.firebaseFirestore.internalMod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/internal", "LoadBundleTask")
@js.native
open class LoadBundleTask ()
  extends StObject
     with PromiseLike[LoadBundleTaskProgress] {
  
  /**
    * Notifies all observers that bundle loading has completed, with a provided
    * `LoadBundleTaskProgress` object.
    *
    * @private
    */
  def _completeWith(progress: LoadBundleTaskProgress): Unit = js.native
  
  /**
    * Notifies all observers that bundle loading has failed, with a provided
    * `Error` as the reason.
    *
    * @private
    */
  def _failWith(error: FirestoreError): Unit = js.native
  
  /* private */ var _lastProgress: Any = js.native
  
  /* private */ var _progressObserver: Any = js.native
  
  /* private */ var _taskCompletionResolver: Any = js.native
  
  /**
    * Notifies a progress update of loading a bundle.
    * @param progress - The new progress.
    *
    * @private
    */
  def _updateProgress(progress: LoadBundleTaskProgress): Unit = js.native
  
  /**
    * Implements the `Promise<LoadBundleTaskProgress>.catch` interface.
    *
    * @param onRejected - Called when an error occurs during bundle loading.
    */
  def `catch`[R](onRejected: js.Function1[/* a */ js.Error, R | PromiseLike[R]]): js.Promise[R | LoadBundleTaskProgress] = js.native
  
  /**
    * Registers functions to listen to bundle loading progress events.
    * @param next - Called when there is a progress update from bundle loading. Typically `next` calls occur
    *   each time a Firestore document is loaded from the bundle.
    * @param error - Called when an error occurs during bundle loading. The task aborts after reporting the
    *   error, and there should be no more updates after this.
    * @param complete - Called when the loading task is complete.
    */
  def onProgress(): Unit = js.native
  def onProgress(next: js.Function1[/* progress */ LoadBundleTaskProgress, Any]): Unit = js.native
  def onProgress(
    next: js.Function1[/* progress */ LoadBundleTaskProgress, Any],
    error: js.Function1[/* err */ js.Error, Any]
  ): Unit = js.native
  def onProgress(
    next: js.Function1[/* progress */ LoadBundleTaskProgress, Any],
    error: js.Function1[/* err */ js.Error, Any],
    complete: js.Function0[Unit]
  ): Unit = js.native
  def onProgress(
    next: js.Function1[/* progress */ LoadBundleTaskProgress, Any],
    error: Unit,
    complete: js.Function0[Unit]
  ): Unit = js.native
  def onProgress(next: Unit, error: js.Function1[/* err */ js.Error, Any]): Unit = js.native
  def onProgress(next: Unit, error: js.Function1[/* err */ js.Error, Any], complete: js.Function0[Unit]): Unit = js.native
  def onProgress(next: Unit, error: Unit, complete: js.Function0[Unit]): Unit = js.native
}
