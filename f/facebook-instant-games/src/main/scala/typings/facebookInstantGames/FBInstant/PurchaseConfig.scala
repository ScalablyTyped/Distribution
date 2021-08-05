package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration of a purchase request for a product registered to the game.
  */
trait PurchaseConfig extends StObject {
  
  /**
    * An optional developer-specified payload, to be included in the returned purchase's signed request.
    */
  var developerPayload: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the product to purchase
    */
  var productID: String
}
object PurchaseConfig {
  
  inline def apply(productID: String): PurchaseConfig = {
    val __obj = js.Dynamic.literal(productID = productID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseConfig]
  }
  
  extension [Self <: PurchaseConfig](x: Self) {
    
    inline def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    inline def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
    
    inline def setProductID(value: String): Self = StObject.set(x, "productID", value.asInstanceOf[js.Any])
  }
}
