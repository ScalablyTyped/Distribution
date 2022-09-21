package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlacementTargeting extends StObject {
  
  /**
    * Mobile application targeting information in a deal. This doesn't apply to Auction Packages.
    */
  var mobileApplicationTargeting: js.UndefOr[SchemaMobileApplicationTargeting] = js.undefined
  
  /**
    * URLs to be included/excluded.
    */
  var uriTargeting: js.UndefOr[SchemaUriTargeting] = js.undefined
}
object SchemaPlacementTargeting {
  
  inline def apply(): SchemaPlacementTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementTargeting]
  }
  
  extension [Self <: SchemaPlacementTargeting](x: Self) {
    
    inline def setMobileApplicationTargeting(value: SchemaMobileApplicationTargeting): Self = StObject.set(x, "mobileApplicationTargeting", value.asInstanceOf[js.Any])
    
    inline def setMobileApplicationTargetingUndefined: Self = StObject.set(x, "mobileApplicationTargeting", js.undefined)
    
    inline def setUriTargeting(value: SchemaUriTargeting): Self = StObject.set(x, "uriTargeting", value.asInstanceOf[js.Any])
    
    inline def setUriTargetingUndefined: Self = StObject.set(x, "uriTargeting", js.undefined)
  }
}
