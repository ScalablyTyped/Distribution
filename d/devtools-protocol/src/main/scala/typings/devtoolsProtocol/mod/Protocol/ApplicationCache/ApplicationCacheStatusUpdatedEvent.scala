package typings.devtoolsProtocol.mod.Protocol.ApplicationCache

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCacheStatusUpdatedEvent extends js.Object {
  
  /**
    * Identifier of the frame containing document whose application cache updated status.
    */
  var frameId: FrameId = js.native
  
  /**
    * Manifest URL.
    */
  var manifestURL: String = js.native
  
  /**
    * Updated application cache status.
    */
  var status: integer = js.native
}
object ApplicationCacheStatusUpdatedEvent {
  
  @scala.inline
  def apply(frameId: FrameId, manifestURL: String, status: integer): ApplicationCacheStatusUpdatedEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], manifestURL = manifestURL.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCacheStatusUpdatedEvent]
  }
  
  @scala.inline
  implicit class ApplicationCacheStatusUpdatedEventOps[Self <: ApplicationCacheStatusUpdatedEvent] (val x: Self) extends AnyVal {
    
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
    def setManifestURL(value: String): Self = this.set("manifestURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: integer): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
