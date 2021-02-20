package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadWillBeginEvent extends StObject {
  
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
  implicit class DownloadWillBeginEventMutableBuilder[Self <: DownloadWillBeginEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedFilename(value: String): Self = StObject.set(x, "suggestedFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
