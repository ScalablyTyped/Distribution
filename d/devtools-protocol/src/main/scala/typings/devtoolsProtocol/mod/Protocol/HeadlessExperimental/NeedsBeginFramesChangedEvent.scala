package typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NeedsBeginFramesChangedEvent extends js.Object {
  
  /**
    * True if BeginFrames are needed, false otherwise.
    */
  var needsBeginFrames: Boolean = js.native
}
object NeedsBeginFramesChangedEvent {
  
  @scala.inline
  def apply(needsBeginFrames: Boolean): NeedsBeginFramesChangedEvent = {
    val __obj = js.Dynamic.literal(needsBeginFrames = needsBeginFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedsBeginFramesChangedEvent]
  }
  
  @scala.inline
  implicit class NeedsBeginFramesChangedEventOps[Self <: NeedsBeginFramesChangedEvent] (val x: Self) extends AnyVal {
    
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
    def setNeedsBeginFrames(value: Boolean): Self = this.set("needsBeginFrames", value.asInstanceOf[js.Any])
  }
}
