package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatedWithinDocumentEvent extends js.Object {
  
  /**
    * Id of the frame.
    */
  var frameId: FrameId = js.native
  
  /**
    * Frame's new url.
    */
  var url: String = js.native
}
object NavigatedWithinDocumentEvent {
  
  @scala.inline
  def apply(frameId: FrameId, url: String): NavigatedWithinDocumentEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatedWithinDocumentEvent]
  }
  
  @scala.inline
  implicit class NavigatedWithinDocumentEventOps[Self <: NavigatedWithinDocumentEvent] (val x: Self) extends AnyVal {
    
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
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
