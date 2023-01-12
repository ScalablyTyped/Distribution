package typings.firebaseAuth.distAuthMod

import typings.firebaseAuth.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
/* Inlined {[ key in std.Exclude<@firebase/auth.@firebase/auth/dist/auth.AuthErrorCode, @firebase/auth.@firebase/auth/dist/auth.AuthErrorCode.ARGUMENT_ERROR | @firebase/auth.@firebase/auth/dist/auth.AuthErrorCode.DEPENDENT_SDK_INIT_BEFORE_AUTH | @firebase/auth.@firebase/auth/dist/auth.AuthErrorCode.INTERNAL_ERROR | @firebase/auth.@firebase/auth/dist/auth.AuthErrorCode.MFA_REQUIRED | @firebase/auth.@firebase/auth/dist/auth.AuthErrorCode.NO_AUTH_EVENT | @firebase/auth.@firebase/auth/dist/auth.AuthErrorCode.OPERATION_NOT_SUPPORTED> ]: {  appName :@firebase/auth.@firebase/auth/dist/auth.AppName | undefined,   email :string | undefined,   phoneNumber :string | undefined,   message :string | undefined}} */
trait GenericAuthErrorParams extends StObject {
  
  var `account-exists-with-different-credential`: Message
  
  var `admin-restricted-operation`: Message
  
  var `already-initialized`: Message
  
  var `app-deleted`: Message
  
  var `app-not-authorized`: Message
  
  var `app-not-installed`: Message
  
  var `auth-domain-config-required`: Message
  
  var `cancelled-popup-request`: Message
  
  var `captcha-check-failed`: Message
  
  var `code-expired`: Message
  
  var `cordova-not-ready`: Message
  
  var `cors-unsupported`: Message
  
  var `credential-already-in-use`: Message
  
  var `custom-token-mismatch`: Message
  
  var `dynamic-link-not-activated`: Message
  
  var `email-already-in-use`: Message
  
  var `email-change-needs-verification`: Message
  
  var `emulator-config-failed`: Message
  
  var `expired-action-code`: Message
  
  var `invalid-action-code`: Message
  
  var `invalid-api-key`: Message
  
  var `invalid-app-credential`: Message
  
  var `invalid-app-id`: Message
  
  var `invalid-auth-event`: Message
  
  var `invalid-cert-hash`: Message
  
  var `invalid-continue-uri`: Message
  
  var `invalid-cordova-configuration`: Message
  
  var `invalid-credential`: Message
  
  var `invalid-custom-token`: Message
  
  var `invalid-dynamic-link-domain`: Message
  
  var `invalid-email`: Message
  
  var `invalid-emulator-scheme`: Message
  
  var `invalid-message-payload`: Message
  
  var `invalid-multi-factor-session`: Message
  
  var `invalid-oauth-client-id`: Message
  
  var `invalid-oauth-provider`: Message
  
  var `invalid-persistence-type`: Message
  
  var `invalid-phone-number`: Message
  
  var `invalid-provider-id`: Message
  
  var `invalid-recipient-email`: Message
  
  var `invalid-sender`: Message
  
  var `invalid-tenant-id`: Message
  
  var `invalid-user-token`: Message
  
  var `invalid-verification-code`: Message
  
  var `invalid-verification-id`: Message
  
  var `login-blocked`: Message
  
  var `maximum-second-factor-count-exceeded`: Message
  
  var `missing-android-pkg-name`: Message
  
  var `missing-app-credential`: Message
  
  var `missing-continue-uri`: Message
  
  var `missing-iframe-start`: Message
  
  var `missing-ios-bundle-id`: Message
  
  var `missing-multi-factor-info`: Message
  
  var `missing-multi-factor-session`: Message
  
  var `missing-or-invalid-nonce`: Message
  
  var `missing-phone-number`: Message
  
  var `missing-verification-code`: Message
  
  var `missing-verification-id`: Message
  
  var `multi-factor-info-not-found`: Message
  
  var `network-request-failed`: Message
  
  var `no-such-provider`: Message
  
  var `null-user`: Message
  
  var `operation-not-allowed`: Message
  
  var `popup-blocked`: Message
  
  var `popup-closed-by-user`: Message
  
  var `provider-already-linked`: Message
  
  var `quota-exceeded`: Message
  
  var `redirect-cancelled-by-user`: Message
  
  var `redirect-operation-pending`: Message
  
  var `rejected-credential`: Message
  
  var `requires-recent-login`: Message
  
  var `second-factor-already-in-use`: Message
  
