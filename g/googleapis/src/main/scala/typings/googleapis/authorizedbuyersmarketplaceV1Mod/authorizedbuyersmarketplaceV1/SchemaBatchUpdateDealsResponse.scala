package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchUpdateDealsResponse extends StObject {
  
  /**
    * Deals updated.
    */
  var deals: js.UndefOr[js.Array[SchemaDeal]] = js.undefined
}
object SchemaBatchUpdateDealsResponse {
  
  inline def apply(): SchemaBatchUpdateDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateDealsResponse]
  }
  
  extension [Self <: SchemaBatchUpdateDealsResponse](x: Self) {
    
    inline def setDeals(value: js.Array[SchemaDeal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    inline def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    inline def setDealsVarargs(value: SchemaDeal*): Self = StObject.set(x, "deals", js.Array(value*))
  }
}
