package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreativeRequirements extends StObject {
  
  /**
    * Output only. The format of the creative, only applicable for programmatic guaranteed and preferred deals.
    */
  var creativeFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Specifies the creative pre-approval policy.
    */
  var creativePreApprovalPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Specifies whether the creative is safeFrame compatible.
    */
  var creativeSafeFrameCompatibility: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The max duration of the video creative in milliseconds. only applicable for deals with video creatives.
    */
  var maxAdDurationMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Specifies the creative source for programmatic deals. PUBLISHER means creative is provided by seller and ADVERTISER means creative is provided by the buyer.
    */
  var programmaticCreativeSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Skippable video ads allow viewers to skip ads after 5 seconds. Only applicable for deals with video creatives.
    */
  var skippableAdType: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreativeRequirements {
  
  inline def apply(): SchemaCreativeRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeRequirements]
  }
  
  extension [Self <: SchemaCreativeRequirements](x: Self) {
    
    inline def setCreativeFormat(value: String): Self = StObject.set(x, "creativeFormat", value.asInstanceOf[js.Any])
    
    inline def setCreativeFormatNull: Self = StObject.set(x, "creativeFormat", null)
    
    inline def setCreativeFormatUndefined: Self = StObject.set(x, "creativeFormat", js.undefined)
    
    inline def setCreativePreApprovalPolicy(value: String): Self = StObject.set(x, "creativePreApprovalPolicy", value.asInstanceOf[js.Any])
    
    inline def setCreativePreApprovalPolicyNull: Self = StObject.set(x, "creativePreApprovalPolicy", null)
    
    inline def setCreativePreApprovalPolicyUndefined: Self = StObject.set(x, "creativePreApprovalPolicy", js.undefined)
    
    inline def setCreativeSafeFrameCompatibility(value: String): Self = StObject.set(x, "creativeSafeFrameCompatibility", value.asInstanceOf[js.Any])
    
    inline def setCreativeSafeFrameCompatibilityNull: Self = StObject.set(x, "creativeSafeFrameCompatibility", null)
    
    inline def setCreativeSafeFrameCompatibilityUndefined: Self = StObject.set(x, "creativeSafeFrameCompatibility", js.undefined)
    
    inline def setMaxAdDurationMs(value: String): Self = StObject.set(x, "maxAdDurationMs", value.asInstanceOf[js.Any])
    
    inline def setMaxAdDurationMsNull: Self = StObject.set(x, "maxAdDurationMs", null)
    
    inline def setMaxAdDurationMsUndefined: Self = StObject.set(x, "maxAdDurationMs", js.undefined)
    
    inline def setProgrammaticCreativeSource(value: String): Self = StObject.set(x, "programmaticCreativeSource", value.asInstanceOf[js.Any])
    
    inline def setProgrammaticCreativeSourceNull: Self = StObject.set(x, "programmaticCreativeSource", null)
    
    inline def setProgrammaticCreativeSourceUndefined: Self = StObject.set(x, "programmaticCreativeSource", js.undefined)
    
    inline def setSkippableAdType(value: String): Self = StObject.set(x, "skippableAdType", value.asInstanceOf[js.Any])
    
    inline def setSkippableAdTypeNull: Self = StObject.set(x, "skippableAdType", null)
    
    inline def setSkippableAdTypeUndefined: Self = StObject.set(x, "skippableAdType", js.undefined)
  }
}
