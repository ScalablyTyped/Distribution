package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptionPurchasesAcknowledgeRequest extends StObject {
  
  /**
    * Payload to attach to the purchase.
    */
  var developerPayload: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubscriptionPurchasesAcknowledgeRequest {
  
  inline def apply(): SchemaSubscriptionPurchasesAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchasesAcknowledgeRequest]
  }
  
  extension [Self <: SchemaSubscriptionPurchasesAcknowledgeRequest](x: Self) {
    
    inline def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    inline def setDeveloperPayloadNull: Self = StObject.set(x, "developerPayload", null)
    
    inline def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
  }
}
