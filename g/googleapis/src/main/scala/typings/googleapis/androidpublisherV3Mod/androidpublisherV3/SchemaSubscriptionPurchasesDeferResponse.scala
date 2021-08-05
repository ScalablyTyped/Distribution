package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptionPurchasesDeferResponse extends StObject {
  
  /**
    * The new expiry time for the subscription in milliseconds since the Epoch.
    */
  var newExpiryTimeMillis: js.UndefOr[String] = js.undefined
}
object SchemaSubscriptionPurchasesDeferResponse {
  
  inline def apply(): SchemaSubscriptionPurchasesDeferResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchasesDeferResponse]
  }
  
  extension [Self <: SchemaSubscriptionPurchasesDeferResponse](x: Self) {
    
    inline def setNewExpiryTimeMillis(value: String): Self = StObject.set(x, "newExpiryTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setNewExpiryTimeMillisUndefined: Self = StObject.set(x, "newExpiryTimeMillis", js.undefined)
  }
}
