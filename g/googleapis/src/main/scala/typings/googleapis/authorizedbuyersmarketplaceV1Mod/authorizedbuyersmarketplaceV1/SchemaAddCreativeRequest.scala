package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddCreativeRequest extends StObject {
  
  /**
    * Name of the creative to add to the finalized deal, in the format `buyers/{buyerAccountId\}/creatives/{creativeId\}`. See creative.name.
    */
  var creative: js.UndefOr[String | Null] = js.undefined
}
object SchemaAddCreativeRequest {
  
  inline def apply(): SchemaAddCreativeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddCreativeRequest]
  }
  
  extension [Self <: SchemaAddCreativeRequest](x: Self) {
    
    inline def setCreative(value: String): Self = StObject.set(x, "creative", value.asInstanceOf[js.Any])
    
    inline def setCreativeNull: Self = StObject.set(x, "creative", null)
    
    inline def setCreativeUndefined: Self = StObject.set(x, "creative", js.undefined)
  }
}
