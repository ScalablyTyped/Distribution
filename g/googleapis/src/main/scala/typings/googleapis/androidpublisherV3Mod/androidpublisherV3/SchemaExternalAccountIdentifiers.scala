package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExternalAccountIdentifiers extends StObject {
  
  /**
    * User account identifier in the third-party service. Only present if account linking happened as part of the subscription purchase flow.
    */
  var externalAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An obfuscated version of the id that is uniquely associated with the user's account in your app. Present for the following purchases: * If account linking happened as part of the subscription purchase flow. * It was specified using https://developer.android.com/reference/com/android/billingclient/api/BillingFlowParams.Builder#setobfuscatedaccountid when the purchase was made.
    */
  var obfuscatedExternalAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An obfuscated version of the id that is uniquely associated with the user's profile in your app. Only present if specified using https://developer.android.com/reference/com/android/billingclient/api/BillingFlowParams.Builder#setobfuscatedprofileid when the purchase was made.
    */
  var obfuscatedExternalProfileId: js.UndefOr[String | Null] = js.undefined
}
object SchemaExternalAccountIdentifiers {
  
  inline def apply(): SchemaExternalAccountIdentifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternalAccountIdentifiers]
  }
  
  extension [Self <: SchemaExternalAccountIdentifiers](x: Self) {
    
    inline def setExternalAccountId(value: String): Self = StObject.set(x, "externalAccountId", value.asInstanceOf[js.Any])
    
    inline def setExternalAccountIdNull: Self = StObject.set(x, "externalAccountId", null)
    
    inline def setExternalAccountIdUndefined: Self = StObject.set(x, "externalAccountId", js.undefined)
    
    inline def setObfuscatedExternalAccountId(value: String): Self = StObject.set(x, "obfuscatedExternalAccountId", value.asInstanceOf[js.Any])
    
    inline def setObfuscatedExternalAccountIdNull: Self = StObject.set(x, "obfuscatedExternalAccountId", null)
    
    inline def setObfuscatedExternalAccountIdUndefined: Self = StObject.set(x, "obfuscatedExternalAccountId", js.undefined)
    
    inline def setObfuscatedExternalProfileId(value: String): Self = StObject.set(x, "obfuscatedExternalProfileId", value.asInstanceOf[js.Any])
    
    inline def setObfuscatedExternalProfileIdNull: Self = StObject.set(x, "obfuscatedExternalProfileId", null)
    
    inline def setObfuscatedExternalProfileIdUndefined: Self = StObject.set(x, "obfuscatedExternalProfileId", js.undefined)
  }
}
