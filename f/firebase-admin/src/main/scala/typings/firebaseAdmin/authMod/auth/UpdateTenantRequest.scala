package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing the properties to update on the provided tenant.
  */
trait UpdateTenantRequest extends StObject {
  
  /**
    * The tenant display name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The email sign in configuration.
    */
  var emailSignInConfig: js.UndefOr[EmailSignInProviderConfig] = js.undefined
  
  /**
    * The multi-factor auth configuration to update on the tenant.
    */
  var multiFactorConfig: js.UndefOr[MultiFactorConfig] = js.undefined
  
  /**
    * The updated map containing the test phone number / code pairs for the tenant.
    * Passing null clears the previously save phone number / code pairs.
    */
  var testPhoneNumbers: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object UpdateTenantRequest {
  
  @scala.inline
  def apply(): UpdateTenantRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTenantRequest]
  }
  
  @scala.inline
  implicit class UpdateTenantRequestMutableBuilder[Self <: UpdateTenantRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmailSignInConfig(value: EmailSignInProviderConfig): Self = StObject.set(x, "emailSignInConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSignInConfigUndefined: Self = StObject.set(x, "emailSignInConfig", js.undefined)
    
    @scala.inline
    def setMultiFactorConfig(value: MultiFactorConfig): Self = StObject.set(x, "multiFactorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiFactorConfigUndefined: Self = StObject.set(x, "multiFactorConfig", js.undefined)
    
    @scala.inline
    def setTestPhoneNumbers(value: StringDictionary[String]): Self = StObject.set(x, "testPhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPhoneNumbersNull: Self = StObject.set(x, "testPhoneNumbers", null)
    
    @scala.inline
    def setTestPhoneNumbersUndefined: Self = StObject.set(x, "testPhoneNumbers", js.undefined)
  }
}
