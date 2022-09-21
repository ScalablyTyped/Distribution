package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductPurchasesAcknowledgeRequest extends StObject {
  
  /**
    * Payload to attach to the purchase.
    */
  var developerPayload: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductPurchasesAcknowledgeRequest {
  
  inline def apply(): SchemaProductPurchasesAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPurchasesAcknowledgeRequest]
  }
  
  extension [Self <: SchemaProductPurchasesAcknowledgeRequest](x: Self) {
    
    inline def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    inline def setDeveloperPayloadNull: Self = StObject.set(x, "developerPayload", null)
    
    inline def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
  }
}
