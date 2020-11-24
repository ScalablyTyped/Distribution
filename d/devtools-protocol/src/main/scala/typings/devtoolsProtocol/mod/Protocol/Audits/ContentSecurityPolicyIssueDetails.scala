package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentSecurityPolicyIssueDetails extends js.Object {
  
  /**
    * The url not included in allowed sources.
    */
  var blockedURL: js.UndefOr[String] = js.native
  
  var contentSecurityPolicyViolationType: ContentSecurityPolicyViolationType = js.native
  
  var frameAncestor: js.UndefOr[AffectedFrame] = js.native
  
  var isReportOnly: Boolean = js.native
  
  var sourceCodeLocation: js.UndefOr[SourceCodeLocation] = js.native
  
  /**
    * Specific directive that is violated, causing the CSP issue.
    */
  var violatedDirective: String = js.native
  
  var violatingNodeId: js.UndefOr[BackendNodeId] = js.native
}
object ContentSecurityPolicyIssueDetails {
  
  @scala.inline
  def apply(
    contentSecurityPolicyViolationType: ContentSecurityPolicyViolationType,
    isReportOnly: Boolean,
    violatedDirective: String
  ): ContentSecurityPolicyIssueDetails = {
    val __obj = js.Dynamic.literal(contentSecurityPolicyViolationType = contentSecurityPolicyViolationType.asInstanceOf[js.Any], isReportOnly = isReportOnly.asInstanceOf[js.Any], violatedDirective = violatedDirective.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSecurityPolicyIssueDetails]
  }
  
  @scala.inline
  implicit class ContentSecurityPolicyIssueDetailsOps[Self <: ContentSecurityPolicyIssueDetails] (val x: Self) extends AnyVal {
    
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
    def setContentSecurityPolicyViolationType(value: ContentSecurityPolicyViolationType): Self = this.set("contentSecurityPolicyViolationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReportOnly(value: Boolean): Self = this.set("isReportOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolatedDirective(value: String): Self = this.set("violatedDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedURL(value: String): Self = this.set("blockedURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockedURL: Self = this.set("blockedURL", js.undefined)
    
    @scala.inline
    def setFrameAncestor(value: AffectedFrame): Self = this.set("frameAncestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameAncestor: Self = this.set("frameAncestor", js.undefined)
    
    @scala.inline
    def setSourceCodeLocation(value: SourceCodeLocation): Self = this.set("sourceCodeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCodeLocation: Self = this.set("sourceCodeLocation", js.undefined)
    
    @scala.inline
    def setViolatingNodeId(value: BackendNodeId): Self = this.set("violatingNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolatingNodeId: Self = this.set("violatingNodeId", js.undefined)
  }
}
