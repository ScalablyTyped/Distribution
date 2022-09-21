package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersClientsUsersList
  extends StObject
     with StandardParameters {
  
  /**
    * Requested page size. If left blank, a default page size of 500 will be applied.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results the server should return. Typically, this is the value of ListClientUsersResponse.nextPageToken returned from the previous call to the list method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the client. Format: `buyers/{buyerAccountId\}/clients/{clientAccountId\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersClientsUsersList {
  
  inline def apply(): ParamsResourceBuyersClientsUsersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersClientsUsersList]
  }
  
  extension [Self <: ParamsResourceBuyersClientsUsersList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
