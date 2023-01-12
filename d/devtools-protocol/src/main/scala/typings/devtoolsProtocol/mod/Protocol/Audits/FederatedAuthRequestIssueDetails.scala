package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FederatedAuthRequestIssueDetails extends StObject {
  
  var federatedAuthRequestIssueReason: FederatedAuthRequestIssueReason
}
object FederatedAuthRequestIssueDetails {
  
  inline def apply(federatedAuthRequestIssueReason: FederatedAuthRequestIssueReason): FederatedAuthRequestIssueDetails = {
    val __obj = js.Dynamic.literal(federatedAuthRequestIssueReason = federatedAuthRequestIssueReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedAuthRequestIssueDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FederatedAuthRequestIssueDetails] (val x: Self) extends AnyVal {
    
    inline def setFederatedAuthRequestIssueReason(value: FederatedAuthRequestIssueReason): Self = StObject.set(x, "federatedAuthRequestIssueReason", value.asInstanceOf[js.Any])
  }
}
