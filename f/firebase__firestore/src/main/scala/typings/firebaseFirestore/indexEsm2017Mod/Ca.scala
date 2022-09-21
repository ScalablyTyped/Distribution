package typings.firebaseFirestore.indexEsm2017Mod

import typings.firebaseFirestore.anon.BytesLoaded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ca extends StObject {
  
  /**
    * Notifies all observers that bundle loading has completed, with a provided
    * `LoadBundleTaskProgress` object.
    *
    * @private
    */ /* private */ var _completeWith: Any
  
  /**
    * Notifies all observers that bundle loading has failed, with a provided
    * `Error` as the reason.
    *
    * @private
    */ /* private */ var _failWith: Any
  
  var _lastProgress: BytesLoaded
  
  var _taskCompletionResolver: L
  
  /**
    * Notifies a progress update of loading a bundle.
    * @param progress - The new progress.
    *
    * @private
    */ /* private */ var _updateProgress: Any
  
  /**
    * Implements the `Promise<LoadBundleTaskProgress>.catch` interface.
    *
    * @param onRejected - Called when an error occurs during bundle loading.
    */ def `catch`(t: Any): js.Promise[Any]
  
  /**
    * Registers functions to listen to bundle loading progress events.
    * @param next - Called when there is a progress update from bundle loading. Typically `next` calls occur
    *   each time a Firestore document is loaded from the bundle.
    * @param error - Called when an error occurs during bundle loading. The task aborts after reporting the
    *   error, and there should be no more updates after this.
    * @param complete - Called when the loading task is complete.
    */ def onProgress(t: Any, e: Any, n: Any): Unit
  
  /**
    * Implements the `Promise<LoadBundleTaskProgress>.then` interface.
    *
    * @param onFulfilled - Called on the completion of the loading task with a final `LoadBundleTaskProgress` update.
    *   The update will always have its `taskState` set to `"Success"`.
    * @param onRejected - Called when an error occurs during bundle loading.
    */ def `then`(t: Any, e: Any): js.Promise[Any]
}
object Ca {
  
  inline def apply(
    _completeWith: Any,
    _failWith: Any,
    _lastProgress: BytesLoaded,
    _taskCompletionResolver: L,
    _updateProgress: Any,
    `catch`: Any => js.Promise[Any],
    onProgress: (Any, Any, Any) => Unit,
    `then`: (Any, Any) => js.Promise[Any]
  ): Ca = {
    val __obj = js.Dynamic.literal(_completeWith = _completeWith.asInstanceOf[js.Any], _failWith = _failWith.asInstanceOf[js.Any], _lastProgress = _lastProgress.asInstanceOf[js.Any], _taskCompletionResolver = _taskCompletionResolver.asInstanceOf[js.Any], _updateProgress = _updateProgress.asInstanceOf[js.Any], onProgress = js.Any.fromFunction3(onProgress))
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[Ca]
  }
  
  extension [Self <: Ca](x: Self) {
    
    inline def setCatch(value: Any => js.Promise[Any]): Self = StObject.set(x, "catch", js.Any.fromFunction1(value))
    
    inline def setOnProgress(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction3(value))
    
    inline def setThen(value: (Any, Any) => js.Promise[Any]): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
    
    inline def set_completeWith(value: Any): Self = StObject.set(x, "_completeWith", value.asInstanceOf[js.Any])
    
    inline def set_failWith(value: Any): Self = StObject.set(x, "_failWith", value.asInstanceOf[js.Any])
    
    inline def set_lastProgress(value: BytesLoaded): Self = StObject.set(x, "_lastProgress", value.asInstanceOf[js.Any])
    
    inline def set_taskCompletionResolver(value: L): Self = StObject.set(x, "_taskCompletionResolver", value.asInstanceOf[js.Any])
    
    inline def set_updateProgress(value: Any): Self = StObject.set(x, "_updateProgress", value.asInstanceOf[js.Any])
  }
}
