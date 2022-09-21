package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPreferredDealTerms extends StObject {
  
  /**
    * Fixed price for the deal.
    */
  var fixedPrice: js.UndefOr[SchemaPrice] = js.undefined
}
object SchemaPreferredDealTerms {
  
  inline def apply(): SchemaPreferredDealTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPreferredDealTerms]
  }
  
  extension [Self <: SchemaPreferredDealTerms](x: Self) {
    
    inline def setFixedPrice(value: SchemaPrice): Self = StObject.set(x, "fixedPrice", value.asInstanceOf[js.Any])
    
    inline def setFixedPriceUndefined: Self = StObject.set(x, "fixedPrice", js.undefined)
  }
}
