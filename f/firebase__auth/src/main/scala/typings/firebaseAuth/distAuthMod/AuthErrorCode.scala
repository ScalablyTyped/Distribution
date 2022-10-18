package typings.firebaseAuth.distAuthMod

import typings.firebaseAuth.firebaseAuthStrings.`account-exists-with-different-credential`
import typings.firebaseAuth.firebaseAuthStrings.`admin-restricted-operation`
import typings.firebaseAuth.firebaseAuthStrings.`already-initialized`
import typings.firebaseAuth.firebaseAuthStrings.`app-deleted`
import typings.firebaseAuth.firebaseAuthStrings.`app-not-authorized`
import typings.firebaseAuth.firebaseAuthStrings.`app-not-installed`
import typings.firebaseAuth.firebaseAuthStrings.`argument-error`
import typings.firebaseAuth.firebaseAuthStrings.`auth-domain-config-required`
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
import typings.firebaseAuth.firebaseAuthStrings.`invalid-recipient-email`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-sender`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-tenant-id`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-user-token`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-verification-code`
import typings.firebaseAuth.firebaseAuthStrings.`invalid-verification-id`
import typings.firebaseAuth.firebaseAuthStrings.`login-blocked`
import typings.firebaseAuth.firebaseAuthStrings.`maximum-second-factor-count-exceeded`
import typings.firebaseAuth.firebaseAuthStrings.`missing-android-pkg-name`
import typings.firebaseAuth.firebaseAuthStrings.`missing-app-credential`
import typings.firebaseAuth.firebaseAuthStrings.`missing-continue-uri`
import typings.firebaseAuth.firebaseAuthStrings.`missing-iframe-start`
import typings.firebaseAuth.firebaseAuthStrings.`missing-ios-bundle-id`
import typings.firebaseAuth.firebaseAuthStrings.`missing-multi-factor-info`
import typings.firebaseAuth.firebaseAuthStrings.`missing-multi-factor-session`
import typings.firebaseAuth.firebaseAuthStrings.`missing-or-invalid-nonce`
import typings.firebaseAuth.firebaseAuthStrings.`missing-phone-number`
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
import typings.firebaseAuth.firebaseAuthStrings.timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enumeration of Firebase Auth error codes.
  *
  * @internal
  */
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
  
  inline def INVALID_RECIPIENT_EMAIL: `invalid-recipient-email` = "invalid-recipient-email".asInstanceOf[`invalid-recipient-email`]
  
  inline def INVALID_SENDER: `invalid-sender` = "invalid-sender".asInstanceOf[`invalid-sender`]
  
  inline def INVALID_SESSION_INFO: `invalid-verification-id` = "invalid-verification-id".asInstanceOf[`invalid-verification-id`]
  
  inline def INVALID_TENANT_ID: `invalid-tenant-id` = "invalid-tenant-id".asInstanceOf[`invalid-tenant-id`]
  
  inline def LOGIN_BLOCKED: `login-blocked` = "login-blocked".asInstanceOf[`login-blocked`]
  
  inline def MFA_INFO_NOT_FOUND: `multi-factor-info-not-found` = "multi-factor-info-not-found".asInstanceOf[`multi-factor-info-not-found`]
  
  inline def MFA_REQUIRED: `multi-factor-auth-required` = "multi-factor-auth-required".asInstanceOf[`multi-factor-auth-required`]
  
  inline def MISSING_ANDROID_PACKAGE_NAME: `missing-android-pkg-name` = "missing-android-pkg-name".asInstanceOf[`missing-android-pkg-name`]
  
  inline def MISSING_APP_CREDENTIAL: `missing-app-credential` = "missing-app-credential".asInstanceOf[`missing-app-credential`]
  
  inline def MISSING_AUTH_DOMAIN: `auth-domain-config-required` = "auth-domain-config-required".asInstanceOf[`auth-domain-config-required`]
  
  inline def MISSING_CODE: `missing-verification-code` = "missing-verification-code".asInstanceOf[`missing-verification-code`]
  
  inline def MISSING_CONTINUE_URI: `missing-continue-uri` = "missing-continue-uri".asInstanceOf[`missing-continue-uri`]
  
  inline def MISSING_IFRAME_START: `missing-iframe-start` = "missing-iframe-start".asInstanceOf[`missing-iframe-start`]
  
  inline def MISSING_IOS_BUNDLE_ID: `missing-ios-bundle-id` = "missing-ios-bundle-id".asInstanceOf[`missing-ios-bundle-id`]
  
  inline def MISSING_MFA_INFO: `missing-multi-factor-info` = "missing-multi-factor-info".asInstanceOf[`missing-multi-factor-info`]
  
  inline def MISSING_MFA_SESSION: `missing-multi-factor-session` = "missing-multi-factor-session".asInstanceOf[`missing-multi-factor-session`]
  
  inline def MISSING_OR_INVALID_NONCE: `missing-or-invalid-nonce` = "missing-or-invalid-nonce".asInstanceOf[`missing-or-invalid-nonce`]
  
  inline def MISSING_PHONE_NUMBER: `missing-phone-number` = "missing-phone-number".asInstanceOf[`missing-phone-number`]
  
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
