package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectorIssueDetails extends StObject {
  
  var blockedByResponseIssueDetails: js.UndefOr[BlockedByResponseIssueDetails] = js.native
  
  var contentSecurityPolicyIssueDetails: js.UndefOr[ContentSecurityPolicyIssueDetails] = js.native
  
  var heavyAdIssueDetails: js.UndefOr[HeavyAdIssueDetails] = js.native
  
  var mixedContentIssueDetails: js.UndefOr[MixedContentIssueDetails] = js.native
  
  var sameSiteCookieIssueDetails: js.UndefOr[SameSiteCookieIssueDetails] = js.native
}
object InspectorIssueDetails {
  
  @scala.inline
  def apply(): InspectorIssueDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectorIssueDetails]
  }
  
  @scala.inline
  implicit class InspectorIssueDetailsMutableBuilder[Self <: InspectorIssueDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockedByResponseIssueDetails(value: BlockedByResponseIssueDetails): Self = StObject.set(x, "blockedByResponseIssueDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedByResponseIssueDetailsUndefined: Self = StObject.set(x, "blockedByResponseIssueDetails", js.undefined)
    
    @scala.inline
    def setContentSecurityPolicyIssueDetails(value: ContentSecurityPolicyIssueDetails): Self = StObject.set(x, "contentSecurityPolicyIssueDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentSecurityPolicyIssueDetailsUndefined: Self = StObject.set(x, "contentSecurityPolicyIssueDetails", js.undefined)
    
    @scala.inline
    def setHeavyAdIssueDetails(value: HeavyAdIssueDetails): Self = StObject.set(x, "heavyAdIssueDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeavyAdIssueDetailsUndefined: Self = StObject.set(x, "heavyAdIssueDetails", js.undefined)
    
    @scala.inline
    def setMixedContentIssueDetails(value: MixedContentIssueDetails): Self = StObject.set(x, "mixedContentIssueDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixedContentIssueDetailsUndefined: Self = StObject.set(x, "mixedContentIssueDetails", js.undefined)
    
    @scala.inline
    def setSameSiteCookieIssueDetails(value: SameSiteCookieIssueDetails): Self = StObject.set(x, "sameSiteCookieIssueDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameSiteCookieIssueDetailsUndefined: Self = StObject.set(x, "sameSiteCookieIssueDetails", js.undefined)
  }
}
