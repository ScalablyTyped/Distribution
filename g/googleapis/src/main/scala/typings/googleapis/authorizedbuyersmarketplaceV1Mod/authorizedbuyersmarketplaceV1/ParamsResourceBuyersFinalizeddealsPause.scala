package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersFinalizeddealsPause
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: `buyers/{accountId\}/finalizedDeals/{dealId\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPauseFinalizedDealRequest] = js.undefined
}
object ParamsResourceBuyersFinalizeddealsPause {
  
  inline def apply(): ParamsResourceBuyersFinalizeddealsPause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersFinalizeddealsPause]
  }
  
  extension [Self <: ParamsResourceBuyersFinalizeddealsPause](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaPauseFinalizedDealRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
