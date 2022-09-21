package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersProposalsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the proposal. Format: `buyers/{accountId\}/proposals/{proposalId\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersProposalsGet {
  
  inline def apply(): ParamsResourceBuyersProposalsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersProposalsGet]
  }
  
  extension [Self <: ParamsResourceBuyersProposalsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
