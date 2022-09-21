package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersProposalsDealsList
  extends StObject
     with StandardParameters {
  
  /**
    * Requested page size. The server may return fewer results than requested. If requested more than 500, the server will return 500 results per page. If unspecified, the server will pick a default page size of 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The page token as returned from ListDealsResponse.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the proposal containing the deals to retrieve. Format: buyers/{accountId\}/proposals/{proposalId\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersProposalsDealsList {
  
  inline def apply(): ParamsResourceBuyersProposalsDealsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersProposalsDealsList]
  }
  
  extension [Self <: ParamsResourceBuyersProposalsDealsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
