package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.canceled_
import typings.devtoolsProtocol.devtoolsProtocolStrings.completed
import typings.devtoolsProtocol.devtoolsProtocolStrings.inProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadProgressEvent extends StObject {
  
  /**
    * Global unique identifier of the download.
    */
  var guid: String
  
  /**
    * Total bytes received.
    */
  var receivedBytes: Double
  
  /**
    * Download status. (DownloadProgressEventState enum)
    */
  var state: inProgress | completed | canceled_
  
  /**
    * Total expected bytes to download.
    */
  var totalBytes: Double
}
object DownloadProgressEvent {
  
  inline def apply(guid: String, receivedBytes: Double, state: inProgress | completed | canceled_, totalBytes: Double): DownloadProgressEvent = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], receivedBytes = receivedBytes.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgressEvent]
  }
  
  extension [Self <: DownloadProgressEvent](x: Self) {
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setReceivedBytes(value: Double): Self = StObject.set(x, "receivedBytes", value.asInstanceOf[js.Any])
    
    inline def setState(value: inProgress | completed | canceled_): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
  }
}
