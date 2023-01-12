package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError
import typings.firebaseFirestore.firebaseFirestoreStrings.Error_
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcApiBundleMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/bundle", "LoadBundleTask")
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
  
  trait LoadBundleTaskProgress extends StObject {
    
    /** How many bytes have been loaded. */
    var bytesLoaded: Double
    
    /** How many documents have been loaded. */
    var documentsLoaded: Double
    
    /** Current task state. */
    var taskState: TaskState
    
    /** How many bytes are in the bundle being loaded. */
    var totalBytes: Double
    
    /** How many documents are in the bundle being loaded. */
    var totalDocuments: Double
  }
  object LoadBundleTaskProgress {
    
    inline def apply(
      bytesLoaded: Double,
      documentsLoaded: Double,
      taskState: TaskState,
      totalBytes: Double,
      totalDocuments: Double
    ): LoadBundleTaskProgress = {
      val __obj = js.Dynamic.literal(bytesLoaded = bytesLoaded.asInstanceOf[js.Any], documentsLoaded = documentsLoaded.asInstanceOf[js.Any], taskState = taskState.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], totalDocuments = totalDocuments.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBundleTaskProgress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadBundleTaskProgress] (val x: Self) extends AnyVal {
      
      inline def setBytesLoaded(value: Double): Self = StObject.set(x, "bytesLoaded", value.asInstanceOf[js.Any])
      
      inline def setDocumentsLoaded(value: Double): Self = StObject.set(x, "documentsLoaded", value.asInstanceOf[js.Any])
      
      inline def setTaskState(value: TaskState): Self = StObject.set(x, "taskState", value.asInstanceOf[js.Any])
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
      
      inline def setTotalDocuments(value: Double): Self = StObject.set(x, "totalDocuments", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.Error_
    - typings.firebaseFirestore.firebaseFirestoreStrings.Running
    - typings.firebaseFirestore.firebaseFirestoreStrings.Success
  */
  trait TaskState extends StObject
  object TaskState {
    
    inline def Error: Error_ = "Error".asInstanceOf[Error_]
    
    inline def Running: typings.firebaseFirestore.firebaseFirestoreStrings.Running = "Running".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.Running]
    
    inline def Success: typings.firebaseFirestore.firebaseFirestoreStrings.Success = "Success".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.Success]
  }
}
