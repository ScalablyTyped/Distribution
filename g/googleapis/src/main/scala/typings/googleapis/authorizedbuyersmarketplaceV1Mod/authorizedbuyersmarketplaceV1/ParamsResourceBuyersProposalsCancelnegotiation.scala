package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersProposalsCancelnegotiation
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the proposal. Format: `buyers/{accountId\}/proposals/{proposalId\}`
    */
  var proposal: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCancelNegotiationRequest] = js.undefined
}
object ParamsResourceBuyersProposalsCancelnegotiation {
  
  inline def apply(): ParamsResourceBuyersProposalsCancelnegotiation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersProposalsCancelnegotiation]
  }
  
  extension [Self <: ParamsResourceBuyersProposalsCancelnegotiation](x: Self) {
    
    inline def setProposal(value: String): Self = StObject.set(x, "proposal", value.asInstanceOf[js.Any])
    
    inline def setProposalUndefined: Self = StObject.set(x, "proposal", js.undefined)
    
    inline def setRequestBody(value: SchemaCancelNegotiationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
