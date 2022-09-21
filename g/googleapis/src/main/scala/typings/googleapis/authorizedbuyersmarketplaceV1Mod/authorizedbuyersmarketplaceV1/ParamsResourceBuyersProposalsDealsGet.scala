package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersProposalsDealsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: buyers/{accountId\}/proposals/{proposalId\}/deals/{dealId\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersProposalsDealsGet {
  
  inline def apply(): ParamsResourceBuyersProposalsDealsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersProposalsDealsGet]
  }
  
  extension [Self <: ParamsResourceBuyersProposalsDealsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
