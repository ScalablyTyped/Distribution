package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixedContentIssueDetails extends StObject {
  
  /**
    * Optional because not every mixed content issue is necessarily linked to a frame.
    */
  var frame: js.UndefOr[AffectedFrame] = js.undefined
  
  /**
    * The unsafe http url causing the mixed content issue.
    */
  var insecureURL: String
  
  /**
    * The url responsible for the call to an unsafe url.
    */
  var mainResourceURL: String
  
  /**
    * The mixed content request.
    * Does not always exist (e.g. for unsafe form submission urls).
    */
  var request: js.UndefOr[AffectedRequest] = js.undefined
  
  /**
    * The way the mixed content issue is being resolved.
    */
  var resolutionStatus: MixedContentResolutionStatus
  
  /**
    * The type of resource causing the mixed content issue (css, js, iframe,
    * form,...). Marked as optional because it is mapped to from
    * blink::mojom::RequestContextType, which will be replaced
    * by network::mojom::RequestDestination
    */
  var resourceType: js.UndefOr[MixedContentResourceType] = js.undefined
}
object MixedContentIssueDetails {
  
  @scala.inline
  def apply(insecureURL: String, mainResourceURL: String, resolutionStatus: MixedContentResolutionStatus): MixedContentIssueDetails = {
    val __obj = js.Dynamic.literal(insecureURL = insecureURL.asInstanceOf[js.Any], mainResourceURL = mainResourceURL.asInstanceOf[js.Any], resolutionStatus = resolutionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixedContentIssueDetails]
  }
  
  @scala.inline
  implicit class MixedContentIssueDetailsMutableBuilder[Self <: MixedContentIssueDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrame(value: AffectedFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    @scala.inline
    def setInsecureURL(value: String): Self = StObject.set(x, "insecureURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainResourceURL(value: String): Self = StObject.set(x, "mainResourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AffectedRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResolutionStatus(value: MixedContentResolutionStatus): Self = StObject.set(x, "resolutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: MixedContentResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
