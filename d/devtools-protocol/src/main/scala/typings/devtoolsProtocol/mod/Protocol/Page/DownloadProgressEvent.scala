package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.canceled
import typings.devtoolsProtocol.devtoolsProtocolStrings.completed
import typings.devtoolsProtocol.devtoolsProtocolStrings.inProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadProgressEvent extends StObject {
  
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
  implicit class DownloadProgressEventMutableBuilder[Self <: DownloadProgressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedBytes(value: Double): Self = StObject.set(x, "receivedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: inProgress | completed | canceled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
  }
}
