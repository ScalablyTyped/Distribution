package typings.firebaseAuth

import typings.firebaseAuth.anon.AppNameEmailMessagePhoneNumber
import typings.firebaseAuth.anon.ErrorMapAuthErrorCode
import typings.firebaseAuth.distNodeSrcCoreCredentialsMod.AuthCredential
import typings.firebaseAuth.distNodeSrcModelAuthMod.AppName
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.AuthErrorMap
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.User
import typings.firebaseAuth.firebaseAuthStrings.`account-exists-with-different-credential`
import typings.firebaseAuth.firebaseAuthStrings.`admin-restricted-operation`
import typings.firebaseAuth.firebaseAuthStrings.`already-initialized`
import typings.firebaseAuth.firebaseAuthStrings.`app-deleted`
import typings.firebaseAuth.firebaseAuthStrings.`app-not-authorized`
import typings.firebaseAuth.firebaseAuthStrings.`app-not-installed`
import typings.firebaseAuth.firebaseAuthStrings.`argument-error`
import typings.firebaseAuth.firebaseAuthStrings.`auth-domain-config-required`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashaccount-exists-with-different-credential`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashadmin-restricted-operation`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashalready-initialized`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashapp-deleted`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashapp-not-authorized`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashapp-not-installed`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashargument-error`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashauth-domain-config-required`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashcancelled-popup-request`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashcaptcha-check-failed`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashcode-expired`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashcordova-not-ready`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashcors-unsupported`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashcredential-already-in-use`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashcustom-token-mismatch`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashdependent-sdk-initialized-before-auth`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashdynamic-link-not-activated`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashemail-already-in-use`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashemail-change-needs-verification`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashemulator-config-failed`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashexpired-action-code`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinternal-error`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-action-code`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-api-key`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-app-credential`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-app-id`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-auth-event`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-cert-hash`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-continue-uri`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-cordova-configuration`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-credential`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-custom-token`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-dynamic-link-domain`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-email`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-emulator-scheme`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-message-payload`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-multi-factor-session`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-oauth-client-id`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-oauth-provider`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-persistence-type`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-phone-number`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-provider-id`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-recaptcha-action`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-recaptcha-token`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-recaptcha-version`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-recipient-email`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-req-type`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-sender`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-tenant-id`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-user-token`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-verification-code`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashinvalid-verification-id`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmaximum-second-factor-count-exceeded`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-android-pkg-name`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-app-credential`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-client-type`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-continue-uri`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-iframe-start`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-ios-bundle-id`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-multi-factor-info`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-multi-factor-session`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-or-invalid-nonce`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-phone-number`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-recaptcha-token`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-recaptcha-version`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-verification-code`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmissing-verification-id`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmulti-factor-auth-required`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashmulti-factor-info-not-found`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashnetwork-request-failed`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashno-auth-event`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashno-such-provider`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashnull-user`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashoperation-not-allowed`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashoperation-not-supported-in-this-environment`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashpopup-blocked`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashpopup-closed-by-user`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashprovider-already-linked`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashquota-exceeded`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashrecaptcha-not-enabled`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashredirect-cancelled-by-user`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashredirect-operation-pending`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashrejected-credential`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashrequires-recent-login`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashsecond-factor-already-in-use`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashtenant-id-mismatch`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashtoo-many-requests`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashunauthorized-continue-uri`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashunauthorized-domain`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashunsupported-first-factor`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashunsupported-persistence-type`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashunsupported-tenant-operation`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashunverified-email`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashuser-cancelled`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashuser-disabled`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashuser-mismatch`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashuser-not-found`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashuser-signed-out`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashuser-token-expired`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashweak-password`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashweb-storage-unsupported`
import typings.firebaseAuth.firebaseAuthStrings.`authSlashwrong-password`
import typings.firebaseAuth.firebaseAuthStrings.`cancelled-popup-request`
import typings.firebaseAuth.firebaseAuthStrings.`captcha-check-failed`
import typings.firebaseAuth.firebaseAuthStrings.`code-expired`
import typings.firebaseAuth.firebaseAuthStrings.`cordova-not-ready`
import typings.firebaseAuth.firebaseAuthStrings.`cors-unsupported`
import typings.firebaseAuth.firebaseAuthStrings.`credential-already-in-use`
import typings.firebaseAuth.firebaseAuthStrings.`custom-token-mismatch`
import typings.firebaseAuth.firebaseAuthStrings.`dependent-sdk-initialized-before-auth`
import typings.firebaseAuth.firebaseAuthStrings.`dynamic-link-not-activated`
import typings.firebaseAuth.firebaseAuthStrings.`email-already-in-use`
import typings.firebaseAuth.firebaseAuthStrings.`email-change-needs-verification`
import typings.firebaseAuth.firebaseAuthStrings.`emulator-config-failed`
import typings.firebaseAuth.firebaseAuthStrings.`expired-action-code`
import typings.firebaseAuth.firebaseAuthStrings.`internal-error`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-action-code`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-api-key`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-app-credential`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-app-id`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-auth-event`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-cert-hash`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-continue-uri`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-cordova-configuration`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-credential`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-custom-token`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-dynamic-link-domain`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-email`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-emulator-scheme`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-message-payload`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-multi-factor-session`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-oauth-client-id`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-oauth-provider`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-persistence-type`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-phone-number`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-provider-id`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-recaptcha-action`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-recaptcha-token`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-recaptcha-version`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-recipient-email`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-req-type`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-sender`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-tenant-id`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-user-token`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-verification-code`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-verification-id`
import typings.firebaseAuth.firebaseAuthStrings.`login-blocked`
import typings.firebaseAuth.firebaseAuthStrings.`maximum-second-factor-count-exceeded`
import typings.firebaseAuth.firebaseAuthStrings.`missing-android-pkg-name`
import typings.firebaseAuth.firebaseAuthStrings.`missing-app-credential`
import typings.firebaseAuth.firebaseAuthStrings.`missing-client-type`
import typings.firebaseAuth.firebaseAuthStrings.`missing-continue-uri`
import typings.firebaseAuth.firebaseAuthStrings.`missing-iframe-start`
import typings.firebaseAuth.firebaseAuthStrings.`missing-ios-bundle-id`
import typings.firebaseAuth.firebaseAuthStrings.`missing-multi-factor-info`
import typings.firebaseAuth.firebaseAuthStrings.`missing-multi-factor-session`
import typings.firebaseAuth.firebaseAuthStrings.`missing-or-invalid-nonce`
import typings.firebaseAuth.firebaseAuthStrings.`missing-password`
import typings.firebaseAuth.firebaseAuthStrings.`missing-phone-number`
import typings.firebaseAuth.firebaseAuthStrings.`missing-recaptcha-token`
import typings.firebaseAuth.firebaseAuthStrings.`missing-recaptcha-version`
import typings.firebaseAuth.firebaseAuthStrings.`missing-verification-code`
import typings.firebaseAuth.firebaseAuthStrings.`missing-verification-id`
import typings.firebaseAuth.firebaseAuthStrings.`multi-factor-auth-required`
import typings.firebaseAuth.firebaseAuthStrings.`multi-factor-info-not-found`
import typings.firebaseAuth.firebaseAuthStrings.`network-request-failed`
import typings.firebaseAuth.firebaseAuthStrings.`no-auth-event`
import typings.firebaseAuth.firebaseAuthStrings.`no-such-provider`
import typings.firebaseAuth.firebaseAuthStrings.`null-user`
import typings.firebaseAuth.firebaseAuthStrings.`operation-not-allowed`
import typings.firebaseAuth.firebaseAuthStrings.`operation-not-supported-in-this-environment`
import typings.firebaseAuth.firebaseAuthStrings.`popup-blocked`
import typings.firebaseAuth.firebaseAuthStrings.`popup-closed-by-user`
import typings.firebaseAuth.firebaseAuthStrings.`provider-already-linked`
import typings.firebaseAuth.firebaseAuthStrings.`quota-exceeded`
import typings.firebaseAuth.firebaseAuthStrings.`recaptcha-not-enabled`
import typings.firebaseAuth.firebaseAuthStrings.`redirect-cancelled-by-user`
import typings.firebaseAuth.firebaseAuthStrings.`redirect-operation-pending`
import typings.firebaseAuth.firebaseAuthStrings.`rejected-credential`
import typings.firebaseAuth.firebaseAuthStrings.`requires-recent-login`
import typings.firebaseAuth.firebaseAuthStrings.`second-factor-already-in-use`
import typings.firebaseAuth.firebaseAuthStrings.`tenant-id-mismatch`
import typings.firebaseAuth.firebaseAuthStrings.`too-many-requests`
import typings.firebaseAuth.firebaseAuthStrings.`unauthorized-continue-uri`
import typings.firebaseAuth.firebaseAuthStrings.`unauthorized-domain`
import typings.firebaseAuth.firebaseAuthStrings.`unsupported-first-factor`
import typings.firebaseAuth.firebaseAuthStrings.`unsupported-persistence-type`
import typings.firebaseAuth.firebaseAuthStrings.`unsupported-tenant-operation`
import typings.firebaseAuth.firebaseAuthStrings.`unverified-email`
import typings.firebaseAuth.firebaseAuthStrings.`user-cancelled`
import typings.firebaseAuth.firebaseAuthStrings.`user-disabled`
import typings.firebaseAuth.firebaseAuthStrings.`user-mismatch`
import typings.firebaseAuth.firebaseAuthStrings.`user-not-found`
import typings.firebaseAuth.firebaseAuthStrings.`user-signed-out`
import typings.firebaseAuth.firebaseAuthStrings.`user-token-expired`
import typings.firebaseAuth.firebaseAuthStrings.`weak-password`
import typings.firebaseAuth.firebaseAuthStrings.`web-storage-unsupported`
import typings.firebaseAuth.firebaseAuthStrings.`wrong-password`
import typings.firebaseAuth.firebaseAuthStrings.authSlashtimeout
import typings.firebaseAuth.firebaseAuthStrings.timeout
import typings.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcCoreErrorsMod {
  
  object AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY {
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.ADMIN_ONLY_OPERATION")
    @js.native
    val ADMIN_ONLY_OPERATION: `authSlashadmin-restricted-operation` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.ALREADY_INITIALIZED")
    @js.native
    val ALREADY_INITIALIZED: `authSlashalready-initialized` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.APP_NOT_AUTHORIZED")
    @js.native
    val APP_NOT_AUTHORIZED: `authSlashapp-not-authorized` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.APP_NOT_INSTALLED")
    @js.native
    val APP_NOT_INSTALLED: `authSlashapp-not-installed` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.ARGUMENT_ERROR")
    @js.native
    val ARGUMENT_ERROR: `authSlashargument-error` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CAPTCHA_CHECK_FAILED")
    @js.native
    val CAPTCHA_CHECK_FAILED: `authSlashcaptcha-check-failed` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CODE_EXPIRED")
    @js.native
    val CODE_EXPIRED: `authSlashcode-expired` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CORDOVA_NOT_READY")
    @js.native
    val CORDOVA_NOT_READY: `authSlashcordova-not-ready` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CORS_UNSUPPORTED")
    @js.native
    val CORS_UNSUPPORTED: `authSlashcors-unsupported` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CREDENTIAL_ALREADY_IN_USE")
    @js.native
    val CREDENTIAL_ALREADY_IN_USE: `authSlashcredential-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CREDENTIAL_MISMATCH")
    @js.native
    val CREDENTIAL_MISMATCH: `authSlashcustom-token-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.CREDENTIAL_TOO_OLD_LOGIN_AGAIN")
    @js.native
    val CREDENTIAL_TOO_OLD_LOGIN_AGAIN: `authSlashrequires-recent-login` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.DEPENDENT_SDK_INIT_BEFORE_AUTH")
    @js.native
    val DEPENDENT_SDK_INIT_BEFORE_AUTH: `authSlashdependent-sdk-initialized-before-auth` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.DYNAMIC_LINK_NOT_ACTIVATED")
    @js.native
    val DYNAMIC_LINK_NOT_ACTIVATED: `authSlashdynamic-link-not-activated` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.EMAIL_CHANGE_NEEDS_VERIFICATION")
    @js.native
    val EMAIL_CHANGE_NEEDS_VERIFICATION: `authSlashemail-change-needs-verification` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.EMAIL_EXISTS")
    @js.native
    val EMAIL_EXISTS: `authSlashemail-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.EMULATOR_CONFIG_FAILED")
    @js.native
    val EMULATOR_CONFIG_FAILED: `authSlashemulator-config-failed` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.EXPIRED_OOB_CODE")
    @js.native
    val EXPIRED_OOB_CODE: `authSlashexpired-action-code` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.EXPIRED_POPUP_REQUEST")
    @js.native
    val EXPIRED_POPUP_REQUEST: `authSlashcancelled-popup-request` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INTERNAL_ERROR")
    @js.native
    val INTERNAL_ERROR: `authSlashinternal-error` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_API_KEY")
    @js.native
    val INVALID_API_KEY: `authSlashinvalid-api-key` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_APP_CREDENTIAL")
    @js.native
    val INVALID_APP_CREDENTIAL: `authSlashinvalid-app-credential` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_APP_ID")
    @js.native
    val INVALID_APP_ID: `authSlashinvalid-app-id` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_AUTH")
    @js.native
    val INVALID_AUTH: `authSlashinvalid-user-token` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_AUTH_EVENT")
    @js.native
    val INVALID_AUTH_EVENT: `authSlashinvalid-auth-event` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_CERT_HASH")
    @js.native
    val INVALID_CERT_HASH: `authSlashinvalid-cert-hash` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_CODE")
    @js.native
    val INVALID_CODE: `authSlashinvalid-verification-code` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_CONTINUE_URI")
    @js.native
    val INVALID_CONTINUE_URI: `authSlashinvalid-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_CORDOVA_CONFIGURATION")
    @js.native
    val INVALID_CORDOVA_CONFIGURATION: `authSlashinvalid-cordova-configuration` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_CUSTOM_TOKEN")
    @js.native
    val INVALID_CUSTOM_TOKEN: `authSlashinvalid-custom-token` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_DYNAMIC_LINK_DOMAIN")
    @js.native
    val INVALID_DYNAMIC_LINK_DOMAIN: `authSlashinvalid-dynamic-link-domain` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_EMAIL")
    @js.native
    val INVALID_EMAIL: `authSlashinvalid-email` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_EMULATOR_SCHEME")
    @js.native
    val INVALID_EMULATOR_SCHEME: `authSlashinvalid-emulator-scheme` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_IDP_RESPONSE")
    @js.native
    val INVALID_IDP_RESPONSE: `authSlashinvalid-credential` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_MESSAGE_PAYLOAD")
    @js.native
    val INVALID_MESSAGE_PAYLOAD: `authSlashinvalid-message-payload` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_MFA_SESSION")
    @js.native
    val INVALID_MFA_SESSION: `authSlashinvalid-multi-factor-session` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_OAUTH_CLIENT_ID")
    @js.native
    val INVALID_OAUTH_CLIENT_ID: `authSlashinvalid-oauth-client-id` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_OAUTH_PROVIDER")
    @js.native
    val INVALID_OAUTH_PROVIDER: `authSlashinvalid-oauth-provider` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_OOB_CODE")
    @js.native
    val INVALID_OOB_CODE: `authSlashinvalid-action-code` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_ORIGIN")
    @js.native
    val INVALID_ORIGIN: `authSlashunauthorized-domain` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_PASSWORD")
    @js.native
    val INVALID_PASSWORD: `authSlashwrong-password` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_PERSISTENCE")
    @js.native
    val INVALID_PERSISTENCE: `authSlashinvalid-persistence-type` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_PHONE_NUMBER")
    @js.native
    val INVALID_PHONE_NUMBER: `authSlashinvalid-phone-number` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_PROVIDER_ID")
    @js.native
    val INVALID_PROVIDER_ID: `authSlashinvalid-provider-id` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_RECAPTCHA_ACTION")
    @js.native
    val INVALID_RECAPTCHA_ACTION: `authSlashinvalid-recaptcha-action` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_RECAPTCHA_TOKEN")
    @js.native
    val INVALID_RECAPTCHA_TOKEN: `authSlashinvalid-recaptcha-token` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_RECAPTCHA_VERSION")
    @js.native
    val INVALID_RECAPTCHA_VERSION: `authSlashinvalid-recaptcha-version` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_RECIPIENT_EMAIL")
    @js.native
    val INVALID_RECIPIENT_EMAIL: `authSlashinvalid-recipient-email` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_REQ_TYPE")
    @js.native
    val INVALID_REQ_TYPE: `authSlashinvalid-req-type` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_SENDER")
    @js.native
    val INVALID_SENDER: `authSlashinvalid-sender` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_SESSION_INFO")
    @js.native
    val INVALID_SESSION_INFO: `authSlashinvalid-verification-id` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.INVALID_TENANT_ID")
    @js.native
    val INVALID_TENANT_ID: `authSlashinvalid-tenant-id` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MFA_INFO_NOT_FOUND")
    @js.native
    val MFA_INFO_NOT_FOUND: `authSlashmulti-factor-info-not-found` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MFA_REQUIRED")
    @js.native
    val MFA_REQUIRED: `authSlashmulti-factor-auth-required` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_ANDROID_PACKAGE_NAME")
    @js.native
    val MISSING_ANDROID_PACKAGE_NAME: `authSlashmissing-android-pkg-name` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_APP_CREDENTIAL")
    @js.native
    val MISSING_APP_CREDENTIAL: `authSlashmissing-app-credential` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_AUTH_DOMAIN")
    @js.native
    val MISSING_AUTH_DOMAIN: `authSlashauth-domain-config-required` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_CLIENT_TYPE")
    @js.native
    val MISSING_CLIENT_TYPE: `authSlashmissing-client-type` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_CODE")
    @js.native
    val MISSING_CODE: `authSlashmissing-verification-code` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_CONTINUE_URI")
    @js.native
    val MISSING_CONTINUE_URI: `authSlashmissing-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_IFRAME_START")
    @js.native
    val MISSING_IFRAME_START: `authSlashmissing-iframe-start` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_IOS_BUNDLE_ID")
    @js.native
    val MISSING_IOS_BUNDLE_ID: `authSlashmissing-ios-bundle-id` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_MFA_INFO")
    @js.native
    val MISSING_MFA_INFO: `authSlashmissing-multi-factor-info` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_MFA_SESSION")
    @js.native
    val MISSING_MFA_SESSION: `authSlashmissing-multi-factor-session` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_OR_INVALID_NONCE")
    @js.native
    val MISSING_OR_INVALID_NONCE: `authSlashmissing-or-invalid-nonce` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_PHONE_NUMBER")
    @js.native
    val MISSING_PHONE_NUMBER: `authSlashmissing-phone-number` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_RECAPTCHA_TOKEN")
    @js.native
    val MISSING_RECAPTCHA_TOKEN: `authSlashmissing-recaptcha-token` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_RECAPTCHA_VERSION")
    @js.native
    val MISSING_RECAPTCHA_VERSION: `authSlashmissing-recaptcha-version` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MISSING_SESSION_INFO")
    @js.native
    val MISSING_SESSION_INFO: `authSlashmissing-verification-id` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.MODULE_DESTROYED")
    @js.native
    val MODULE_DESTROYED: `authSlashapp-deleted` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.NEED_CONFIRMATION")
    @js.native
    val NEED_CONFIRMATION: `authSlashaccount-exists-with-different-credential` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.NETWORK_REQUEST_FAILED")
    @js.native
    val NETWORK_REQUEST_FAILED: `authSlashnetwork-request-failed` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.NO_AUTH_EVENT")
    @js.native
    val NO_AUTH_EVENT: `authSlashno-auth-event` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.NO_SUCH_PROVIDER")
    @js.native
    val NO_SUCH_PROVIDER: `authSlashno-such-provider` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.NULL_USER")
    @js.native
    val NULL_USER: `authSlashnull-user` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.OPERATION_NOT_ALLOWED")
    @js.native
    val OPERATION_NOT_ALLOWED: `authSlashoperation-not-allowed` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.OPERATION_NOT_SUPPORTED")
    @js.native
    val OPERATION_NOT_SUPPORTED: `authSlashoperation-not-supported-in-this-environment` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.POPUP_BLOCKED")
    @js.native
    val POPUP_BLOCKED: `authSlashpopup-blocked` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.POPUP_CLOSED_BY_USER")
    @js.native
    val POPUP_CLOSED_BY_USER: `authSlashpopup-closed-by-user` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.PROVIDER_ALREADY_LINKED")
    @js.native
    val PROVIDER_ALREADY_LINKED: `authSlashprovider-already-linked` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.QUOTA_EXCEEDED")
    @js.native
    val QUOTA_EXCEEDED: `authSlashquota-exceeded` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.RECAPTCHA_NOT_ENABLED")
    @js.native
    val RECAPTCHA_NOT_ENABLED: `authSlashrecaptcha-not-enabled` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.REDIRECT_CANCELLED_BY_USER")
    @js.native
    val REDIRECT_CANCELLED_BY_USER: `authSlashredirect-cancelled-by-user` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.REDIRECT_OPERATION_PENDING")
    @js.native
    val REDIRECT_OPERATION_PENDING: `authSlashredirect-operation-pending` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.REJECTED_CREDENTIAL")
    @js.native
    val REJECTED_CREDENTIAL: `authSlashrejected-credential` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.SECOND_FACTOR_ALREADY_ENROLLED")
    @js.native
    val SECOND_FACTOR_ALREADY_ENROLLED: `authSlashsecond-factor-already-in-use` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.SECOND_FACTOR_LIMIT_EXCEEDED")
    @js.native
    val SECOND_FACTOR_LIMIT_EXCEEDED: `authSlashmaximum-second-factor-count-exceeded` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.TENANT_ID_MISMATCH")
    @js.native
    val TENANT_ID_MISMATCH: `authSlashtenant-id-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.TIMEOUT")
    @js.native
    val TIMEOUT: authSlashtimeout = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.TOKEN_EXPIRED")
    @js.native
    val TOKEN_EXPIRED: `authSlashuser-token-expired` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.TOO_MANY_ATTEMPTS_TRY_LATER")
    @js.native
    val TOO_MANY_ATTEMPTS_TRY_LATER: `authSlashtoo-many-requests` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.UNAUTHORIZED_DOMAIN")
    @js.native
    val UNAUTHORIZED_DOMAIN: `authSlashunauthorized-continue-uri` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.UNSUPPORTED_FIRST_FACTOR")
    @js.native
    val UNSUPPORTED_FIRST_FACTOR: `authSlashunsupported-first-factor` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.UNSUPPORTED_PERSISTENCE")
    @js.native
    val UNSUPPORTED_PERSISTENCE: `authSlashunsupported-persistence-type` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.UNSUPPORTED_TENANT_OPERATION")
    @js.native
    val UNSUPPORTED_TENANT_OPERATION: `authSlashunsupported-tenant-operation` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.UNVERIFIED_EMAIL")
    @js.native
    val UNVERIFIED_EMAIL: `authSlashunverified-email` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.USER_CANCELLED")
    @js.native
    val USER_CANCELLED: `authSlashuser-cancelled` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.USER_DELETED")
    @js.native
    val USER_DELETED: `authSlashuser-not-found` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.USER_DISABLED")
    @js.native
    val USER_DISABLED: `authSlashuser-disabled` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.USER_MISMATCH")
    @js.native
    val USER_MISMATCH: `authSlashuser-mismatch` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.USER_SIGNED_OUT")
    @js.native
    val USER_SIGNED_OUT: `authSlashuser-signed-out` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.WEAK_PASSWORD")
    @js.native
    val WEAK_PASSWORD: `authSlashweak-password` = js.native
    
    @JSImport("@firebase/auth/dist/node/src/core/errors", "AUTH_ERROR_CODES_MAP_DO_NOT_USE_INTERNALLY.WEB_STORAGE_UNSUPPORTED")
    @js.native
    val WEB_STORAGE_UNSUPPORTED: `authSlashweb-storage-unsupported` = js.native
  }
  
  @JSImport("@firebase/auth/dist/node/src/core/errors", "_DEFAULT_AUTH_ERROR_FACTORY")
  @js.native
  val _DEFAULT_AUTH_ERROR_FACTORY: ErrorFactory[AuthErrorCode, AuthErrorParams] = js.native
  
  @JSImport("@firebase/auth/dist/node/src/core/errors", "debugErrorMap")
  @js.native
  val debugErrorMap: AuthErrorMap = js.native
  
  @JSImport("@firebase/auth/dist/node/src/core/errors", "prodErrorMap")
  @js.native
  val prodErrorMap: AuthErrorMap = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthStrings.`admin-restricted-operation`
    - typings.firebaseAuth.firebaseAuthStrings.`argument-error`
    - typings.firebaseAuth.firebaseAuthStrings.`app-not-authorized`
    - typings.firebaseAuth.firebaseAuthStrings.`app-not-installed`
    - typings.firebaseAuth.firebaseAuthStrings.`captcha-check-failed`
    - typings.firebaseAuth.firebaseAuthStrings.`code-expired`
    - typings.firebaseAuth.firebaseAuthStrings.`cordova-not-ready`
    - typings.firebaseAuth.firebaseAuthStrings.`cors-unsupported`
    - typings.firebaseAuth.firebaseAuthStrings.`credential-already-in-use`
    - typings.firebaseAuth.firebaseAuthStrings.`custom-token-mismatch`
    - typings.firebaseAuth.firebaseAuthStrings.`requires-recent-login`
    - typings.firebaseAuth.firebaseAuthStrings.`dependent-sdk-initialized-before-auth`
    - typings.firebaseAuth.firebaseAuthStrings.`dynamic-link-not-activated`
    - typings.firebaseAuth.firebaseAuthStrings.`email-change-needs-verification`
    - typings.firebaseAuth.firebaseAuthStrings.`email-already-in-use`
    - typings.firebaseAuth.firebaseAuthStrings.`emulator-config-failed`
    - typings.firebaseAuth.firebaseAuthStrings.`expired-action-code`
    - typings.firebaseAuth.firebaseAuthStrings.`cancelled-popup-request`
    - typings.firebaseAuth.firebaseAuthStrings.`internal-error`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-api-key`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-app-credential`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-app-id`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-user-token`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-auth-event`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-cert-hash`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-verification-code`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-continue-uri`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-cordova-configuration`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-custom-token`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-dynamic-link-domain`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-email`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-emulator-scheme`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-credential`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-message-payload`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-multi-factor-session`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-oauth-client-id`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-oauth-provider`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-action-code`
    - typings.firebaseAuth.firebaseAuthStrings.`unauthorized-domain`
    - typings.firebaseAuth.firebaseAuthStrings.`wrong-password`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-persistence-type`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-phone-number`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-provider-id`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-recipient-email`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-sender`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-verification-id`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-tenant-id`
    - typings.firebaseAuth.firebaseAuthStrings.`login-blocked`
    - typings.firebaseAuth.firebaseAuthStrings.`multi-factor-info-not-found`
    - typings.firebaseAuth.firebaseAuthStrings.`multi-factor-auth-required`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-android-pkg-name`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-app-credential`
    - typings.firebaseAuth.firebaseAuthStrings.`auth-domain-config-required`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-verification-code`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-continue-uri`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-iframe-start`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-ios-bundle-id`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-or-invalid-nonce`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-multi-factor-info`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-multi-factor-session`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-phone-number`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-password`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-verification-id`
    - typings.firebaseAuth.firebaseAuthStrings.`app-deleted`
    - typings.firebaseAuth.firebaseAuthStrings.`account-exists-with-different-credential`
    - typings.firebaseAuth.firebaseAuthStrings.`network-request-failed`
    - typings.firebaseAuth.firebaseAuthStrings.`null-user`
    - typings.firebaseAuth.firebaseAuthStrings.`no-auth-event`
    - typings.firebaseAuth.firebaseAuthStrings.`no-such-provider`
    - typings.firebaseAuth.firebaseAuthStrings.`operation-not-allowed`
    - typings.firebaseAuth.firebaseAuthStrings.`operation-not-supported-in-this-environment`
    - typings.firebaseAuth.firebaseAuthStrings.`popup-blocked`
    - typings.firebaseAuth.firebaseAuthStrings.`popup-closed-by-user`
    - typings.firebaseAuth.firebaseAuthStrings.`provider-already-linked`
    - typings.firebaseAuth.firebaseAuthStrings.`quota-exceeded`
    - typings.firebaseAuth.firebaseAuthStrings.`redirect-cancelled-by-user`
    - typings.firebaseAuth.firebaseAuthStrings.`redirect-operation-pending`
    - typings.firebaseAuth.firebaseAuthStrings.`rejected-credential`
    - typings.firebaseAuth.firebaseAuthStrings.`second-factor-already-in-use`
    - typings.firebaseAuth.firebaseAuthStrings.`maximum-second-factor-count-exceeded`
    - typings.firebaseAuth.firebaseAuthStrings.`tenant-id-mismatch`
    - typings.firebaseAuth.firebaseAuthStrings.timeout
    - typings.firebaseAuth.firebaseAuthStrings.`user-token-expired`
    - typings.firebaseAuth.firebaseAuthStrings.`too-many-requests`
    - typings.firebaseAuth.firebaseAuthStrings.`unauthorized-continue-uri`
    - typings.firebaseAuth.firebaseAuthStrings.`unsupported-first-factor`
    - typings.firebaseAuth.firebaseAuthStrings.`unsupported-persistence-type`
    - typings.firebaseAuth.firebaseAuthStrings.`unsupported-tenant-operation`
    - typings.firebaseAuth.firebaseAuthStrings.`unverified-email`
    - typings.firebaseAuth.firebaseAuthStrings.`user-cancelled`
    - typings.firebaseAuth.firebaseAuthStrings.`user-not-found`
    - typings.firebaseAuth.firebaseAuthStrings.`user-disabled`
    - typings.firebaseAuth.firebaseAuthStrings.`user-mismatch`
    - typings.firebaseAuth.firebaseAuthStrings.`user-signed-out`
    - typings.firebaseAuth.firebaseAuthStrings.`weak-password`
    - typings.firebaseAuth.firebaseAuthStrings.`web-storage-unsupported`
    - typings.firebaseAuth.firebaseAuthStrings.`already-initialized`
    - typings.firebaseAuth.firebaseAuthStrings.`recaptcha-not-enabled`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-recaptcha-token`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-recaptcha-token`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-recaptcha-action`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-client-type`
    - typings.firebaseAuth.firebaseAuthStrings.`missing-recaptcha-version`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-recaptcha-version`
    - typings.firebaseAuth.firebaseAuthStrings.`invalid-req-type`
  */
  trait AuthErrorCode extends StObject
  object AuthErrorCode {
    
    inline def ADMIN_ONLY_OPERATION: `admin-restricted-operation` = "admin-restricted-operation".asInstanceOf[`admin-restricted-operation`]
    
    inline def ALREADY_INITIALIZED: `already-initialized` = "already-initialized".asInstanceOf[`already-initialized`]
    
    inline def APP_NOT_AUTHORIZED: `app-not-authorized` = "app-not-authorized".asInstanceOf[`app-not-authorized`]
    
    inline def APP_NOT_INSTALLED: `app-not-installed` = "app-not-installed".asInstanceOf[`app-not-installed`]
    
    inline def ARGUMENT_ERROR: `argument-error` = "argument-error".asInstanceOf[`argument-error`]
    
    inline def CAPTCHA_CHECK_FAILED: `captcha-check-failed` = "captcha-check-failed".asInstanceOf[`captcha-check-failed`]
    
    inline def CODE_EXPIRED: `code-expired` = "code-expired".asInstanceOf[`code-expired`]
    
    inline def CORDOVA_NOT_READY: `cordova-not-ready` = "cordova-not-ready".asInstanceOf[`cordova-not-ready`]
    
    inline def CORS_UNSUPPORTED: `cors-unsupported` = "cors-unsupported".asInstanceOf[`cors-unsupported`]
    
    inline def CREDENTIAL_ALREADY_IN_USE: `credential-already-in-use` = "credential-already-in-use".asInstanceOf[`credential-already-in-use`]
    
    inline def CREDENTIAL_MISMATCH: `custom-token-mismatch` = "custom-token-mismatch".asInstanceOf[`custom-token-mismatch`]
    
    inline def CREDENTIAL_TOO_OLD_LOGIN_AGAIN: `requires-recent-login` = "requires-recent-login".asInstanceOf[`requires-recent-login`]
    
    inline def DEPENDENT_SDK_INIT_BEFORE_AUTH: `dependent-sdk-initialized-before-auth` = "dependent-sdk-initialized-before-auth".asInstanceOf[`dependent-sdk-initialized-before-auth`]
    
    inline def DYNAMIC_LINK_NOT_ACTIVATED: `dynamic-link-not-activated` = "dynamic-link-not-activated".asInstanceOf[`dynamic-link-not-activated`]
    
    inline def EMAIL_CHANGE_NEEDS_VERIFICATION: `email-change-needs-verification` = "email-change-needs-verification".asInstanceOf[`email-change-needs-verification`]
    
    inline def EMAIL_EXISTS: `email-already-in-use` = "email-already-in-use".asInstanceOf[`email-already-in-use`]
    
    inline def EMULATOR_CONFIG_FAILED: `emulator-config-failed` = "emulator-config-failed".asInstanceOf[`emulator-config-failed`]
    
    inline def EXPIRED_OOB_CODE: `expired-action-code` = "expired-action-code".asInstanceOf[`expired-action-code`]
    
    inline def EXPIRED_POPUP_REQUEST: `cancelled-popup-request` = "cancelled-popup-request".asInstanceOf[`cancelled-popup-request`]
    
    inline def INTERNAL_ERROR: `internal-error` = "internal-error".asInstanceOf[`internal-error`]
    
    inline def INVALID_API_KEY: `invalid-api-key` = "invalid-api-key".asInstanceOf[`invalid-api-key`]
    
    inline def INVALID_APP_CREDENTIAL: `invalid-app-credential` = "invalid-app-credential".asInstanceOf[`invalid-app-credential`]
    
    inline def INVALID_APP_ID: `invalid-app-id` = "invalid-app-id".asInstanceOf[`invalid-app-id`]
    
    inline def INVALID_AUTH: `invalid-user-token` = "invalid-user-token".asInstanceOf[`invalid-user-token`]
    
    inline def INVALID_AUTH_EVENT: `invalid-auth-event` = "invalid-auth-event".asInstanceOf[`invalid-auth-event`]
    
    inline def INVALID_CERT_HASH: `invalid-cert-hash` = "invalid-cert-hash".asInstanceOf[`invalid-cert-hash`]
    
    inline def INVALID_CODE: `invalid-verification-code` = "invalid-verification-code".asInstanceOf[`invalid-verification-code`]
    
    inline def INVALID_CONTINUE_URI: `invalid-continue-uri` = "invalid-continue-uri".asInstanceOf[`invalid-continue-uri`]
    
    inline def INVALID_CORDOVA_CONFIGURATION: `invalid-cordova-configuration` = "invalid-cordova-configuration".asInstanceOf[`invalid-cordova-configuration`]
    
    inline def INVALID_CUSTOM_TOKEN: `invalid-custom-token` = "invalid-custom-token".asInstanceOf[`invalid-custom-token`]
    
    inline def INVALID_DYNAMIC_LINK_DOMAIN: `invalid-dynamic-link-domain` = "invalid-dynamic-link-domain".asInstanceOf[`invalid-dynamic-link-domain`]
    
    inline def INVALID_EMAIL: `invalid-email` = "invalid-email".asInstanceOf[`invalid-email`]
    
    inline def INVALID_EMULATOR_SCHEME: `invalid-emulator-scheme` = "invalid-emulator-scheme".asInstanceOf[`invalid-emulator-scheme`]
    
    inline def INVALID_IDP_RESPONSE: `invalid-credential` = "invalid-credential".asInstanceOf[`invalid-credential`]
    
    inline def INVALID_MESSAGE_PAYLOAD: `invalid-message-payload` = "invalid-message-payload".asInstanceOf[`invalid-message-payload`]
    
    inline def INVALID_MFA_SESSION: `invalid-multi-factor-session` = "invalid-multi-factor-session".asInstanceOf[`invalid-multi-factor-session`]
    
    inline def INVALID_OAUTH_CLIENT_ID: `invalid-oauth-client-id` = "invalid-oauth-client-id".asInstanceOf[`invalid-oauth-client-id`]
    
    inline def INVALID_OAUTH_PROVIDER: `invalid-oauth-provider` = "invalid-oauth-provider".asInstanceOf[`invalid-oauth-provider`]
    
    inline def INVALID_OOB_CODE: `invalid-action-code` = "invalid-action-code".asInstanceOf[`invalid-action-code`]
    
    inline def INVALID_ORIGIN: `unauthorized-domain` = "unauthorized-domain".asInstanceOf[`unauthorized-domain`]
    
    inline def INVALID_PASSWORD: `wrong-password` = "wrong-password".asInstanceOf[`wrong-password`]
    
    inline def INVALID_PERSISTENCE: `invalid-persistence-type` = "invalid-persistence-type".asInstanceOf[`invalid-persistence-type`]
    
    inline def INVALID_PHONE_NUMBER: `invalid-phone-number` = "invalid-phone-number".asInstanceOf[`invalid-phone-number`]
    
    inline def INVALID_PROVIDER_ID: `invalid-provider-id` = "invalid-provider-id".asInstanceOf[`invalid-provider-id`]
    
    inline def INVALID_RECAPTCHA_ACTION: `invalid-recaptcha-action` = "invalid-recaptcha-action".asInstanceOf[`invalid-recaptcha-action`]
    
    inline def INVALID_RECAPTCHA_TOKEN: `invalid-recaptcha-token` = "invalid-recaptcha-token".asInstanceOf[`invalid-recaptcha-token`]
    
    inline def INVALID_RECAPTCHA_VERSION: `invalid-recaptcha-version` = "invalid-recaptcha-version".asInstanceOf[`invalid-recaptcha-version`]
    
    inline def INVALID_RECIPIENT_EMAIL: `invalid-recipient-email` = "invalid-recipient-email".asInstanceOf[`invalid-recipient-email`]
    
    inline def INVALID_REQ_TYPE: `invalid-req-type` = "invalid-req-type".asInstanceOf[`invalid-req-type`]
    
    inline def INVALID_SENDER: `invalid-sender` = "invalid-sender".asInstanceOf[`invalid-sender`]
    
    inline def INVALID_SESSION_INFO: `invalid-verification-id` = "invalid-verification-id".asInstanceOf[`invalid-verification-id`]
    
    inline def INVALID_TENANT_ID: `invalid-tenant-id` = "invalid-tenant-id".asInstanceOf[`invalid-tenant-id`]
    
    inline def LOGIN_BLOCKED: `login-blocked` = "login-blocked".asInstanceOf[`login-blocked`]
    
    inline def MFA_INFO_NOT_FOUND: `multi-factor-info-not-found` = "multi-factor-info-not-found".asInstanceOf[`multi-factor-info-not-found`]
    
    inline def MFA_REQUIRED: `multi-factor-auth-required` = "multi-factor-auth-required".asInstanceOf[`multi-factor-auth-required`]
    
    inline def MISSING_ANDROID_PACKAGE_NAME: `missing-android-pkg-name` = "missing-android-pkg-name".asInstanceOf[`missing-android-pkg-name`]
    
    inline def MISSING_APP_CREDENTIAL: `missing-app-credential` = "missing-app-credential".asInstanceOf[`missing-app-credential`]
    
    inline def MISSING_AUTH_DOMAIN: `auth-domain-config-required` = "auth-domain-config-required".asInstanceOf[`auth-domain-config-required`]
    
    inline def MISSING_CLIENT_TYPE: `missing-client-type` = "missing-client-type".asInstanceOf[`missing-client-type`]
    
    inline def MISSING_CODE: `missing-verification-code` = "missing-verification-code".asInstanceOf[`missing-verification-code`]
    
    inline def MISSING_CONTINUE_URI: `missing-continue-uri` = "missing-continue-uri".asInstanceOf[`missing-continue-uri`]
    
    inline def MISSING_IFRAME_START: `missing-iframe-start` = "missing-iframe-start".asInstanceOf[`missing-iframe-start`]
    
    inline def MISSING_IOS_BUNDLE_ID: `missing-ios-bundle-id` = "missing-ios-bundle-id".asInstanceOf[`missing-ios-bundle-id`]
    
    inline def MISSING_MFA_INFO: `missing-multi-factor-info` = "missing-multi-factor-info".asInstanceOf[`missing-multi-factor-info`]
    
    inline def MISSING_MFA_SESSION: `missing-multi-factor-session` = "missing-multi-factor-session".asInstanceOf[`missing-multi-factor-session`]
    
    inline def MISSING_OR_INVALID_NONCE: `missing-or-invalid-nonce` = "missing-or-invalid-nonce".asInstanceOf[`missing-or-invalid-nonce`]
    
    inline def MISSING_PASSWORD: `missing-password` = "missing-password".asInstanceOf[`missing-password`]
    
    inline def MISSING_PHONE_NUMBER: `missing-phone-number` = "missing-phone-number".asInstanceOf[`missing-phone-number`]
    
    inline def MISSING_RECAPTCHA_TOKEN: `missing-recaptcha-token` = "missing-recaptcha-token".asInstanceOf[`missing-recaptcha-token`]
    
    inline def MISSING_RECAPTCHA_VERSION: `missing-recaptcha-version` = "missing-recaptcha-version".asInstanceOf[`missing-recaptcha-version`]
    
    inline def MISSING_SESSION_INFO: `missing-verification-id` = "missing-verification-id".asInstanceOf[`missing-verification-id`]
    
    inline def MODULE_DESTROYED: `app-deleted` = "app-deleted".asInstanceOf[`app-deleted`]
    
    inline def NEED_CONFIRMATION: `account-exists-with-different-credential` = "account-exists-with-different-credential".asInstanceOf[`account-exists-with-different-credential`]
    
    inline def NETWORK_REQUEST_FAILED: `network-request-failed` = "network-request-failed".asInstanceOf[`network-request-failed`]
    
    inline def NO_AUTH_EVENT: `no-auth-event` = "no-auth-event".asInstanceOf[`no-auth-event`]
    
    inline def NO_SUCH_PROVIDER: `no-such-provider` = "no-such-provider".asInstanceOf[`no-such-provider`]
    
    inline def NULL_USER: `null-user` = "null-user".asInstanceOf[`null-user`]
    
    inline def OPERATION_NOT_ALLOWED: `operation-not-allowed` = "operation-not-allowed".asInstanceOf[`operation-not-allowed`]
    
    inline def OPERATION_NOT_SUPPORTED: `operation-not-supported-in-this-environment` = "operation-not-supported-in-this-environment".asInstanceOf[`operation-not-supported-in-this-environment`]
    
    inline def POPUP_BLOCKED: `popup-blocked` = "popup-blocked".asInstanceOf[`popup-blocked`]
    
    inline def POPUP_CLOSED_BY_USER: `popup-closed-by-user` = "popup-closed-by-user".asInstanceOf[`popup-closed-by-user`]
    
    inline def PROVIDER_ALREADY_LINKED: `provider-already-linked` = "provider-already-linked".asInstanceOf[`provider-already-linked`]
    
    inline def QUOTA_EXCEEDED: `quota-exceeded` = "quota-exceeded".asInstanceOf[`quota-exceeded`]
    
    inline def RECAPTCHA_NOT_ENABLED: `recaptcha-not-enabled` = "recaptcha-not-enabled".asInstanceOf[`recaptcha-not-enabled`]
    
    inline def REDIRECT_CANCELLED_BY_USER: `redirect-cancelled-by-user` = "redirect-cancelled-by-user".asInstanceOf[`redirect-cancelled-by-user`]
    
    inline def REDIRECT_OPERATION_PENDING: `redirect-operation-pending` = "redirect-operation-pending".asInstanceOf[`redirect-operation-pending`]
    
    inline def REJECTED_CREDENTIAL: `rejected-credential` = "rejected-credential".asInstanceOf[`rejected-credential`]
    
    inline def SECOND_FACTOR_ALREADY_ENROLLED: `second-factor-already-in-use` = "second-factor-already-in-use".asInstanceOf[`second-factor-already-in-use`]
    
    inline def SECOND_FACTOR_LIMIT_EXCEEDED: `maximum-second-factor-count-exceeded` = "maximum-second-factor-count-exceeded".asInstanceOf[`maximum-second-factor-count-exceeded`]
    
    inline def TENANT_ID_MISMATCH: `tenant-id-mismatch` = "tenant-id-mismatch".asInstanceOf[`tenant-id-mismatch`]
    
    inline def TIMEOUT: timeout = "timeout".asInstanceOf[timeout]
    
    inline def TOKEN_EXPIRED: `user-token-expired` = "user-token-expired".asInstanceOf[`user-token-expired`]
    
    inline def TOO_MANY_ATTEMPTS_TRY_LATER: `too-many-requests` = "too-many-requests".asInstanceOf[`too-many-requests`]
    
    inline def UNAUTHORIZED_DOMAIN: `unauthorized-continue-uri` = "unauthorized-continue-uri".asInstanceOf[`unauthorized-continue-uri`]
    
    inline def UNSUPPORTED_FIRST_FACTOR: `unsupported-first-factor` = "unsupported-first-factor".asInstanceOf[`unsupported-first-factor`]
    
    inline def UNSUPPORTED_PERSISTENCE: `unsupported-persistence-type` = "unsupported-persistence-type".asInstanceOf[`unsupported-persistence-type`]
    
    inline def UNSUPPORTED_TENANT_OPERATION: `unsupported-tenant-operation` = "unsupported-tenant-operation".asInstanceOf[`unsupported-tenant-operation`]
    
    inline def UNVERIFIED_EMAIL: `unverified-email` = "unverified-email".asInstanceOf[`unverified-email`]
    
    inline def USER_CANCELLED: `user-cancelled` = "user-cancelled".asInstanceOf[`user-cancelled`]
    
    inline def USER_DELETED: `user-not-found` = "user-not-found".asInstanceOf[`user-not-found`]
    
    inline def USER_DISABLED: `user-disabled` = "user-disabled".asInstanceOf[`user-disabled`]
    
    inline def USER_MISMATCH: `user-mismatch` = "user-mismatch".asInstanceOf[`user-mismatch`]
    
    inline def USER_SIGNED_OUT: `user-signed-out` = "user-signed-out".asInstanceOf[`user-signed-out`]
    
    inline def WEAK_PASSWORD: `weak-password` = "weak-password".asInstanceOf[`weak-password`]
    
    inline def WEB_STORAGE_UNSUPPORTED: `web-storage-unsupported` = "web-storage-unsupported".asInstanceOf[`web-storage-unsupported`]
  }
  
  @js.native
  trait AuthErrorParams
    extends StObject
       with GenericAuthErrorParams
  
  @js.native
  trait ErrorMapRetriever
    extends StObject
       with AuthErrorMap {
    
    def apply(): ErrorMapAuthErrorCode = js.native
  }
  
  /**
    * @internal
    */
  /* Inlined {[ key in std.Exclude<@firebase/auth.@firebase/auth/dist/node/src/core/errors.AuthErrorCode, @firebase/auth.@firebase/auth/dist/node/src/core/errors.AuthErrorCode.ARGUMENT_ERROR | @firebase/auth.@firebase/auth/dist/node/src/core/errors.AuthErrorCode.DEPENDENT_SDK_INIT_BEFORE_AUTH | @firebase/auth.@firebase/auth/dist/node/src/core/errors.AuthErrorCode.INTERNAL_ERROR | @firebase/auth.@firebase/auth/dist/node/src/core/errors.AuthErrorCode.MFA_REQUIRED | @firebase/auth.@firebase/auth/dist/node/src/core/errors.AuthErrorCode.NO_AUTH_EVENT | @firebase/auth.@firebase/auth/dist/node/src/core/errors.AuthErrorCode.OPERATION_NOT_SUPPORTED> ]: {  appName :@firebase/auth.@firebase/auth/dist/node/src/model/auth.AppName | undefined,   email :string | undefined,   phoneNumber :string | undefined,   message :string | undefined}} */
  trait GenericAuthErrorParams extends StObject {
    
    var `account-exists-with-different-credential`: AppNameEmailMessagePhoneNumber
    
    var `admin-restricted-operation`: AppNameEmailMessagePhoneNumber
    
    var `already-initialized`: AppNameEmailMessagePhoneNumber
    
    var `app-deleted`: AppNameEmailMessagePhoneNumber
    
    var `app-not-authorized`: AppNameEmailMessagePhoneNumber
    
    var `app-not-installed`: AppNameEmailMessagePhoneNumber
    
    var `auth-domain-config-required`: AppNameEmailMessagePhoneNumber
    
    var `cancelled-popup-request`: AppNameEmailMessagePhoneNumber
    
    var `captcha-check-failed`: AppNameEmailMessagePhoneNumber
    
    var `code-expired`: AppNameEmailMessagePhoneNumber
    
    var `cordova-not-ready`: AppNameEmailMessagePhoneNumber
    
    var `cors-unsupported`: AppNameEmailMessagePhoneNumber
    
    var `credential-already-in-use`: AppNameEmailMessagePhoneNumber
    
    var `custom-token-mismatch`: AppNameEmailMessagePhoneNumber
    
    var `dynamic-link-not-activated`: AppNameEmailMessagePhoneNumber
    
    var `email-already-in-use`: AppNameEmailMessagePhoneNumber
    
    var `email-change-needs-verification`: AppNameEmailMessagePhoneNumber
    
    var `emulator-config-failed`: AppNameEmailMessagePhoneNumber
    
    var `expired-action-code`: AppNameEmailMessagePhoneNumber
    
    var `invalid-action-code`: AppNameEmailMessagePhoneNumber
    
    var `invalid-api-key`: AppNameEmailMessagePhoneNumber
    
    var `invalid-app-credential`: AppNameEmailMessagePhoneNumber
    
    var `invalid-app-id`: AppNameEmailMessagePhoneNumber
    
    var `invalid-auth-event`: AppNameEmailMessagePhoneNumber
    
    var `invalid-cert-hash`: AppNameEmailMessagePhoneNumber
    
    var `invalid-continue-uri`: AppNameEmailMessagePhoneNumber
    
    var `invalid-cordova-configuration`: AppNameEmailMessagePhoneNumber
    
    var `invalid-credential`: AppNameEmailMessagePhoneNumber
    
    var `invalid-custom-token`: AppNameEmailMessagePhoneNumber
    
    var `invalid-dynamic-link-domain`: AppNameEmailMessagePhoneNumber
    
    var `invalid-email`: AppNameEmailMessagePhoneNumber
    
    var `invalid-emulator-scheme`: AppNameEmailMessagePhoneNumber
    
    var `invalid-message-payload`: AppNameEmailMessagePhoneNumber
    
    var `invalid-multi-factor-session`: AppNameEmailMessagePhoneNumber
    
    var `invalid-oauth-client-id`: AppNameEmailMessagePhoneNumber
    
    var `invalid-oauth-provider`: AppNameEmailMessagePhoneNumber
    
    var `invalid-persistence-type`: AppNameEmailMessagePhoneNumber
    
    var `invalid-phone-number`: AppNameEmailMessagePhoneNumber
    
    var `invalid-provider-id`: AppNameEmailMessagePhoneNumber
    
    var `invalid-recaptcha-action`: AppNameEmailMessagePhoneNumber
    
    var `invalid-recaptcha-token`: AppNameEmailMessagePhoneNumber
    
    var `invalid-recaptcha-version`: AppNameEmailMessagePhoneNumber
    
    var `invalid-recipient-email`: AppNameEmailMessagePhoneNumber
    
    var `invalid-req-type`: AppNameEmailMessagePhoneNumber
    
    var `invalid-sender`: AppNameEmailMessagePhoneNumber
    
    var `invalid-tenant-id`: AppNameEmailMessagePhoneNumber
    
    var `invalid-user-token`: AppNameEmailMessagePhoneNumber
    
    var `invalid-verification-code`: AppNameEmailMessagePhoneNumber
    
    var `invalid-verification-id`: AppNameEmailMessagePhoneNumber
    
    var `login-blocked`: AppNameEmailMessagePhoneNumber
    
    var `maximum-second-factor-count-exceeded`: AppNameEmailMessagePhoneNumber
    
    var `missing-android-pkg-name`: AppNameEmailMessagePhoneNumber
    
    var `missing-app-credential`: AppNameEmailMessagePhoneNumber
    
    var `missing-client-type`: AppNameEmailMessagePhoneNumber
    
    var `missing-continue-uri`: AppNameEmailMessagePhoneNumber
    
    var `missing-iframe-start`: AppNameEmailMessagePhoneNumber
    
    var `missing-ios-bundle-id`: AppNameEmailMessagePhoneNumber
    
    var `missing-multi-factor-info`: AppNameEmailMessagePhoneNumber
    
    var `missing-multi-factor-session`: AppNameEmailMessagePhoneNumber
    
    var `missing-or-invalid-nonce`: AppNameEmailMessagePhoneNumber
    
    var `missing-password`: AppNameEmailMessagePhoneNumber
    
    var `missing-phone-number`: AppNameEmailMessagePhoneNumber
    
    var `missing-recaptcha-token`: AppNameEmailMessagePhoneNumber
    
    var `missing-recaptcha-version`: AppNameEmailMessagePhoneNumber
    
    var `missing-verification-code`: AppNameEmailMessagePhoneNumber
    
    var `missing-verification-id`: AppNameEmailMessagePhoneNumber
    
    var `multi-factor-info-not-found`: AppNameEmailMessagePhoneNumber
    
    var `network-request-failed`: AppNameEmailMessagePhoneNumber
    
    var `no-such-provider`: AppNameEmailMessagePhoneNumber
    
    var `null-user`: AppNameEmailMessagePhoneNumber
    
    var `operation-not-allowed`: AppNameEmailMessagePhoneNumber
    
    var `popup-blocked`: AppNameEmailMessagePhoneNumber
    
    var `popup-closed-by-user`: AppNameEmailMessagePhoneNumber
    
    var `provider-already-linked`: AppNameEmailMessagePhoneNumber
    
    var `quota-exceeded`: AppNameEmailMessagePhoneNumber
    
    var `recaptcha-not-enabled`: AppNameEmailMessagePhoneNumber
    
    var `redirect-cancelled-by-user`: AppNameEmailMessagePhoneNumber
    
    var `redirect-operation-pending`: AppNameEmailMessagePhoneNumber
    
    var `rejected-credential`: AppNameEmailMessagePhoneNumber
    
    var `requires-recent-login`: AppNameEmailMessagePhoneNumber
    
    var `second-factor-already-in-use`: AppNameEmailMessagePhoneNumber
    
    var `tenant-id-mismatch`: AppNameEmailMessagePhoneNumber
    
    var timeout: AppNameEmailMessagePhoneNumber
    
    var `too-many-requests`: AppNameEmailMessagePhoneNumber
    
    var `unauthorized-continue-uri`: AppNameEmailMessagePhoneNumber
    
    var `unauthorized-domain`: AppNameEmailMessagePhoneNumber
    
    var `unsupported-first-factor`: AppNameEmailMessagePhoneNumber
    
    var `unsupported-persistence-type`: AppNameEmailMessagePhoneNumber
    
    var `unsupported-tenant-operation`: AppNameEmailMessagePhoneNumber
    
    var `unverified-email`: AppNameEmailMessagePhoneNumber
    
    var `user-cancelled`: AppNameEmailMessagePhoneNumber
    
    var `user-disabled`: AppNameEmailMessagePhoneNumber
    
    var `user-mismatch`: AppNameEmailMessagePhoneNumber
    
    var `user-not-found`: AppNameEmailMessagePhoneNumber
    
    var `user-signed-out`: AppNameEmailMessagePhoneNumber
    
    var `user-token-expired`: AppNameEmailMessagePhoneNumber
    
    var `weak-password`: AppNameEmailMessagePhoneNumber
    
    var `web-storage-unsupported`: AppNameEmailMessagePhoneNumber
    
    var `wrong-password`: AppNameEmailMessagePhoneNumber
  }
  object GenericAuthErrorParams {
    
    inline def apply(
      `account-exists-with-different-credential`: AppNameEmailMessagePhoneNumber,
      `admin-restricted-operation`: AppNameEmailMessagePhoneNumber,
      `already-initialized`: AppNameEmailMessagePhoneNumber,
      `app-deleted`: AppNameEmailMessagePhoneNumber,
      `app-not-authorized`: AppNameEmailMessagePhoneNumber,
      `app-not-installed`: AppNameEmailMessagePhoneNumber,
      `auth-domain-config-required`: AppNameEmailMessagePhoneNumber,
      `cancelled-popup-request`: AppNameEmailMessagePhoneNumber,
      `captcha-check-failed`: AppNameEmailMessagePhoneNumber,
      `code-expired`: AppNameEmailMessagePhoneNumber,
      `cordova-not-ready`: AppNameEmailMessagePhoneNumber,
      `cors-unsupported`: AppNameEmailMessagePhoneNumber,
      `credential-already-in-use`: AppNameEmailMessagePhoneNumber,
      `custom-token-mismatch`: AppNameEmailMessagePhoneNumber,
      `dynamic-link-not-activated`: AppNameEmailMessagePhoneNumber,
      `email-already-in-use`: AppNameEmailMessagePhoneNumber,
      `email-change-needs-verification`: AppNameEmailMessagePhoneNumber,
      `emulator-config-failed`: AppNameEmailMessagePhoneNumber,
      `expired-action-code`: AppNameEmailMessagePhoneNumber,
      `invalid-action-code`: AppNameEmailMessagePhoneNumber,
      `invalid-api-key`: AppNameEmailMessagePhoneNumber,
      `invalid-app-credential`: AppNameEmailMessagePhoneNumber,
      `invalid-app-id`: AppNameEmailMessagePhoneNumber,
      `invalid-auth-event`: AppNameEmailMessagePhoneNumber,
      `invalid-cert-hash`: AppNameEmailMessagePhoneNumber,
      `invalid-continue-uri`: AppNameEmailMessagePhoneNumber,
      `invalid-cordova-configuration`: AppNameEmailMessagePhoneNumber,
      `invalid-credential`: AppNameEmailMessagePhoneNumber,
      `invalid-custom-token`: AppNameEmailMessagePhoneNumber,
      `invalid-dynamic-link-domain`: AppNameEmailMessagePhoneNumber,
      `invalid-email`: AppNameEmailMessagePhoneNumber,
      `invalid-emulator-scheme`: AppNameEmailMessagePhoneNumber,
      `invalid-message-payload`: AppNameEmailMessagePhoneNumber,
      `invalid-multi-factor-session`: AppNameEmailMessagePhoneNumber,
      `invalid-oauth-client-id`: AppNameEmailMessagePhoneNumber,
      `invalid-oauth-provider`: AppNameEmailMessagePhoneNumber,
      `invalid-persistence-type`: AppNameEmailMessagePhoneNumber,
      `invalid-phone-number`: AppNameEmailMessagePhoneNumber,
      `invalid-provider-id`: AppNameEmailMessagePhoneNumber,
      `invalid-recaptcha-action`: AppNameEmailMessagePhoneNumber,
      `invalid-recaptcha-token`: AppNameEmailMessagePhoneNumber,
      `invalid-recaptcha-version`: AppNameEmailMessagePhoneNumber,
      `invalid-recipient-email`: AppNameEmailMessagePhoneNumber,
      `invalid-req-type`: AppNameEmailMessagePhoneNumber,
      `invalid-sender`: AppNameEmailMessagePhoneNumber,
      `invalid-tenant-id`: AppNameEmailMessagePhoneNumber,
      `invalid-user-token`: AppNameEmailMessagePhoneNumber,
      `invalid-verification-code`: AppNameEmailMessagePhoneNumber,
      `invalid-verification-id`: AppNameEmailMessagePhoneNumber,
      `login-blocked`: AppNameEmailMessagePhoneNumber,
      `maximum-second-factor-count-exceeded`: AppNameEmailMessagePhoneNumber,
      `missing-android-pkg-name`: AppNameEmailMessagePhoneNumber,
      `missing-app-credential`: AppNameEmailMessagePhoneNumber,
      `missing-client-type`: AppNameEmailMessagePhoneNumber,
      `missing-continue-uri`: AppNameEmailMessagePhoneNumber,
      `missing-iframe-start`: AppNameEmailMessagePhoneNumber,
      `missing-ios-bundle-id`: AppNameEmailMessagePhoneNumber,
      `missing-multi-factor-info`: AppNameEmailMessagePhoneNumber,
      `missing-multi-factor-session`: AppNameEmailMessagePhoneNumber,
      `missing-or-invalid-nonce`: AppNameEmailMessagePhoneNumber,
      `missing-password`: AppNameEmailMessagePhoneNumber,
      `missing-phone-number`: AppNameEmailMessagePhoneNumber,
      `missing-recaptcha-token`: AppNameEmailMessagePhoneNumber,
      `missing-recaptcha-version`: AppNameEmailMessagePhoneNumber,
      `missing-verification-code`: AppNameEmailMessagePhoneNumber,
      `missing-verification-id`: AppNameEmailMessagePhoneNumber,
      `multi-factor-info-not-found`: AppNameEmailMessagePhoneNumber,
      `network-request-failed`: AppNameEmailMessagePhoneNumber,
      `no-such-provider`: AppNameEmailMessagePhoneNumber,
      `null-user`: AppNameEmailMessagePhoneNumber,
      `operation-not-allowed`: AppNameEmailMessagePhoneNumber,
      `popup-blocked`: AppNameEmailMessagePhoneNumber,
      `popup-closed-by-user`: AppNameEmailMessagePhoneNumber,
      `provider-already-linked`: AppNameEmailMessagePhoneNumber,
      `quota-exceeded`: AppNameEmailMessagePhoneNumber,
      `recaptcha-not-enabled`: AppNameEmailMessagePhoneNumber,
      `redirect-cancelled-by-user`: AppNameEmailMessagePhoneNumber,
      `redirect-operation-pending`: AppNameEmailMessagePhoneNumber,
      `rejected-credential`: AppNameEmailMessagePhoneNumber,
      `requires-recent-login`: AppNameEmailMessagePhoneNumber,
      `second-factor-already-in-use`: AppNameEmailMessagePhoneNumber,
      `tenant-id-mismatch`: AppNameEmailMessagePhoneNumber,
      timeout: AppNameEmailMessagePhoneNumber,
      `too-many-requests`: AppNameEmailMessagePhoneNumber,
      `unauthorized-continue-uri`: AppNameEmailMessagePhoneNumber,
      `unauthorized-domain`: AppNameEmailMessagePhoneNumber,
      `unsupported-first-factor`: AppNameEmailMessagePhoneNumber,
      `unsupported-persistence-type`: AppNameEmailMessagePhoneNumber,
      `unsupported-tenant-operation`: AppNameEmailMessagePhoneNumber,
      `unverified-email`: AppNameEmailMessagePhoneNumber,
      `user-cancelled`: AppNameEmailMessagePhoneNumber,
      `user-disabled`: AppNameEmailMessagePhoneNumber,
      `user-mismatch`: AppNameEmailMessagePhoneNumber,
      `user-not-found`: AppNameEmailMessagePhoneNumber,
      `user-signed-out`: AppNameEmailMessagePhoneNumber,
      `user-token-expired`: AppNameEmailMessagePhoneNumber,
      `weak-password`: AppNameEmailMessagePhoneNumber,
      `web-storage-unsupported`: AppNameEmailMessagePhoneNumber,
      `wrong-password`: AppNameEmailMessagePhoneNumber
    ): GenericAuthErrorParams = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.updateDynamic("account-exists-with-different-credential")(`account-exists-with-different-credential`.asInstanceOf[js.Any])
      __obj.updateDynamic("admin-restricted-operation")(`admin-restricted-operation`.asInstanceOf[js.Any])
      __obj.updateDynamic("already-initialized")(`already-initialized`.asInstanceOf[js.Any])
      __obj.updateDynamic("app-deleted")(`app-deleted`.asInstanceOf[js.Any])
      __obj.updateDynamic("app-not-authorized")(`app-not-authorized`.asInstanceOf[js.Any])
      __obj.updateDynamic("app-not-installed")(`app-not-installed`.asInstanceOf[js.Any])
      __obj.updateDynamic("auth-domain-config-required")(`auth-domain-config-required`.asInstanceOf[js.Any])
      __obj.updateDynamic("cancelled-popup-request")(`cancelled-popup-request`.asInstanceOf[js.Any])
      __obj.updateDynamic("captcha-check-failed")(`captcha-check-failed`.asInstanceOf[js.Any])
      __obj.updateDynamic("code-expired")(`code-expired`.asInstanceOf[js.Any])
      __obj.updateDynamic("cordova-not-ready")(`cordova-not-ready`.asInstanceOf[js.Any])
      __obj.updateDynamic("cors-unsupported")(`cors-unsupported`.asInstanceOf[js.Any])
      __obj.updateDynamic("credential-already-in-use")(`credential-already-in-use`.asInstanceOf[js.Any])
      __obj.updateDynamic("custom-token-mismatch")(`custom-token-mismatch`.asInstanceOf[js.Any])
      __obj.updateDynamic("dynamic-link-not-activated")(`dynamic-link-not-activated`.asInstanceOf[js.Any])
      __obj.updateDynamic("email-already-in-use")(`email-already-in-use`.asInstanceOf[js.Any])
      __obj.updateDynamic("email-change-needs-verification")(`email-change-needs-verification`.asInstanceOf[js.Any])
      __obj.updateDynamic("emulator-config-failed")(`emulator-config-failed`.asInstanceOf[js.Any])
      __obj.updateDynamic("expired-action-code")(`expired-action-code`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-action-code")(`invalid-action-code`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-api-key")(`invalid-api-key`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-app-credential")(`invalid-app-credential`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-app-id")(`invalid-app-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-auth-event")(`invalid-auth-event`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-cert-hash")(`invalid-cert-hash`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-continue-uri")(`invalid-continue-uri`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-cordova-configuration")(`invalid-cordova-configuration`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-credential")(`invalid-credential`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-custom-token")(`invalid-custom-token`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-dynamic-link-domain")(`invalid-dynamic-link-domain`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-email")(`invalid-email`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-emulator-scheme")(`invalid-emulator-scheme`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-message-payload")(`invalid-message-payload`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-multi-factor-session")(`invalid-multi-factor-session`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-oauth-client-id")(`invalid-oauth-client-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-oauth-provider")(`invalid-oauth-provider`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-persistence-type")(`invalid-persistence-type`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-phone-number")(`invalid-phone-number`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-provider-id")(`invalid-provider-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-recaptcha-action")(`invalid-recaptcha-action`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-recaptcha-token")(`invalid-recaptcha-token`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-recaptcha-version")(`invalid-recaptcha-version`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-recipient-email")(`invalid-recipient-email`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-req-type")(`invalid-req-type`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-sender")(`invalid-sender`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-tenant-id")(`invalid-tenant-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-user-token")(`invalid-user-token`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-verification-code")(`invalid-verification-code`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-verification-id")(`invalid-verification-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("login-blocked")(`login-blocked`.asInstanceOf[js.Any])
      __obj.updateDynamic("maximum-second-factor-count-exceeded")(`maximum-second-factor-count-exceeded`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-android-pkg-name")(`missing-android-pkg-name`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-app-credential")(`missing-app-credential`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-client-type")(`missing-client-type`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-continue-uri")(`missing-continue-uri`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-iframe-start")(`missing-iframe-start`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-ios-bundle-id")(`missing-ios-bundle-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-multi-factor-info")(`missing-multi-factor-info`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-multi-factor-session")(`missing-multi-factor-session`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-or-invalid-nonce")(`missing-or-invalid-nonce`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-password")(`missing-password`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-phone-number")(`missing-phone-number`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-recaptcha-token")(`missing-recaptcha-token`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-recaptcha-version")(`missing-recaptcha-version`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-verification-code")(`missing-verification-code`.asInstanceOf[js.Any])
      __obj.updateDynamic("missing-verification-id")(`missing-verification-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("multi-factor-info-not-found")(`multi-factor-info-not-found`.asInstanceOf[js.Any])
      __obj.updateDynamic("network-request-failed")(`network-request-failed`.asInstanceOf[js.Any])
      __obj.updateDynamic("no-such-provider")(`no-such-provider`.asInstanceOf[js.Any])
      __obj.updateDynamic("null-user")(`null-user`.asInstanceOf[js.Any])
      __obj.updateDynamic("operation-not-allowed")(`operation-not-allowed`.asInstanceOf[js.Any])
      __obj.updateDynamic("popup-blocked")(`popup-blocked`.asInstanceOf[js.Any])
      __obj.updateDynamic("popup-closed-by-user")(`popup-closed-by-user`.asInstanceOf[js.Any])
      __obj.updateDynamic("provider-already-linked")(`provider-already-linked`.asInstanceOf[js.Any])
      __obj.updateDynamic("quota-exceeded")(`quota-exceeded`.asInstanceOf[js.Any])
      __obj.updateDynamic("recaptcha-not-enabled")(`recaptcha-not-enabled`.asInstanceOf[js.Any])
      __obj.updateDynamic("redirect-cancelled-by-user")(`redirect-cancelled-by-user`.asInstanceOf[js.Any])
      __obj.updateDynamic("redirect-operation-pending")(`redirect-operation-pending`.asInstanceOf[js.Any])
      __obj.updateDynamic("rejected-credential")(`rejected-credential`.asInstanceOf[js.Any])
      __obj.updateDynamic("requires-recent-login")(`requires-recent-login`.asInstanceOf[js.Any])
      __obj.updateDynamic("second-factor-already-in-use")(`second-factor-already-in-use`.asInstanceOf[js.Any])
      __obj.updateDynamic("tenant-id-mismatch")(`tenant-id-mismatch`.asInstanceOf[js.Any])
      __obj.updateDynamic("too-many-requests")(`too-many-requests`.asInstanceOf[js.Any])
      __obj.updateDynamic("unauthorized-continue-uri")(`unauthorized-continue-uri`.asInstanceOf[js.Any])
      __obj.updateDynamic("unauthorized-domain")(`unauthorized-domain`.asInstanceOf[js.Any])
      __obj.updateDynamic("unsupported-first-factor")(`unsupported-first-factor`.asInstanceOf[js.Any])
      __obj.updateDynamic("unsupported-persistence-type")(`unsupported-persistence-type`.asInstanceOf[js.Any])
      __obj.updateDynamic("unsupported-tenant-operation")(`unsupported-tenant-operation`.asInstanceOf[js.Any])
      __obj.updateDynamic("unverified-email")(`unverified-email`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-cancelled")(`user-cancelled`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-disabled")(`user-disabled`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-mismatch")(`user-mismatch`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-not-found")(`user-not-found`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-signed-out")(`user-signed-out`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-token-expired")(`user-token-expired`.asInstanceOf[js.Any])
      __obj.updateDynamic("weak-password")(`weak-password`.asInstanceOf[js.Any])
      __obj.updateDynamic("web-storage-unsupported")(`web-storage-unsupported`.asInstanceOf[js.Any])
      __obj.updateDynamic("wrong-password")(`wrong-password`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericAuthErrorParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenericAuthErrorParams] (val x: Self) extends AnyVal {
      
      inline def `setAccount-exists-with-different-credential`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "account-exists-with-different-credential", value.asInstanceOf[js.Any])
      
      inline def `setAdmin-restricted-operation`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "admin-restricted-operation", value.asInstanceOf[js.Any])
      
      inline def `setAlready-initialized`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "already-initialized", value.asInstanceOf[js.Any])
      
      inline def `setApp-deleted`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "app-deleted", value.asInstanceOf[js.Any])
      
      inline def `setApp-not-authorized`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "app-not-authorized", value.asInstanceOf[js.Any])
      
      inline def `setApp-not-installed`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "app-not-installed", value.asInstanceOf[js.Any])
      
      inline def `setAuth-domain-config-required`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "auth-domain-config-required", value.asInstanceOf[js.Any])
      
      inline def `setCancelled-popup-request`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "cancelled-popup-request", value.asInstanceOf[js.Any])
      
      inline def `setCaptcha-check-failed`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "captcha-check-failed", value.asInstanceOf[js.Any])
      
      inline def `setCode-expired`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "code-expired", value.asInstanceOf[js.Any])
      
      inline def `setCordova-not-ready`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "cordova-not-ready", value.asInstanceOf[js.Any])
      
      inline def `setCors-unsupported`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "cors-unsupported", value.asInstanceOf[js.Any])
      
      inline def `setCredential-already-in-use`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "credential-already-in-use", value.asInstanceOf[js.Any])
      
      inline def `setCustom-token-mismatch`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "custom-token-mismatch", value.asInstanceOf[js.Any])
      
      inline def `setDynamic-link-not-activated`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "dynamic-link-not-activated", value.asInstanceOf[js.Any])
      
      inline def `setEmail-already-in-use`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "email-already-in-use", value.asInstanceOf[js.Any])
      
      inline def `setEmail-change-needs-verification`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "email-change-needs-verification", value.asInstanceOf[js.Any])
      
      inline def `setEmulator-config-failed`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "emulator-config-failed", value.asInstanceOf[js.Any])
      
      inline def `setExpired-action-code`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "expired-action-code", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-action-code`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-action-code", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-api-key`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-api-key", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-app-credential`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-app-credential", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-app-id`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-app-id", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-auth-event`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-auth-event", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-cert-hash`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-cert-hash", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-continue-uri`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-continue-uri", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-cordova-configuration`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-cordova-configuration", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-credential`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-credential", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-custom-token`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-custom-token", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-dynamic-link-domain`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-dynamic-link-domain", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-email`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-email", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-emulator-scheme`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-emulator-scheme", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-message-payload`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-message-payload", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-multi-factor-session`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-multi-factor-session", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-oauth-client-id`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-oauth-client-id", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-oauth-provider`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-oauth-provider", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-persistence-type`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-persistence-type", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-phone-number`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-phone-number", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-provider-id`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-provider-id", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-recaptcha-action`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-recaptcha-action", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-recaptcha-token`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-recaptcha-token", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-recaptcha-version`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-recaptcha-version", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-recipient-email`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-recipient-email", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-req-type`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-req-type", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-sender`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-sender", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-tenant-id`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-tenant-id", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-user-token`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-user-token", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-verification-code`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-verification-code", value.asInstanceOf[js.Any])
      
      inline def `setInvalid-verification-id`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "invalid-verification-id", value.asInstanceOf[js.Any])
      
      inline def `setLogin-blocked`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "login-blocked", value.asInstanceOf[js.Any])
      
      inline def `setMaximum-second-factor-count-exceeded`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "maximum-second-factor-count-exceeded", value.asInstanceOf[js.Any])
      
      inline def `setMissing-android-pkg-name`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-android-pkg-name", value.asInstanceOf[js.Any])
      
      inline def `setMissing-app-credential`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-app-credential", value.asInstanceOf[js.Any])
      
      inline def `setMissing-client-type`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-client-type", value.asInstanceOf[js.Any])
      
      inline def `setMissing-continue-uri`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-continue-uri", value.asInstanceOf[js.Any])
      
      inline def `setMissing-iframe-start`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-iframe-start", value.asInstanceOf[js.Any])
      
      inline def `setMissing-ios-bundle-id`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-ios-bundle-id", value.asInstanceOf[js.Any])
      
      inline def `setMissing-multi-factor-info`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-multi-factor-info", value.asInstanceOf[js.Any])
      
      inline def `setMissing-multi-factor-session`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-multi-factor-session", value.asInstanceOf[js.Any])
      
      inline def `setMissing-or-invalid-nonce`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-or-invalid-nonce", value.asInstanceOf[js.Any])
      
      inline def `setMissing-password`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-password", value.asInstanceOf[js.Any])
      
      inline def `setMissing-phone-number`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-phone-number", value.asInstanceOf[js.Any])
      
      inline def `setMissing-recaptcha-token`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-recaptcha-token", value.asInstanceOf[js.Any])
      
      inline def `setMissing-recaptcha-version`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-recaptcha-version", value.asInstanceOf[js.Any])
      
      inline def `setMissing-verification-code`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-verification-code", value.asInstanceOf[js.Any])
      
      inline def `setMissing-verification-id`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "missing-verification-id", value.asInstanceOf[js.Any])
      
      inline def `setMulti-factor-info-not-found`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "multi-factor-info-not-found", value.asInstanceOf[js.Any])
      
      inline def `setNetwork-request-failed`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "network-request-failed", value.asInstanceOf[js.Any])
      
      inline def `setNo-such-provider`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "no-such-provider", value.asInstanceOf[js.Any])
      
      inline def `setNull-user`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "null-user", value.asInstanceOf[js.Any])
      
      inline def `setOperation-not-allowed`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "operation-not-allowed", value.asInstanceOf[js.Any])
      
      inline def `setPopup-blocked`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "popup-blocked", value.asInstanceOf[js.Any])
      
      inline def `setPopup-closed-by-user`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "popup-closed-by-user", value.asInstanceOf[js.Any])
      
      inline def `setProvider-already-linked`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "provider-already-linked", value.asInstanceOf[js.Any])
      
      inline def `setQuota-exceeded`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "quota-exceeded", value.asInstanceOf[js.Any])
      
      inline def `setRecaptcha-not-enabled`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "recaptcha-not-enabled", value.asInstanceOf[js.Any])
      
      inline def `setRedirect-cancelled-by-user`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "redirect-cancelled-by-user", value.asInstanceOf[js.Any])
      
      inline def `setRedirect-operation-pending`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "redirect-operation-pending", value.asInstanceOf[js.Any])
      
      inline def `setRejected-credential`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "rejected-credential", value.asInstanceOf[js.Any])
      
      inline def `setRequires-recent-login`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "requires-recent-login", value.asInstanceOf[js.Any])
      
      inline def `setSecond-factor-already-in-use`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "second-factor-already-in-use", value.asInstanceOf[js.Any])
      
      inline def `setTenant-id-mismatch`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "tenant-id-mismatch", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def `setToo-many-requests`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "too-many-requests", value.asInstanceOf[js.Any])
      
      inline def `setUnauthorized-continue-uri`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "unauthorized-continue-uri", value.asInstanceOf[js.Any])
      
      inline def `setUnauthorized-domain`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "unauthorized-domain", value.asInstanceOf[js.Any])
      
      inline def `setUnsupported-first-factor`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "unsupported-first-factor", value.asInstanceOf[js.Any])
      
      inline def `setUnsupported-persistence-type`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "unsupported-persistence-type", value.asInstanceOf[js.Any])
      
      inline def `setUnsupported-tenant-operation`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "unsupported-tenant-operation", value.asInstanceOf[js.Any])
      
      inline def `setUnverified-email`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "unverified-email", value.asInstanceOf[js.Any])
      
      inline def `setUser-cancelled`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "user-cancelled", value.asInstanceOf[js.Any])
      
      inline def `setUser-disabled`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "user-disabled", value.asInstanceOf[js.Any])
      
      inline def `setUser-mismatch`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "user-mismatch", value.asInstanceOf[js.Any])
      
      inline def `setUser-not-found`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "user-not-found", value.asInstanceOf[js.Any])
      
      inline def `setUser-signed-out`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "user-signed-out", value.asInstanceOf[js.Any])
      
      inline def `setUser-token-expired`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "user-token-expired", value.asInstanceOf[js.Any])
      
      inline def `setWeak-password`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "weak-password", value.asInstanceOf[js.Any])
      
      inline def `setWeb-storage-unsupported`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "web-storage-unsupported", value.asInstanceOf[js.Any])
      
      inline def `setWrong-password`(value: AppNameEmailMessagePhoneNumber): Self = StObject.set(x, "wrong-password", value.asInstanceOf[js.Any])
    }
  }
  
  trait NamedErrorParams extends StObject {
    
    var _serverResponse: js.UndefOr[js.Object] = js.undefined
    
    var appName: AppName
    
    var credential: js.UndefOr[AuthCredential] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[User] = js.undefined
  }
  object NamedErrorParams {
    
    inline def apply(appName: AppName): NamedErrorParams = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedErrorParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NamedErrorParams] (val x: Self) extends AnyVal {
      
      inline def setAppName(value: AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setCredential(value: AuthCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def set_serverResponse(value: js.Object): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
      
      inline def set_serverResponseUndefined: Self = StObject.set(x, "_serverResponse", js.undefined)
    }
  }
}
