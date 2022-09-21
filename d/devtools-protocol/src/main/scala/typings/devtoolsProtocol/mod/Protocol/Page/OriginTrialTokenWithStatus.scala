package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginTrialTokenWithStatus extends StObject {
  
  /**
    * `parsedToken` is present only when the token is extractable and
    * parsable.
    */
  var parsedToken: js.UndefOr[OriginTrialToken] = js.undefined
  
  var rawTokenText: String
  
  var status: OriginTrialTokenStatus
}
object OriginTrialTokenWithStatus {
  
  inline def apply(rawTokenText: String, status: OriginTrialTokenStatus): OriginTrialTokenWithStatus = {
    val __obj = js.Dynamic.literal(rawTokenText = rawTokenText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginTrialTokenWithStatus]
  }
  
  extension [Self <: OriginTrialTokenWithStatus](x: Self) {
    
    inline def setParsedToken(value: OriginTrialToken): Self = StObject.set(x, "parsedToken", value.asInstanceOf[js.Any])
    
    inline def setParsedTokenUndefined: Self = StObject.set(x, "parsedToken", js.undefined)
    
    inline def setRawTokenText(value: String): Self = StObject.set(x, "rawTokenText", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OriginTrialTokenStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
