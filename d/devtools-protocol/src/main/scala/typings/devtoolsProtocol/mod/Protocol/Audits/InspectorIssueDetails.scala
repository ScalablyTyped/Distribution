package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorIssueDetails extends StObject {
  
  var attributionReportingIssueDetails: js.UndefOr[AttributionReportingIssueDetails] = js.undefined
  
  var blockedByResponseIssueDetails: js.UndefOr[BlockedByResponseIssueDetails] = js.undefined
  
  var clientHintIssueDetails: js.UndefOr[ClientHintIssueDetails] = js.undefined
  
  var contentSecurityPolicyIssueDetails: js.UndefOr[ContentSecurityPolicyIssueDetails] = js.undefined
  
  var cookieIssueDetails: js.UndefOr[CookieIssueDetails] = js.undefined
  
  var corsIssueDetails: js.UndefOr[CorsIssueDetails] = js.undefined
  
  var deprecationIssueDetails: js.UndefOr[DeprecationIssueDetails] = js.undefined
  
  var federatedAuthRequestIssueDetails: js.UndefOr[FederatedAuthRequestIssueDetails] = js.undefined
  
  var genericIssueDetails: js.UndefOr[GenericIssueDetails] = js.undefined
  
  var heavyAdIssueDetails: js.UndefOr[HeavyAdIssueDetails] = js.undefined
  
  var lowTextContrastIssueDetails: js.UndefOr[LowTextContrastIssueDetails] = js.undefined
  
  var mixedContentIssueDetails: js.UndefOr[MixedContentIssueDetails] = js.undefined
  
  var navigatorUserAgentIssueDetails: js.UndefOr[NavigatorUserAgentIssueDetails] = js.undefined
  
  var quirksModeIssueDetails: js.UndefOr[QuirksModeIssueDetails] = js.undefined
  
  var sharedArrayBufferIssueDetails: js.UndefOr[SharedArrayBufferIssueDetails] = js.undefined
  
  var twaQualityEnforcementDetails: js.UndefOr[TrustedWebActivityIssueDetails] = js.undefined
}
object InspectorIssueDetails {
  
  inline def apply(): InspectorIssueDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectorIssueDetails]
  }
  
  extension [Self <: InspectorIssueDetails](x: Self) {
    
    inline def setAttributionReportingIssueDetails(value: AttributionReportingIssueDetails): Self = StObject.set(x, "attributionReportingIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setAttributionReportingIssueDetailsUndefined: Self = StObject.set(x, "attributionReportingIssueDetails", js.undefined)
    
    inline def setBlockedByResponseIssueDetails(value: BlockedByResponseIssueDetails): Self = StObject.set(x, "blockedByResponseIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setBlockedByResponseIssueDetailsUndefined: Self = StObject.set(x, "blockedByResponseIssueDetails", js.undefined)
    
    inline def setClientHintIssueDetails(value: ClientHintIssueDetails): Self = StObject.set(x, "clientHintIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setClientHintIssueDetailsUndefined: Self = StObject.set(x, "clientHintIssueDetails", js.undefined)
    
    inline def setContentSecurityPolicyIssueDetails(value: ContentSecurityPolicyIssueDetails): Self = StObject.set(x, "contentSecurityPolicyIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setContentSecurityPolicyIssueDetailsUndefined: Self = StObject.set(x, "contentSecurityPolicyIssueDetails", js.undefined)
    
    inline def setCookieIssueDetails(value: CookieIssueDetails): Self = StObject.set(x, "cookieIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setCookieIssueDetailsUndefined: Self = StObject.set(x, "cookieIssueDetails", js.undefined)
    
    inline def setCorsIssueDetails(value: CorsIssueDetails): Self = StObject.set(x, "corsIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setCorsIssueDetailsUndefined: Self = StObject.set(x, "corsIssueDetails", js.undefined)
    
    inline def setDeprecationIssueDetails(value: DeprecationIssueDetails): Self = StObject.set(x, "deprecationIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setDeprecationIssueDetailsUndefined: Self = StObject.set(x, "deprecationIssueDetails", js.undefined)
    
    inline def setFederatedAuthRequestIssueDetails(value: FederatedAuthRequestIssueDetails): Self = StObject.set(x, "federatedAuthRequestIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setFederatedAuthRequestIssueDetailsUndefined: Self = StObject.set(x, "federatedAuthRequestIssueDetails", js.undefined)
    
    inline def setGenericIssueDetails(value: GenericIssueDetails): Self = StObject.set(x, "genericIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setGenericIssueDetailsUndefined: Self = StObject.set(x, "genericIssueDetails", js.undefined)
    
    inline def setHeavyAdIssueDetails(value: HeavyAdIssueDetails): Self = StObject.set(x, "heavyAdIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setHeavyAdIssueDetailsUndefined: Self = StObject.set(x, "heavyAdIssueDetails", js.undefined)
    
    inline def setLowTextContrastIssueDetails(value: LowTextContrastIssueDetails): Self = StObject.set(x, "lowTextContrastIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setLowTextContrastIssueDetailsUndefined: Self = StObject.set(x, "lowTextContrastIssueDetails", js.undefined)
    
    inline def setMixedContentIssueDetails(value: MixedContentIssueDetails): Self = StObject.set(x, "mixedContentIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setMixedContentIssueDetailsUndefined: Self = StObject.set(x, "mixedContentIssueDetails", js.undefined)
    
    inline def setNavigatorUserAgentIssueDetails(value: NavigatorUserAgentIssueDetails): Self = StObject.set(x, "navigatorUserAgentIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setNavigatorUserAgentIssueDetailsUndefined: Self = StObject.set(x, "navigatorUserAgentIssueDetails", js.undefined)
    
    inline def setQuirksModeIssueDetails(value: QuirksModeIssueDetails): Self = StObject.set(x, "quirksModeIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setQuirksModeIssueDetailsUndefined: Self = StObject.set(x, "quirksModeIssueDetails", js.undefined)
    
    inline def setSharedArrayBufferIssueDetails(value: SharedArrayBufferIssueDetails): Self = StObject.set(x, "sharedArrayBufferIssueDetails", value.asInstanceOf[js.Any])
    
    inline def setSharedArrayBufferIssueDetailsUndefined: Self = StObject.set(x, "sharedArrayBufferIssueDetails", js.undefined)
    
    inline def setTwaQualityEnforcementDetails(value: TrustedWebActivityIssueDetails): Self = StObject.set(x, "twaQualityEnforcementDetails", value.asInstanceOf[js.Any])
    
    inline def setTwaQualityEnforcementDetailsUndefined: Self = StObject.set(x, "twaQualityEnforcementDetails", js.undefined)
  }
}
