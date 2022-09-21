package typings.firebaseStorage

import typings.firebaseStorage.firebaseStorageStrings.canceled
import typings.firebaseStorage.firebaseStorageStrings.canceling
import typings.firebaseStorage.firebaseStorageStrings.error
import typings.firebaseStorage.firebaseStorageStrings.paused
import typings.firebaseStorage.firebaseStorageStrings.pausing
import typings.firebaseStorage.firebaseStorageStrings.running
import typings.firebaseStorage.firebaseStorageStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationTaskenumsMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/taskenums", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object TaskEvent {
    
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskEvent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * For this event,
      * <ul>
      *   <li>The `next` function is triggered on progress updates and when the
      *       task is paused/resumed with an `UploadTaskSnapshot` as the first
      *       argument.</li>
      *   <li>The `error` function is triggered if the upload is canceled or fails
      *       for another reason.</li>
      *   <li>The `complete` function is triggered if the upload completes
      *       successfully.</li>
      * </ul>
      */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskEvent.STATE_CHANGED")
    @js.native
    def STATE_CHANGED: String = js.native
    inline def STATE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_CHANGED")(x.asInstanceOf[js.Any])
  }
  type TaskEvent = String
  
  /* Inlined { readonly RUNNING :'running',  readonly PAUSED :'paused',  readonly SUCCESS :'success',  readonly CANCELED :'canceled',  readonly ERROR :'error'}[keyof { readonly RUNNING :'running',  readonly PAUSED :'paused',  readonly SUCCESS :'success',  readonly CANCELED :'canceled',  readonly ERROR :'error'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseStorage.firebaseStorageStrings.running
    - typings.firebaseStorage.firebaseStorageStrings.paused
    - typings.firebaseStorage.firebaseStorageStrings.canceled
    - typings.firebaseStorage.firebaseStorageStrings.error
    - typings.firebaseStorage.firebaseStorageStrings.success
  */
  trait TaskState extends StObject
  object TaskState {
    
    /** The task was canceled. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.CANCELED")
    @js.native
    val CANCELED: canceled = js.native
    
    /** The task failed with an error. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.ERROR")
    @js.native
    val ERROR: error = js.native
    
    /** The task was paused by the user. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.PAUSED")
    @js.native
    val PAUSED: paused = js.native
    
    /** The task is currently transferring data. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.RUNNING")
    @js.native
    val RUNNING: running = js.native
    
    /** The task completed successfully. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.SUCCESS")
    @js.native
    val SUCCESS: success = js.native
  }
  
  inline def taskStateFromInternalTaskState(state: InternalTaskState): TaskState = ^.asInstanceOf[js.Dynamic].applyDynamic("taskStateFromInternalTaskState")(state.asInstanceOf[js.Any]).asInstanceOf[TaskState]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseStorage.firebaseStorageStrings.running
    - typings.firebaseStorage.firebaseStorageStrings.pausing
    - typings.firebaseStorage.firebaseStorageStrings.paused
    - typings.firebaseStorage.firebaseStorageStrings.success
    - typings.firebaseStorage.firebaseStorageStrings.canceling
    - typings.firebaseStorage.firebaseStorageStrings.canceled
    - typings.firebaseStorage.firebaseStorageStrings.error
  */
  trait InternalTaskState extends StObject
  object InternalTaskState {
    
    inline def CANCELED: canceled = "canceled".asInstanceOf[canceled]
    
    inline def CANCELING: canceling = "canceling".asInstanceOf[canceling]
    
    inline def ERROR: error = "error".asInstanceOf[error]
    
    inline def PAUSED: paused = "paused".asInstanceOf[paused]
    
    inline def PAUSING: pausing = "pausing".asInstanceOf[pausing]
    
    inline def RUNNING: running = "running".asInstanceOf[running]
    
    inline def SUCCESS: success = "success".asInstanceOf[success]
  }
}
