package typings.firebaseStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskenumsMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/taskenums", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object InternalTaskState {
    
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "InternalTaskState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "InternalTaskState.CANCELED")
    @js.native
    def CANCELED: String = js.native
    @scala.inline
    def CANCELED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "InternalTaskState.CANCELING")
    @js.native
    def CANCELING: String = js.native
    @scala.inline
    def CANCELING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELING")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "InternalTaskState.ERROR")
    @js.native
    def ERROR: String = js.native
    @scala.inline
    def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "InternalTaskState.PAUSED")
    @js.native
    def PAUSED: String = js.native
    @scala.inline
    def PAUSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAUSED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "InternalTaskState.PAUSING")
    @js.native
    def PAUSING: String = js.native
    @scala.inline
    def PAUSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAUSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "InternalTaskState.RUNNING")
    @js.native
    def RUNNING: String = js.native
    @scala.inline
    def RUNNING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUNNING")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "InternalTaskState.SUCCESS")
    @js.native
    def SUCCESS: String = js.native
    @scala.inline
    def SUCCESS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
  }
  type InternalTaskState = String
  
  object TaskEvent {
    
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskEvent")
    @js.native
    val ^ : js.Any = js.native
    
    /** Triggered whenever the task changes or progress is updated. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskEvent.STATE_CHANGED")
    @js.native
    def STATE_CHANGED: String = js.native
    @scala.inline
    def STATE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_CHANGED")(x.asInstanceOf[js.Any])
  }
  type TaskEvent = String
  
  object TaskState {
    
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState")
    @js.native
    val ^ : js.Any = js.native
    
    /** The task was canceled. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.CANCELED")
    @js.native
    def CANCELED: String = js.native
    @scala.inline
    def CANCELED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELED")(x.asInstanceOf[js.Any])
    
    /** The task failed with an error. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.ERROR")
    @js.native
    def ERROR: String = js.native
    @scala.inline
    def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    /** The task was paused by the user. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.PAUSED")
    @js.native
    def PAUSED: String = js.native
    @scala.inline
    def PAUSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAUSED")(x.asInstanceOf[js.Any])
    
    /** The task is currently transferring data. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.RUNNING")
    @js.native
    def RUNNING: String = js.native
    @scala.inline
    def RUNNING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUNNING")(x.asInstanceOf[js.Any])
    
    /** The task completed successfully. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.SUCCESS")
    @js.native
    def SUCCESS: String = js.native
    @scala.inline
    def SUCCESS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
  }
  type TaskState = String
  
  @scala.inline
  def taskStateFromInternalTaskState(state: InternalTaskState): TaskState = ^.asInstanceOf[js.Dynamic].applyDynamic("taskStateFromInternalTaskState")(state.asInstanceOf[js.Any]).asInstanceOf[TaskState]
}
