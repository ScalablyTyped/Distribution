package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptionPriceChange extends StObject {
  
  /**
    * The new price the subscription will renew with if the price change is accepted by the user.
    */
  var newPrice: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The current state of the price change. Possible values are: 0. Outstanding: State for a pending price change waiting for the user to agree. In this state, you can optionally seek confirmation from the user using the In-App API. 1. Accepted: State for an accepted price change that the subscription will renew with unless it's canceled. The price change takes effect on a future date when the subscription renews. Note that the change might not occur when the subscription is renewed next.
    */
  var state: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSubscriptionPriceChange {
  
  inline def apply(): SchemaSubscriptionPriceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPriceChange]
  }
  
  extension [Self <: SchemaSubscriptionPriceChange](x: Self) {
    
    inline def setNewPrice(value: SchemaPrice): Self = StObject.set(x, "newPrice", value.asInstanceOf[js.Any])
    
    inline def setNewPriceUndefined: Self = StObject.set(x, "newPrice", js.undefined)
    
    inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
