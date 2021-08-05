package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorIssueDetails extends StObject {
  
  var blockedByResponseIssueDetails: js.UndefOr[BlockedByResponseIssueDetails] = js.undefined
  
  var contentSecurityPolicyIssueDetails: js.UndefOr[ContentSecurityPolicyIssueDetails] = js.undefined
  
  var heavyAdIssueDetails: js.UndefOr[HeavyAdIssueDetails] = js.undefined
  
  var mixedContentIssueDetails: js.UndefOr[MixedContentIssueDetails] = js.undefined
  
  var sameSiteCookieIssueDetails: js.UndefOr[SameSiteCookieIssueDetails] = js.undefined
}
object InspectorIssueDetails {
  
  inline def apply(): InspectorIssueDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectorIssueDetails]
  }
  
  extension [Self <: InspectorIssueDetails](x: Self) {
    
    inline def setBlockedByResponseIssueDetails(value: BlockedByResponseIssueDetails): Self = StObject.set(x, "blockedByResponseIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setBlockedByResponseIssueDetailsUndefined: Self = StObject.set(x, "blockedByResponseIssueDetails", js.undefined)
    
    inline def setContentSecurityPolicyIssueDetails(value: ContentSecurityPolicyIssueDetails): Self = StObject.set(x, "contentSecurityPolicyIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setContentSecurityPolicyIssueDetailsUndefined: Self = StObject.set(x, "contentSecurityPolicyIssueDetails", js.undefined)
    
    inline def setHeavyAdIssueDetails(value: HeavyAdIssueDetails): Self = StObject.set(x, "heavyAdIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setHeavyAdIssueDetailsUndefined: Self = StObject.set(x, "heavyAdIssueDetails", js.undefined)
    
    inline def setMixedContentIssueDetails(value: MixedContentIssueDetails): Self = StObject.set(x, "mixedContentIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setMixedContentIssueDetailsUndefined: Self = StObject.set(x, "mixedContentIssueDetails", js.undefined)
    
    inline def setSameSiteCookieIssueDetails(value: SameSiteCookieIssueDetails): Self = StObject.set(x, "sameSiteCookieIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setSameSiteCookieIssueDetailsUndefined: Self = StObject.set(x, "sameSiteCookieIssueDetails", js.undefined)
  }
}
