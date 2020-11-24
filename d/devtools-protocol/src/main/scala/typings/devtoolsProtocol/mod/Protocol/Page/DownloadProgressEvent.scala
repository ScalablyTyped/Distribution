package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.canceled
import typings.devtoolsProtocol.devtoolsProtocolStrings.completed
import typings.devtoolsProtocol.devtoolsProtocolStrings.inProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadProgressEvent extends js.Object {
  
  /**
    * Global unique identifier of the download.
    */
  var guid: String = js.native
  
  /**
    * Total bytes received.
    */
  var receivedBytes: Double = js.native
  
  /**
    * Download status. (DownloadProgressEventState enum)
    */
  var state: inProgress | completed | canceled = js.native
  
  /**
    * Total expected bytes to download.
    */
  var totalBytes: Double = js.native
}
object DownloadProgressEvent {
  
  @scala.inline
  def apply(guid: String, receivedBytes: Double, state: inProgress | completed | canceled, totalBytes: Double): DownloadProgressEvent = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], receivedBytes = receivedBytes.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgressEvent]
  }
  
  @scala.inline
  implicit class DownloadProgressEventOps[Self <: DownloadProgressEvent] (val x: Self) extends AnyVal {
    
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
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedBytes(value: Double): Self = this.set("receivedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: inProgress | completed | canceled): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytes(value: Double): Self = this.set("totalBytes", value.asInstanceOf[js.Any])
  }
}
