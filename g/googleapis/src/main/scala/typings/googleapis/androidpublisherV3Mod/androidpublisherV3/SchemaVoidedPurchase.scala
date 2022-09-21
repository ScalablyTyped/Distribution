package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVoidedPurchase extends StObject {
  
  /**
    * This kind represents a voided purchase object in the androidpublisher service.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The order id which uniquely identifies a one-time purchase, subscription purchase, or subscription renewal.
    */
  var orderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the purchase was made, in milliseconds since the epoch (Jan 1, 1970).
    */
  var purchaseTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The token which uniquely identifies a one-time purchase or subscription. To uniquely identify subscription renewals use order_id (available starting from version 3 of the API).
    */
  var purchaseToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reason why the purchase was voided, possible values are: 0. Other 1. Remorse 2. Not_received 3. Defective 4. Accidental_purchase 5. Fraud 6. Friendly_fraud 7. Chargeback
    */
  var voidedReason: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The initiator of voided purchase, possible values are: 0. User 1. Developer 2. Google
    */
  var voidedSource: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The time at which the purchase was canceled/refunded/charged-back, in milliseconds since the epoch (Jan 1, 1970).
    */
  var voidedTimeMillis: js.UndefOr[String | Null] = js.undefined
}
object SchemaVoidedPurchase {
  
  inline def apply(): SchemaVoidedPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoidedPurchase]
  }
  
  extension [Self <: SchemaVoidedPurchase](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdNull: Self = StObject.set(x, "orderId", null)
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setPurchaseTimeMillis(value: String): Self = StObject.set(x, "purchaseTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTimeMillisNull: Self = StObject.set(x, "purchaseTimeMillis", null)
    
    inline def setPurchaseTimeMillisUndefined: Self = StObject.set(x, "purchaseTimeMillis", js.undefined)
    
    inline def setPurchaseToken(value: String): Self = StObject.set(x, "purchaseToken", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTokenNull: Self = StObject.set(x, "purchaseToken", null)
    
    inline def setPurchaseTokenUndefined: Self = StObject.set(x, "purchaseToken", js.undefined)
    
    inline def setVoidedReason(value: Double): Self = StObject.set(x, "voidedReason", value.asInstanceOf[js.Any])
    
    inline def setVoidedReasonNull: Self = StObject.set(x, "voidedReason", null)
    
    inline def setVoidedReasonUndefined: Self = StObject.set(x, "voidedReason", js.undefined)
    
    inline def setVoidedSource(value: Double): Self = StObject.set(x, "voidedSource", value.asInstanceOf[js.Any])
    
    inline def setVoidedSourceNull: Self = StObject.set(x, "voidedSource", null)
    
    inline def setVoidedSourceUndefined: Self = StObject.set(x, "voidedSource", js.undefined)
    
    inline def setVoidedTimeMillis(value: String): Self = StObject.set(x, "voidedTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setVoidedTimeMillisNull: Self = StObject.set(x, "voidedTimeMillis", null)
    
    inline def setVoidedTimeMillisUndefined: Self = StObject.set(x, "voidedTimeMillis", js.undefined)
  }
}
