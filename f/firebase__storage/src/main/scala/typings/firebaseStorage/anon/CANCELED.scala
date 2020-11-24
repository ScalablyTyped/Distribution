package typings.firebaseStorage.anon

import typings.firebaseStorageTypes.mod.TaskState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CANCELED extends js.Object {
  
  var CANCELED: TaskState = js.native
  
  var ERROR: TaskState = js.native
  
  var PAUSED: TaskState = js.native
  
  var RUNNING: TaskState = js.native
  
  var SUCCESS: TaskState = js.native
}
object CANCELED {
  
  @scala.inline
  def apply(CANCELED: TaskState, ERROR: TaskState, PAUSED: TaskState, RUNNING: TaskState, SUCCESS: TaskState): CANCELED = {
    val __obj = js.Dynamic.literal(CANCELED = CANCELED.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], PAUSED = PAUSED.asInstanceOf[js.Any], RUNNING = RUNNING.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[CANCELED]
  }
  
  @scala.inline
  implicit class CANCELEDOps[Self <: CANCELED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCANCELED(value: TaskState): Self = this.set("CANCELED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: TaskState): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAUSED(value: TaskState): Self = this.set("PAUSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUNNING(value: TaskState): Self = this.set("RUNNING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUCCESS(value: TaskState): Self = this.set("SUCCESS", value.asInstanceOf[js.Any])
  }
}
