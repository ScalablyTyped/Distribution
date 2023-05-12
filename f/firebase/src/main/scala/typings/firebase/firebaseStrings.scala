package typings.firebase

import typings.firebase.compatMod.firebase.FirebaseSignInProvider
import typings.firebase.compatMod.firebase.analytics.EventNameString
import typings.firebase.compatMod.firebase.database.EventType
import typings.firebase.compatMod.firebase.firestore.DocumentChangeType
import typings.firebase.compatMod.firebase.firestore.FirestoreErrorCode
import typings.firebase.compatMod.firebase.firestore.OrderByDirection
import typings.firebase.compatMod.firebase.firestore.TaskState
import typings.firebase.compatMod.firebase.firestore.WhereFilterOp
import typings.firebase.compatMod.firebase.functions.FunctionsErrorCode
import typings.firebase.compatMod.firebase.remoteConfig.FetchStatus
import typings.firebase.compatMod.firebase.remoteConfig.LogLevel
import typings.firebase.compatMod.firebase.remoteConfig.ValueSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with ValueSource
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait EMAIL_SIGNIN extends StObject
  inline def EMAIL_SIGNIN: EMAIL_SIGNIN = "EMAIL_SIGNIN".asInstanceOf[EMAIL_SIGNIN]
  
  @js.native
  sealed trait EqualssignEqualssign
    extends StObject
       with WhereFilterOp
  inline def EqualssignEqualssign: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  
  @js.native
  sealed trait Error
    extends StObject
       with TaskState
  inline def Error: Error = "Error".asInstanceOf[Error]
  
  @js.native
  sealed trait ExclamationmarkEqualssign
    extends StObject
       with WhereFilterOp
  inline def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  
  @js.native
  sealed trait FirebaseError extends StObject
  inline def FirebaseError: FirebaseError = "FirebaseError".asInstanceOf[FirebaseError]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with WhereFilterOp
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with WhereFilterOp
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with WhereFilterOp
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with WhereFilterOp
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait PASSWORD_RESET extends StObject
  inline def PASSWORD_RESET: PASSWORD_RESET = "PASSWORD_RESET".asInstanceOf[PASSWORD_RESET]
  
  @js.native
  sealed trait RECOVER_EMAIL extends StObject
  inline def RECOVER_EMAIL: RECOVER_EMAIL = "RECOVER_EMAIL".asInstanceOf[RECOVER_EMAIL]
  
  @js.native
  sealed trait REVERT_SECOND_FACTOR_ADDITION extends StObject
  inline def REVERT_SECOND_FACTOR_ADDITION: REVERT_SECOND_FACTOR_ADDITION = "REVERT_SECOND_FACTOR_ADDITION".asInstanceOf[REVERT_SECOND_FACTOR_ADDITION]
  
  @js.native
  sealed trait Running
    extends StObject
       with TaskState
  inline def Running: Running = "Running".asInstanceOf[Running]
  
  @js.native
  sealed trait Success
    extends StObject
       with TaskState
  inline def Success: Success = "Success".asInstanceOf[Success]
  
  @js.native
  sealed trait VERIFY_AND_CHANGE_EMAIL extends StObject
  inline def VERIFY_AND_CHANGE_EMAIL: VERIFY_AND_CHANGE_EMAIL = "VERIFY_AND_CHANGE_EMAIL".asInstanceOf[VERIFY_AND_CHANGE_EMAIL]
  
  @js.native
  sealed trait VERIFY_EMAIL extends StObject
  inline def VERIFY_EMAIL: VERIFY_EMAIL = "VERIFY_EMAIL".asInstanceOf[VERIFY_EMAIL]
  
  @js.native
  sealed trait aborted
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait add_payment_info
    extends StObject
       with EventNameString
  inline def add_payment_info: add_payment_info = "add_payment_info".asInstanceOf[add_payment_info]
  
  @js.native
  sealed trait add_shipping_info
    extends StObject
       with EventNameString
  inline def add_shipping_info: add_shipping_info = "add_shipping_info".asInstanceOf[add_shipping_info]
  
  @js.native
  sealed trait add_to_cart
    extends StObject
       with EventNameString
  inline def add_to_cart: add_to_cart = "add_to_cart".asInstanceOf[add_to_cart]
  
  @js.native
  sealed trait add_to_wishlist
    extends StObject
       with EventNameString
  inline def add_to_wishlist: add_to_wishlist = "add_to_wishlist".asInstanceOf[add_to_wishlist]
  
  @js.native
  sealed trait added
    extends StObject
       with DocumentChangeType
  inline def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait `already-exists`
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  
  @js.native
  sealed trait anonymous
    extends StObject
       with FirebaseSignInProvider
  inline def anonymous: anonymous = "anonymous".asInstanceOf[anonymous]
  
  @js.native
  sealed trait appleDotcom
    extends StObject
       with FirebaseSignInProvider
  inline def appleDotcom: appleDotcom = "apple.com".asInstanceOf[appleDotcom]
  
  @js.native
  sealed trait `array-contains`
    extends StObject
       with WhereFilterOp
  inline def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  
  @js.native
  sealed trait `array-contains-any`
    extends StObject
       with WhereFilterOp
  inline def `array-contains-any`: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  
  @js.native
  sealed trait asc
    extends StObject
       with OrderByDirection
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait `authSlashaccount-exists-with-different-credential` extends StObject
  inline def `authSlashaccount-exists-with-different-credential`: `authSlashaccount-exists-with-different-credential` = "auth/account-exists-with-different-credential".asInstanceOf[`authSlashaccount-exists-with-different-credential`]
  
  @js.native
  sealed trait `authSlashadmin-restricted-operation` extends StObject
  inline def `authSlashadmin-restricted-operation`: `authSlashadmin-restricted-operation` = "auth/admin-restricted-operation".asInstanceOf[`authSlashadmin-restricted-operation`]
  
  @js.native
  sealed trait `authSlashalready-initialized` extends StObject
  inline def `authSlashalready-initialized`: `authSlashalready-initialized` = "auth/already-initialized".asInstanceOf[`authSlashalready-initialized`]
  
  @js.native
  sealed trait `authSlashapp-deleted` extends StObject
  inline def `authSlashapp-deleted`: `authSlashapp-deleted` = "auth/app-deleted".asInstanceOf[`authSlashapp-deleted`]
  
  @js.native
  sealed trait `authSlashapp-not-authorized` extends StObject
  inline def `authSlashapp-not-authorized`: `authSlashapp-not-authorized` = "auth/app-not-authorized".asInstanceOf[`authSlashapp-not-authorized`]
  
  @js.native
  sealed trait `authSlashapp-not-installed` extends StObject
  inline def `authSlashapp-not-installed`: `authSlashapp-not-installed` = "auth/app-not-installed".asInstanceOf[`authSlashapp-not-installed`]
  
  @js.native
  sealed trait `authSlashargument-error` extends StObject
  inline def `authSlashargument-error`: `authSlashargument-error` = "auth/argument-error".asInstanceOf[`authSlashargument-error`]
  
  @js.native
  sealed trait `authSlashauth-domain-config-required` extends StObject
  inline def `authSlashauth-domain-config-required`: `authSlashauth-domain-config-required` = "auth/auth-domain-config-required".asInstanceOf[`authSlashauth-domain-config-required`]
  
  @js.native
  sealed trait `authSlashcancelled-popup-request` extends StObject
  inline def `authSlashcancelled-popup-request`: `authSlashcancelled-popup-request` = "auth/cancelled-popup-request".asInstanceOf[`authSlashcancelled-popup-request`]
  
  @js.native
  sealed trait `authSlashcaptcha-check-failed` extends StObject
  inline def `authSlashcaptcha-check-failed`: `authSlashcaptcha-check-failed` = "auth/captcha-check-failed".asInstanceOf[`authSlashcaptcha-check-failed`]
  
  @js.native
  sealed trait `authSlashcode-expired` extends StObject
  inline def `authSlashcode-expired`: `authSlashcode-expired` = "auth/code-expired".asInstanceOf[`authSlashcode-expired`]
  
  @js.native
  sealed trait `authSlashcordova-not-ready` extends StObject
  inline def `authSlashcordova-not-ready`: `authSlashcordova-not-ready` = "auth/cordova-not-ready".asInstanceOf[`authSlashcordova-not-ready`]
  
  @js.native
  sealed trait `authSlashcors-unsupported` extends StObject
  inline def `authSlashcors-unsupported`: `authSlashcors-unsupported` = "auth/cors-unsupported".asInstanceOf[`authSlashcors-unsupported`]
  
  @js.native
  sealed trait `authSlashcredential-already-in-use` extends StObject
  inline def `authSlashcredential-already-in-use`: `authSlashcredential-already-in-use` = "auth/credential-already-in-use".asInstanceOf[`authSlashcredential-already-in-use`]
  
  @js.native
  sealed trait `authSlashcustom-token-mismatch` extends StObject
  inline def `authSlashcustom-token-mismatch`: `authSlashcustom-token-mismatch` = "auth/custom-token-mismatch".asInstanceOf[`authSlashcustom-token-mismatch`]
  
  @js.native
  sealed trait `authSlashdependent-sdk-initialized-before-auth` extends StObject
  inline def `authSlashdependent-sdk-initialized-before-auth`: `authSlashdependent-sdk-initialized-before-auth` = "auth/dependent-sdk-initialized-before-auth".asInstanceOf[`authSlashdependent-sdk-initialized-before-auth`]
  
  @js.native
  sealed trait `authSlashdynamic-link-not-activated` extends StObject
  inline def `authSlashdynamic-link-not-activated`: `authSlashdynamic-link-not-activated` = "auth/dynamic-link-not-activated".asInstanceOf[`authSlashdynamic-link-not-activated`]
  
  @js.native
  sealed trait `authSlashemail-already-in-use` extends StObject
  inline def `authSlashemail-already-in-use`: `authSlashemail-already-in-use` = "auth/email-already-in-use".asInstanceOf[`authSlashemail-already-in-use`]
  
  @js.native
  sealed trait `authSlashemail-change-needs-verification` extends StObject
  inline def `authSlashemail-change-needs-verification`: `authSlashemail-change-needs-verification` = "auth/email-change-needs-verification".asInstanceOf[`authSlashemail-change-needs-verification`]
  
  @js.native
  sealed trait `authSlashemulator-config-failed` extends StObject
  inline def `authSlashemulator-config-failed`: `authSlashemulator-config-failed` = "auth/emulator-config-failed".asInstanceOf[`authSlashemulator-config-failed`]
  
  @js.native
  sealed trait `authSlashexpired-action-code` extends StObject
  inline def `authSlashexpired-action-code`: `authSlashexpired-action-code` = "auth/expired-action-code".asInstanceOf[`authSlashexpired-action-code`]
  
  @js.native
  sealed trait `authSlashinternal-error` extends StObject
  inline def `authSlashinternal-error`: `authSlashinternal-error` = "auth/internal-error".asInstanceOf[`authSlashinternal-error`]
  
  @js.native
  sealed trait `authSlashinvalid-action-code` extends StObject
  inline def `authSlashinvalid-action-code`: `authSlashinvalid-action-code` = "auth/invalid-action-code".asInstanceOf[`authSlashinvalid-action-code`]
  
  @js.native
  sealed trait `authSlashinvalid-api-key` extends StObject
  inline def `authSlashinvalid-api-key`: `authSlashinvalid-api-key` = "auth/invalid-api-key".asInstanceOf[`authSlashinvalid-api-key`]
  
  @js.native
  sealed trait `authSlashinvalid-app-credential` extends StObject
  inline def `authSlashinvalid-app-credential`: `authSlashinvalid-app-credential` = "auth/invalid-app-credential".asInstanceOf[`authSlashinvalid-app-credential`]
  
  @js.native
  sealed trait `authSlashinvalid-app-id` extends StObject
  inline def `authSlashinvalid-app-id`: `authSlashinvalid-app-id` = "auth/invalid-app-id".asInstanceOf[`authSlashinvalid-app-id`]
  
  @js.native
  sealed trait `authSlashinvalid-auth-event` extends StObject
  inline def `authSlashinvalid-auth-event`: `authSlashinvalid-auth-event` = "auth/invalid-auth-event".asInstanceOf[`authSlashinvalid-auth-event`]
  
  @js.native
  sealed trait `authSlashinvalid-cert-hash` extends StObject
  inline def `authSlashinvalid-cert-hash`: `authSlashinvalid-cert-hash` = "auth/invalid-cert-hash".asInstanceOf[`authSlashinvalid-cert-hash`]
  
  @js.native
  sealed trait `authSlashinvalid-continue-uri` extends StObject
  inline def `authSlashinvalid-continue-uri`: `authSlashinvalid-continue-uri` = "auth/invalid-continue-uri".asInstanceOf[`authSlashinvalid-continue-uri`]
  
  @js.native
  sealed trait `authSlashinvalid-cordova-configuration` extends StObject
  inline def `authSlashinvalid-cordova-configuration`: `authSlashinvalid-cordova-configuration` = "auth/invalid-cordova-configuration".asInstanceOf[`authSlashinvalid-cordova-configuration`]
  
  @js.native
  sealed trait `authSlashinvalid-credential` extends StObject
  inline def `authSlashinvalid-credential`: `authSlashinvalid-credential` = "auth/invalid-credential".asInstanceOf[`authSlashinvalid-credential`]
  
  @js.native
  sealed trait `authSlashinvalid-custom-token` extends StObject
  inline def `authSlashinvalid-custom-token`: `authSlashinvalid-custom-token` = "auth/invalid-custom-token".asInstanceOf[`authSlashinvalid-custom-token`]
  
  @js.native
  sealed trait `authSlashinvalid-dynamic-link-domain` extends StObject
  inline def `authSlashinvalid-dynamic-link-domain`: `authSlashinvalid-dynamic-link-domain` = "auth/invalid-dynamic-link-domain".asInstanceOf[`authSlashinvalid-dynamic-link-domain`]
  
  @js.native
  sealed trait `authSlashinvalid-email` extends StObject
  inline def `authSlashinvalid-email`: `authSlashinvalid-email` = "auth/invalid-email".asInstanceOf[`authSlashinvalid-email`]
  
  @js.native
  sealed trait `authSlashinvalid-emulator-scheme` extends StObject
  inline def `authSlashinvalid-emulator-scheme`: `authSlashinvalid-emulator-scheme` = "auth/invalid-emulator-scheme".asInstanceOf[`authSlashinvalid-emulator-scheme`]
  
  @js.native
  sealed trait `authSlashinvalid-message-payload` extends StObject
  inline def `authSlashinvalid-message-payload`: `authSlashinvalid-message-payload` = "auth/invalid-message-payload".asInstanceOf[`authSlashinvalid-message-payload`]
  
  @js.native
  sealed trait `authSlashinvalid-multi-factor-session` extends StObject
  inline def `authSlashinvalid-multi-factor-session`: `authSlashinvalid-multi-factor-session` = "auth/invalid-multi-factor-session".asInstanceOf[`authSlashinvalid-multi-factor-session`]
  
  @js.native
  sealed trait `authSlashinvalid-oauth-client-id` extends StObject
  inline def `authSlashinvalid-oauth-client-id`: `authSlashinvalid-oauth-client-id` = "auth/invalid-oauth-client-id".asInstanceOf[`authSlashinvalid-oauth-client-id`]
  
  @js.native
  sealed trait `authSlashinvalid-oauth-provider` extends StObject
  inline def `authSlashinvalid-oauth-provider`: `authSlashinvalid-oauth-provider` = "auth/invalid-oauth-provider".asInstanceOf[`authSlashinvalid-oauth-provider`]
  
  @js.native
  sealed trait `authSlashinvalid-persistence-type` extends StObject
  inline def `authSlashinvalid-persistence-type`: `authSlashinvalid-persistence-type` = "auth/invalid-persistence-type".asInstanceOf[`authSlashinvalid-persistence-type`]
  
  @js.native
  sealed trait `authSlashinvalid-phone-number` extends StObject
  inline def `authSlashinvalid-phone-number`: `authSlashinvalid-phone-number` = "auth/invalid-phone-number".asInstanceOf[`authSlashinvalid-phone-number`]
  
  @js.native
  sealed trait `authSlashinvalid-provider-id` extends StObject
  inline def `authSlashinvalid-provider-id`: `authSlashinvalid-provider-id` = "auth/invalid-provider-id".asInstanceOf[`authSlashinvalid-provider-id`]
  
  @js.native
  sealed trait `authSlashinvalid-recaptcha-action` extends StObject
  inline def `authSlashinvalid-recaptcha-action`: `authSlashinvalid-recaptcha-action` = "auth/invalid-recaptcha-action".asInstanceOf[`authSlashinvalid-recaptcha-action`]
  
  @js.native
  sealed trait `authSlashinvalid-recaptcha-token` extends StObject
  inline def `authSlashinvalid-recaptcha-token`: `authSlashinvalid-recaptcha-token` = "auth/invalid-recaptcha-token".asInstanceOf[`authSlashinvalid-recaptcha-token`]
  
  @js.native
  sealed trait `authSlashinvalid-recaptcha-version` extends StObject
  inline def `authSlashinvalid-recaptcha-version`: `authSlashinvalid-recaptcha-version` = "auth/invalid-recaptcha-version".asInstanceOf[`authSlashinvalid-recaptcha-version`]
  
  @js.native
  sealed trait `authSlashinvalid-recipient-email` extends StObject
  inline def `authSlashinvalid-recipient-email`: `authSlashinvalid-recipient-email` = "auth/invalid-recipient-email".asInstanceOf[`authSlashinvalid-recipient-email`]
  
  @js.native
  sealed trait `authSlashinvalid-req-type` extends StObject
  inline def `authSlashinvalid-req-type`: `authSlashinvalid-req-type` = "auth/invalid-req-type".asInstanceOf[`authSlashinvalid-req-type`]
  
  @js.native
  sealed trait `authSlashinvalid-sender` extends StObject
  inline def `authSlashinvalid-sender`: `authSlashinvalid-sender` = "auth/invalid-sender".asInstanceOf[`authSlashinvalid-sender`]
  
  @js.native
  sealed trait `authSlashinvalid-tenant-id` extends StObject
  inline def `authSlashinvalid-tenant-id`: `authSlashinvalid-tenant-id` = "auth/invalid-tenant-id".asInstanceOf[`authSlashinvalid-tenant-id`]
  
  @js.native
  sealed trait `authSlashinvalid-user-token` extends StObject
  inline def `authSlashinvalid-user-token`: `authSlashinvalid-user-token` = "auth/invalid-user-token".asInstanceOf[`authSlashinvalid-user-token`]
  
  @js.native
  sealed trait `authSlashinvalid-verification-code` extends StObject
  inline def `authSlashinvalid-verification-code`: `authSlashinvalid-verification-code` = "auth/invalid-verification-code".asInstanceOf[`authSlashinvalid-verification-code`]
  
  @js.native
  sealed trait `authSlashinvalid-verification-id` extends StObject
  inline def `authSlashinvalid-verification-id`: `authSlashinvalid-verification-id` = "auth/invalid-verification-id".asInstanceOf[`authSlashinvalid-verification-id`]
  
  @js.native
  sealed trait `authSlashmaximum-second-factor-count-exceeded` extends StObject
  inline def `authSlashmaximum-second-factor-count-exceeded`: `authSlashmaximum-second-factor-count-exceeded` = "auth/maximum-second-factor-count-exceeded".asInstanceOf[`authSlashmaximum-second-factor-count-exceeded`]
  
  @js.native
  sealed trait `authSlashmissing-android-pkg-name` extends StObject
  inline def `authSlashmissing-android-pkg-name`: `authSlashmissing-android-pkg-name` = "auth/missing-android-pkg-name".asInstanceOf[`authSlashmissing-android-pkg-name`]
  
  @js.native
  sealed trait `authSlashmissing-app-credential` extends StObject
  inline def `authSlashmissing-app-credential`: `authSlashmissing-app-credential` = "auth/missing-app-credential".asInstanceOf[`authSlashmissing-app-credential`]
  
  @js.native
  sealed trait `authSlashmissing-client-type` extends StObject
  inline def `authSlashmissing-client-type`: `authSlashmissing-client-type` = "auth/missing-client-type".asInstanceOf[`authSlashmissing-client-type`]
  
  @js.native
  sealed trait `authSlashmissing-continue-uri` extends StObject
  inline def `authSlashmissing-continue-uri`: `authSlashmissing-continue-uri` = "auth/missing-continue-uri".asInstanceOf[`authSlashmissing-continue-uri`]
  
  @js.native
  sealed trait `authSlashmissing-iframe-start` extends StObject
  inline def `authSlashmissing-iframe-start`: `authSlashmissing-iframe-start` = "auth/missing-iframe-start".asInstanceOf[`authSlashmissing-iframe-start`]
  
  @js.native
  sealed trait `authSlashmissing-ios-bundle-id` extends StObject
  inline def `authSlashmissing-ios-bundle-id`: `authSlashmissing-ios-bundle-id` = "auth/missing-ios-bundle-id".asInstanceOf[`authSlashmissing-ios-bundle-id`]
  
  @js.native
  sealed trait `authSlashmissing-multi-factor-info` extends StObject
  inline def `authSlashmissing-multi-factor-info`: `authSlashmissing-multi-factor-info` = "auth/missing-multi-factor-info".asInstanceOf[`authSlashmissing-multi-factor-info`]
  
  @js.native
  sealed trait `authSlashmissing-multi-factor-session` extends StObject
  inline def `authSlashmissing-multi-factor-session`: `authSlashmissing-multi-factor-session` = "auth/missing-multi-factor-session".asInstanceOf[`authSlashmissing-multi-factor-session`]
  
  @js.native
  sealed trait `authSlashmissing-or-invalid-nonce` extends StObject
  inline def `authSlashmissing-or-invalid-nonce`: `authSlashmissing-or-invalid-nonce` = "auth/missing-or-invalid-nonce".asInstanceOf[`authSlashmissing-or-invalid-nonce`]
  
  @js.native
  sealed trait `authSlashmissing-phone-number` extends StObject
  inline def `authSlashmissing-phone-number`: `authSlashmissing-phone-number` = "auth/missing-phone-number".asInstanceOf[`authSlashmissing-phone-number`]
  
  @js.native
  sealed trait `authSlashmissing-recaptcha-token` extends StObject
  inline def `authSlashmissing-recaptcha-token`: `authSlashmissing-recaptcha-token` = "auth/missing-recaptcha-token".asInstanceOf[`authSlashmissing-recaptcha-token`]
  
  @js.native
  sealed trait `authSlashmissing-recaptcha-version` extends StObject
  inline def `authSlashmissing-recaptcha-version`: `authSlashmissing-recaptcha-version` = "auth/missing-recaptcha-version".asInstanceOf[`authSlashmissing-recaptcha-version`]
  
  @js.native
  sealed trait `authSlashmissing-verification-code` extends StObject
  inline def `authSlashmissing-verification-code`: `authSlashmissing-verification-code` = "auth/missing-verification-code".asInstanceOf[`authSlashmissing-verification-code`]
  
  @js.native
  sealed trait `authSlashmissing-verification-id` extends StObject
  inline def `authSlashmissing-verification-id`: `authSlashmissing-verification-id` = "auth/missing-verification-id".asInstanceOf[`authSlashmissing-verification-id`]
  
  @js.native
  sealed trait `authSlashmulti-factor-auth-required` extends StObject
  inline def `authSlashmulti-factor-auth-required`: `authSlashmulti-factor-auth-required` = "auth/multi-factor-auth-required".asInstanceOf[`authSlashmulti-factor-auth-required`]
  
  @js.native
  sealed trait `authSlashmulti-factor-info-not-found` extends StObject
  inline def `authSlashmulti-factor-info-not-found`: `authSlashmulti-factor-info-not-found` = "auth/multi-factor-info-not-found".asInstanceOf[`authSlashmulti-factor-info-not-found`]
  
  @js.native
  sealed trait `authSlashnetwork-request-failed` extends StObject
  inline def `authSlashnetwork-request-failed`: `authSlashnetwork-request-failed` = "auth/network-request-failed".asInstanceOf[`authSlashnetwork-request-failed`]
  
  @js.native
  sealed trait `authSlashno-auth-event` extends StObject
  inline def `authSlashno-auth-event`: `authSlashno-auth-event` = "auth/no-auth-event".asInstanceOf[`authSlashno-auth-event`]
  
  @js.native
  sealed trait `authSlashno-such-provider` extends StObject
  inline def `authSlashno-such-provider`: `authSlashno-such-provider` = "auth/no-such-provider".asInstanceOf[`authSlashno-such-provider`]
  
  @js.native
  sealed trait `authSlashnull-user` extends StObject
  inline def `authSlashnull-user`: `authSlashnull-user` = "auth/null-user".asInstanceOf[`authSlashnull-user`]
  
  @js.native
  sealed trait `authSlashoperation-not-allowed` extends StObject
  inline def `authSlashoperation-not-allowed`: `authSlashoperation-not-allowed` = "auth/operation-not-allowed".asInstanceOf[`authSlashoperation-not-allowed`]
  
  @js.native
  sealed trait `authSlashoperation-not-supported-in-this-environment` extends StObject
  inline def `authSlashoperation-not-supported-in-this-environment`: `authSlashoperation-not-supported-in-this-environment` = "auth/operation-not-supported-in-this-environment".asInstanceOf[`authSlashoperation-not-supported-in-this-environment`]
  
  @js.native
  sealed trait `authSlashpopup-blocked` extends StObject
  inline def `authSlashpopup-blocked`: `authSlashpopup-blocked` = "auth/popup-blocked".asInstanceOf[`authSlashpopup-blocked`]
  
  @js.native
  sealed trait `authSlashpopup-closed-by-user` extends StObject
  inline def `authSlashpopup-closed-by-user`: `authSlashpopup-closed-by-user` = "auth/popup-closed-by-user".asInstanceOf[`authSlashpopup-closed-by-user`]
  
  @js.native
  sealed trait `authSlashprovider-already-linked` extends StObject
  inline def `authSlashprovider-already-linked`: `authSlashprovider-already-linked` = "auth/provider-already-linked".asInstanceOf[`authSlashprovider-already-linked`]
  
  @js.native
  sealed trait `authSlashquota-exceeded` extends StObject
  inline def `authSlashquota-exceeded`: `authSlashquota-exceeded` = "auth/quota-exceeded".asInstanceOf[`authSlashquota-exceeded`]
  
  @js.native
  sealed trait `authSlashrecaptcha-not-enabled` extends StObject
  inline def `authSlashrecaptcha-not-enabled`: `authSlashrecaptcha-not-enabled` = "auth/recaptcha-not-enabled".asInstanceOf[`authSlashrecaptcha-not-enabled`]
  
  @js.native
  sealed trait `authSlashredirect-cancelled-by-user` extends StObject
  inline def `authSlashredirect-cancelled-by-user`: `authSlashredirect-cancelled-by-user` = "auth/redirect-cancelled-by-user".asInstanceOf[`authSlashredirect-cancelled-by-user`]
  
  @js.native
  sealed trait `authSlashredirect-operation-pending` extends StObject
  inline def `authSlashredirect-operation-pending`: `authSlashredirect-operation-pending` = "auth/redirect-operation-pending".asInstanceOf[`authSlashredirect-operation-pending`]
  
  @js.native
  sealed trait `authSlashrejected-credential` extends StObject
  inline def `authSlashrejected-credential`: `authSlashrejected-credential` = "auth/rejected-credential".asInstanceOf[`authSlashrejected-credential`]
  
  @js.native
  sealed trait `authSlashrequires-recent-login` extends StObject
  inline def `authSlashrequires-recent-login`: `authSlashrequires-recent-login` = "auth/requires-recent-login".asInstanceOf[`authSlashrequires-recent-login`]
  
  @js.native
  sealed trait `authSlashsecond-factor-already-in-use` extends StObject
  inline def `authSlashsecond-factor-already-in-use`: `authSlashsecond-factor-already-in-use` = "auth/second-factor-already-in-use".asInstanceOf[`authSlashsecond-factor-already-in-use`]
  
  @js.native
  sealed trait `authSlashtenant-id-mismatch` extends StObject
  inline def `authSlashtenant-id-mismatch`: `authSlashtenant-id-mismatch` = "auth/tenant-id-mismatch".asInstanceOf[`authSlashtenant-id-mismatch`]
  
  @js.native
  sealed trait authSlashtimeout extends StObject
  inline def authSlashtimeout: authSlashtimeout = "auth/timeout".asInstanceOf[authSlashtimeout]
  
  @js.native
  sealed trait `authSlashtoo-many-requests` extends StObject
  inline def `authSlashtoo-many-requests`: `authSlashtoo-many-requests` = "auth/too-many-requests".asInstanceOf[`authSlashtoo-many-requests`]
  
  @js.native
  sealed trait `authSlashunauthorized-continue-uri` extends StObject
  inline def `authSlashunauthorized-continue-uri`: `authSlashunauthorized-continue-uri` = "auth/unauthorized-continue-uri".asInstanceOf[`authSlashunauthorized-continue-uri`]
  
  @js.native
  sealed trait `authSlashunauthorized-domain` extends StObject
  inline def `authSlashunauthorized-domain`: `authSlashunauthorized-domain` = "auth/unauthorized-domain".asInstanceOf[`authSlashunauthorized-domain`]
  
  @js.native
  sealed trait `authSlashunsupported-first-factor` extends StObject
  inline def `authSlashunsupported-first-factor`: `authSlashunsupported-first-factor` = "auth/unsupported-first-factor".asInstanceOf[`authSlashunsupported-first-factor`]
  
  @js.native
  sealed trait `authSlashunsupported-persistence-type` extends StObject
  inline def `authSlashunsupported-persistence-type`: `authSlashunsupported-persistence-type` = "auth/unsupported-persistence-type".asInstanceOf[`authSlashunsupported-persistence-type`]
  
  @js.native
  sealed trait `authSlashunsupported-tenant-operation` extends StObject
  inline def `authSlashunsupported-tenant-operation`: `authSlashunsupported-tenant-operation` = "auth/unsupported-tenant-operation".asInstanceOf[`authSlashunsupported-tenant-operation`]
  
  @js.native
  sealed trait `authSlashunverified-email` extends StObject
  inline def `authSlashunverified-email`: `authSlashunverified-email` = "auth/unverified-email".asInstanceOf[`authSlashunverified-email`]
  
  @js.native
  sealed trait `authSlashuser-cancelled` extends StObject
  inline def `authSlashuser-cancelled`: `authSlashuser-cancelled` = "auth/user-cancelled".asInstanceOf[`authSlashuser-cancelled`]
  
  @js.native
  sealed trait `authSlashuser-disabled` extends StObject
  inline def `authSlashuser-disabled`: `authSlashuser-disabled` = "auth/user-disabled".asInstanceOf[`authSlashuser-disabled`]
  
  @js.native
  sealed trait `authSlashuser-mismatch` extends StObject
  inline def `authSlashuser-mismatch`: `authSlashuser-mismatch` = "auth/user-mismatch".asInstanceOf[`authSlashuser-mismatch`]
  
  @js.native
  sealed trait `authSlashuser-not-found` extends StObject
  inline def `authSlashuser-not-found`: `authSlashuser-not-found` = "auth/user-not-found".asInstanceOf[`authSlashuser-not-found`]
  
  @js.native
  sealed trait `authSlashuser-signed-out` extends StObject
  inline def `authSlashuser-signed-out`: `authSlashuser-signed-out` = "auth/user-signed-out".asInstanceOf[`authSlashuser-signed-out`]
  
  @js.native
  sealed trait `authSlashuser-token-expired` extends StObject
  inline def `authSlashuser-token-expired`: `authSlashuser-token-expired` = "auth/user-token-expired".asInstanceOf[`authSlashuser-token-expired`]
  
  @js.native
  sealed trait `authSlashweak-password` extends StObject
  inline def `authSlashweak-password`: `authSlashweak-password` = "auth/weak-password".asInstanceOf[`authSlashweak-password`]
  
  @js.native
  sealed trait `authSlashweb-storage-unsupported` extends StObject
  inline def `authSlashweb-storage-unsupported`: `authSlashweb-storage-unsupported` = "auth/web-storage-unsupported".asInstanceOf[`authSlashweb-storage-unsupported`]
  
  @js.native
  sealed trait `authSlashwrong-password` extends StObject
  inline def `authSlashwrong-password`: `authSlashwrong-password` = "auth/wrong-password".asInstanceOf[`authSlashwrong-password`]
  
  @js.native
  sealed trait base64 extends StObject
  inline def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait base64url extends StObject
  inline def base64url: base64url = "base64url".asInstanceOf[base64url]
  
  @js.native
  sealed trait begin_checkout
    extends StObject
       with EventNameString
  inline def begin_checkout: begin_checkout = "begin_checkout".asInstanceOf[begin_checkout]
  
  @js.native
  sealed trait cache extends StObject
  inline def cache: cache = "cache".asInstanceOf[cache]
  
  @js.native
  sealed trait cancelled
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait checkout_progress
    extends StObject
       with EventNameString
  inline def checkout_progress: checkout_progress = "checkout_progress".asInstanceOf[checkout_progress]
  
  @js.native
  sealed trait child_added
    extends StObject
       with EventType
  inline def child_added: child_added = "child_added".asInstanceOf[child_added]
  
  @js.native
  sealed trait child_changed
    extends StObject
       with EventType
  inline def child_changed: child_changed = "child_changed".asInstanceOf[child_changed]
  
  @js.native
  sealed trait child_moved
    extends StObject
       with EventType
  inline def child_moved: child_moved = "child_moved".asInstanceOf[child_moved]
  
  @js.native
  sealed trait child_removed
    extends StObject
       with EventType
  inline def child_removed: child_removed = "child_removed".asInstanceOf[child_removed]
  
  @js.native
  sealed trait custom
    extends StObject
       with FirebaseSignInProvider
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait `data-loss`
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def `data-loss`: `data-loss` = "data-loss".asInstanceOf[`data-loss`]
  
  @js.native
  sealed trait data_url extends StObject
  inline def data_url: data_url = "data_url".asInstanceOf[data_url]
  
  @js.native
  sealed trait `deadline-exceeded`
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def `deadline-exceeded`: `deadline-exceeded` = "deadline-exceeded".asInstanceOf[`deadline-exceeded`]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
       with typings.firebase.compatMod.firebase.LogLevel
       with typings.firebase.compatMod.firebase.firestore.LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait desc
    extends StObject
       with OrderByDirection
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait email
    extends StObject
       with FirebaseSignInProvider
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait emailLink extends StObject
  inline def emailLink: emailLink = "emailLink".asInstanceOf[emailLink]
  
  @js.native
  sealed trait error_
    extends StObject
       with LogLevel
       with typings.firebase.compatMod.firebase.LogLevel
       with typings.firebase.compatMod.firebase.firestore.LogLevel
  inline def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait estimate extends StObject
  inline def estimate: estimate = "estimate".asInstanceOf[estimate]
  
  @js.native
  sealed trait exception
    extends StObject
       with EventNameString
  inline def exception: exception = "exception".asInstanceOf[exception]
  
  @js.native
  sealed trait facebookDotcom
    extends StObject
       with FirebaseSignInProvider
  inline def facebookDotcom: facebookDotcom = "facebook.com".asInstanceOf[facebookDotcom]
  
  @js.native
  sealed trait `failed-precondition`
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def `failed-precondition`: `failed-precondition` = "failed-precondition".asInstanceOf[`failed-precondition`]
  
  @js.native
  sealed trait failure
    extends StObject
       with FetchStatus
  inline def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait generate_lead
    extends StObject
       with EventNameString
  inline def generate_lead: generate_lead = "generate_lead".asInstanceOf[generate_lead]
  
  @js.native
  sealed trait githubDotcom
    extends StObject
       with FirebaseSignInProvider
  inline def githubDotcom: githubDotcom = "github.com".asInstanceOf[githubDotcom]
  
  @js.native
  sealed trait googleDotcom
    extends StObject
       with FirebaseSignInProvider
  inline def googleDotcom: googleDotcom = "google.com".asInstanceOf[googleDotcom]
  
  @js.native
  sealed trait in
    extends StObject
       with WhereFilterOp
  inline def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait info
    extends StObject
       with typings.firebase.compatMod.firebase.LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait internal
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait `invalid-argument`
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def `invalid-argument`: `invalid-argument` = "invalid-argument".asInstanceOf[`invalid-argument`]
  
  @js.native
  sealed trait link extends StObject
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait login
    extends StObject
       with EventNameString
  inline def login: login = "login".asInstanceOf[login]
  
  @js.native
  sealed trait microsoftDotcom
    extends StObject
       with FirebaseSignInProvider
  inline def microsoftDotcom: microsoftDotcom = "microsoft.com".asInstanceOf[microsoftDotcom]
  
  @js.native
  sealed trait modified
    extends StObject
       with DocumentChangeType
  inline def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait `no-fetch-yet`
    extends StObject
       with FetchStatus
  inline def `no-fetch-yet`: `no-fetch-yet` = "no-fetch-yet".asInstanceOf[`no-fetch-yet`]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait `not-found`
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def `not-found`: `not-found` = "not-found".asInstanceOf[`not-found`]
  
  @js.native
  sealed trait `not-in`
    extends StObject
       with WhereFilterOp
  inline def `not-in`: `not-in` = "not-in".asInstanceOf[`not-in`]
  
  @js.native
  sealed trait ok
    extends StObject
       with FunctionsErrorCode
  inline def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait `out-of-range`
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def `out-of-range`: `out-of-range` = "out-of-range".asInstanceOf[`out-of-range`]
  
  @js.native
  sealed trait page_view
    extends StObject
       with EventNameString
  inline def page_view: page_view = "page_view".asInstanceOf[page_view]
  
  @js.native
  sealed trait password
    extends StObject
       with FirebaseSignInProvider
  inline def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait `permission-denied`
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def `permission-denied`: `permission-denied` = "permission-denied".asInstanceOf[`permission-denied`]
  
  @js.native
  sealed trait phone
    extends StObject
       with FirebaseSignInProvider
  inline def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait previous extends StObject
  inline def previous: previous = "previous".asInstanceOf[previous]
  
  @js.native
  sealed trait purchase
    extends StObject
       with EventNameString
  inline def purchase: purchase = "purchase".asInstanceOf[purchase]
  
  @js.native
  sealed trait raw extends StObject
  inline def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait reauthenticate extends StObject
  inline def reauthenticate: reauthenticate = "reauthenticate".asInstanceOf[reauthenticate]
  
  @js.native
  sealed trait refund
    extends StObject
       with EventNameString
  inline def refund: refund = "refund".asInstanceOf[refund]
  
  @js.native
  sealed trait remote
    extends StObject
       with ValueSource
  inline def remote: remote = "remote".asInstanceOf[remote]
  
  @js.native
  sealed trait remove_from_cart
    extends StObject
       with EventNameString
  inline def remove_from_cart: remove_from_cart = "remove_from_cart".asInstanceOf[remove_from_cart]
  
  @js.native
  sealed trait removed
    extends StObject
       with DocumentChangeType
  inline def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait `resource-exhausted`
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def `resource-exhausted`: `resource-exhausted` = "resource-exhausted".asInstanceOf[`resource-exhausted`]
  
  @js.native
  sealed trait screen_view
    extends StObject
       with EventNameString
  inline def screen_view: screen_view = "screen_view".asInstanceOf[screen_view]
  
  @js.native
  sealed trait search
    extends StObject
       with EventNameString
  inline def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait select_content
    extends StObject
       with EventNameString
  inline def select_content: select_content = "select_content".asInstanceOf[select_content]
  
  @js.native
  sealed trait select_item
    extends StObject
       with EventNameString
  inline def select_item: select_item = "select_item".asInstanceOf[select_item]
  
  @js.native
  sealed trait select_promotion
    extends StObject
       with EventNameString
  inline def select_promotion: select_promotion = "select_promotion".asInstanceOf[select_promotion]
  
  @js.native
  sealed trait server extends StObject
  inline def server: server = "server".asInstanceOf[server]
  
  @js.native
  sealed trait set_checkout_option
    extends StObject
       with EventNameString
  inline def set_checkout_option: set_checkout_option = "set_checkout_option".asInstanceOf[set_checkout_option]
  
  @js.native
  sealed trait share
    extends StObject
       with EventNameString
  inline def share: share = "share".asInstanceOf[share]
  
  @js.native
  sealed trait signIn extends StObject
  inline def signIn: signIn = "signIn".asInstanceOf[signIn]
  
  @js.native
  sealed trait sign_up
    extends StObject
       with EventNameString
  inline def sign_up: sign_up = "sign_up".asInstanceOf[sign_up]
  
  @js.native
  sealed trait silent
    extends StObject
       with LogLevel
       with typings.firebase.compatMod.firebase.LogLevel
       with typings.firebase.compatMod.firebase.firestore.LogLevel
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait static
    extends StObject
       with ValueSource
  inline def static: static = "static".asInstanceOf[static]
  
  @js.native
  sealed trait success_
    extends StObject
       with FetchStatus
  inline def success_ : success_ = "success".asInstanceOf[success_]
  
  @js.native
  sealed trait throttle
    extends StObject
       with FetchStatus
  inline def throttle: throttle = "throttle".asInstanceOf[throttle]
  
  @js.native
  sealed trait timing_complete
    extends StObject
       with EventNameString
  inline def timing_complete: timing_complete = "timing_complete".asInstanceOf[timing_complete]
  
  @js.native
  sealed trait totp extends StObject
  inline def totp: totp = "totp".asInstanceOf[totp]
  
  @js.native
  sealed trait twitterDotcom
    extends StObject
       with FirebaseSignInProvider
  inline def twitterDotcom: twitterDotcom = "twitter.com".asInstanceOf[twitterDotcom]
  
  @js.native
  sealed trait unauthenticated
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  
  @js.native
  sealed trait unavailable
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait unimplemented
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def unimplemented: unimplemented = "unimplemented".asInstanceOf[unimplemented]
  
  @js.native
  sealed trait unknown
    extends StObject
       with FirestoreErrorCode
       with FunctionsErrorCode
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait value
    extends StObject
       with EventType
  inline def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait verbose
    extends StObject
       with typings.firebase.compatMod.firebase.LogLevel
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait view_cart
    extends StObject
       with EventNameString
  inline def view_cart: view_cart = "view_cart".asInstanceOf[view_cart]
  
  @js.native
  sealed trait view_item
    extends StObject
       with EventNameString
  inline def view_item: view_item = "view_item".asInstanceOf[view_item]
  
  @js.native
  sealed trait view_item_list
    extends StObject
       with EventNameString
  inline def view_item_list: view_item_list = "view_item_list".asInstanceOf[view_item_list]
  
  @js.native
  sealed trait view_promotion
    extends StObject
       with EventNameString
  inline def view_promotion: view_promotion = "view_promotion".asInstanceOf[view_promotion]
  
  @js.native
  sealed trait view_search_results
    extends StObject
       with EventNameString
  inline def view_search_results: view_search_results = "view_search_results".asInstanceOf[view_search_results]
  
  @js.native
  sealed trait warn
    extends StObject
       with typings.firebase.compatMod.firebase.LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
}
