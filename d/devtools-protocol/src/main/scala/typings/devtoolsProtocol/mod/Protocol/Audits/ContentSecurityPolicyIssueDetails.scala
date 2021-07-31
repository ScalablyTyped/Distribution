package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentSecurityPolicyIssueDetails extends StObject {
  
  /**
    * The url not included in allowed sources.
    */
  var blockedURL: js.UndefOr[String] = js.undefined
  
  var contentSecurityPolicyViolationType: ContentSecurityPolicyViolationType
  
  var frameAncestor: js.UndefOr[AffectedFrame] = js.undefined
  
  var isReportOnly: Boolean
  
  var sourceCodeLocation: js.UndefOr[SourceCodeLocation] = js.undefined
  
  /**
    * Specific directive that is violated, causing the CSP issue.
    */
  var violatedDirective: String
  
  var violatingNodeId: js.UndefOr[BackendNodeId] = js.undefined
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
  implicit class ContentSecurityPolicyIssueDetailsMutableBuilder[Self <: ContentSecurityPolicyIssueDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockedURL(value: String): Self = StObject.set(x, "blockedURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedURLUndefined: Self = StObject.set(x, "blockedURL", js.undefined)
    
    @scala.inline
    def setContentSecurityPolicyViolationType(value: ContentSecurityPolicyViolationType): Self = StObject.set(x, "contentSecurityPolicyViolationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameAncestor(value: AffectedFrame): Self = StObject.set(x, "frameAncestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameAncestorUndefined: Self = StObject.set(x, "frameAncestor", js.undefined)
    
    @scala.inline
    def setIsReportOnly(value: Boolean): Self = StObject.set(x, "isReportOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeLocation(value: SourceCodeLocation): Self = StObject.set(x, "sourceCodeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeLocationUndefined: Self = StObject.set(x, "sourceCodeLocation", js.undefined)
    
    @scala.inline
    def setViolatedDirective(value: String): Self = StObject.set(x, "violatedDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolatingNodeId(value: BackendNodeId): Self = StObject.set(x, "violatingNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolatingNodeIdUndefined: Self = StObject.set(x, "violatingNodeId", js.undefined)
  }
}
