package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginTrialToken extends StObject {
  
  var expiryTime: TimeSinceEpoch
  
  var isThirdParty: Boolean
  
  var matchSubDomains: Boolean
  
  var origin: String
  
  var trialName: String
  
  var usageRestriction: OriginTrialUsageRestriction
}
object OriginTrialToken {
  
  inline def apply(
    expiryTime: TimeSinceEpoch,
    isThirdParty: Boolean,
    matchSubDomains: Boolean,
    origin: String,
    trialName: String,
    usageRestriction: OriginTrialUsageRestriction
  ): OriginTrialToken = {
    val __obj = js.Dynamic.literal(expiryTime = expiryTime.asInstanceOf[js.Any], isThirdParty = isThirdParty.asInstanceOf[js.Any], matchSubDomains = matchSubDomains.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], trialName = trialName.asInstanceOf[js.Any], usageRestriction = usageRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginTrialToken]
  }
  
  extension [Self <: OriginTrialToken](x: Self) {
    
    inline def setExpiryTime(value: TimeSinceEpoch): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
    
    inline def setIsThirdParty(value: Boolean): Self = StObject.set(x, "isThirdParty", value.asInstanceOf[js.Any])
    
    inline def setMatchSubDomains(value: Boolean): Self = StObject.set(x, "matchSubDomains", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setTrialName(value: String): Self = StObject.set(x, "trialName", value.asInstanceOf[js.Any])
    
    inline def setUsageRestriction(value: OriginTrialUsageRestriction): Self = StObject.set(x, "usageRestriction", value.asInstanceOf[js.Any])
  }
}
