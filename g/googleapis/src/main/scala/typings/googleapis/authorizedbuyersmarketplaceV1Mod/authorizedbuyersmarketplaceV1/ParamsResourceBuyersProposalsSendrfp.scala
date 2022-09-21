package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersProposalsSendrfp
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The current buyer who is sending the RFP in the format: `buyers/{accountId\}`.
    */
  var buyer: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSendRfpRequest] = js.undefined
}
object ParamsResourceBuyersProposalsSendrfp {
  
  inline def apply(): ParamsResourceBuyersProposalsSendrfp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersProposalsSendrfp]
  }
  
  extension [Self <: ParamsResourceBuyersProposalsSendrfp](x: Self) {
    
    inline def setBuyer(value: String): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    inline def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    inline def setRequestBody(value: SchemaSendRfpRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
