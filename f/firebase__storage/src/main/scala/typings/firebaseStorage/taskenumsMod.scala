package typings.firebaseStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/taskenums", JSImport.Namespace)
@js.native
object taskenumsMod extends js.Object {
  
  def taskStateFromInternalTaskState(state: InternalTaskState): TaskState = js.native
  
  @js.native
  object InternalTaskState extends js.Object {
    
    var CANCELED: String = js.native
    
    var CANCELING: String = js.native
    
    var ERROR: String = js.native
    
    var PAUSED: String = js.native
    
    var PAUSING: String = js.native
    
    var RUNNING: String = js.native
    
    var SUCCESS: String = js.native
  }
  
  @js.native
  object TaskEvent extends js.Object {
    
    /** Triggered whenever the task changes or progress is updated. */
    var STATE_CHANGED: String = js.native
  }
  
  @js.native
  object TaskState extends js.Object {
    
    /** The task was canceled. */
    var CANCELED: String = js.native
    
    /** The task failed with an error. */
    var ERROR: String = js.native
    
    /** The task was paused by the user. */
    var PAUSED: String = js.native
    
    /** The task is currently transferring data. */
    var RUNNING: String = js.native
    
    /** The task completed successfully. */
    var SUCCESS: String = js.native
  }
  
  type InternalTaskState = String
  
  type TaskEvent = String
  
  type TaskState = String
}
