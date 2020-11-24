package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadWillBeginEvent extends js.Object {
  
  /**
    * Id of the frame that caused download to begin.
    */
  var frameId: FrameId = js.native
  
  /**
    * Global unique identifier of the download.
    */
  var guid: String = js.native
  
  /**
    * Suggested file name of the resource (the actual name of the file saved on disk may differ).
    */
  var suggestedFilename: String = js.native
  
  /**
    * URL of the resource being downloaded.
    */
  var url: String = js.native
}
object DownloadWillBeginEvent {
  
  @scala.inline
  def apply(frameId: FrameId, guid: String, suggestedFilename: String, url: String): DownloadWillBeginEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], suggestedFilename = suggestedFilename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadWillBeginEvent]
  }
  
  @scala.inline
  implicit class DownloadWillBeginEventOps[Self <: DownloadWillBeginEvent] (val x: Self) extends AnyVal {
    
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
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedFilename(value: String): Self = this.set("suggestedFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
