package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginTrial extends StObject {
  
  var status: OriginTrialStatus
  
  var tokensWithStatus: js.Array[OriginTrialTokenWithStatus]
  
  var trialName: String
}
object OriginTrial {
  
  inline def apply(
    status: OriginTrialStatus,
    tokensWithStatus: js.Array[OriginTrialTokenWithStatus],
    trialName: String
  ): OriginTrial = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], tokensWithStatus = tokensWithStatus.asInstanceOf[js.Any], trialName = trialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginTrial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginTrial] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: OriginTrialStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTokensWithStatus(value: js.Array[OriginTrialTokenWithStatus]): Self = StObject.set(x, "tokensWithStatus", value.asInstanceOf[js.Any])
    
    inline def setTokensWithStatusVarargs(value: OriginTrialTokenWithStatus*): Self = StObject.set(x, "tokensWithStatus", js.Array(value*))
    
    inline def setTrialName(value: String): Self = StObject.set(x, "trialName", value.asInstanceOf[js.Any])
  }
}
