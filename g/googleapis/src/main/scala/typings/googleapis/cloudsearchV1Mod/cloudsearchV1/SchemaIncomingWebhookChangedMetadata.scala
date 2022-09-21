package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIncomingWebhookChangedMetadata extends StObject {
  
  /**
    * The webhook name at the time of the change. Used in Spanner storage, BE API responses and FE API responses.
    */
  var incomingWebhookName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user id of the user whose action triggered this system message. Used in Spanner storage, BE API responses and FE API responses.
    */
  var initiatorId: js.UndefOr[SchemaUserId] = js.undefined
  
  /**
    * Complete profile when ListTopicsRequest FetchOptions.USER is set. Otherwise, only the id will be filled in. Used in FE API responses.
    */
  var initiatorProfile: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The webhook id of the incoming webhook in question. This field should not be used to load webhook information dynamically and is only present for debugging purposes. Used in Spanner storage, BE API responses and FE API responses.
    */
  var obfuscatedIncomingWebhookId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only populated for UPDATED_NAME and UPDATED_NAME_AND_AVATAR events, where the webhook name was changed. Used in Spanner storage, BE API responses and FE API responses.
    */
  var oldIncomingWebhookName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used in Spanner storage, BE API responses and FE API responses.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaIncomingWebhookChangedMetadata {
  
  inline def apply(): SchemaIncomingWebhookChangedMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIncomingWebhookChangedMetadata]
  }
  
  extension [Self <: SchemaIncomingWebhookChangedMetadata](x: Self) {
    
    inline def setIncomingWebhookName(value: String): Self = StObject.set(x, "incomingWebhookName", value.asInstanceOf[js.Any])
    
    inline def setIncomingWebhookNameNull: Self = StObject.set(x, "incomingWebhookName", null)
    
    inline def setIncomingWebhookNameUndefined: Self = StObject.set(x, "incomingWebhookName", js.undefined)
    
    inline def setInitiatorId(value: SchemaUserId): Self = StObject.set(x, "initiatorId", value.asInstanceOf[js.Any])
    
    inline def setInitiatorIdUndefined: Self = StObject.set(x, "initiatorId", js.undefined)
    
    inline def setInitiatorProfile(value: SchemaUser): Self = StObject.set(x, "initiatorProfile", value.asInstanceOf[js.Any])
    
    inline def setInitiatorProfileUndefined: Self = StObject.set(x, "initiatorProfile", js.undefined)
    
    inline def setObfuscatedIncomingWebhookId(value: String): Self = StObject.set(x, "obfuscatedIncomingWebhookId", value.asInstanceOf[js.Any])
    
    inline def setObfuscatedIncomingWebhookIdNull: Self = StObject.set(x, "obfuscatedIncomingWebhookId", null)
    
    inline def setObfuscatedIncomingWebhookIdUndefined: Self = StObject.set(x, "obfuscatedIncomingWebhookId", js.undefined)
    
    inline def setOldIncomingWebhookName(value: String): Self = StObject.set(x, "oldIncomingWebhookName", value.asInstanceOf[js.Any])
    
    inline def setOldIncomingWebhookNameNull: Self = StObject.set(x, "oldIncomingWebhookName", null)
    
    inline def setOldIncomingWebhookNameUndefined: Self = StObject.set(x, "oldIncomingWebhookName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
