package typings.firebaseAdmin

import typings.firebaseAdmin.apiRequestMod.HttpMethod
import typings.firebaseAdmin.appCheckApiClientInternalMod.AppCheckErrorCode
import typings.firebaseAdmin.authConfigMod.MultiFactorConfigState
import typings.firebaseAdmin.errorMod.ProjectManagementErrorCode
import typings.firebaseAdmin.eventarcUtilsMod.EventarcErrorCode
import typings.firebaseAdmin.functionsApiClientInternalMod.FunctionsErrorCode
import typings.firebaseAdmin.machineLearningUtilsMod.MachineLearningErrorCode
import typings.firebaseAdmin.remoteConfigApiClientInternalMod.RemoteConfigErrorCode
import typings.firebaseAdmin.remoteConfigApiMod.ParameterValueType
import typings.firebaseAdmin.remoteConfigApiMod.TagColor
import typings.firebaseAdmin.securityRulesInternalMod.SecurityRulesErrorCode
import typings.firebaseAdmin.userImportBuilderMod.HashAlgorithmType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseAdminStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `1Dot0` extends StObject
  inline def `1Dot0`: `1Dot0` = "1.0".asInstanceOf[`1Dot0`]
  
  @js.native
  sealed trait ADMIN_SDK_NODE extends StObject
  inline def ADMIN_SDK_NODE: ADMIN_SDK_NODE = "ADMIN_SDK_NODE".asInstanceOf[ADMIN_SDK_NODE]
  
  @js.native
  sealed trait BCRYPT
    extends StObject
       with HashAlgorithmType
  inline def BCRYPT: BCRYPT = "BCRYPT".asInstanceOf[BCRYPT]
  
  @js.native
  sealed trait BLUE
    extends StObject
       with TagColor
  inline def BLUE: BLUE = "BLUE".asInstanceOf[BLUE]
  
  @js.native
  sealed trait BOOLEAN
    extends StObject
       with ParameterValueType
  inline def BOOLEAN: BOOLEAN = "BOOLEAN".asInstanceOf[BOOLEAN]
  
  @js.native
  sealed trait BROWN
    extends StObject
       with TagColor
  inline def BROWN: BROWN = "BROWN".asInstanceOf[BROWN]
  
  @js.native
  sealed trait CONSOLE extends StObject
  inline def CONSOLE: CONSOLE = "CONSOLE".asInstanceOf[CONSOLE]
  
  @js.native
  sealed trait CYAN
    extends StObject
       with TagColor
  inline def CYAN: CYAN = "CYAN".asInstanceOf[CYAN]
  
  @js.native
  sealed trait DEEP_ORANGE
    extends StObject
       with TagColor
  inline def DEEP_ORANGE: DEEP_ORANGE = "DEEP_ORANGE".asInstanceOf[DEEP_ORANGE]
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HttpMethod
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait DISABLED
    extends StObject
       with MultiFactorConfigState
  inline def DISABLED: DISABLED = "DISABLED".asInstanceOf[DISABLED]
  
  @js.native
  sealed trait ENABLED
    extends StObject
       with MultiFactorConfigState
  inline def ENABLED: ENABLED = "ENABLED".asInstanceOf[ENABLED]
  
  @js.native
  sealed trait FORCED_UPDATE extends StObject
  inline def FORCED_UPDATE: FORCED_UPDATE = "FORCED_UPDATE".asInstanceOf[FORCED_UPDATE]
  
  @js.native
  sealed trait GET
    extends StObject
       with HttpMethod
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait GREEN
    extends StObject
       with TagColor
  inline def GREEN: GREEN = "GREEN".asInstanceOf[GREEN]
  
  @js.native
  sealed trait HEAD
    extends StObject
       with HttpMethod
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait HMAC_MD5
    extends StObject
       with HashAlgorithmType
  inline def HMAC_MD5: HMAC_MD5 = "HMAC_MD5".asInstanceOf[HMAC_MD5]
  
  @js.native
  sealed trait HMAC_SHA1
    extends StObject
       with HashAlgorithmType
  inline def HMAC_SHA1: HMAC_SHA1 = "HMAC_SHA1".asInstanceOf[HMAC_SHA1]
  
  @js.native
  sealed trait HMAC_SHA256
    extends StObject
       with HashAlgorithmType
  inline def HMAC_SHA256: HMAC_SHA256 = "HMAC_SHA256".asInstanceOf[HMAC_SHA256]
  
  @js.native
  sealed trait HMAC_SHA512
    extends StObject
       with HashAlgorithmType
  inline def HMAC_SHA512: HMAC_SHA512 = "HMAC_SHA512".asInstanceOf[HMAC_SHA512]
  
  @js.native
  sealed trait INCREMENTAL_UPDATE extends StObject
  inline def INCREMENTAL_UPDATE: INCREMENTAL_UPDATE = "INCREMENTAL_UPDATE".asInstanceOf[INCREMENTAL_UPDATE]
  
  @js.native
  sealed trait INDIGO
    extends StObject
       with TagColor
  inline def INDIGO: INDIGO = "INDIGO".asInstanceOf[INDIGO]
  
  @js.native
  sealed trait JSON
    extends StObject
       with ParameterValueType
  inline def JSON: JSON = "JSON".asInstanceOf[JSON]
  
  @js.native
  sealed trait LIME
    extends StObject
       with TagColor
  inline def LIME: LIME = "LIME".asInstanceOf[LIME]
  
  @js.native
  sealed trait MD5
    extends StObject
       with HashAlgorithmType
  inline def MD5: MD5 = "MD5".asInstanceOf[MD5]
  
  @js.native
  sealed trait NUMBER
    extends StObject
       with ParameterValueType
  inline def NUMBER: NUMBER = "NUMBER".asInstanceOf[NUMBER]
  
  @js.native
  sealed trait ORANGE
    extends StObject
       with TagColor
  inline def ORANGE: ORANGE = "ORANGE".asInstanceOf[ORANGE]
  
  @js.native
  sealed trait PATCH
    extends StObject
       with HttpMethod
  inline def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait PBKDF2_SHA256
    extends StObject
       with HashAlgorithmType
  inline def PBKDF2_SHA256: PBKDF2_SHA256 = "PBKDF2_SHA256".asInstanceOf[PBKDF2_SHA256]
  
  @js.native
  sealed trait PBKDF_SHA1
    extends StObject
       with HashAlgorithmType
  inline def PBKDF_SHA1: PBKDF_SHA1 = "PBKDF_SHA1".asInstanceOf[PBKDF_SHA1]
  
  @js.native
  sealed trait PHONE_SMS extends StObject
  inline def PHONE_SMS: PHONE_SMS = "PHONE_SMS".asInstanceOf[PHONE_SMS]
  
  @js.native
  sealed trait PINK
    extends StObject
       with TagColor
  inline def PINK: PINK = "PINK".asInstanceOf[PINK]
  
  @js.native
  sealed trait POST
    extends StObject
       with HttpMethod
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PURPLE
    extends StObject
       with TagColor
  inline def PURPLE: PURPLE = "PURPLE".asInstanceOf[PURPLE]
  
  @js.native
  sealed trait PUT
    extends StObject
       with HttpMethod
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED extends StObject
  inline def REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED: REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED = "REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED".asInstanceOf[REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED]
  
  @js.native
  sealed trait REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED extends StObject
  inline def REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED: REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED = "REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED".asInstanceOf[REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED]
  
  @js.native
  sealed trait REST_API extends StObject
  inline def REST_API: REST_API = "REST_API".asInstanceOf[REST_API]
  
  @js.native
  sealed trait ROLLBACK extends StObject
  inline def ROLLBACK: ROLLBACK = "ROLLBACK".asInstanceOf[ROLLBACK]
  
  @js.native
  sealed trait SCRYPT
    extends StObject
       with HashAlgorithmType
  inline def SCRYPT: SCRYPT = "SCRYPT".asInstanceOf[SCRYPT]
  
  @js.native
  sealed trait SHA1
    extends StObject
       with HashAlgorithmType
  inline def SHA1: SHA1 = "SHA1".asInstanceOf[SHA1]
  
  @js.native
  sealed trait SHA256
    extends StObject
       with HashAlgorithmType
  inline def SHA256: SHA256 = "SHA256".asInstanceOf[SHA256]
  
  @js.native
  sealed trait SHA512
    extends StObject
       with HashAlgorithmType
  inline def SHA512: SHA512 = "SHA512".asInstanceOf[SHA512]
  
  @js.native
  sealed trait STANDARD_SCRYPT
    extends StObject
       with HashAlgorithmType
  inline def STANDARD_SCRYPT: STANDARD_SCRYPT = "STANDARD_SCRYPT".asInstanceOf[STANDARD_SCRYPT]
  
  @js.native
  sealed trait STRING
    extends StObject
       with ParameterValueType
  inline def STRING: STRING = "STRING".asInstanceOf[STRING]
  
  @js.native
  sealed trait TEAL
    extends StObject
       with TagColor
  inline def TEAL: TEAL = "TEAL".asInstanceOf[TEAL]
  
  @js.native
  sealed trait aborted
    extends StObject
       with AppCheckErrorCode
       with FunctionsErrorCode
       with MachineLearningErrorCode
       with RemoteConfigErrorCode
  inline def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait `already-exists`
    extends StObject
       with MachineLearningErrorCode
       with ProjectManagementErrorCode
       with RemoteConfigErrorCode
       with SecurityRulesErrorCode
  inline def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  
  @js.native
  sealed trait `app-check-token-expired`
    extends StObject
       with AppCheckErrorCode
  inline def `app-check-token-expired`: `app-check-token-expired` = "app-check-token-expired".asInstanceOf[`app-check-token-expired`]
  
  @js.native
  sealed trait `authentication-error`
    extends StObject
       with MachineLearningErrorCode
       with ProjectManagementErrorCode
       with SecurityRulesErrorCode
  inline def `authentication-error`: `authentication-error` = "authentication-error".asInstanceOf[`authentication-error`]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait cancelled
    extends StObject
       with MachineLearningErrorCode
  inline def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait `data-loss`
    extends StObject
       with MachineLearningErrorCode
  inline def `data-loss`: `data-loss` = "data-loss".asInstanceOf[`data-loss`]
  
  @js.native
  sealed trait `deadline-exceeded`
    extends StObject
       with MachineLearningErrorCode
  inline def `deadline-exceeded`: `deadline-exceeded` = "deadline-exceeded".asInstanceOf[`deadline-exceeded`]
  
  @js.native
  sealed trait `failed-precondition`
    extends StObject
       with FunctionsErrorCode
       with MachineLearningErrorCode
       with RemoteConfigErrorCode
  inline def `failed-precondition`: `failed-precondition` = "failed-precondition".asInstanceOf[`failed-precondition`]
  
  @js.native
  sealed trait high extends StObject
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait `internal-error`
    extends StObject
       with AppCheckErrorCode
       with FunctionsErrorCode
       with MachineLearningErrorCode
       with ProjectManagementErrorCode
       with RemoteConfigErrorCode
       with SecurityRulesErrorCode
  inline def `internal-error`: `internal-error` = "internal-error".asInstanceOf[`internal-error`]
  
  @js.native
  sealed trait `invalid-argument`
    extends StObject
       with AppCheckErrorCode
       with EventarcErrorCode
       with FunctionsErrorCode
       with MachineLearningErrorCode
       with ProjectManagementErrorCode
       with RemoteConfigErrorCode
       with SecurityRulesErrorCode
  inline def `invalid-argument`: `invalid-argument` = "invalid-argument".asInstanceOf[`invalid-argument`]
  
  @js.native
  sealed trait `invalid-credential`
    extends StObject
       with AppCheckErrorCode
       with FunctionsErrorCode
  inline def `invalid-credential`: `invalid-credential` = "invalid-credential".asInstanceOf[`invalid-credential`]
  
  @js.native
  sealed trait `invalid-project-id`
    extends StObject
       with ProjectManagementErrorCode
  inline def `invalid-project-id`: `invalid-project-id` = "invalid-project-id".asInstanceOf[`invalid-project-id`]
  
  @js.native
  sealed trait `invalid-server-response`
    extends StObject
       with MachineLearningErrorCode
       with ProjectManagementErrorCode
       with SecurityRulesErrorCode
  inline def `invalid-server-response`: `invalid-server-response` = "invalid-server-response".asInstanceOf[`invalid-server-response`]
  
  @js.native
  sealed trait low extends StObject
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait ltr extends StObject
  inline def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait max extends StObject
  inline def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait min extends StObject
  inline def min: min = "min".asInstanceOf[min]
  
  @js.native
  sealed trait normal extends StObject
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait `not-found`
    extends StObject
       with AppCheckErrorCode
       with FunctionsErrorCode
       with MachineLearningErrorCode
       with ProjectManagementErrorCode
       with RemoteConfigErrorCode
       with SecurityRulesErrorCode
  inline def `not-found`: `not-found` = "not-found".asInstanceOf[`not-found`]
  
  @js.native
  sealed trait oidc extends StObject
  inline def oidc: oidc = "oidc".asInstanceOf[oidc]
  
  @js.native
  sealed trait `out-of-range`
    extends StObject
       with MachineLearningErrorCode
       with RemoteConfigErrorCode
  inline def `out-of-range`: `out-of-range` = "out-of-range".asInstanceOf[`out-of-range`]
  
  @js.native
  sealed trait `permission-denied`
    extends StObject
       with AppCheckErrorCode
       with FunctionsErrorCode
       with MachineLearningErrorCode
       with RemoteConfigErrorCode
  inline def `permission-denied`: `permission-denied` = "permission-denied".asInstanceOf[`permission-denied`]
  
  @js.native
  sealed trait phone extends StObject
  inline def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait `private` extends StObject
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait public extends StObject
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait `resource-exhausted`
    extends StObject
       with MachineLearningErrorCode
       with RemoteConfigErrorCode
       with SecurityRulesErrorCode
  inline def `resource-exhausted`: `resource-exhausted` = "resource-exhausted".asInstanceOf[`resource-exhausted`]
  
  @js.native
  sealed trait rtl extends StObject
  inline def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait saml extends StObject
  inline def saml: saml = "saml".asInstanceOf[saml]
  
  @js.native
  sealed trait secret extends StObject
  inline def secret: secret = "secret".asInstanceOf[secret]
  
  @js.native
  sealed trait `service-unavailable`
    extends StObject
       with MachineLearningErrorCode
       with ProjectManagementErrorCode
       with SecurityRulesErrorCode
  inline def `service-unavailable`: `service-unavailable` = "service-unavailable".asInstanceOf[`service-unavailable`]
  
  @js.native
  sealed trait sha1_ extends StObject
  inline def sha1_ : sha1_ = "sha1".asInstanceOf[sha1_]
  
  @js.native
  sealed trait sha256_ extends StObject
  inline def sha256_ : sha256_ = "sha256".asInstanceOf[sha256_]
  
  @js.native
  sealed trait unauthenticated
    extends StObject
       with AppCheckErrorCode
       with FunctionsErrorCode
       with MachineLearningErrorCode
       with RemoteConfigErrorCode
  inline def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  
  @js.native
  sealed trait `unknown-error`
    extends StObject
       with AppCheckErrorCode
       with EventarcErrorCode
       with FunctionsErrorCode
       with MachineLearningErrorCode
       with ProjectManagementErrorCode
       with RemoteConfigErrorCode
       with SecurityRulesErrorCode
  inline def `unknown-error`: `unknown-error` = "unknown-error".asInstanceOf[`unknown-error`]
}
