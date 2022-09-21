package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPauseFinalizedDealRequest extends StObject {
  
  /**
    * The reason to pause the finalized deal, will be displayed to the seller. Maximum length is 1000 characters.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaPauseFinalizedDealRequest {
  
  inline def apply(): SchemaPauseFinalizedDealRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPauseFinalizedDealRequest]
  }
  
  extension [Self <: SchemaPauseFinalizedDealRequest](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
