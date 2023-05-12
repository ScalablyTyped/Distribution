package typings.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FedCm {
  
  trait Account extends StObject {
    
    var accountId: String
    
    var email: String
    
    var givenName: String
    
    var idpConfigUrl: String
    
    var idpSigninUrl: String
    
    var loginState: LoginState
    
    var name: String
    
    var pictureUrl: String
    
    var privacyPolicyUrl: js.UndefOr[String] = js.undefined
    
    /**
      * These two are only set if the loginState is signUp
      */
    var termsOfServiceUrl: js.UndefOr[String] = js.undefined
  }
  object Account {
    
    inline def apply(
      accountId: String,
      email: String,
      givenName: String,
      idpConfigUrl: String,
      idpSigninUrl: String,
      loginState: LoginState,
      name: String,
      pictureUrl: String
    ): Account = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], idpConfigUrl = idpConfigUrl.asInstanceOf[js.Any], idpSigninUrl = idpSigninUrl.asInstanceOf[js.Any], loginState = loginState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pictureUrl = pictureUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Account]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      inline def setIdpConfigUrl(value: String): Self = StObject.set(x, "idpConfigUrl", value.asInstanceOf[js.Any])
      
      inline def setIdpSigninUrl(value: String): Self = StObject.set(x, "idpSigninUrl", value.asInstanceOf[js.Any])
      
      inline def setLoginState(value: LoginState): Self = StObject.set(x, "loginState", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPictureUrl(value: String): Self = StObject.set(x, "pictureUrl", value.asInstanceOf[js.Any])
      
      inline def setPrivacyPolicyUrl(value: String): Self = StObject.set(x, "privacyPolicyUrl", value.asInstanceOf[js.Any])
      
      inline def setPrivacyPolicyUrlUndefined: Self = StObject.set(x, "privacyPolicyUrl", js.undefined)
      
      inline def setTermsOfServiceUrl(value: String): Self = StObject.set(x, "termsOfServiceUrl", value.asInstanceOf[js.Any])
      
      inline def setTermsOfServiceUrlUndefined: Self = StObject.set(x, "termsOfServiceUrl", js.undefined)
    }
  }
  
  trait DialogShownEvent extends StObject {
    
    var accounts: js.Array[Account]
    
    var dialogId: String
    
    var dialogType: DialogType
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    /**
      * These exist primarily so that the caller can verify the
      * RP context was used appropriately.
      */
    var title: String
  }
  object DialogShownEvent {
    
    inline def apply(accounts: js.Array[Account], dialogId: String, dialogType: DialogType, title: String): DialogShownEvent = {
      val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], dialogId = dialogId.asInstanceOf[js.Any], dialogType = dialogType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogShownEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogShownEvent] (val x: Self) extends AnyVal {
      
      inline def setAccounts(value: js.Array[Account]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value*))
      
      inline def setDialogId(value: String): Self = StObject.set(x, "dialogId", value.asInstanceOf[js.Any])
      
      inline def setDialogType(value: DialogType): Self = StObject.set(x, "dialogType", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.AccountChooser
    - typings.devtoolsProtocol.devtoolsProtocolStrings.AutoReauthn
  */
  trait DialogType extends StObject
  object DialogType {
    
    inline def AccountChooser: typings.devtoolsProtocol.devtoolsProtocolStrings.AccountChooser = "AccountChooser".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.AccountChooser]
    
    inline def AutoReauthn: typings.devtoolsProtocol.devtoolsProtocolStrings.AutoReauthn = "AutoReauthn".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.AutoReauthn]
  }
  
  trait DismissDialogRequest extends StObject {
    
    var dialogId: String
    
    var triggerCooldown: js.UndefOr[Boolean] = js.undefined
  }
  object DismissDialogRequest {
    
    inline def apply(dialogId: String): DismissDialogRequest = {
      val __obj = js.Dynamic.literal(dialogId = dialogId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DismissDialogRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DismissDialogRequest] (val x: Self) extends AnyVal {
      
      inline def setDialogId(value: String): Self = StObject.set(x, "dialogId", value.asInstanceOf[js.Any])
      
      inline def setTriggerCooldown(value: Boolean): Self = StObject.set(x, "triggerCooldown", value.asInstanceOf[js.Any])
      
      inline def setTriggerCooldownUndefined: Self = StObject.set(x, "triggerCooldown", js.undefined)
    }
  }
  
  trait EnableRequest extends StObject {
    
    /**
      * Allows callers to disable the promise rejection delay that would
      * normally happen, if this is unimportant to what's being tested.
      * (step 4 of https://fedidcg.github.io/FedCM/#browser-api-rp-sign-in)
      */
    var disableRejectionDelay: js.UndefOr[Boolean] = js.undefined
  }
  object EnableRequest {
    
    inline def apply(): EnableRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnableRequest] (val x: Self) extends AnyVal {
      
      inline def setDisableRejectionDelay(value: Boolean): Self = StObject.set(x, "disableRejectionDelay", value.asInstanceOf[js.Any])
      
      inline def setDisableRejectionDelayUndefined: Self = StObject.set(x, "disableRejectionDelay", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.SignIn
    - typings.devtoolsProtocol.devtoolsProtocolStrings.SignUp
  */
  trait LoginState extends StObject
  object LoginState {
    
    inline def SignIn: typings.devtoolsProtocol.devtoolsProtocolStrings.SignIn = "SignIn".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SignIn]
    
    inline def SignUp: typings.devtoolsProtocol.devtoolsProtocolStrings.SignUp = "SignUp".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SignUp]
  }
  
  trait SelectAccountRequest extends StObject {
    
    var accountIndex: integer
    
    var dialogId: String
  }
  object SelectAccountRequest {
    
    inline def apply(accountIndex: integer, dialogId: String): SelectAccountRequest = {
      val __obj = js.Dynamic.literal(accountIndex = accountIndex.asInstanceOf[js.Any], dialogId = dialogId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectAccountRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectAccountRequest] (val x: Self) extends AnyVal {
      
      inline def setAccountIndex(value: integer): Self = StObject.set(x, "accountIndex", value.asInstanceOf[js.Any])
      
      inline def setDialogId(value: String): Self = StObject.set(x, "dialogId", value.asInstanceOf[js.Any])
    }
  }
}
