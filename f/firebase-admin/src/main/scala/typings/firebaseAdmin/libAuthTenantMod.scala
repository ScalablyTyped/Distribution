package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.libAuthAuthConfigMod.EmailSignInConfigServerRequest
import typings.firebaseAdmin.libAuthAuthConfigMod.EmailSignInProviderConfig
import typings.firebaseAdmin.libAuthAuthConfigMod.MultiFactorAuthServerConfig
import typings.firebaseAdmin.libAuthAuthConfigMod.MultiFactorConfig
import typings.firebaseAdmin.libAuthAuthConfigMod.SmsRegionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthTenantMod {
  
  @JSImport("firebase-admin/lib/auth/tenant", "Tenant")
  @js.native
  open class Tenant () extends StObject {
    
    val anonymousSignInEnabled: Boolean = js.native
    
    /**
      * The tenant display name.
      */
    val displayName: js.UndefOr[String] = js.native
    
    /**
      * The email sign in provider configuration.
      */
    def emailSignInConfig: js.UndefOr[EmailSignInProviderConfig] = js.native
    
    /* private */ val emailSignInConfig_ : Any = js.native
    
    /**
      * The multi-factor auth configuration on the current tenant.
      */
    def multiFactorConfig: js.UndefOr[MultiFactorConfig] = js.native
    
    /* private */ val multiFactorConfig_ : Any = js.native
    
    /**
      * The SMS Regions Config to update a tenant.
      * Configures the regions where users are allowed to send verification SMS.
      * This is based on the calling code of the destination phone number.
      */
    val smsRegionConfig: js.UndefOr[SmsRegionConfig] = js.native
    
    /**
      * The tenant identifier.
      */
    val tenantId: String = js.native
    
    /**
      * The map containing the test phone number / code pairs for the tenant.
      */
    val testPhoneNumbers: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      *
      * @returns A JSON-serializable representation of this object.
      */
    def toJSON(): js.Object = js.native
  }
  /* static members */
  object Tenant {
    
    @JSImport("firebase-admin/lib/auth/tenant", "Tenant")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Validates a tenant options object. Throws an error on failure.
      *
      * @param request - The tenant options object to validate.
      * @param createRequest - Whether this is a create request.
      */
    @JSImport("firebase-admin/lib/auth/tenant", "Tenant.validate")
    @js.native
    def validate: Any = js.native
    inline def validate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validate")(x.asInstanceOf[js.Any])
  }
  
  type CreateTenantRequest = UpdateTenantRequest
  
  trait TenantOptionsServerRequest
    extends StObject
       with EmailSignInConfigServerRequest {
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var enableAnonymousUser: js.UndefOr[Boolean] = js.undefined
    
    var mfaConfig: js.UndefOr[MultiFactorAuthServerConfig] = js.undefined
    
    var smsRegionConfig: js.UndefOr[SmsRegionConfig] = js.undefined
    
    var testPhoneNumbers: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object TenantOptionsServerRequest {
    
    inline def apply(): TenantOptionsServerRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TenantOptionsServerRequest]
    }
    
    extension [Self <: TenantOptionsServerRequest](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEnableAnonymousUser(value: Boolean): Self = StObject.set(x, "enableAnonymousUser", value.asInstanceOf[js.Any])
      
      inline def setEnableAnonymousUserUndefined: Self = StObject.set(x, "enableAnonymousUser", js.undefined)
      
      inline def setMfaConfig(value: MultiFactorAuthServerConfig): Self = StObject.set(x, "mfaConfig", value.asInstanceOf[js.Any])
      
      inline def setMfaConfigUndefined: Self = StObject.set(x, "mfaConfig", js.undefined)
      
      inline def setSmsRegionConfig(value: SmsRegionConfig): Self = StObject.set(x, "smsRegionConfig", value.asInstanceOf[js.Any])
      
      inline def setSmsRegionConfigUndefined: Self = StObject.set(x, "smsRegionConfig", js.undefined)
      
      inline def setTestPhoneNumbers(value: StringDictionary[String]): Self = StObject.set(x, "testPhoneNumbers", value.asInstanceOf[js.Any])
      
      inline def setTestPhoneNumbersUndefined: Self = StObject.set(x, "testPhoneNumbers", js.undefined)
    }
  }
  
  trait TenantServerResponse extends StObject {
    
    var allowPasswordSignup: js.UndefOr[Boolean] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var enableAnonymousUser: js.UndefOr[Boolean] = js.undefined
    
    var enableEmailLinkSignin: js.UndefOr[Boolean] = js.undefined
    
    var mfaConfig: js.UndefOr[MultiFactorAuthServerConfig] = js.undefined
    
    var name: String
    
    var smsRegionConfig: js.UndefOr[SmsRegionConfig] = js.undefined
    
    var testPhoneNumbers: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object TenantServerResponse {
    
    inline def apply(name: String): TenantServerResponse = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TenantServerResponse]
    }
    
    extension [Self <: TenantServerResponse](x: Self) {
      
      inline def setAllowPasswordSignup(value: Boolean): Self = StObject.set(x, "allowPasswordSignup", value.asInstanceOf[js.Any])
      
      inline def setAllowPasswordSignupUndefined: Self = StObject.set(x, "allowPasswordSignup", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEnableAnonymousUser(value: Boolean): Self = StObject.set(x, "enableAnonymousUser", value.asInstanceOf[js.Any])
      
      inline def setEnableAnonymousUserUndefined: Self = StObject.set(x, "enableAnonymousUser", js.undefined)
      
      inline def setEnableEmailLinkSignin(value: Boolean): Self = StObject.set(x, "enableEmailLinkSignin", value.asInstanceOf[js.Any])
      
      inline def setEnableEmailLinkSigninUndefined: Self = StObject.set(x, "enableEmailLinkSignin", js.undefined)
      
      inline def setMfaConfig(value: MultiFactorAuthServerConfig): Self = StObject.set(x, "mfaConfig", value.asInstanceOf[js.Any])
      
      inline def setMfaConfigUndefined: Self = StObject.set(x, "mfaConfig", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSmsRegionConfig(value: SmsRegionConfig): Self = StObject.set(x, "smsRegionConfig", value.asInstanceOf[js.Any])
      
      inline def setSmsRegionConfigUndefined: Self = StObject.set(x, "smsRegionConfig", js.undefined)
      
      inline def setTestPhoneNumbers(value: StringDictionary[String]): Self = StObject.set(x, "testPhoneNumbers", value.asInstanceOf[js.Any])
      
      inline def setTestPhoneNumbersUndefined: Self = StObject.set(x, "testPhoneNumbers", js.undefined)
    }
  }
  
  trait UpdateTenantRequest extends StObject {
    
    /**
      * Whether the anonymous provider is enabled.
      */
    var anonymousSignInEnabled: js.UndefOr[Boolean] = js.undefined
    
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
      * The SMS configuration to update on the project.
      */
    var smsRegionConfig: js.UndefOr[SmsRegionConfig] = js.undefined
    
    /**
      * The updated map containing the test phone number / code pairs for the tenant.
      * Passing null clears the previously save phone number / code pairs.
      */
    var testPhoneNumbers: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  }
  object UpdateTenantRequest {
    
    inline def apply(): UpdateTenantRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTenantRequest]
    }
    
    extension [Self <: UpdateTenantRequest](x: Self) {
      
      inline def setAnonymousSignInEnabled(value: Boolean): Self = StObject.set(x, "anonymousSignInEnabled", value.asInstanceOf[js.Any])
      
      inline def setAnonymousSignInEnabledUndefined: Self = StObject.set(x, "anonymousSignInEnabled", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmailSignInConfig(value: EmailSignInProviderConfig): Self = StObject.set(x, "emailSignInConfig", value.asInstanceOf[js.Any])
      
      inline def setEmailSignInConfigUndefined: Self = StObject.set(x, "emailSignInConfig", js.undefined)
      
      inline def setMultiFactorConfig(value: MultiFactorConfig): Self = StObject.set(x, "multiFactorConfig", value.asInstanceOf[js.Any])
      
      inline def setMultiFactorConfigUndefined: Self = StObject.set(x, "multiFactorConfig", js.undefined)
      
      inline def setSmsRegionConfig(value: SmsRegionConfig): Self = StObject.set(x, "smsRegionConfig", value.asInstanceOf[js.Any])
      
      inline def setSmsRegionConfigUndefined: Self = StObject.set(x, "smsRegionConfig", js.undefined)
      
      inline def setTestPhoneNumbers(value: StringDictionary[String]): Self = StObject.set(x, "testPhoneNumbers", value.asInstanceOf[js.Any])
      
      inline def setTestPhoneNumbersNull: Self = StObject.set(x, "testPhoneNumbers", null)
      
      inline def setTestPhoneNumbersUndefined: Self = StObject.set(x, "testPhoneNumbers", js.undefined)
    }
  }
}
