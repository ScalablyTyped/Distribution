package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameRequestedNavigationEvent extends js.Object {
  
  /**
    * The disposition for the navigation.
    */
  var disposition: ClientNavigationDisposition = js.native
  
  /**
    * Id of the frame that is being navigated.
    */
  var frameId: FrameId = js.native
  
  /**
    * The reason for the navigation.
    */
  var reason: ClientNavigationReason = js.native
  
  /**
    * The destination URL for the requested navigation.
    */
  var url: String = js.native
}
object FrameRequestedNavigationEvent {
  
  @scala.inline
  def apply(
    disposition: ClientNavigationDisposition,
    frameId: FrameId,
    reason: ClientNavigationReason,
    url: String
  ): FrameRequestedNavigationEvent = {
    val __obj = js.Dynamic.literal(disposition = disposition.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameRequestedNavigationEvent]
  }
  
  @scala.inline
  implicit class FrameRequestedNavigationEventOps[Self <: FrameRequestedNavigationEvent] (val x: Self) extends AnyVal {
    
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
    def setDisposition(value: ClientNavigationDisposition): Self = this.set("disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: ClientNavigationReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
