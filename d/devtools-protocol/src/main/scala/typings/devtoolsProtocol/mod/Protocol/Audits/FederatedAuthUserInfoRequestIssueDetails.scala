package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FederatedAuthUserInfoRequestIssueDetails extends StObject {
  
  var federatedAuthUserInfoRequestIssueReason: FederatedAuthUserInfoRequestIssueReason
}
object FederatedAuthUserInfoRequestIssueDetails {
  
  inline def apply(federatedAuthUserInfoRequestIssueReason: FederatedAuthUserInfoRequestIssueReason): FederatedAuthUserInfoRequestIssueDetails = {
    val __obj = js.Dynamic.literal(federatedAuthUserInfoRequestIssueReason = federatedAuthUserInfoRequestIssueReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedAuthUserInfoRequestIssueDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FederatedAuthUserInfoRequestIssueDetails] (val x: Self) extends AnyVal {
    
    inline def setFederatedAuthUserInfoRequestIssueReason(value: FederatedAuthUserInfoRequestIssueReason): Self = StObject.set(x, "federatedAuthUserInfoRequestIssueReason", value.asInstanceOf[js.Any])
  }
}
