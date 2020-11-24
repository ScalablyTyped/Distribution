package typings.devtoolsProtocol.mod.Protocol.Audits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MixedContentIssueDetails extends js.Object {
  
  /**
    * Optional because not every mixed content issue is necessarily linked to a frame.
    */
  var frame: js.UndefOr[AffectedFrame] = js.native
  
  /**
    * The unsafe http url causing the mixed content issue.
    */
  var insecureURL: String = js.native
  
  /**
    * The url responsible for the call to an unsafe url.
    */
  var mainResourceURL: String = js.native
  
  /**
    * The mixed content request.
    * Does not always exist (e.g. for unsafe form submission urls).
    */
  var request: js.UndefOr[AffectedRequest] = js.native
  
  /**
    * The way the mixed content issue is being resolved.
    */
  var resolutionStatus: MixedContentResolutionStatus = js.native
  
  /**
    * The type of resource causing the mixed content issue (css, js, iframe,
    * form,...). Marked as optional because it is mapped to from
    * blink::mojom::RequestContextType, which will be replaced
    * by network::mojom::RequestDestination
    */
  var resourceType: js.UndefOr[MixedContentResourceType] = js.native
}
object MixedContentIssueDetails {
  
  @scala.inline
  def apply(insecureURL: String, mainResourceURL: String, resolutionStatus: MixedContentResolutionStatus): MixedContentIssueDetails = {
    val __obj = js.Dynamic.literal(insecureURL = insecureURL.asInstanceOf[js.Any], mainResourceURL = mainResourceURL.asInstanceOf[js.Any], resolutionStatus = resolutionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixedContentIssueDetails]
  }
  
  @scala.inline
  implicit class MixedContentIssueDetailsOps[Self <: MixedContentIssueDetails] (val x: Self) extends AnyVal {
    
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
    def setInsecureURL(value: String): Self = this.set("insecureURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainResourceURL(value: String): Self = this.set("mainResourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionStatus(value: MixedContentResolutionStatus): Self = this.set("resolutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: AffectedFrame): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    
    @scala.inline
    def setRequest(value: AffectedRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setResourceType(value: MixedContentResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
}
