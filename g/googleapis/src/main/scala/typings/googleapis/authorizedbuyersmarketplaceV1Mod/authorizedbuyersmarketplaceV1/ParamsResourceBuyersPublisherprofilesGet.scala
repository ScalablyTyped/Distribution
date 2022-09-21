package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersPublisherprofilesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the publisher profile. Format: `buyers/{buyerId\}/publisherProfiles/{publisherProfileId\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersPublisherprofilesGet {
  
  inline def apply(): ParamsResourceBuyersPublisherprofilesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersPublisherprofilesGet]
  }
  
  extension [Self <: ParamsResourceBuyersPublisherprofilesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
