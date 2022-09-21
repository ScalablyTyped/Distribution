package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersFinalizeddealsResume
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: `buyers/{accountId\}/finalizedDeals/{dealId\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResumeFinalizedDealRequest] = js.undefined
}
object ParamsResourceBuyersFinalizeddealsResume {
  
  inline def apply(): ParamsResourceBuyersFinalizeddealsResume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersFinalizeddealsResume]
  }
  
  extension [Self <: ParamsResourceBuyersFinalizeddealsResume](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaResumeFinalizedDealRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
