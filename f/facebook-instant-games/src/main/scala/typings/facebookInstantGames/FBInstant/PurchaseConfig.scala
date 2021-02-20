package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration of a purchase request for a product registered to the game.
  */
@js.native
trait PurchaseConfig extends StObject {
  
  /**
    * An optional developer-specified payload, to be included in the returned purchase's signed request.
    */
  var developerPayload: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the product to purchase
    */
  var productID: String = js.native
}
object PurchaseConfig {
  
  @scala.inline
  def apply(productID: String): PurchaseConfig = {
    val __obj = js.Dynamic.literal(productID = productID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseConfig]
  }
  
  @scala.inline
  implicit class PurchaseConfigMutableBuilder[Self <: PurchaseConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
    
    @scala.inline
    def setProductID(value: String): Self = StObject.set(x, "productID", value.asInstanceOf[js.Any])
  }
}
