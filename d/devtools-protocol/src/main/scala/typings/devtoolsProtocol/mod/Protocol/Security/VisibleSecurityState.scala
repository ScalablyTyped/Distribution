package typings.devtoolsProtocol.mod.Protocol.Security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleSecurityState extends StObject {
  
  /**
    * Security state details about the page certificate.
    */
  var certificateSecurityState: js.UndefOr[CertificateSecurityState] = js.undefined
  
  /**
    * The type of Safety Tip triggered on the page. Note that this field will be set even if the Safety Tip UI was not actually shown.
    */
  var safetyTipInfo: js.UndefOr[SafetyTipInfo] = js.undefined
  
  /**
    * The security level of the page.
    */
  var securityState: SecurityState
  
  /**
    * Array of security state issues ids.
    */
  var securityStateIssueIds: js.Array[String]
}
object VisibleSecurityState {
  
  inline def apply(securityState: SecurityState, securityStateIssueIds: js.Array[String]): VisibleSecurityState = {
    val __obj = js.Dynamic.literal(securityState = securityState.asInstanceOf[js.Any], securityStateIssueIds = securityStateIssueIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleSecurityState]
  }
  
  extension [Self <: VisibleSecurityState](x: Self) {
    
    inline def setCertificateSecurityState(value: CertificateSecurityState): Self = StObject.set(x, "certificateSecurityState", value.asInstanceOf[js.Any])
    
    inline def setCertificateSecurityStateUndefined: Self = StObject.set(x, "certificateSecurityState", js.undefined)
    
    inline def setSafetyTipInfo(value: SafetyTipInfo): Self = StObject.set(x, "safetyTipInfo", value.asInstanceOf[js.Any])
    
    inline def setSafetyTipInfoUndefined: Self = StObject.set(x, "safetyTipInfo", js.undefined)
    
    inline def setSecurityState(value: SecurityState): Self = StObject.set(x, "securityState", value.asInstanceOf[js.Any])
    
    inline def setSecurityStateIssueIds(value: js.Array[String]): Self = StObject.set(x, "securityStateIssueIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityStateIssueIdsVarargs(value: String*): Self = StObject.set(x, "securityStateIssueIds", js.Array(value :_*))
  }
}
