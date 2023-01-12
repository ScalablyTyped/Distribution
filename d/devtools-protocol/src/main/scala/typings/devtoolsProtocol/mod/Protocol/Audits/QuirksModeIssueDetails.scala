package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.Network.LoaderId
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuirksModeIssueDetails extends StObject {
  
  var documentNodeId: BackendNodeId
  
  var frameId: FrameId
  
  /**
    * If false, it means the document's mode is "quirks"
    * instead of "limited-quirks".
    */
  var isLimitedQuirksMode: Boolean
  
  var loaderId: LoaderId
  
  var url: String
}
object QuirksModeIssueDetails {
  
  inline def apply(
    documentNodeId: BackendNodeId,
    frameId: FrameId,
    isLimitedQuirksMode: Boolean,
    loaderId: LoaderId,
    url: String
  ): QuirksModeIssueDetails = {
    val __obj = js.Dynamic.literal(documentNodeId = documentNodeId.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], isLimitedQuirksMode = isLimitedQuirksMode.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuirksModeIssueDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuirksModeIssueDetails] (val x: Self) extends AnyVal {
    
    inline def setDocumentNodeId(value: BackendNodeId): Self = StObject.set(x, "documentNodeId", value.asInstanceOf[js.Any])
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setIsLimitedQuirksMode(value: Boolean): Self = StObject.set(x, "isLimitedQuirksMode", value.asInstanceOf[js.Any])
    
    inline def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