  var `tenant-id-mismatch`: Message
  
  var timeout: Message
  
  var `too-many-requests`: Message
  
  var `unauthorized-continue-uri`: Message
  
  var `unauthorized-domain`: Message
  
  var `unsupported-first-factor`: Message
  
  var `unsupported-persistence-type`: Message
  
  var `unsupported-tenant-operation`: Message
  
  var `unverified-email`: Message
  
  var `user-cancelled`: Message
  
  var `user-disabled`: Message
  
  var `user-mismatch`: Message
  
  var `user-not-found`: Message
  
  var `user-signed-out`: Message
  
  var `user-token-expired`: Message
  
  var `weak-password`: Message
  
  var `web-storage-unsupported`: Message
  
  var `wrong-password`: Message
}
object GenericAuthErrorParams {
  
  inline def apply(
    `account-exists-with-different-credential`: Message,
    `admin-restricted-operation`: Message,
    `already-initialized`: Message,
    `app-deleted`: Message,
    `app-not-authorized`: Message,
    `app-not-installed`: Message,
    `auth-domain-config-required`: Message,
    `cancelled-popup-request`: Message,
    `captcha-check-failed`: Message,
    `code-expired`: Message,
    `cordova-not-ready`: Message,
    `cors-unsupported`: Message,
    `credential-already-in-use`: Message,
    `custom-token-mismatch`: Message,
    `dynamic-link-not-activated`: Message,
    `email-already-in-use`: Message,
    `email-change-needs-verification`: Message,
    `emulator-config-failed`: Message,
    `expired-action-code`: Message,
    `invalid-action-code`: Message,
    `invalid-api-key`: Message,
    `invalid-app-credential`: Message,
    `invalid-app-id`: Message,
    `invalid-auth-event`: Message,
    `invalid-cert-hash`: Message,
    `invalid-continue-uri`: Message,
    `invalid-cordova-configuration`: Message,
    `invalid-credential`: Message,
    `invalid-custom-token`: Message,
    `invalid-dynamic-link-domain`: Message,
    `invalid-email`: Message,
    `invalid-emulator-scheme`: Message,
    `invalid-message-payload`: Message,
    `invalid-multi-factor-session`: Message,
    `invalid-oauth-client-id`: Message,
    `invalid-oauth-provider`: Message,
    `invalid-persistence-type`: Message,
    `invalid-phone-number`: Message,
    `invalid-provider-id`: Message,
    `invalid-recipient-email`: Message,
    `invalid-sender`: Message,
    `invalid-tenant-id`: Message,
    `invalid-user-token`: Message,
    `invalid-verification-code`: Message,
    `invalid-verification-id`: Message,
    `login-blocked`: Message,
    `maximum-second-factor-count-exceeded`: Message,
    `missing-android-pkg-name`: Message,
    `missing-app-credential`: Message,
    `missing-continue-uri`: Message,
    `missing-iframe-start`: Message,
    `missing-ios-bundle-id`: Message,
    `missing-multi-factor-info`: Message,
    `missing-multi-factor-session`: Message,
    `missing-or-invalid-nonce`: Message,
    `missing-phone-number`: Message,
    `missing-verification-code`: Message,
    `missing-verification-id`: Message,
    `multi-factor-info-not-found`: Message,
    `network-request-failed`: Message,
    `no-such-provider`: Message,
    `null-user`: Message,
    `operation-not-allowed`: Message,
    `popup-blocked`: Message,
    `popup-closed-by-user`: Message,
    `provider-already-linked`: Message,
    `quota-exceeded`: Message,
    `redirect-cancelled-by-user`: Message,
    `redirect-operation-pending`: Message,
    `rejected-credential`: Message,
    `requires-recent-login`: Message,
    `second-factor-already-in-use`: Message,
    `tenant-id-mismatch`: Message,
    timeout: Message,
    `too-many-requests`: Message,
    `unauthorized-continue-uri`: Message,
    `unauthorized-domain`: Message,
    `unsupported-first-factor`: Message,
    `unsupported-persistence-type`: Message,
    `unsupported-tenant-operation`: Message,
    `unverified-email`: Message,
    `user-cancelled`: Message,
    `user-disabled`: Message,
    `user-mismatch`: Message,
    `user-not-found`: Message,
    `user-signed-out`: Message,
    `user-token-expired`: Message,
    `weak-password`: Message,
    `web-storage-unsupported`: Message,
    `wrong-password`: Message
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
    __obj.updateDynamic("invalid-recipient-email")(`invalid-recipient-email`.asInstanceOf[js.Any])
    __obj.updateDynamic("invalid-sender")(`invalid-sender`.asInstanceOf[js.Any])
    __obj.updateDynamic("invalid-tenant-id")(`invalid-tenant-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("invalid-user-token")(`invalid-user-token`.asInstanceOf[js.Any])
    __obj.updateDynamic("invalid-verification-code")(`invalid-verification-code`.asInstanceOf[js.Any])
    __obj.updateDynamic("invalid-verification-id")(`invalid-verification-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("login-blocked")(`login-blocked`.asInstanceOf[js.Any])
    __obj.updateDynamic("maximum-second-factor-count-exceeded")(`maximum-second-factor-count-exceeded`.asInstanceOf[js.Any])
    __obj.updateDynamic("missing-android-pkg-name")(`missing-android-pkg-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("missing-app-credential")(`missing-app-credential`.asInstanceOf[js.Any])
    __obj.updateDynamic("missing-continue-uri")(`missing-continue-uri`.asInstanceOf[js.Any])
    __obj.updateDynamic("missing-iframe-start")(`missing-iframe-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("missing-ios-bundle-id")(`missing-ios-bundle-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("missing-multi-factor-info")(`missing-multi-factor-info`.asInstanceOf[js.Any])
    __obj.updateDynamic("missing-multi-factor-session")(`missing-multi-factor-session`.asInstanceOf[js.Any])
    __obj.updateDynamic("missing-or-invalid-nonce")(`missing-or-invalid-nonce`.asInstanceOf[js.Any])
    __obj.updateDynamic("missing-phone-number")(`missing-phone-number`.asInstanceOf[js.Any])
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
    
    inline def `setAccount-exists-with-different-credential`(value: Message): Self = StObject.set(x, "account-exists-with-different-credential", value.asInstanceOf[js.Any])
    
    inline def `setAdmin-restricted-operation`(value: Message): Self = StObject.set(x, "admin-restricted-operation", value.asInstanceOf[js.Any])
    
    inline def `setAlready-initialized`(value: Message): Self = StObject.set(x, "already-initialized", value.asInstanceOf[js.Any])
    
    inline def `setApp-deleted`(value: Message): Self = StObject.set(x, "app-deleted", value.asInstanceOf[js.Any])
    
    inline def `setApp-not-authorized`(value: Message): Self = StObject.set(x, "app-not-authorized", value.asInstanceOf[js.Any])
    
    inline def `setApp-not-installed`(value: Message): Self = StObject.set(x, "app-not-installed", value.asInstanceOf[js.Any])
    
    inline def `setAuth-domain-config-required`(value: Message): Self = StObject.set(x, "auth-domain-config-required", value.asInstanceOf[js.Any])
    
    inline def `setCancelled-popup-request`(value: Message): Self = StObject.set(x, "cancelled-popup-request", value.asInstanceOf[js.Any])
    
    inline def `setCaptcha-check-failed`(value: Message): Self = StObject.set(x, "captcha-check-failed", value.asInstanceOf[js.Any])
    
    inline def `setCode-expired`(value: Message): Self = StObject.set(x, "code-expired", value.asInstanceOf[js.Any])
    
    inline def `setCordova-not-ready`(value: Message): Self = StObject.set(x, "cordova-not-ready", value.asInstanceOf[js.Any])
    
    inline def `setCors-unsupported`(value: Message): Self = StObject.set(x, "cors-unsupported", value.asInstanceOf[js.Any])
    
    inline def `setCredential-already-in-use`(value: Message): Self = StObject.set(x, "credential-already-in-use", value.asInstanceOf[js.Any])
    
    inline def `setCustom-token-mismatch`(value: Message): Self = StObject.set(x, "custom-token-mismatch", value.asInstanceOf[js.Any])
    
    inline def `setDynamic-link-not-activated`(value: Message): Self = StObject.set(x, "dynamic-link-not-activated", value.asInstanceOf[js.Any])
    
    inline def `setEmail-already-in-use`(value: Message): Self = StObject.set(x, "email-already-in-use", value.asInstanceOf[js.Any])
    
    inline def `setEmail-change-needs-verification`(value: Message): Self = StObject.set(x, "email-change-needs-verification", value.asInstanceOf[js.Any])
    
    inline def `setEmulator-config-failed`(value: Message): Self = StObject.set(x, "emulator-config-failed", value.asInstanceOf[js.Any])
    
    inline def `setExpired-action-code`(value: Message): Self = StObject.set(x, "expired-action-code", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-action-code`(value: Message): Self = StObject.set(x, "invalid-action-code", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-api-key`(value: Message): Self = StObject.set(x, "invalid-api-key", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-app-credential`(value: Message): Self = StObject.set(x, "invalid-app-credential", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-app-id`(value: Message): Self = StObject.set(x, "invalid-app-id", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-auth-event`(value: Message): Self = StObject.set(x, "invalid-auth-event", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-cert-hash`(value: Message): Self = StObject.set(x, "invalid-cert-hash", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-continue-uri`(value: Message): Self = StObject.set(x, "invalid-continue-uri", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-cordova-configuration`(value: Message): Self = StObject.set(x, "invalid-cordova-configuration", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-credential`(value: Message): Self = StObject.set(x, "invalid-credential", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-custom-token`(value: Message): Self = StObject.set(x, "invalid-custom-token", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-dynamic-link-domain`(value: Message): Self = StObject.set(x, "invalid-dynamic-link-domain", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-email`(value: Message): Self = StObject.set(x, "invalid-email", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-emulator-scheme`(value: Message): Self = StObject.set(x, "invalid-emulator-scheme", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-message-payload`(value: Message): Self = StObject.set(x, "invalid-message-payload", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-multi-factor-session`(value: Message): Self = StObject.set(x, "invalid-multi-factor-session", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-oauth-client-id`(value: Message): Self = StObject.set(x, "invalid-oauth-client-id", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-oauth-provider`(value: Message): Self = StObject.set(x, "invalid-oauth-provider", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-persistence-type`(value: Message): Self = StObject.set(x, "invalid-persistence-type", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-phone-number`(value: Message): Self = StObject.set(x, "invalid-phone-number", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-provider-id`(value: Message): Self = StObject.set(x, "invalid-provider-id", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-recipient-email`(value: Message): Self = StObject.set(x, "invalid-recipient-email", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-sender`(value: Message): Self = StObject.set(x, "invalid-sender", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-tenant-id`(value: Message): Self = StObject.set(x, "invalid-tenant-id", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-user-token`(value: Message): Self = StObject.set(x, "invalid-user-token", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-verification-code`(value: Message): Self = StObject.set(x, "invalid-verification-code", value.asInstanceOf[js.Any])
    
    inline def `setInvalid-verification-id`(value: Message): Self = StObject.set(x, "invalid-verification-id", value.asInstanceOf[js.Any])
    
    inline def `setLogin-blocked`(value: Message): Self = StObject.set(x, "login-blocked", value.asInstanceOf[js.Any])
    
    inline def `setMaximum-second-factor-count-exceeded`(value: Message): Self = StObject.set(x, "maximum-second-factor-count-exceeded", value.asInstanceOf[js.Any])
    
    inline def `setMissing-android-pkg-name`(value: Message): Self = StObject.set(x, "missing-android-pkg-name", value.asInstanceOf[js.Any])
    
    inline def `setMissing-app-credential`(value: Message): Self = StObject.set(x, "missing-app-credential", value.asInstanceOf[js.Any])
    
    inline def `setMissing-continue-uri`(value: Message): Self = StObject.set(x, "missing-continue-uri", value.asInstanceOf[js.Any])
    
    inline def `setMissing-iframe-start`(value: Message): Self = StObject.set(x, "missing-iframe-start", value.asInstanceOf[js.Any])
    
    inline def `setMissing-ios-bundle-id`(value: Message): Self = StObject.set(x, "missing-ios-bundle-id", value.asInstanceOf[js.Any])
    
    inline def `setMissing-multi-factor-info`(value: Message): Self = StObject.set(x, "missing-multi-factor-info", value.asInstanceOf[js.Any])
    
    inline def `setMissing-multi-factor-session`(value: Message): Self = StObject.set(x, "missing-multi-factor-session", value.asInstanceOf[js.Any])
    
    inline def `setMissing-or-invalid-nonce`(value: Message): Self = StObject.set(x, "missing-or-invalid-nonce", value.asInstanceOf[js.Any])
    
    inline def `setMissing-phone-number`(value: Message): Self = StObject.set(x, "missing-phone-number", value.asInstanceOf[js.Any])
    
    inline def `setMissing-verification-code`(value: Message): Self = StObject.set(x, "missing-verification-code", value.asInstanceOf[js.Any])
    
    inline def `setMissing-verification-id`(value: Message): Self = StObject.set(x, "missing-verification-id", value.asInstanceOf[js.Any])
    
    inline def `setMulti-factor-info-not-found`(value: Message): Self = StObject.set(x, "multi-factor-info-not-found", value.asInstanceOf[js.Any])
    
    inline def `setNetwork-request-failed`(value: Message): Self = StObject.set(x, "network-request-failed", value.asInstanceOf[js.Any])
    
    inline def `setNo-such-provider`(value: Message): Self = StObject.set(x, "no-such-provider", value.asInstanceOf[js.Any])
    
    inline def `setNull-user`(value: Message): Self = StObject.set(x, "null-user", value.asInstanceOf[js.Any])
    
    inline def `setOperation-not-allowed`(value: Message): Self = StObject.set(x, "operation-not-allowed", value.asInstanceOf[js.Any])
    
    inline def `setPopup-blocked`(value: Message): Self = StObject.set(x, "popup-blocked", value.asInstanceOf[js.Any])
    
    inline def `setPopup-closed-by-user`(value: Message): Self = StObject.set(x, "popup-closed-by-user", value.asInstanceOf[js.Any])
    
    inline def `setProvider-already-linked`(value: Message): Self = StObject.set(x, "provider-already-linked", value.asInstanceOf[js.Any])
    
    inline def `setQuota-exceeded`(value: Message): Self = StObject.set(x, "quota-exceeded", value.asInstanceOf[js.Any])
    
    inline def `setRedirect-cancelled-by-user`(value: Message): Self = StObject.set(x, "redirect-cancelled-by-user", value.asInstanceOf[js.Any])
    
    inline def `setRedirect-operation-pending`(value: Message): Self = StObject.set(x, "redirect-operation-pending", value.asInstanceOf[js.Any])
    
    inline def `setRejected-credential`(value: Message): Self = StObject.set(x, "rejected-credential", value.asInstanceOf[js.Any])
    
    inline def `setRequires-recent-login`(value: Message): Self = StObject.set(x, "requires-recent-login", value.asInstanceOf[js.Any])
    
    inline def `setSecond-factor-already-in-use`(value: Message): Self = StObject.set(x, "second-factor-already-in-use", value.asInstanceOf[js.Any])
    
    inline def `setTenant-id-mismatch`(value: Message): Self = StObject.set(x, "tenant-id-mismatch", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Message): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def `setToo-many-requests`(value: Message): Self = StObject.set(x, "too-many-requests", value.asInstanceOf[js.Any])
    
    inline def `setUnauthorized-continue-uri`(value: Message): Self = StObject.set(x, "unauthorized-continue-uri", value.asInstanceOf[js.Any])
    
    inline def `setUnauthorized-domain`(value: Message): Self = StObject.set(x, "unauthorized-domain", value.asInstanceOf[js.Any])
    
    inline def `setUnsupported-first-factor`(value: Message): Self = StObject.set(x, "unsupported-first-factor", value.asInstanceOf[js.Any])
    
    inline def `setUnsupported-persistence-type`(value: Message): Self = StObject.set(x, "unsupported-persistence-type", value.asInstanceOf[js.Any])
    
    inline def `setUnsupported-tenant-operation`(value: Message): Self = StObject.set(x, "unsupported-tenant-operation", value.asInstanceOf[js.Any])
    
    inline def `setUnverified-email`(value: Message): Self = StObject.set(x, "unverified-email", value.asInstanceOf[js.Any])
    
    inline def `setUser-cancelled`(value: Message): Self = StObject.set(x, "user-cancelled", value.asInstanceOf[js.Any])
    
    inline def `setUser-disabled`(value: Message): Self = StObject.set(x, "user-disabled", value.asInstanceOf[js.Any])
    
    inline def `setUser-mismatch`(value: Message): Self = StObject.set(x, "user-mismatch", value.asInstanceOf[js.Any])
    
    inline def `setUser-not-found`(value: Message): Self = StObject.set(x, "user-not-found", value.asInstanceOf[js.Any])
    
    inline def `setUser-signed-out`(value: Message): Self = StObject.set(x, "user-signed-out", value.asInstanceOf[js.Any])
    
    inline def `setUser-token-expired`(value: Message): Self = StObject.set(x, "user-token-expired", value.asInstanceOf[js.Any])
    
    inline def `setWeak-password`(value: Message): Self = StObject.set(x, "weak-password", value.asInstanceOf[js.Any])
    
    inline def `setWeb-storage-unsupported`(value: Message): Self = StObject.set(x, "web-storage-unsupported", value.asInstanceOf[js.Any])
    
    inline def `setWrong-password`(value: Message): Self = StObject.set(x, "wrong-password", value.asInstanceOf[js.Any])
  }
}
