package typings.firebaseAuth

import typings.firebaseAuth.authMod.ProviderId2
import typings.firebaseAuth.browserMod.BrowserName
import typings.firebaseAuth.coreAuthAuthImplMod.DefaultConfig
import typings.firebaseAuth.coreAuthRegisterMod.ComponentName
import typings.firebaseAuth.coreErrorsMod.AuthErrorCode
import typings.firebaseAuth.corePersistenceMod.PersistenceType
import typings.firebaseAuth.corePersistencePersistenceUserManagerMod.KeyName
import typings.firebaseAuth.coreUtilVersionMod.ClientPlatform
import typings.firebaseAuth.distSrcModelPopupRedirectMod.AuthEventType
import typings.firebaseAuth.distSrcModelPopupRedirectMod.GapiOutcome
import typings.firebaseAuth.modelPublicTypesMod.ActionCodeOperation
import typings.firebaseAuth.nodeEsmSrcApiErrorsMod.ServerError
import typings.firebaseAuth.nodeEsmSrcModelEnumsMod.OperationType
import typings.firebaseAuth.nodeEsmSrcModelEnumsMod.ProviderId
import typings.firebaseAuth.nodeEsmSrcModelEnumsMod.SignInMethod
import typings.firebaseAuth.rnSrcApiMod.Endpoint
import typings.firebaseAuth.rnSrcApiMod.HttpHeader
import typings.firebaseAuth.rnSrcApiMod.HttpMethod
import typings.firebaseAuth.rnSrcMfaMfaSessionMod.MultiFactorSessionType
import typings.firebaseAuth.rnSrcModelIdTokenMod.IdTokenResponseKind
import typings.firebaseAuth.srcPlatformBrowserMessagechannelMod.EventType
import typings.firebaseAuth.srcPlatformBrowserMessagechannelMod.MessageError
import typings.firebaseAuth.srcPlatformBrowserMessagechannelMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseAuthStrings {
  
  @js.native
  sealed trait ACK
    extends StObject
       with GapiOutcome
       with typings.firebaseAuth.modelPopupRedirectMod.GapiOutcome
       with typings.firebaseAuth.srcModelPopupRedirectMod.GapiOutcome
       with typings.firebaseAuth.rnSrcModelPopupRedirectMod.GapiOutcome
       with typings.firebaseAuth.nodeEsmSrcModelPopupRedirectMod.GapiOutcome
       with typings.firebaseAuth.nodeSrcModelPopupRedirectMod.GapiOutcome
       with typings.firebaseAuth.popupRedirectMod.GapiOutcome
  inline def ACK: ACK = "ACK".asInstanceOf[ACK]
  
  @js.native
  sealed trait ADMIN_ONLY_OPERATION
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def ADMIN_ONLY_OPERATION: ADMIN_ONLY_OPERATION = "ADMIN_ONLY_OPERATION".asInstanceOf[ADMIN_ONLY_OPERATION]
  
  @js.native
  sealed trait Android
    extends StObject
       with BrowserName
       with typings.firebaseAuth.rnSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.nodeSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.distSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.utilBrowserMod.BrowserName
       with typings.firebaseAuth.coreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.srcCoreUtilBrowserMod.BrowserName
  inline def Android: Android = "Android".asInstanceOf[Android]
  
  @js.native
  sealed trait BLOCKING_FUNCTION_ERROR_RESPONSE
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def BLOCKING_FUNCTION_ERROR_RESPONSE: BLOCKING_FUNCTION_ERROR_RESPONSE = "BLOCKING_FUNCTION_ERROR_RESPONSE".asInstanceOf[BLOCKING_FUNCTION_ERROR_RESPONSE]
  
  @js.native
  sealed trait Blackberry
    extends StObject
       with BrowserName
       with typings.firebaseAuth.rnSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.nodeSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.distSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.utilBrowserMod.BrowserName
       with typings.firebaseAuth.coreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.srcCoreUtilBrowserMod.BrowserName
  inline def Blackberry: Blackberry = "Blackberry".asInstanceOf[Blackberry]
  
  @js.native
  sealed trait Browser
    extends StObject
       with ClientPlatform
       with typings.firebaseAuth.rnSrcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.versionMod.ClientPlatform
       with typings.firebaseAuth.distSrcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.srcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.authMod.ClientPlatform
       with typings.firebaseAuth.utilVersionMod.ClientPlatform
       with typings.firebaseAuth.nodeSrcCoreUtilVersionMod.ClientPlatform
  inline def Browser: Browser = "Browser".asInstanceOf[Browser]
  
  @js.native
  sealed trait CAPTCHA_CHECK_FAILED
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def CAPTCHA_CHECK_FAILED: CAPTCHA_CHECK_FAILED = "CAPTCHA_CHECK_FAILED".asInstanceOf[CAPTCHA_CHECK_FAILED]
  
  @js.native
  sealed trait CORS_UNSUPPORTED
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def CORS_UNSUPPORTED: CORS_UNSUPPORTED = "CORS_UNSUPPORTED".asInstanceOf[CORS_UNSUPPORTED]
  
  @js.native
  sealed trait CREDENTIAL_MISMATCH
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def CREDENTIAL_MISMATCH: CREDENTIAL_MISMATCH = "CREDENTIAL_MISMATCH".asInstanceOf[CREDENTIAL_MISMATCH]
  
  @js.native
  sealed trait CREDENTIAL_TOO_OLD_LOGIN_AGAIN
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def CREDENTIAL_TOO_OLD_LOGIN_AGAIN: CREDENTIAL_TOO_OLD_LOGIN_AGAIN = "CREDENTIAL_TOO_OLD_LOGIN_AGAIN".asInstanceOf[CREDENTIAL_TOO_OLD_LOGIN_AGAIN]
  
  @js.native
  sealed trait Chrome
    extends StObject
       with BrowserName
       with typings.firebaseAuth.rnSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.nodeSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.distSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.utilBrowserMod.BrowserName
       with typings.firebaseAuth.coreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.srcCoreUtilBrowserMod.BrowserName
  inline def Chrome: Chrome = "Chrome".asInstanceOf[Chrome]
  
  @js.native
  sealed trait `Content-Type`
    extends StObject
       with HttpHeader
       with typings.firebaseAuth.nodeEsmSrcApiMod.HttpHeader
       with typings.firebaseAuth.distSrcApiMod.HttpHeader
       with typings.firebaseAuth.nodeSrcApiMod.HttpHeader
       with typings.firebaseAuth.esm5SrcApiMod.HttpHeader
       with typings.firebaseAuth.apiMod.HttpHeader
       with typings.firebaseAuth.srcApiMod.HttpHeader
  inline def `Content-Type`: `Content-Type` = "Content-Type".asInstanceOf[`Content-Type`]
  
  @js.native
  sealed trait Cordova
    extends StObject
       with ClientPlatform
       with typings.firebaseAuth.rnSrcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.versionMod.ClientPlatform
       with typings.firebaseAuth.distSrcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.srcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.authMod.ClientPlatform
       with typings.firebaseAuth.utilVersionMod.ClientPlatform
       with typings.firebaseAuth.nodeSrcCoreUtilVersionMod.ClientPlatform
  inline def Cordova: Cordova = "Cordova".asInstanceOf[Cordova]
  
  @js.native
  sealed trait DOMContentLoaded extends StObject
  inline def DOMContentLoaded: DOMContentLoaded = "DOMContentLoaded".asInstanceOf[DOMContentLoaded]
  
  @js.native
  sealed trait DYNAMIC_LINK_NOT_ACTIVATED
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def DYNAMIC_LINK_NOT_ACTIVATED: DYNAMIC_LINK_NOT_ACTIVATED = "DYNAMIC_LINK_NOT_ACTIVATED".asInstanceOf[DYNAMIC_LINK_NOT_ACTIVATED]
  
  @js.native
  sealed trait EMAIL_CHANGE_NEEDS_VERIFICATION
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def EMAIL_CHANGE_NEEDS_VERIFICATION: EMAIL_CHANGE_NEEDS_VERIFICATION = "EMAIL_CHANGE_NEEDS_VERIFICATION".asInstanceOf[EMAIL_CHANGE_NEEDS_VERIFICATION]
  
  @js.native
  sealed trait EMAIL_EXISTS
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def EMAIL_EXISTS: EMAIL_EXISTS = "EMAIL_EXISTS".asInstanceOf[EMAIL_EXISTS]
  
  @js.native
  sealed trait EMAIL_NOT_FOUND
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def EMAIL_NOT_FOUND: EMAIL_NOT_FOUND = "EMAIL_NOT_FOUND".asInstanceOf[EMAIL_NOT_FOUND]
  
  @js.native
  sealed trait EMAIL_SIGNIN
    extends StObject
       with ActionCodeOperation
       with typings.firebaseAuth.distSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.rnSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.publicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.srcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.nodeSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.ActionCodeOperation
  inline def EMAIL_SIGNIN: EMAIL_SIGNIN = "EMAIL_SIGNIN".asInstanceOf[EMAIL_SIGNIN]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with GapiOutcome
       with typings.firebaseAuth.modelPopupRedirectMod.GapiOutcome
       with typings.firebaseAuth.srcModelPopupRedirectMod.GapiOutcome
       with typings.firebaseAuth.rnSrcModelPopupRedirectMod.GapiOutcome
       with typings.firebaseAuth.nodeEsmSrcModelPopupRedirectMod.GapiOutcome
       with typings.firebaseAuth.nodeSrcModelPopupRedirectMod.GapiOutcome
       with typings.firebaseAuth.popupRedirectMod.GapiOutcome
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait EXPIRED_OOB_CODE
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def EXPIRED_OOB_CODE: EXPIRED_OOB_CODE = "EXPIRED_OOB_CODE".asInstanceOf[EXPIRED_OOB_CODE]
  
  @js.native
  sealed trait Edge
    extends StObject
       with BrowserName
       with typings.firebaseAuth.rnSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.nodeSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.distSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.utilBrowserMod.BrowserName
       with typings.firebaseAuth.coreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.srcCoreUtilBrowserMod.BrowserName
  inline def Edge: Edge = "Edge".asInstanceOf[Edge]
  
  @js.native
  sealed trait FEDERATED_USER_ID_ALREADY_LINKED
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def FEDERATED_USER_ID_ALREADY_LINKED: FEDERATED_USER_ID_ALREADY_LINKED = "FEDERATED_USER_ID_ALREADY_LINKED".asInstanceOf[FEDERATED_USER_ID_ALREADY_LINKED]
  
  @js.native
  sealed trait Firefox
    extends StObject
       with BrowserName
       with typings.firebaseAuth.rnSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.nodeSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.distSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.utilBrowserMod.BrowserName
       with typings.firebaseAuth.coreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.srcCoreUtilBrowserMod.BrowserName
  inline def Firefox: Firefox = "Firefox".asInstanceOf[Firefox]
  
  @js.native
  sealed trait GET
    extends StObject
       with HttpMethod
       with typings.firebaseAuth.nodeEsmSrcApiMod.HttpMethod
       with typings.firebaseAuth.distSrcApiMod.HttpMethod
       with typings.firebaseAuth.nodeSrcApiMod.HttpMethod
       with typings.firebaseAuth.esm5SrcApiMod.HttpMethod
       with typings.firebaseAuth.apiMod.HttpMethod
       with typings.firebaseAuth.srcApiMod.HttpMethod
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait IE
    extends StObject
       with BrowserName
       with typings.firebaseAuth.rnSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.nodeSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.distSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.utilBrowserMod.BrowserName
       with typings.firebaseAuth.coreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.srcCoreUtilBrowserMod.BrowserName
  inline def IE: IE = "IE".asInstanceOf[IE]
  
  @js.native
  sealed trait IEMobile
    extends StObject
       with BrowserName
       with typings.firebaseAuth.rnSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.nodeSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.distSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.utilBrowserMod.BrowserName
       with typings.firebaseAuth.coreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.srcCoreUtilBrowserMod.BrowserName
  inline def IEMobile: IEMobile = "IEMobile".asInstanceOf[IEMobile]
  
  @js.native
  sealed trait INVALID_APP_CREDENTIAL
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_APP_CREDENTIAL: INVALID_APP_CREDENTIAL = "INVALID_APP_CREDENTIAL".asInstanceOf[INVALID_APP_CREDENTIAL]
  
  @js.native
  sealed trait INVALID_APP_ID
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_APP_ID: INVALID_APP_ID = "INVALID_APP_ID".asInstanceOf[INVALID_APP_ID]
  
  @js.native
  sealed trait INVALID_CERT_HASH
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_CERT_HASH: INVALID_CERT_HASH = "INVALID_CERT_HASH".asInstanceOf[INVALID_CERT_HASH]
  
  @js.native
  sealed trait INVALID_CODE
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_CODE: INVALID_CODE = "INVALID_CODE".asInstanceOf[INVALID_CODE]
  
  @js.native
  sealed trait INVALID_CONTINUE_URI
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_CONTINUE_URI: INVALID_CONTINUE_URI = "INVALID_CONTINUE_URI".asInstanceOf[INVALID_CONTINUE_URI]
  
  @js.native
  sealed trait INVALID_CUSTOM_TOKEN
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_CUSTOM_TOKEN: INVALID_CUSTOM_TOKEN = "INVALID_CUSTOM_TOKEN".asInstanceOf[INVALID_CUSTOM_TOKEN]
  
  @js.native
  sealed trait INVALID_DYNAMIC_LINK_DOMAIN
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_DYNAMIC_LINK_DOMAIN: INVALID_DYNAMIC_LINK_DOMAIN = "INVALID_DYNAMIC_LINK_DOMAIN".asInstanceOf[INVALID_DYNAMIC_LINK_DOMAIN]
  
  @js.native
  sealed trait INVALID_EMAIL
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_EMAIL: INVALID_EMAIL = "INVALID_EMAIL".asInstanceOf[INVALID_EMAIL]
  
  @js.native
  sealed trait INVALID_IDENTIFIER
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_IDENTIFIER: INVALID_IDENTIFIER = "INVALID_IDENTIFIER".asInstanceOf[INVALID_IDENTIFIER]
  
  @js.native
  sealed trait INVALID_IDP_RESPONSE
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_IDP_RESPONSE: INVALID_IDP_RESPONSE = "INVALID_IDP_RESPONSE".asInstanceOf[INVALID_IDP_RESPONSE]
  
  @js.native
  sealed trait INVALID_ID_TOKEN
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_ID_TOKEN: INVALID_ID_TOKEN = "INVALID_ID_TOKEN".asInstanceOf[INVALID_ID_TOKEN]
  
  @js.native
  sealed trait INVALID_MESSAGE_PAYLOAD
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_MESSAGE_PAYLOAD: INVALID_MESSAGE_PAYLOAD = "INVALID_MESSAGE_PAYLOAD".asInstanceOf[INVALID_MESSAGE_PAYLOAD]
  
  @js.native
  sealed trait INVALID_MFA_PENDING_CREDENTIAL
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_MFA_PENDING_CREDENTIAL: INVALID_MFA_PENDING_CREDENTIAL = "INVALID_MFA_PENDING_CREDENTIAL".asInstanceOf[INVALID_MFA_PENDING_CREDENTIAL]
  
  @js.native
  sealed trait INVALID_OAUTH_CLIENT_ID
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_OAUTH_CLIENT_ID: INVALID_OAUTH_CLIENT_ID = "INVALID_OAUTH_CLIENT_ID".asInstanceOf[INVALID_OAUTH_CLIENT_ID]
  
  @js.native
  sealed trait INVALID_OOB_CODE
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_OOB_CODE: INVALID_OOB_CODE = "INVALID_OOB_CODE".asInstanceOf[INVALID_OOB_CODE]
  
  @js.native
  sealed trait INVALID_PASSWORD
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_PASSWORD: INVALID_PASSWORD = "INVALID_PASSWORD".asInstanceOf[INVALID_PASSWORD]
  
  @js.native
  sealed trait INVALID_PENDING_TOKEN
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_PENDING_TOKEN: INVALID_PENDING_TOKEN = "INVALID_PENDING_TOKEN".asInstanceOf[INVALID_PENDING_TOKEN]
  
  @js.native
  sealed trait INVALID_PHONE_NUMBER
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_PHONE_NUMBER: INVALID_PHONE_NUMBER = "INVALID_PHONE_NUMBER".asInstanceOf[INVALID_PHONE_NUMBER]
  
  @js.native
  sealed trait INVALID_PROVIDER_ID
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_PROVIDER_ID: INVALID_PROVIDER_ID = "INVALID_PROVIDER_ID".asInstanceOf[INVALID_PROVIDER_ID]
  
  @js.native
  sealed trait INVALID_RECIPIENT_EMAIL
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_RECIPIENT_EMAIL: INVALID_RECIPIENT_EMAIL = "INVALID_RECIPIENT_EMAIL".asInstanceOf[INVALID_RECIPIENT_EMAIL]
  
  @js.native
  sealed trait INVALID_SENDER
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_SENDER: INVALID_SENDER = "INVALID_SENDER".asInstanceOf[INVALID_SENDER]
  
  @js.native
  sealed trait INVALID_SESSION_INFO
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_SESSION_INFO: INVALID_SESSION_INFO = "INVALID_SESSION_INFO".asInstanceOf[INVALID_SESSION_INFO]
  
  @js.native
  sealed trait INVALID_TEMPORARY_PROOF
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_TEMPORARY_PROOF: INVALID_TEMPORARY_PROOF = "INVALID_TEMPORARY_PROOF".asInstanceOf[INVALID_TEMPORARY_PROOF]
  
  @js.native
  sealed trait INVALID_TENANT_ID
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def INVALID_TENANT_ID: INVALID_TENANT_ID = "INVALID_TENANT_ID".asInstanceOf[INVALID_TENANT_ID]
  
  @js.native
  sealed trait JsCore extends StObject
  inline def JsCore: JsCore = "JsCore".asInstanceOf[JsCore]
  
  @js.native
  sealed trait LOCAL
    extends StObject
       with PersistenceType
       with typings.firebaseAuth.persistenceMod.PersistenceType
       with typings.firebaseAuth.rnSrcCorePersistenceMod.PersistenceType
       with typings.firebaseAuth.nodeEsmSrcCorePersistenceMod.PersistenceType
       with typings.firebaseAuth.nodeSrcCorePersistenceMod.PersistenceType
       with typings.firebaseAuth.distSrcCorePersistenceMod.PersistenceType
       with typings.firebaseAuth.srcCorePersistenceMod.PersistenceType
  inline def LOCAL: LOCAL = "LOCAL".asInstanceOf[LOCAL]
  
  @js.native
  sealed trait MFA_ENROLLMENT_NOT_FOUND
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MFA_ENROLLMENT_NOT_FOUND: MFA_ENROLLMENT_NOT_FOUND = "MFA_ENROLLMENT_NOT_FOUND".asInstanceOf[MFA_ENROLLMENT_NOT_FOUND]
  
  @js.native
  sealed trait MISSING_ANDROID_PACKAGE_NAME
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_ANDROID_PACKAGE_NAME: MISSING_ANDROID_PACKAGE_NAME = "MISSING_ANDROID_PACKAGE_NAME".asInstanceOf[MISSING_ANDROID_PACKAGE_NAME]
  
  @js.native
  sealed trait MISSING_APP_CREDENTIAL
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_APP_CREDENTIAL: MISSING_APP_CREDENTIAL = "MISSING_APP_CREDENTIAL".asInstanceOf[MISSING_APP_CREDENTIAL]
  
  @js.native
  sealed trait MISSING_CODE
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_CODE: MISSING_CODE = "MISSING_CODE".asInstanceOf[MISSING_CODE]
  
  @js.native
  sealed trait MISSING_CONTINUE_URI
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_CONTINUE_URI: MISSING_CONTINUE_URI = "MISSING_CONTINUE_URI".asInstanceOf[MISSING_CONTINUE_URI]
  
  @js.native
  sealed trait MISSING_CUSTOM_TOKEN
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_CUSTOM_TOKEN: MISSING_CUSTOM_TOKEN = "MISSING_CUSTOM_TOKEN".asInstanceOf[MISSING_CUSTOM_TOKEN]
  
  @js.native
  sealed trait MISSING_IOS_BUNDLE_ID
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_IOS_BUNDLE_ID: MISSING_IOS_BUNDLE_ID = "MISSING_IOS_BUNDLE_ID".asInstanceOf[MISSING_IOS_BUNDLE_ID]
  
  @js.native
  sealed trait MISSING_MFA_ENROLLMENT_ID
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_MFA_ENROLLMENT_ID: MISSING_MFA_ENROLLMENT_ID = "MISSING_MFA_ENROLLMENT_ID".asInstanceOf[MISSING_MFA_ENROLLMENT_ID]
  
  @js.native
  sealed trait MISSING_MFA_PENDING_CREDENTIAL
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_MFA_PENDING_CREDENTIAL: MISSING_MFA_PENDING_CREDENTIAL = "MISSING_MFA_PENDING_CREDENTIAL".asInstanceOf[MISSING_MFA_PENDING_CREDENTIAL]
  
  @js.native
  sealed trait MISSING_OOB_CODE
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_OOB_CODE: MISSING_OOB_CODE = "MISSING_OOB_CODE".asInstanceOf[MISSING_OOB_CODE]
  
  @js.native
  sealed trait MISSING_OR_INVALID_NONCE
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_OR_INVALID_NONCE: MISSING_OR_INVALID_NONCE = "MISSING_OR_INVALID_NONCE".asInstanceOf[MISSING_OR_INVALID_NONCE]
  
  @js.native
  sealed trait MISSING_PASSWORD
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_PASSWORD: MISSING_PASSWORD = "MISSING_PASSWORD".asInstanceOf[MISSING_PASSWORD]
  
  @js.native
  sealed trait MISSING_PHONE_NUMBER
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_PHONE_NUMBER: MISSING_PHONE_NUMBER = "MISSING_PHONE_NUMBER".asInstanceOf[MISSING_PHONE_NUMBER]
  
  @js.native
  sealed trait MISSING_REQ_TYPE
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_REQ_TYPE: MISSING_REQ_TYPE = "MISSING_REQ_TYPE".asInstanceOf[MISSING_REQ_TYPE]
  
  @js.native
  sealed trait MISSING_SESSION_INFO
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def MISSING_SESSION_INFO: MISSING_SESSION_INFO = "MISSING_SESSION_INFO".asInstanceOf[MISSING_SESSION_INFO]
  
  @js.native
  sealed trait NONE
    extends StObject
       with PersistenceType
       with typings.firebaseAuth.persistenceMod.PersistenceType
       with typings.firebaseAuth.rnSrcCorePersistenceMod.PersistenceType
       with typings.firebaseAuth.nodeEsmSrcCorePersistenceMod.PersistenceType
       with typings.firebaseAuth.nodeSrcCorePersistenceMod.PersistenceType
       with typings.firebaseAuth.distSrcCorePersistenceMod.PersistenceType
       with typings.firebaseAuth.srcCorePersistenceMod.PersistenceType
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait Node
    extends StObject
       with ClientPlatform
       with typings.firebaseAuth.rnSrcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.versionMod.ClientPlatform
       with typings.firebaseAuth.distSrcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.srcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.authMod.ClientPlatform
       with typings.firebaseAuth.utilVersionMod.ClientPlatform
       with typings.firebaseAuth.nodeSrcCoreUtilVersionMod.ClientPlatform
  inline def Node: Node = "Node".asInstanceOf[Node]
  
  @js.native
  sealed trait OPERATION_NOT_ALLOWED
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def OPERATION_NOT_ALLOWED: OPERATION_NOT_ALLOWED = "OPERATION_NOT_ALLOWED".asInstanceOf[OPERATION_NOT_ALLOWED]
  
  @js.native
  sealed trait Opera
    extends StObject
       with BrowserName
       with typings.firebaseAuth.rnSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.nodeSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.distSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.utilBrowserMod.BrowserName
       with typings.firebaseAuth.coreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.srcCoreUtilBrowserMod.BrowserName
  inline def Opera: Opera = "Opera".asInstanceOf[Opera]
  
  @js.native
  sealed trait Other
    extends StObject
       with BrowserName
       with typings.firebaseAuth.rnSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.nodeSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.distSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.utilBrowserMod.BrowserName
       with typings.firebaseAuth.coreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.srcCoreUtilBrowserMod.BrowserName
  inline def Other: Other = "Other".asInstanceOf[Other]
  
  @js.native
  sealed trait PASSWORD_LOGIN_DISABLED
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def PASSWORD_LOGIN_DISABLED: PASSWORD_LOGIN_DISABLED = "PASSWORD_LOGIN_DISABLED".asInstanceOf[PASSWORD_LOGIN_DISABLED]
  
  @js.native
  sealed trait PASSWORD_RESET
    extends StObject
       with ActionCodeOperation
       with typings.firebaseAuth.distSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.rnSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.publicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.srcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.nodeSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.ActionCodeOperation
  inline def PASSWORD_RESET: PASSWORD_RESET = "PASSWORD_RESET".asInstanceOf[PASSWORD_RESET]
  
  @js.native
  sealed trait POST
    extends StObject
       with HttpMethod
       with typings.firebaseAuth.nodeEsmSrcApiMod.HttpMethod
       with typings.firebaseAuth.distSrcApiMod.HttpMethod
       with typings.firebaseAuth.nodeSrcApiMod.HttpMethod
       with typings.firebaseAuth.esm5SrcApiMod.HttpMethod
       with typings.firebaseAuth.apiMod.HttpMethod
       with typings.firebaseAuth.srcApiMod.HttpMethod
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait QUOTA_EXCEEDED
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def QUOTA_EXCEEDED: QUOTA_EXCEEDED = "QUOTA_EXCEEDED".asInstanceOf[QUOTA_EXCEEDED]
  
  @js.native
  sealed trait RECOVER_EMAIL
    extends StObject
       with ActionCodeOperation
       with typings.firebaseAuth.distSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.rnSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.publicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.srcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.nodeSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.ActionCodeOperation
  inline def RECOVER_EMAIL: RECOVER_EMAIL = "RECOVER_EMAIL".asInstanceOf[RECOVER_EMAIL]
  
  @js.native
  sealed trait REJECTED_CREDENTIAL
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def REJECTED_CREDENTIAL: REJECTED_CREDENTIAL = "REJECTED_CREDENTIAL".asInstanceOf[REJECTED_CREDENTIAL]
  
  @js.native
  sealed trait RESET_PASSWORD_EXCEED_LIMIT
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def RESET_PASSWORD_EXCEED_LIMIT: RESET_PASSWORD_EXCEED_LIMIT = "RESET_PASSWORD_EXCEED_LIMIT".asInstanceOf[RESET_PASSWORD_EXCEED_LIMIT]
  
  @js.native
  sealed trait REVERT_SECOND_FACTOR_ADDITION
    extends StObject
       with ActionCodeOperation
       with typings.firebaseAuth.distSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.rnSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.publicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.srcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.nodeSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.ActionCodeOperation
  inline def REVERT_SECOND_FACTOR_ADDITION: REVERT_SECOND_FACTOR_ADDITION = "REVERT_SECOND_FACTOR_ADDITION".asInstanceOf[REVERT_SECOND_FACTOR_ADDITION]
  
  @js.native
  sealed trait ReactNative
    extends StObject
       with ClientPlatform
       with typings.firebaseAuth.rnSrcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.versionMod.ClientPlatform
       with typings.firebaseAuth.distSrcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.srcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.authMod.ClientPlatform
       with typings.firebaseAuth.utilVersionMod.ClientPlatform
       with typings.firebaseAuth.nodeSrcCoreUtilVersionMod.ClientPlatform
  inline def ReactNative: ReactNative = "ReactNative".asInstanceOf[ReactNative]
  
  @js.native
  sealed trait SECOND_FACTOR_EXISTS
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def SECOND_FACTOR_EXISTS: SECOND_FACTOR_EXISTS = "SECOND_FACTOR_EXISTS".asInstanceOf[SECOND_FACTOR_EXISTS]
  
  @js.native
  sealed trait SECOND_FACTOR_LIMIT_EXCEEDED
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def SECOND_FACTOR_LIMIT_EXCEEDED: SECOND_FACTOR_LIMIT_EXCEEDED = "SECOND_FACTOR_LIMIT_EXCEEDED".asInstanceOf[SECOND_FACTOR_LIMIT_EXCEEDED]
  
  @js.native
  sealed trait SESSION
    extends StObject
       with PersistenceType
       with typings.firebaseAuth.persistenceMod.PersistenceType
       with typings.firebaseAuth.rnSrcCorePersistenceMod.PersistenceType
       with typings.firebaseAuth.nodeEsmSrcCorePersistenceMod.PersistenceType
       with typings.firebaseAuth.nodeSrcCorePersistenceMod.PersistenceType
       with typings.firebaseAuth.distSrcCorePersistenceMod.PersistenceType
       with typings.firebaseAuth.srcCorePersistenceMod.PersistenceType
  inline def SESSION: SESSION = "SESSION".asInstanceOf[SESSION]
  
  @js.native
  sealed trait SESSION_EXPIRED
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def SESSION_EXPIRED: SESSION_EXPIRED = "SESSION_EXPIRED".asInstanceOf[SESSION_EXPIRED]
  
  @js.native
  sealed trait Safari
    extends StObject
       with BrowserName
       with typings.firebaseAuth.rnSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.nodeSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.distSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.utilBrowserMod.BrowserName
       with typings.firebaseAuth.coreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.srcCoreUtilBrowserMod.BrowserName
  inline def Safari: Safari = "Safari".asInstanceOf[Safari]
  
  @js.native
  sealed trait ServerErrorMap extends StObject
  inline def ServerErrorMap: ServerErrorMap = "ServerErrorMap".asInstanceOf[ServerErrorMap]
  
  @js.native
  sealed trait Silk
    extends StObject
       with BrowserName
       with typings.firebaseAuth.rnSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.nodeSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.distSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.utilBrowserMod.BrowserName
       with typings.firebaseAuth.coreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.srcCoreUtilBrowserMod.BrowserName
  inline def Silk: Silk = "Silk".asInstanceOf[Silk]
  
  @js.native
  sealed trait Slashv1SlashaccountsColoncreateAuthUri
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashaccountsColoncreateAuthUri: Slashv1SlashaccountsColoncreateAuthUri = "/v1/accounts:createAuthUri".asInstanceOf[Slashv1SlashaccountsColoncreateAuthUri]
  
  @js.native
  sealed trait Slashv1SlashaccountsColondelete
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashaccountsColondelete: Slashv1SlashaccountsColondelete = "/v1/accounts:delete".asInstanceOf[Slashv1SlashaccountsColondelete]
  
  @js.native
  sealed trait Slashv1SlashaccountsColonlookup
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashaccountsColonlookup: Slashv1SlashaccountsColonlookup = "/v1/accounts:lookup".asInstanceOf[Slashv1SlashaccountsColonlookup]
  
  @js.native
  sealed trait Slashv1SlashaccountsColonresetPassword
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashaccountsColonresetPassword: Slashv1SlashaccountsColonresetPassword = "/v1/accounts:resetPassword".asInstanceOf[Slashv1SlashaccountsColonresetPassword]
  
  @js.native
  sealed trait Slashv1SlashaccountsColonsendOobCode
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashaccountsColonsendOobCode: Slashv1SlashaccountsColonsendOobCode = "/v1/accounts:sendOobCode".asInstanceOf[Slashv1SlashaccountsColonsendOobCode]
  
  @js.native
  sealed trait Slashv1SlashaccountsColonsendVerificationCode
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashaccountsColonsendVerificationCode: Slashv1SlashaccountsColonsendVerificationCode = "/v1/accounts:sendVerificationCode".asInstanceOf[Slashv1SlashaccountsColonsendVerificationCode]
  
  @js.native
  sealed trait Slashv1SlashaccountsColonsignInWithCustomToken
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashaccountsColonsignInWithCustomToken: Slashv1SlashaccountsColonsignInWithCustomToken = "/v1/accounts:signInWithCustomToken".asInstanceOf[Slashv1SlashaccountsColonsignInWithCustomToken]
  
  @js.native
  sealed trait Slashv1SlashaccountsColonsignInWithEmailLink
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashaccountsColonsignInWithEmailLink: Slashv1SlashaccountsColonsignInWithEmailLink = "/v1/accounts:signInWithEmailLink".asInstanceOf[Slashv1SlashaccountsColonsignInWithEmailLink]
  
  @js.native
  sealed trait Slashv1SlashaccountsColonsignInWithIdp
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashaccountsColonsignInWithIdp: Slashv1SlashaccountsColonsignInWithIdp = "/v1/accounts:signInWithIdp".asInstanceOf[Slashv1SlashaccountsColonsignInWithIdp]
  
  @js.native
  sealed trait Slashv1SlashaccountsColonsignInWithPassword
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashaccountsColonsignInWithPassword: Slashv1SlashaccountsColonsignInWithPassword = "/v1/accounts:signInWithPassword".asInstanceOf[Slashv1SlashaccountsColonsignInWithPassword]
  
  @js.native
  sealed trait Slashv1SlashaccountsColonsignInWithPhoneNumber
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashaccountsColonsignInWithPhoneNumber: Slashv1SlashaccountsColonsignInWithPhoneNumber = "/v1/accounts:signInWithPhoneNumber".asInstanceOf[Slashv1SlashaccountsColonsignInWithPhoneNumber]
  
  @js.native
  sealed trait Slashv1SlashaccountsColonsignUp
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashaccountsColonsignUp: Slashv1SlashaccountsColonsignUp = "/v1/accounts:signUp".asInstanceOf[Slashv1SlashaccountsColonsignUp]
  
  @js.native
  sealed trait Slashv1SlashaccountsColonupdate
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashaccountsColonupdate: Slashv1SlashaccountsColonupdate = "/v1/accounts:update".asInstanceOf[Slashv1SlashaccountsColonupdate]
  
  @js.native
  sealed trait Slashv1Slashprojects
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1Slashprojects: Slashv1Slashprojects = "/v1/projects".asInstanceOf[Slashv1Slashprojects]
  
  @js.native
  sealed trait Slashv1SlashrecaptchaParams
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv1SlashrecaptchaParams: Slashv1SlashrecaptchaParams = "/v1/recaptchaParams".asInstanceOf[Slashv1SlashrecaptchaParams]
  
  @js.native
  sealed trait Slashv1Slashtoken extends StObject
  inline def Slashv1Slashtoken: Slashv1Slashtoken = "/v1/token".asInstanceOf[Slashv1Slashtoken]
  
  @js.native
  sealed trait Slashv2SlashaccountsSlashmfaEnrollmentColonfinalize
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv2SlashaccountsSlashmfaEnrollmentColonfinalize: Slashv2SlashaccountsSlashmfaEnrollmentColonfinalize = "/v2/accounts/mfaEnrollment:finalize".asInstanceOf[Slashv2SlashaccountsSlashmfaEnrollmentColonfinalize]
  
  @js.native
  sealed trait Slashv2SlashaccountsSlashmfaEnrollmentColonstart
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv2SlashaccountsSlashmfaEnrollmentColonstart: Slashv2SlashaccountsSlashmfaEnrollmentColonstart = "/v2/accounts/mfaEnrollment:start".asInstanceOf[Slashv2SlashaccountsSlashmfaEnrollmentColonstart]
  
  @js.native
  sealed trait Slashv2SlashaccountsSlashmfaEnrollmentColonwithdraw
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv2SlashaccountsSlashmfaEnrollmentColonwithdraw: Slashv2SlashaccountsSlashmfaEnrollmentColonwithdraw = "/v2/accounts/mfaEnrollment:withdraw".asInstanceOf[Slashv2SlashaccountsSlashmfaEnrollmentColonwithdraw]
  
  @js.native
  sealed trait Slashv2SlashaccountsSlashmfaSignInColonfinalize
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv2SlashaccountsSlashmfaSignInColonfinalize: Slashv2SlashaccountsSlashmfaSignInColonfinalize = "/v2/accounts/mfaSignIn:finalize".asInstanceOf[Slashv2SlashaccountsSlashmfaSignInColonfinalize]
  
  @js.native
  sealed trait Slashv2SlashaccountsSlashmfaSignInColonstart
    extends StObject
       with Endpoint
       with typings.firebaseAuth.nodeEsmSrcApiMod.Endpoint
       with typings.firebaseAuth.distSrcApiMod.Endpoint
       with typings.firebaseAuth.nodeSrcApiMod.Endpoint
       with typings.firebaseAuth.esm5SrcApiMod.Endpoint
       with typings.firebaseAuth.apiMod.Endpoint
       with typings.firebaseAuth.srcApiMod.Endpoint
  inline def Slashv2SlashaccountsSlashmfaSignInColonstart: Slashv2SlashaccountsSlashmfaSignInColonstart = "/v2/accounts/mfaSignIn:start".asInstanceOf[Slashv2SlashaccountsSlashmfaSignInColonstart]
  
  @js.native
  sealed trait TENANT_ID_MISMATCH
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def TENANT_ID_MISMATCH: TENANT_ID_MISMATCH = "TENANT_ID_MISMATCH".asInstanceOf[TENANT_ID_MISMATCH]
  
  @js.native
  sealed trait TOKEN_EXPIRED
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def TOKEN_EXPIRED: TOKEN_EXPIRED = "TOKEN_EXPIRED".asInstanceOf[TOKEN_EXPIRED]
  
  @js.native
  sealed trait TOO_MANY_ATTEMPTS_TRY_LATER
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def TOO_MANY_ATTEMPTS_TRY_LATER: TOO_MANY_ATTEMPTS_TRY_LATER = "TOO_MANY_ATTEMPTS_TRY_LATER".asInstanceOf[TOO_MANY_ATTEMPTS_TRY_LATER]
  
  @js.native
  sealed trait UNAUTHORIZED_DOMAIN
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def UNAUTHORIZED_DOMAIN: UNAUTHORIZED_DOMAIN = "UNAUTHORIZED_DOMAIN".asInstanceOf[UNAUTHORIZED_DOMAIN]
  
  @js.native
  sealed trait UNSUPPORTED_FIRST_FACTOR
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def UNSUPPORTED_FIRST_FACTOR: UNSUPPORTED_FIRST_FACTOR = "UNSUPPORTED_FIRST_FACTOR".asInstanceOf[UNSUPPORTED_FIRST_FACTOR]
  
  @js.native
  sealed trait UNSUPPORTED_TENANT_OPERATION
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def UNSUPPORTED_TENANT_OPERATION: UNSUPPORTED_TENANT_OPERATION = "UNSUPPORTED_TENANT_OPERATION".asInstanceOf[UNSUPPORTED_TENANT_OPERATION]
  
  @js.native
  sealed trait UNVERIFIED_EMAIL
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def UNVERIFIED_EMAIL: UNVERIFIED_EMAIL = "UNVERIFIED_EMAIL".asInstanceOf[UNVERIFIED_EMAIL]
  
  @js.native
  sealed trait USER_CANCELLED
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def USER_CANCELLED: USER_CANCELLED = "USER_CANCELLED".asInstanceOf[USER_CANCELLED]
  
  @js.native
  sealed trait USER_DISABLED
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def USER_DISABLED: USER_DISABLED = "USER_DISABLED".asInstanceOf[USER_DISABLED]
  
  @js.native
  sealed trait USER_NOT_FOUND
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def USER_NOT_FOUND: USER_NOT_FOUND = "USER_NOT_FOUND".asInstanceOf[USER_NOT_FOUND]
  
  @js.native
  sealed trait VERIFY_AND_CHANGE_EMAIL
    extends StObject
       with ActionCodeOperation
       with typings.firebaseAuth.distSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.rnSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.publicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.srcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.nodeSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.ActionCodeOperation
  inline def VERIFY_AND_CHANGE_EMAIL: VERIFY_AND_CHANGE_EMAIL = "VERIFY_AND_CHANGE_EMAIL".asInstanceOf[VERIFY_AND_CHANGE_EMAIL]
  
  @js.native
  sealed trait VERIFY_EMAIL
    extends StObject
       with ActionCodeOperation
       with typings.firebaseAuth.distSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.rnSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.publicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.srcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.nodeSrcModelPublicTypesMod.ActionCodeOperation
       with typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.ActionCodeOperation
  inline def VERIFY_EMAIL: VERIFY_EMAIL = "VERIFY_EMAIL".asInstanceOf[VERIFY_EMAIL]
  
  @js.native
  sealed trait WEAK_PASSWORD
    extends StObject
       with ServerError
       with typings.firebaseAuth.rnSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.apiErrorsMod.ServerError
       with typings.firebaseAuth.nodeSrcApiErrorsMod.ServerError
       with typings.firebaseAuth.errorsMod.ServerError
       with typings.firebaseAuth.srcApiErrorsMod.ServerError
       with typings.firebaseAuth.distSrcApiErrorsMod.ServerError
  inline def WEAK_PASSWORD: WEAK_PASSWORD = "WEAK_PASSWORD".asInstanceOf[WEAK_PASSWORD]
  
  @js.native
  sealed trait Webos
    extends StObject
       with BrowserName
       with typings.firebaseAuth.rnSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.nodeSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.distSrcCoreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.utilBrowserMod.BrowserName
       with typings.firebaseAuth.coreUtilBrowserMod.BrowserName
       with typings.firebaseAuth.srcCoreUtilBrowserMod.BrowserName
  inline def Webos: Webos = "Webos".asInstanceOf[Webos]
  
  @js.native
  sealed trait Worker
    extends StObject
       with ClientPlatform
       with typings.firebaseAuth.rnSrcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.versionMod.ClientPlatform
       with typings.firebaseAuth.distSrcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.srcCoreUtilVersionMod.ClientPlatform
       with typings.firebaseAuth.authMod.ClientPlatform
       with typings.firebaseAuth.utilVersionMod.ClientPlatform
       with typings.firebaseAuth.nodeSrcCoreUtilVersionMod.ClientPlatform
  inline def Worker: Worker = "Worker".asInstanceOf[Worker]
  
  @js.native
  sealed trait `X-Client-Version`
    extends StObject
       with HttpHeader
       with typings.firebaseAuth.nodeEsmSrcApiMod.HttpHeader
       with typings.firebaseAuth.distSrcApiMod.HttpHeader
       with typings.firebaseAuth.nodeSrcApiMod.HttpHeader
       with typings.firebaseAuth.esm5SrcApiMod.HttpHeader
       with typings.firebaseAuth.apiMod.HttpHeader
       with typings.firebaseAuth.srcApiMod.HttpHeader
  inline def `X-Client-Version`: `X-Client-Version` = "X-Client-Version".asInstanceOf[`X-Client-Version`]
  
  @js.native
  sealed trait `X-Firebase-Client`
    extends StObject
       with HttpHeader
       with typings.firebaseAuth.nodeEsmSrcApiMod.HttpHeader
       with typings.firebaseAuth.distSrcApiMod.HttpHeader
       with typings.firebaseAuth.nodeSrcApiMod.HttpHeader
       with typings.firebaseAuth.esm5SrcApiMod.HttpHeader
       with typings.firebaseAuth.apiMod.HttpHeader
       with typings.firebaseAuth.srcApiMod.HttpHeader
  inline def `X-Firebase-Client`: `X-Firebase-Client` = "X-Firebase-Client".asInstanceOf[`X-Firebase-Client`]
  
  @js.native
  sealed trait `X-Firebase-Locale`
    extends StObject
       with HttpHeader
       with typings.firebaseAuth.nodeEsmSrcApiMod.HttpHeader
       with typings.firebaseAuth.distSrcApiMod.HttpHeader
       with typings.firebaseAuth.nodeSrcApiMod.HttpHeader
       with typings.firebaseAuth.esm5SrcApiMod.HttpHeader
       with typings.firebaseAuth.apiMod.HttpHeader
       with typings.firebaseAuth.srcApiMod.HttpHeader
  inline def `X-Firebase-Locale`: `X-Firebase-Locale` = "X-Firebase-Locale".asInstanceOf[`X-Firebase-Locale`]
  
  @js.native
  sealed trait `X-Firebase-gmpid`
    extends StObject
       with HttpHeader
       with typings.firebaseAuth.nodeEsmSrcApiMod.HttpHeader
       with typings.firebaseAuth.distSrcApiMod.HttpHeader
       with typings.firebaseAuth.nodeSrcApiMod.HttpHeader
       with typings.firebaseAuth.esm5SrcApiMod.HttpHeader
       with typings.firebaseAuth.apiMod.HttpHeader
       with typings.firebaseAuth.srcApiMod.HttpHeader
  inline def `X-Firebase-gmpid`: `X-Firebase-gmpid` = "X-Firebase-gmpid".asInstanceOf[`X-Firebase-gmpid`]
  
  @js.native
  sealed trait `account-exists-with-different-credential`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `account-exists-with-different-credential`: `account-exists-with-different-credential` = "account-exists-with-different-credential".asInstanceOf[`account-exists-with-different-credential`]
  
  @js.native
  sealed trait ack_
    extends StObject
       with Status
       with typings.firebaseAuth.rnSrcPlatformBrowserMessagechannelMod.Status
       with typings.firebaseAuth.platformBrowserMessagechannelMod.Status
       with typings.firebaseAuth.messagechannelMod.Status
       with typings.firebaseAuth.distSrcPlatformBrowserMessagechannelMod.Status
       with typings.firebaseAuth.nodeSrcPlatformBrowserMessagechannelMod.Status
       with typings.firebaseAuth.nodeEsmSrcPlatformBrowserMessagechannelMod.Status
  inline def ack_ : ack_ = "ack".asInstanceOf[ack_]
  
  @js.native
  sealed trait `admin-restricted-operation`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `admin-restricted-operation`: `admin-restricted-operation` = "admin-restricted-operation".asInstanceOf[`admin-restricted-operation`]
  
  @js.native
  sealed trait `already-initialized`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `already-initialized`: `already-initialized` = "already-initialized".asInstanceOf[`already-initialized`]
  
  @js.native
  sealed trait anonymous
    extends StObject
       with ProviderId
       with typings.firebaseAuth.distSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.modelEnumsMod.ProviderId
       with typings.firebaseAuth.rnSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.nodeSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.srcModelEnumsMod.ProviderId
       with typings.firebaseAuth.enumsMod.ProviderId
       with ProviderId2
       with SignInMethod
       with typings.firebaseAuth.distSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.modelEnumsMod.SignInMethod
       with typings.firebaseAuth.rnSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.nodeSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.srcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.enumsMod.SignInMethod
  inline def anonymous: anonymous = "anonymous".asInstanceOf[anonymous]
  
  @js.native
  sealed trait `app-deleted`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `app-deleted`: `app-deleted` = "app-deleted".asInstanceOf[`app-deleted`]
  
  @js.native
  sealed trait `app-not-authorized`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `app-not-authorized`: `app-not-authorized` = "app-not-authorized".asInstanceOf[`app-not-authorized`]
  
  @js.native
  sealed trait `app-not-installed`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `app-not-installed`: `app-not-installed` = "app-not-installed".asInstanceOf[`app-not-installed`]
  
  @js.native
  sealed trait appName extends StObject
  inline def appName: appName = "appName".asInstanceOf[appName]
  
  @js.native
  sealed trait `argument-error`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `argument-error`: `argument-error` = "argument-error".asInstanceOf[`argument-error`]
  
  @js.native
  sealed trait auth
    extends StObject
       with ComponentName
       with typings.firebaseAuth.registerMod.ComponentName
       with typings.firebaseAuth.distSrcCoreAuthRegisterMod.ComponentName
       with typings.firebaseAuth.rnSrcCoreAuthRegisterMod.ComponentName
       with typings.firebaseAuth.authRegisterMod.ComponentName
       with typings.firebaseAuth.srcCoreAuthRegisterMod.ComponentName
       with typings.firebaseAuth.nodeSrcCoreAuthRegisterMod.ComponentName
  inline def auth: auth = "auth".asInstanceOf[auth]
  
  @js.native
  sealed trait `auth-domain-config-required`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `auth-domain-config-required`: `auth-domain-config-required` = "auth-domain-config-required".asInstanceOf[`auth-domain-config-required`]
  
  @js.native
  sealed trait `auth-internal`
    extends StObject
       with ComponentName
       with typings.firebaseAuth.registerMod.ComponentName
       with typings.firebaseAuth.distSrcCoreAuthRegisterMod.ComponentName
       with typings.firebaseAuth.rnSrcCoreAuthRegisterMod.ComponentName
       with typings.firebaseAuth.authRegisterMod.ComponentName
       with typings.firebaseAuth.srcCoreAuthRegisterMod.ComponentName
       with typings.firebaseAuth.nodeSrcCoreAuthRegisterMod.ComponentName
  inline def `auth-internal`: `auth-internal` = "auth-internal".asInstanceOf[`auth-internal`]
  
  @js.native
  sealed trait authEvent
    extends StObject
       with KeyName
       with typings.firebaseAuth.distSrcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.srcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.persistenceUserManagerMod.KeyName
       with typings.firebaseAuth.rnSrcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.nodeSrcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.persistencePersistenceUserManagerMod.KeyName
  inline def authEvent: authEvent = "authEvent".asInstanceOf[authEvent]
  
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
  sealed trait `authSlashinvalid-recipient-email` extends StObject
  inline def `authSlashinvalid-recipient-email`: `authSlashinvalid-recipient-email` = "auth/invalid-recipient-email".asInstanceOf[`authSlashinvalid-recipient-email`]
  
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
  sealed trait authUser
    extends StObject
       with KeyName
       with typings.firebaseAuth.distSrcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.srcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.persistenceUserManagerMod.KeyName
       with typings.firebaseAuth.rnSrcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.nodeSrcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.persistencePersistenceUserManagerMod.KeyName
  inline def authUser: authUser = "authUser".asInstanceOf[authUser]
  
  @js.native
  sealed trait `cancelled-popup-request`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `cancelled-popup-request`: `cancelled-popup-request` = "cancelled-popup-request".asInstanceOf[`cancelled-popup-request`]
  
  @js.native
  sealed trait `captcha-check-failed`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `captcha-check-failed`: `captcha-check-failed` = "captcha-check-failed".asInstanceOf[`captcha-check-failed`]
  
  @js.native
  sealed trait `code-expired`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `code-expired`: `code-expired` = "code-expired".asInstanceOf[`code-expired`]
  
  @js.native
  sealed trait connection_closed
    extends StObject
       with MessageError
       with typings.firebaseAuth.rnSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.platformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.messagechannelMod.MessageError
       with typings.firebaseAuth.distSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.nodeSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.nodeEsmSrcPlatformBrowserMessagechannelMod.MessageError
  inline def connection_closed: connection_closed = "connection_closed".asInstanceOf[connection_closed]
  
  @js.native
  sealed trait connection_unavailable
    extends StObject
       with MessageError
       with typings.firebaseAuth.rnSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.platformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.messagechannelMod.MessageError
       with typings.firebaseAuth.distSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.nodeSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.nodeEsmSrcPlatformBrowserMessagechannelMod.MessageError
  inline def connection_unavailable: connection_unavailable = "connection_unavailable".asInstanceOf[connection_unavailable]
  
  @js.native
  sealed trait `cordova-not-ready`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `cordova-not-ready`: `cordova-not-ready` = "cordova-not-ready".asInstanceOf[`cordova-not-ready`]
  
  @js.native
  sealed trait `cors-unsupported`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `cors-unsupported`: `cors-unsupported` = "cors-unsupported".asInstanceOf[`cors-unsupported`]
  
  @js.native
  sealed trait `credential-already-in-use`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `credential-already-in-use`: `credential-already-in-use` = "credential-already-in-use".asInstanceOf[`credential-already-in-use`]
  
  @js.native
  sealed trait custom
    extends StObject
       with ProviderId
       with typings.firebaseAuth.distSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.modelEnumsMod.ProviderId
       with typings.firebaseAuth.rnSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.nodeSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.srcModelEnumsMod.ProviderId
       with typings.firebaseAuth.enumsMod.ProviderId
       with ProviderId2
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait `custom-token-mismatch`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `custom-token-mismatch`: `custom-token-mismatch` = "custom-token-mismatch".asInstanceOf[`custom-token-mismatch`]
  
  @js.native
  sealed trait `dependent-sdk-initialized-before-auth`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `dependent-sdk-initialized-before-auth`: `dependent-sdk-initialized-before-auth` = "dependent-sdk-initialized-before-auth".asInstanceOf[`dependent-sdk-initialized-before-auth`]
  
  @js.native
  sealed trait done
    extends StObject
       with Status
       with typings.firebaseAuth.rnSrcPlatformBrowserMessagechannelMod.Status
       with typings.firebaseAuth.platformBrowserMessagechannelMod.Status
       with typings.firebaseAuth.messagechannelMod.Status
       with typings.firebaseAuth.distSrcPlatformBrowserMessagechannelMod.Status
       with typings.firebaseAuth.nodeSrcPlatformBrowserMessagechannelMod.Status
       with typings.firebaseAuth.nodeEsmSrcPlatformBrowserMessagechannelMod.Status
  inline def done: done = "done".asInstanceOf[done]
  
  @js.native
  sealed trait `dynamic-link-not-activated`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `dynamic-link-not-activated`: `dynamic-link-not-activated` = "dynamic-link-not-activated".asInstanceOf[`dynamic-link-not-activated`]
  
  @js.native
  sealed trait `email-already-in-use`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `email-already-in-use`: `email-already-in-use` = "email-already-in-use".asInstanceOf[`email-already-in-use`]
  
  @js.native
  sealed trait `email-change-needs-verification`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `email-change-needs-verification`: `email-change-needs-verification` = "email-change-needs-verification".asInstanceOf[`email-change-needs-verification`]
  
  @js.native
  sealed trait emailLink
    extends StObject
       with SignInMethod
       with typings.firebaseAuth.distSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.modelEnumsMod.SignInMethod
       with typings.firebaseAuth.rnSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.nodeSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.srcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.enumsMod.SignInMethod
  inline def emailLink: emailLink = "emailLink".asInstanceOf[emailLink]
  
  @js.native
  sealed trait `emulator-config-failed`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `emulator-config-failed`: `emulator-config-failed` = "emulator-config-failed".asInstanceOf[`emulator-config-failed`]
  
  @js.native
  sealed trait enroll
    extends StObject
       with MultiFactorSessionType
       with typings.firebaseAuth.mfaSessionMod.MultiFactorSessionType
       with typings.firebaseAuth.distSrcMfaMfaSessionMod.MultiFactorSessionType
       with typings.firebaseAuth.mfaMfaSessionMod.MultiFactorSessionType
       with typings.firebaseAuth.nodeEsmSrcMfaMfaSessionMod.MultiFactorSessionType
       with typings.firebaseAuth.srcMfaMfaSessionMod.MultiFactorSessionType
       with typings.firebaseAuth.nodeSrcMfaMfaSessionMod.MultiFactorSessionType
  inline def enroll: enroll = "enroll".asInstanceOf[enroll]
  
  @js.native
  sealed trait `expired-action-code`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `expired-action-code`: `expired-action-code` = "expired-action-code".asInstanceOf[`expired-action-code`]
  
  @js.native
  sealed trait facebookDotcom
    extends StObject
       with ProviderId
       with typings.firebaseAuth.distSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.modelEnumsMod.ProviderId
       with typings.firebaseAuth.rnSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.nodeSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.srcModelEnumsMod.ProviderId
       with typings.firebaseAuth.enumsMod.ProviderId
       with ProviderId2
       with SignInMethod
       with typings.firebaseAuth.distSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.modelEnumsMod.SignInMethod
       with typings.firebaseAuth.rnSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.nodeSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.srcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.enumsMod.SignInMethod
  inline def facebookDotcom: facebookDotcom = "facebook.com".asInstanceOf[facebookDotcom]
  
  @js.native
  sealed trait firebase
    extends StObject
       with ProviderId
       with typings.firebaseAuth.distSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.modelEnumsMod.ProviderId
       with typings.firebaseAuth.rnSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.nodeSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.srcModelEnumsMod.ProviderId
       with typings.firebaseAuth.enumsMod.ProviderId
       with ProviderId2
  inline def firebase: firebase = "firebase".asInstanceOf[firebase]
  
  @js.native
  sealed trait gapiDotiframes extends StObject
  inline def gapiDotiframes: gapiDotiframes = "gapi.iframes".asInstanceOf[gapiDotiframes]
  
  @js.native
  sealed trait githubDotcom
    extends StObject
       with ProviderId
       with typings.firebaseAuth.distSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.modelEnumsMod.ProviderId
       with typings.firebaseAuth.rnSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.nodeSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.srcModelEnumsMod.ProviderId
       with typings.firebaseAuth.enumsMod.ProviderId
       with ProviderId2
       with SignInMethod
       with typings.firebaseAuth.distSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.modelEnumsMod.SignInMethod
       with typings.firebaseAuth.rnSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.nodeSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.srcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.enumsMod.SignInMethod
  inline def githubDotcom: githubDotcom = "github.com".asInstanceOf[githubDotcom]
  
  @js.native
  sealed trait googleDotcom
    extends StObject
       with ProviderId
       with typings.firebaseAuth.distSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.modelEnumsMod.ProviderId
       with typings.firebaseAuth.rnSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.nodeSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.srcModelEnumsMod.ProviderId
       with typings.firebaseAuth.enumsMod.ProviderId
       with ProviderId2
       with SignInMethod
       with typings.firebaseAuth.distSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.modelEnumsMod.SignInMethod
       with typings.firebaseAuth.rnSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.nodeSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.srcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.enumsMod.SignInMethod
  inline def googleDotcom: googleDotcom = "google.com".asInstanceOf[googleDotcom]
  
  @js.native
  sealed trait https
    extends StObject
       with DefaultConfig
       with typings.firebaseAuth.rnSrcCoreAuthAuthImplMod.DefaultConfig
       with typings.firebaseAuth.authAuthImplMod.DefaultConfig
       with typings.firebaseAuth.srcCoreAuthAuthImplMod.DefaultConfig
       with typings.firebaseAuth.authImplMod.DefaultConfig
       with typings.firebaseAuth.distSrcCoreAuthAuthImplMod.DefaultConfig
       with typings.firebaseAuth.nodeSrcCoreAuthAuthImplMod.DefaultConfig
  inline def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait identitytoolkitDotgoogleapisDotcom
    extends StObject
       with DefaultConfig
       with typings.firebaseAuth.rnSrcCoreAuthAuthImplMod.DefaultConfig
       with typings.firebaseAuth.authAuthImplMod.DefaultConfig
       with typings.firebaseAuth.srcCoreAuthAuthImplMod.DefaultConfig
       with typings.firebaseAuth.authImplMod.DefaultConfig
       with typings.firebaseAuth.distSrcCoreAuthAuthImplMod.DefaultConfig
       with typings.firebaseAuth.nodeSrcCoreAuthAuthImplMod.DefaultConfig
  inline def identitytoolkitDotgoogleapisDotcom: identitytoolkitDotgoogleapisDotcom = "identitytoolkit.googleapis.com".asInstanceOf[identitytoolkitDotgoogleapisDotcom]
  
  @js.native
  sealed trait identitytoolkitNumbersignCreateAuthUriResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignCreateAuthUriResponse: identitytoolkitNumbersignCreateAuthUriResponse = "identitytoolkit#CreateAuthUriResponse".asInstanceOf[identitytoolkitNumbersignCreateAuthUriResponse]
  
  @js.native
  sealed trait identitytoolkitNumbersignDeleteAccountResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignDeleteAccountResponse: identitytoolkitNumbersignDeleteAccountResponse = "identitytoolkit#DeleteAccountResponse".asInstanceOf[identitytoolkitNumbersignDeleteAccountResponse]
  
  @js.native
  sealed trait identitytoolkitNumbersignDownloadAccountResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignDownloadAccountResponse: identitytoolkitNumbersignDownloadAccountResponse = "identitytoolkit#DownloadAccountResponse".asInstanceOf[identitytoolkitNumbersignDownloadAccountResponse]
  
  @js.native
  sealed trait identitytoolkitNumbersignEmailLinkSigninResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignEmailLinkSigninResponse: identitytoolkitNumbersignEmailLinkSigninResponse = "identitytoolkit#EmailLinkSigninResponse".asInstanceOf[identitytoolkitNumbersignEmailLinkSigninResponse]
  
  @js.native
  sealed trait identitytoolkitNumbersignGetAccountInfoResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignGetAccountInfoResponse: identitytoolkitNumbersignGetAccountInfoResponse = "identitytoolkit#GetAccountInfoResponse".asInstanceOf[identitytoolkitNumbersignGetAccountInfoResponse]
  
  @js.native
  sealed trait identitytoolkitNumbersignGetOobConfirmationCodeResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignGetOobConfirmationCodeResponse: identitytoolkitNumbersignGetOobConfirmationCodeResponse = "identitytoolkit#GetOobConfirmationCodeResponse".asInstanceOf[identitytoolkitNumbersignGetOobConfirmationCodeResponse]
  
  @js.native
  sealed trait identitytoolkitNumbersignGetRecaptchaParamResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignGetRecaptchaParamResponse: identitytoolkitNumbersignGetRecaptchaParamResponse = "identitytoolkit#GetRecaptchaParamResponse".asInstanceOf[identitytoolkitNumbersignGetRecaptchaParamResponse]
  
  @js.native
  sealed trait identitytoolkitNumbersignResetPasswordResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignResetPasswordResponse: identitytoolkitNumbersignResetPasswordResponse = "identitytoolkit#ResetPasswordResponse".asInstanceOf[identitytoolkitNumbersignResetPasswordResponse]
  
  @js.native
  sealed trait identitytoolkitNumbersignSetAccountInfoResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignSetAccountInfoResponse: identitytoolkitNumbersignSetAccountInfoResponse = "identitytoolkit#SetAccountInfoResponse".asInstanceOf[identitytoolkitNumbersignSetAccountInfoResponse]
  
  @js.native
  sealed trait identitytoolkitNumbersignSignupNewUserResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignSignupNewUserResponse: identitytoolkitNumbersignSignupNewUserResponse = "identitytoolkit#SignupNewUserResponse".asInstanceOf[identitytoolkitNumbersignSignupNewUserResponse]
  
  @js.native
  sealed trait identitytoolkitNumbersignUploadAccountResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignUploadAccountResponse: identitytoolkitNumbersignUploadAccountResponse = "identitytoolkit#UploadAccountResponse".asInstanceOf[identitytoolkitNumbersignUploadAccountResponse]
  
  @js.native
  sealed trait identitytoolkitNumbersignVerifyAssertionResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignVerifyAssertionResponse: identitytoolkitNumbersignVerifyAssertionResponse = "identitytoolkit#VerifyAssertionResponse".asInstanceOf[identitytoolkitNumbersignVerifyAssertionResponse]
  
  @js.native
  sealed trait identitytoolkitNumbersignVerifyCustomTokenResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignVerifyCustomTokenResponse: identitytoolkitNumbersignVerifyCustomTokenResponse = "identitytoolkit#VerifyCustomTokenResponse".asInstanceOf[identitytoolkitNumbersignVerifyCustomTokenResponse]
  
  @js.native
  sealed trait identitytoolkitNumbersignVerifyPasswordResponse
    extends StObject
       with IdTokenResponseKind
       with typings.firebaseAuth.idTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.modelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.authMod.IdTokenResponseKind
       with typings.firebaseAuth.srcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeEsmSrcModelIdTokenMod.IdTokenResponseKind
       with typings.firebaseAuth.nodeSrcModelIdTokenMod.IdTokenResponseKind
  inline def identitytoolkitNumbersignVerifyPasswordResponse: identitytoolkitNumbersignVerifyPasswordResponse = "identitytoolkit#VerifyPasswordResponse".asInstanceOf[identitytoolkitNumbersignVerifyPasswordResponse]
  
  @js.native
  sealed trait `internal-error`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `internal-error`: `internal-error` = "internal-error".asInstanceOf[`internal-error`]
  
  @js.native
  sealed trait `invalid-action-code`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-action-code`: `invalid-action-code` = "invalid-action-code".asInstanceOf[`invalid-action-code`]
  
  @js.native
  sealed trait `invalid-api-key`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-api-key`: `invalid-api-key` = "invalid-api-key".asInstanceOf[`invalid-api-key`]
  
  @js.native
  sealed trait `invalid-app-credential`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-app-credential`: `invalid-app-credential` = "invalid-app-credential".asInstanceOf[`invalid-app-credential`]
  
  @js.native
  sealed trait `invalid-app-id`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-app-id`: `invalid-app-id` = "invalid-app-id".asInstanceOf[`invalid-app-id`]
  
  @js.native
  sealed trait `invalid-auth-event`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-auth-event`: `invalid-auth-event` = "invalid-auth-event".asInstanceOf[`invalid-auth-event`]
  
  @js.native
  sealed trait `invalid-cert-hash`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-cert-hash`: `invalid-cert-hash` = "invalid-cert-hash".asInstanceOf[`invalid-cert-hash`]
  
  @js.native
  sealed trait `invalid-continue-uri`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-continue-uri`: `invalid-continue-uri` = "invalid-continue-uri".asInstanceOf[`invalid-continue-uri`]
  
  @js.native
  sealed trait `invalid-cordova-configuration`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-cordova-configuration`: `invalid-cordova-configuration` = "invalid-cordova-configuration".asInstanceOf[`invalid-cordova-configuration`]
  
  @js.native
  sealed trait `invalid-credential`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-credential`: `invalid-credential` = "invalid-credential".asInstanceOf[`invalid-credential`]
  
  @js.native
  sealed trait `invalid-custom-token`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-custom-token`: `invalid-custom-token` = "invalid-custom-token".asInstanceOf[`invalid-custom-token`]
  
  @js.native
  sealed trait `invalid-dynamic-link-domain`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-dynamic-link-domain`: `invalid-dynamic-link-domain` = "invalid-dynamic-link-domain".asInstanceOf[`invalid-dynamic-link-domain`]
  
  @js.native
  sealed trait `invalid-email`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-email`: `invalid-email` = "invalid-email".asInstanceOf[`invalid-email`]
  
  @js.native
  sealed trait `invalid-emulator-scheme`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-emulator-scheme`: `invalid-emulator-scheme` = "invalid-emulator-scheme".asInstanceOf[`invalid-emulator-scheme`]
  
  @js.native
  sealed trait `invalid-message-payload`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-message-payload`: `invalid-message-payload` = "invalid-message-payload".asInstanceOf[`invalid-message-payload`]
  
  @js.native
  sealed trait `invalid-multi-factor-session`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-multi-factor-session`: `invalid-multi-factor-session` = "invalid-multi-factor-session".asInstanceOf[`invalid-multi-factor-session`]
  
  @js.native
  sealed trait `invalid-oauth-client-id`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-oauth-client-id`: `invalid-oauth-client-id` = "invalid-oauth-client-id".asInstanceOf[`invalid-oauth-client-id`]
  
  @js.native
  sealed trait `invalid-oauth-provider`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-oauth-provider`: `invalid-oauth-provider` = "invalid-oauth-provider".asInstanceOf[`invalid-oauth-provider`]
  
  @js.native
  sealed trait `invalid-persistence-type`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-persistence-type`: `invalid-persistence-type` = "invalid-persistence-type".asInstanceOf[`invalid-persistence-type`]
  
  @js.native
  sealed trait `invalid-phone-number`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-phone-number`: `invalid-phone-number` = "invalid-phone-number".asInstanceOf[`invalid-phone-number`]
  
  @js.native
  sealed trait `invalid-provider-id`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-provider-id`: `invalid-provider-id` = "invalid-provider-id".asInstanceOf[`invalid-provider-id`]
  
  @js.native
  sealed trait `invalid-recipient-email`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-recipient-email`: `invalid-recipient-email` = "invalid-recipient-email".asInstanceOf[`invalid-recipient-email`]
  
  @js.native
  sealed trait `invalid-sender`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-sender`: `invalid-sender` = "invalid-sender".asInstanceOf[`invalid-sender`]
  
  @js.native
  sealed trait `invalid-tenant-id`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-tenant-id`: `invalid-tenant-id` = "invalid-tenant-id".asInstanceOf[`invalid-tenant-id`]
  
  @js.native
  sealed trait `invalid-user-token`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-user-token`: `invalid-user-token` = "invalid-user-token".asInstanceOf[`invalid-user-token`]
  
  @js.native
  sealed trait `invalid-verification-code`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-verification-code`: `invalid-verification-code` = "invalid-verification-code".asInstanceOf[`invalid-verification-code`]
  
  @js.native
  sealed trait `invalid-verification-id`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `invalid-verification-id`: `invalid-verification-id` = "invalid-verification-id".asInstanceOf[`invalid-verification-id`]
  
  @js.native
  sealed trait invalid_response
    extends StObject
       with MessageError
       with typings.firebaseAuth.rnSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.platformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.messagechannelMod.MessageError
       with typings.firebaseAuth.distSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.nodeSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.nodeEsmSrcPlatformBrowserMessagechannelMod.MessageError
  inline def invalid_response: invalid_response = "invalid_response".asInstanceOf[invalid_response]
  
  @js.native
  sealed trait keyChanged
    extends StObject
       with EventType
       with typings.firebaseAuth.rnSrcPlatformBrowserMessagechannelMod.EventType
       with typings.firebaseAuth.platformBrowserMessagechannelMod.EventType
       with typings.firebaseAuth.messagechannelMod.EventType
       with typings.firebaseAuth.distSrcPlatformBrowserMessagechannelMod.EventType
       with typings.firebaseAuth.nodeSrcPlatformBrowserMessagechannelMod.EventType
       with typings.firebaseAuth.nodeEsmSrcPlatformBrowserMessagechannelMod.EventType
  inline def keyChanged: keyChanged = "keyChanged".asInstanceOf[keyChanged]
  
  @js.native
  sealed trait link
    extends StObject
       with OperationType
       with typings.firebaseAuth.distSrcModelEnumsMod.OperationType
       with typings.firebaseAuth.modelEnumsMod.OperationType
       with typings.firebaseAuth.rnSrcModelEnumsMod.OperationType
       with typings.firebaseAuth.nodeSrcModelEnumsMod.OperationType
       with typings.firebaseAuth.srcModelEnumsMod.OperationType
       with typings.firebaseAuth.enumsMod.OperationType
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait linkViaPopup
    extends StObject
       with AuthEventType
       with typings.firebaseAuth.modelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.srcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.rnSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeEsmSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.authMod.AuthEventType
       with typings.firebaseAuth.popupRedirectMod.AuthEventType
  inline def linkViaPopup: linkViaPopup = "linkViaPopup".asInstanceOf[linkViaPopup]
  
  @js.native
  sealed trait linkViaRedirect
    extends StObject
       with AuthEventType
       with typings.firebaseAuth.modelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.srcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.rnSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeEsmSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.authMod.AuthEventType
       with typings.firebaseAuth.popupRedirectMod.AuthEventType
  inline def linkViaRedirect: linkViaRedirect = "linkViaRedirect".asInstanceOf[linkViaRedirect]
  
  @js.native
  sealed trait `login-blocked`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `login-blocked`: `login-blocked` = "login-blocked".asInstanceOf[`login-blocked`]
  
  @js.native
  sealed trait `maximum-second-factor-count-exceeded`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `maximum-second-factor-count-exceeded`: `maximum-second-factor-count-exceeded` = "maximum-second-factor-count-exceeded".asInstanceOf[`maximum-second-factor-count-exceeded`]
  
  @js.native
  sealed trait `missing-android-pkg-name`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `missing-android-pkg-name`: `missing-android-pkg-name` = "missing-android-pkg-name".asInstanceOf[`missing-android-pkg-name`]
  
  @js.native
  sealed trait `missing-app-credential`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `missing-app-credential`: `missing-app-credential` = "missing-app-credential".asInstanceOf[`missing-app-credential`]
  
  @js.native
  sealed trait `missing-continue-uri`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `missing-continue-uri`: `missing-continue-uri` = "missing-continue-uri".asInstanceOf[`missing-continue-uri`]
  
  @js.native
  sealed trait `missing-iframe-start`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `missing-iframe-start`: `missing-iframe-start` = "missing-iframe-start".asInstanceOf[`missing-iframe-start`]
  
  @js.native
  sealed trait `missing-ios-bundle-id`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `missing-ios-bundle-id`: `missing-ios-bundle-id` = "missing-ios-bundle-id".asInstanceOf[`missing-ios-bundle-id`]
  
  @js.native
  sealed trait `missing-multi-factor-info`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `missing-multi-factor-info`: `missing-multi-factor-info` = "missing-multi-factor-info".asInstanceOf[`missing-multi-factor-info`]
  
  @js.native
  sealed trait `missing-multi-factor-session`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `missing-multi-factor-session`: `missing-multi-factor-session` = "missing-multi-factor-session".asInstanceOf[`missing-multi-factor-session`]
  
  @js.native
  sealed trait `missing-or-invalid-nonce`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `missing-or-invalid-nonce`: `missing-or-invalid-nonce` = "missing-or-invalid-nonce".asInstanceOf[`missing-or-invalid-nonce`]
  
  @js.native
  sealed trait `missing-phone-number`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `missing-phone-number`: `missing-phone-number` = "missing-phone-number".asInstanceOf[`missing-phone-number`]
  
  @js.native
  sealed trait `missing-verification-code`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `missing-verification-code`: `missing-verification-code` = "missing-verification-code".asInstanceOf[`missing-verification-code`]
  
  @js.native
  sealed trait `missing-verification-id`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `missing-verification-id`: `missing-verification-id` = "missing-verification-id".asInstanceOf[`missing-verification-id`]
  
  @js.native
  sealed trait `multi-factor-auth-required`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `multi-factor-auth-required`: `multi-factor-auth-required` = "multi-factor-auth-required".asInstanceOf[`multi-factor-auth-required`]
  
  @js.native
  sealed trait `multi-factor-info-not-found`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `multi-factor-info-not-found`: `multi-factor-info-not-found` = "multi-factor-info-not-found".asInstanceOf[`multi-factor-info-not-found`]
  
  @js.native
  sealed trait `network-request-failed`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `network-request-failed`: `network-request-failed` = "network-request-failed".asInstanceOf[`network-request-failed`]
  
  @js.native
  sealed trait `no-auth-event`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `no-auth-event`: `no-auth-event` = "no-auth-event".asInstanceOf[`no-auth-event`]
  
  @js.native
  sealed trait `no-such-provider`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `no-such-provider`: `no-such-provider` = "no-such-provider".asInstanceOf[`no-such-provider`]
  
  @js.native
  sealed trait `null-user`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `null-user`: `null-user` = "null-user".asInstanceOf[`null-user`]
  
  @js.native
  sealed trait `operation-not-allowed`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `operation-not-allowed`: `operation-not-allowed` = "operation-not-allowed".asInstanceOf[`operation-not-allowed`]
  
  @js.native
  sealed trait `operation-not-supported-in-this-environment`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `operation-not-supported-in-this-environment`: `operation-not-supported-in-this-environment` = "operation-not-supported-in-this-environment".asInstanceOf[`operation-not-supported-in-this-environment`]
  
  @js.native
  sealed trait password
    extends StObject
       with ProviderId
       with typings.firebaseAuth.distSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.modelEnumsMod.ProviderId
       with typings.firebaseAuth.rnSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.nodeSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.srcModelEnumsMod.ProviderId
       with typings.firebaseAuth.enumsMod.ProviderId
       with ProviderId2
       with SignInMethod
       with typings.firebaseAuth.distSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.modelEnumsMod.SignInMethod
       with typings.firebaseAuth.rnSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.nodeSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.srcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.enumsMod.SignInMethod
  inline def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait persistence
    extends StObject
       with KeyName
       with typings.firebaseAuth.distSrcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.srcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.persistenceUserManagerMod.KeyName
       with typings.firebaseAuth.rnSrcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.nodeSrcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.persistencePersistenceUserManagerMod.KeyName
  inline def persistence: persistence = "persistence".asInstanceOf[persistence]
  
  @js.native
  sealed trait phone
    extends StObject
       with ProviderId
       with typings.firebaseAuth.distSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.modelEnumsMod.ProviderId
       with typings.firebaseAuth.rnSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.nodeSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.srcModelEnumsMod.ProviderId
       with typings.firebaseAuth.enumsMod.ProviderId
       with ProviderId2
       with SignInMethod
       with typings.firebaseAuth.distSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.modelEnumsMod.SignInMethod
       with typings.firebaseAuth.rnSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.nodeSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.srcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.enumsMod.SignInMethod
  inline def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait ping
    extends StObject
       with EventType
       with typings.firebaseAuth.rnSrcPlatformBrowserMessagechannelMod.EventType
       with typings.firebaseAuth.platformBrowserMessagechannelMod.EventType
       with typings.firebaseAuth.messagechannelMod.EventType
       with typings.firebaseAuth.distSrcPlatformBrowserMessagechannelMod.EventType
       with typings.firebaseAuth.nodeSrcPlatformBrowserMessagechannelMod.EventType
       with typings.firebaseAuth.nodeEsmSrcPlatformBrowserMessagechannelMod.EventType
  inline def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait `popup-blocked`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `popup-blocked`: `popup-blocked` = "popup-blocked".asInstanceOf[`popup-blocked`]
  
  @js.native
  sealed trait `popup-closed-by-user`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `popup-closed-by-user`: `popup-closed-by-user` = "popup-closed-by-user".asInstanceOf[`popup-closed-by-user`]
  
  @js.native
  sealed trait `provider-already-linked`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `provider-already-linked`: `provider-already-linked` = "provider-already-linked".asInstanceOf[`provider-already-linked`]
  
  @js.native
  sealed trait `quota-exceeded`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `quota-exceeded`: `quota-exceeded` = "quota-exceeded".asInstanceOf[`quota-exceeded`]
  
  @js.native
  sealed trait reauthViaPopup
    extends StObject
       with AuthEventType
       with typings.firebaseAuth.modelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.srcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.rnSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeEsmSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.authMod.AuthEventType
       with typings.firebaseAuth.popupRedirectMod.AuthEventType
  inline def reauthViaPopup: reauthViaPopup = "reauthViaPopup".asInstanceOf[reauthViaPopup]
  
  @js.native
  sealed trait reauthViaRedirect
    extends StObject
       with AuthEventType
       with typings.firebaseAuth.modelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.srcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.rnSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeEsmSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.authMod.AuthEventType
       with typings.firebaseAuth.popupRedirectMod.AuthEventType
  inline def reauthViaRedirect: reauthViaRedirect = "reauthViaRedirect".asInstanceOf[reauthViaRedirect]
  
  @js.native
  sealed trait reauthenticate
    extends StObject
       with OperationType
       with typings.firebaseAuth.distSrcModelEnumsMod.OperationType
       with typings.firebaseAuth.modelEnumsMod.OperationType
       with typings.firebaseAuth.rnSrcModelEnumsMod.OperationType
       with typings.firebaseAuth.nodeSrcModelEnumsMod.OperationType
       with typings.firebaseAuth.srcModelEnumsMod.OperationType
       with typings.firebaseAuth.enumsMod.OperationType
  inline def reauthenticate: reauthenticate = "reauthenticate".asInstanceOf[reauthenticate]
  
  @js.native
  sealed trait `redirect-cancelled-by-user`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `redirect-cancelled-by-user`: `redirect-cancelled-by-user` = "redirect-cancelled-by-user".asInstanceOf[`redirect-cancelled-by-user`]
  
  @js.native
  sealed trait `redirect-operation-pending`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `redirect-operation-pending`: `redirect-operation-pending` = "redirect-operation-pending".asInstanceOf[`redirect-operation-pending`]
  
  @js.native
  sealed trait redirectUser
    extends StObject
       with KeyName
       with typings.firebaseAuth.distSrcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.srcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.persistenceUserManagerMod.KeyName
       with typings.firebaseAuth.rnSrcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.nodeSrcCorePersistencePersistenceUserManagerMod.KeyName
       with typings.firebaseAuth.persistencePersistenceUserManagerMod.KeyName
  inline def redirectUser: redirectUser = "redirectUser".asInstanceOf[redirectUser]
  
  @js.native
  sealed trait `rejected-credential`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `rejected-credential`: `rejected-credential` = "rejected-credential".asInstanceOf[`rejected-credential`]
  
  @js.native
  sealed trait `requires-recent-login`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `requires-recent-login`: `requires-recent-login` = "requires-recent-login".asInstanceOf[`requires-recent-login`]
  
  @js.native
  sealed trait `second-factor-already-in-use`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `second-factor-already-in-use`: `second-factor-already-in-use` = "second-factor-already-in-use".asInstanceOf[`second-factor-already-in-use`]
  
  @js.native
  sealed trait securetokenDotgoogleapisDotcom
    extends StObject
       with DefaultConfig
       with typings.firebaseAuth.rnSrcCoreAuthAuthImplMod.DefaultConfig
       with typings.firebaseAuth.authAuthImplMod.DefaultConfig
       with typings.firebaseAuth.srcCoreAuthAuthImplMod.DefaultConfig
       with typings.firebaseAuth.authImplMod.DefaultConfig
       with typings.firebaseAuth.distSrcCoreAuthAuthImplMod.DefaultConfig
       with typings.firebaseAuth.nodeSrcCoreAuthAuthImplMod.DefaultConfig
  inline def securetokenDotgoogleapisDotcom: securetokenDotgoogleapisDotcom = "securetoken.googleapis.com".asInstanceOf[securetokenDotgoogleapisDotcom]
  
  @js.native
  sealed trait signIn
    extends StObject
       with OperationType
       with typings.firebaseAuth.distSrcModelEnumsMod.OperationType
       with typings.firebaseAuth.modelEnumsMod.OperationType
       with typings.firebaseAuth.rnSrcModelEnumsMod.OperationType
       with typings.firebaseAuth.nodeSrcModelEnumsMod.OperationType
       with typings.firebaseAuth.srcModelEnumsMod.OperationType
       with typings.firebaseAuth.enumsMod.OperationType
  inline def signIn: signIn = "signIn".asInstanceOf[signIn]
  
  @js.native
  sealed trait signInViaPopup
    extends StObject
       with AuthEventType
       with typings.firebaseAuth.modelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.srcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.rnSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeEsmSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.authMod.AuthEventType
       with typings.firebaseAuth.popupRedirectMod.AuthEventType
  inline def signInViaPopup: signInViaPopup = "signInViaPopup".asInstanceOf[signInViaPopup]
  
  @js.native
  sealed trait signInViaRedirect
    extends StObject
       with AuthEventType
       with typings.firebaseAuth.modelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.srcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.rnSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeEsmSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.authMod.AuthEventType
       with typings.firebaseAuth.popupRedirectMod.AuthEventType
  inline def signInViaRedirect: signInViaRedirect = "signInViaRedirect".asInstanceOf[signInViaRedirect]
  
  @js.native
  sealed trait signin_
    extends StObject
       with MultiFactorSessionType
       with typings.firebaseAuth.mfaSessionMod.MultiFactorSessionType
       with typings.firebaseAuth.distSrcMfaMfaSessionMod.MultiFactorSessionType
       with typings.firebaseAuth.mfaMfaSessionMod.MultiFactorSessionType
       with typings.firebaseAuth.nodeEsmSrcMfaMfaSessionMod.MultiFactorSessionType
       with typings.firebaseAuth.srcMfaMfaSessionMod.MultiFactorSessionType
       with typings.firebaseAuth.nodeSrcMfaMfaSessionMod.MultiFactorSessionType
  inline def signin_ : signin_ = "signin".asInstanceOf[signin_]
  
  @js.native
  sealed trait `tenant-id-mismatch`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `tenant-id-mismatch`: `tenant-id-mismatch` = "tenant-id-mismatch".asInstanceOf[`tenant-id-mismatch`]
  
  @js.native
  sealed trait timeout
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
       with MessageError
       with typings.firebaseAuth.rnSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.platformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.messagechannelMod.MessageError
       with typings.firebaseAuth.distSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.nodeSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.nodeEsmSrcPlatformBrowserMessagechannelMod.MessageError
  inline def timeout: timeout = "timeout".asInstanceOf[timeout]
  
  @js.native
  sealed trait `too-many-requests`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `too-many-requests`: `too-many-requests` = "too-many-requests".asInstanceOf[`too-many-requests`]
  
  @js.native
  sealed trait twitterDotcom
    extends StObject
       with ProviderId
       with typings.firebaseAuth.distSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.modelEnumsMod.ProviderId
       with typings.firebaseAuth.rnSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.nodeSrcModelEnumsMod.ProviderId
       with typings.firebaseAuth.srcModelEnumsMod.ProviderId
       with typings.firebaseAuth.enumsMod.ProviderId
       with ProviderId2
       with SignInMethod
       with typings.firebaseAuth.distSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.modelEnumsMod.SignInMethod
       with typings.firebaseAuth.rnSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.nodeSrcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.srcModelEnumsMod.SignInMethod
       with typings.firebaseAuth.enumsMod.SignInMethod
  inline def twitterDotcom: twitterDotcom = "twitter.com".asInstanceOf[twitterDotcom]
  
  @js.native
  sealed trait `unauthorized-continue-uri`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `unauthorized-continue-uri`: `unauthorized-continue-uri` = "unauthorized-continue-uri".asInstanceOf[`unauthorized-continue-uri`]
  
  @js.native
  sealed trait `unauthorized-domain`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `unauthorized-domain`: `unauthorized-domain` = "unauthorized-domain".asInstanceOf[`unauthorized-domain`]
  
  @js.native
  sealed trait unknown
    extends StObject
       with AuthEventType
       with typings.firebaseAuth.modelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.srcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.rnSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeEsmSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.authMod.AuthEventType
       with typings.firebaseAuth.popupRedirectMod.AuthEventType
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait unknown_error
    extends StObject
       with MessageError
       with typings.firebaseAuth.rnSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.platformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.messagechannelMod.MessageError
       with typings.firebaseAuth.distSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.nodeSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.nodeEsmSrcPlatformBrowserMessagechannelMod.MessageError
  inline def unknown_error: unknown_error = "unknown_error".asInstanceOf[unknown_error]
  
  @js.native
  sealed trait `unsupported-first-factor`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `unsupported-first-factor`: `unsupported-first-factor` = "unsupported-first-factor".asInstanceOf[`unsupported-first-factor`]
  
  @js.native
  sealed trait `unsupported-persistence-type`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `unsupported-persistence-type`: `unsupported-persistence-type` = "unsupported-persistence-type".asInstanceOf[`unsupported-persistence-type`]
  
  @js.native
  sealed trait `unsupported-tenant-operation`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `unsupported-tenant-operation`: `unsupported-tenant-operation` = "unsupported-tenant-operation".asInstanceOf[`unsupported-tenant-operation`]
  
  @js.native
  sealed trait unsupported_event
    extends StObject
       with MessageError
       with typings.firebaseAuth.rnSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.platformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.messagechannelMod.MessageError
       with typings.firebaseAuth.distSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.nodeSrcPlatformBrowserMessagechannelMod.MessageError
       with typings.firebaseAuth.nodeEsmSrcPlatformBrowserMessagechannelMod.MessageError
  inline def unsupported_event: unsupported_event = "unsupported_event".asInstanceOf[unsupported_event]
  
  @js.native
  sealed trait `unverified-email`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `unverified-email`: `unverified-email` = "unverified-email".asInstanceOf[`unverified-email`]
  
  @js.native
  sealed trait `user-cancelled`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `user-cancelled`: `user-cancelled` = "user-cancelled".asInstanceOf[`user-cancelled`]
  
  @js.native
  sealed trait `user-disabled`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `user-disabled`: `user-disabled` = "user-disabled".asInstanceOf[`user-disabled`]
  
  @js.native
  sealed trait `user-mismatch`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `user-mismatch`: `user-mismatch` = "user-mismatch".asInstanceOf[`user-mismatch`]
  
  @js.native
  sealed trait `user-not-found`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `user-not-found`: `user-not-found` = "user-not-found".asInstanceOf[`user-not-found`]
  
  @js.native
  sealed trait `user-signed-out`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `user-signed-out`: `user-signed-out` = "user-signed-out".asInstanceOf[`user-signed-out`]
  
  @js.native
  sealed trait `user-token-expired`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `user-token-expired`: `user-token-expired` = "user-token-expired".asInstanceOf[`user-token-expired`]
  
  @js.native
  sealed trait verifyApp
    extends StObject
       with AuthEventType
       with typings.firebaseAuth.modelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.srcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.rnSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeEsmSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.nodeSrcModelPopupRedirectMod.AuthEventType
       with typings.firebaseAuth.authMod.AuthEventType
       with typings.firebaseAuth.popupRedirectMod.AuthEventType
  inline def verifyApp: verifyApp = "verifyApp".asInstanceOf[verifyApp]
  
  @js.native
  sealed trait `weak-password`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `weak-password`: `weak-password` = "weak-password".asInstanceOf[`weak-password`]
  
  @js.native
  sealed trait `web-storage-unsupported`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `web-storage-unsupported`: `web-storage-unsupported` = "web-storage-unsupported".asInstanceOf[`web-storage-unsupported`]
  
  @js.native
  sealed trait `wrong-password`
    extends StObject
       with AuthErrorCode
       with typings.firebaseAuth.rnSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeEsmSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.srcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.nodeSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.distSrcCoreErrorsMod.AuthErrorCode
       with typings.firebaseAuth.authMod.AuthErrorCode
       with typings.firebaseAuth.esm5SrcCoreErrorsMod.AuthErrorCode
  inline def `wrong-password`: `wrong-password` = "wrong-password".asInstanceOf[`wrong-password`]
}
