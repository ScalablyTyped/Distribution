package typings.firebaseAuth

import typings.firebaseAuth.anon.PartialServerErrorMapServ
import typings.firebaseAuth.anon.TenantId
import typings.firebaseAuth.distCordovaSrcCoreErrorsMod.AuthErrorCode
import typings.firebaseAuth.distCordovaSrcCoreUtilDelayMod.Delay
import typings.firebaseAuth.distCordovaSrcModelIdTokenMod.IdTokenResponse
import typings.firebaseAuth.distCordovaSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColoncreateAuthUri
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColondelete
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonlookup
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonresetPassword
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsendOobCode
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsendVerificationCode
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsignInWithCustomToken
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsignInWithEmailLink
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsignInWithIdp
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsignInWithPassword
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsignInWithPhoneNumber
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsignUp
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonupdate
import typings.firebaseAuth.firebaseAuthStrings.Slashv1Slashprojects
import typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashrecaptchaParams
import typings.firebaseAuth.firebaseAuthStrings.Slashv2SlashaccountsSlashmfaEnrollmentColonfinalize
import typings.firebaseAuth.firebaseAuthStrings.Slashv2SlashaccountsSlashmfaEnrollmentColonstart
import typings.firebaseAuth.firebaseAuthStrings.Slashv2SlashaccountsSlashmfaEnrollmentColonwithdraw
import typings.firebaseAuth.firebaseAuthStrings.Slashv2SlashaccountsSlashmfaSignInColonfinalize
import typings.firebaseAuth.firebaseAuthStrings.Slashv2SlashaccountsSlashmfaSignInColonstart
import typings.firebaseAuth.firebaseAuthStrings.`Content-Type`
import typings.firebaseAuth.firebaseAuthStrings.`X-Client-Version`
import typings.firebaseAuth.firebaseAuthStrings.`X-Firebase-Client`
import typings.firebaseAuth.firebaseAuthStrings.`X-Firebase-Locale`
import typings.firebaseAuth.firebaseAuthStrings.`X-Firebase-gmpid`
import typings.firebaseUtil.mod.FirebaseError
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcApiMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/cordova/src/api", "DEFAULT_API_TIMEOUT_MS")
  @js.native
  val DEFAULT_API_TIMEOUT_MS: Delay = js.native
  
  inline def addTidIfNecessary[T /* <: TenantId */](auth: Auth, request: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("_addTidIfNecessary")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def getFinalTarget(auth: Auth, host: String, path: String, query: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getFinalTarget")(auth.asInstanceOf[js.Any], host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def makeTaggedError(auth: Auth, code: AuthErrorCode, response: PotentialResponse): FirebaseError = (^.asInstanceOf[js.Dynamic].applyDynamic("_makeTaggedError")(auth.asInstanceOf[js.Any], code.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[FirebaseError]
  
  inline def performApiRequest[T, V](auth: Auth, method: HttpMethod, path: Endpoint): js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("_performApiRequest")(auth.asInstanceOf[js.Any], method.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  inline def performApiRequest[T, V](auth: Auth, method: HttpMethod, path: Endpoint, request: T): js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("_performApiRequest")(auth.asInstanceOf[js.Any], method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  inline def performApiRequest[T, V](
    auth: Auth,
    method: HttpMethod,
    path: Endpoint,
    request: T,
    customErrorMap: PartialServerErrorMapServ
  ): js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("_performApiRequest")(auth.asInstanceOf[js.Any], method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], request.asInstanceOf[js.Any], customErrorMap.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  inline def performApiRequest[T, V](
    auth: Auth,
    method: HttpMethod,
    path: Endpoint,
    request: Unit,
    customErrorMap: PartialServerErrorMapServ
  ): js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("_performApiRequest")(auth.asInstanceOf[js.Any], method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], request.asInstanceOf[js.Any], customErrorMap.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  
  inline def performFetchWithErrorHandling[V](auth: Auth, customErrorMap: PartialServerErrorMapServ, fetchFn: js.Function0[js.Promise[Response]]): js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("_performFetchWithErrorHandling")(auth.asInstanceOf[js.Any], customErrorMap.asInstanceOf[js.Any], fetchFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  
  inline def performSignInRequest[T, V /* <: IdTokenResponse */](auth: Auth, method: HttpMethod, path: Endpoint): js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("_performSignInRequest")(auth.asInstanceOf[js.Any], method.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  inline def performSignInRequest[T, V /* <: IdTokenResponse */](auth: Auth, method: HttpMethod, path: Endpoint, request: T): js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("_performSignInRequest")(auth.asInstanceOf[js.Any], method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  inline def performSignInRequest[T, V /* <: IdTokenResponse */](
    auth: Auth,
    method: HttpMethod,
    path: Endpoint,
    request: T,
    customErrorMap: PartialServerErrorMapServ
  ): js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("_performSignInRequest")(auth.asInstanceOf[js.Any], method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], request.asInstanceOf[js.Any], customErrorMap.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  inline def performSignInRequest[T, V /* <: IdTokenResponse */](
    auth: Auth,
    method: HttpMethod,
    path: Endpoint,
    request: Unit,
    customErrorMap: PartialServerErrorMapServ
  ): js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("_performSignInRequest")(auth.asInstanceOf[js.Any], method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], request.asInstanceOf[js.Any], customErrorMap.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColoncreateAuthUri
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColondelete
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonresetPassword
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsignUp
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsignInWithCustomToken
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsignInWithEmailLink
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsignInWithIdp
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsignInWithPassword
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsignInWithPhoneNumber
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsendVerificationCode
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonsendOobCode
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonupdate
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashaccountsColonlookup
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1SlashrecaptchaParams
    - typings.firebaseAuth.firebaseAuthStrings.Slashv2SlashaccountsSlashmfaEnrollmentColonstart
    - typings.firebaseAuth.firebaseAuthStrings.Slashv2SlashaccountsSlashmfaEnrollmentColonfinalize
    - typings.firebaseAuth.firebaseAuthStrings.Slashv2SlashaccountsSlashmfaSignInColonstart
    - typings.firebaseAuth.firebaseAuthStrings.Slashv2SlashaccountsSlashmfaSignInColonfinalize
    - typings.firebaseAuth.firebaseAuthStrings.Slashv2SlashaccountsSlashmfaEnrollmentColonwithdraw
    - typings.firebaseAuth.firebaseAuthStrings.Slashv1Slashprojects
  */
  trait Endpoint extends StObject
  object Endpoint {
    
    inline def CREATE_AUTH_URI: Slashv1SlashaccountsColoncreateAuthUri = "/v1/accounts:createAuthUri".asInstanceOf[Slashv1SlashaccountsColoncreateAuthUri]
    
    inline def DELETE_ACCOUNT: Slashv1SlashaccountsColondelete = "/v1/accounts:delete".asInstanceOf[Slashv1SlashaccountsColondelete]
    
    inline def FINALIZE_MFA_ENROLLMENT: Slashv2SlashaccountsSlashmfaEnrollmentColonfinalize = "/v2/accounts/mfaEnrollment:finalize".asInstanceOf[Slashv2SlashaccountsSlashmfaEnrollmentColonfinalize]
    
    inline def FINALIZE_MFA_SIGN_IN: Slashv2SlashaccountsSlashmfaSignInColonfinalize = "/v2/accounts/mfaSignIn:finalize".asInstanceOf[Slashv2SlashaccountsSlashmfaSignInColonfinalize]
    
    inline def GET_ACCOUNT_INFO: Slashv1SlashaccountsColonlookup = "/v1/accounts:lookup".asInstanceOf[Slashv1SlashaccountsColonlookup]
    
    inline def GET_PROJECT_CONFIG: Slashv1Slashprojects = "/v1/projects".asInstanceOf[Slashv1Slashprojects]
    
    inline def GET_RECAPTCHA_PARAM: Slashv1SlashrecaptchaParams = "/v1/recaptchaParams".asInstanceOf[Slashv1SlashrecaptchaParams]
    
    inline def RESET_PASSWORD: Slashv1SlashaccountsColonresetPassword = "/v1/accounts:resetPassword".asInstanceOf[Slashv1SlashaccountsColonresetPassword]
    
    inline def SEND_OOB_CODE: Slashv1SlashaccountsColonsendOobCode = "/v1/accounts:sendOobCode".asInstanceOf[Slashv1SlashaccountsColonsendOobCode]
    
    inline def SEND_VERIFICATION_CODE: Slashv1SlashaccountsColonsendVerificationCode = "/v1/accounts:sendVerificationCode".asInstanceOf[Slashv1SlashaccountsColonsendVerificationCode]
    
    inline def SET_ACCOUNT_INFO: Slashv1SlashaccountsColonupdate = "/v1/accounts:update".asInstanceOf[Slashv1SlashaccountsColonupdate]
    
    inline def SIGN_IN_WITH_CUSTOM_TOKEN: Slashv1SlashaccountsColonsignInWithCustomToken = "/v1/accounts:signInWithCustomToken".asInstanceOf[Slashv1SlashaccountsColonsignInWithCustomToken]
    
    inline def SIGN_IN_WITH_EMAIL_LINK: Slashv1SlashaccountsColonsignInWithEmailLink = "/v1/accounts:signInWithEmailLink".asInstanceOf[Slashv1SlashaccountsColonsignInWithEmailLink]
    
    inline def SIGN_IN_WITH_IDP: Slashv1SlashaccountsColonsignInWithIdp = "/v1/accounts:signInWithIdp".asInstanceOf[Slashv1SlashaccountsColonsignInWithIdp]
    
    inline def SIGN_IN_WITH_PASSWORD: Slashv1SlashaccountsColonsignInWithPassword = "/v1/accounts:signInWithPassword".asInstanceOf[Slashv1SlashaccountsColonsignInWithPassword]
    
    inline def SIGN_IN_WITH_PHONE_NUMBER: Slashv1SlashaccountsColonsignInWithPhoneNumber = "/v1/accounts:signInWithPhoneNumber".asInstanceOf[Slashv1SlashaccountsColonsignInWithPhoneNumber]
    
    inline def SIGN_UP: Slashv1SlashaccountsColonsignUp = "/v1/accounts:signUp".asInstanceOf[Slashv1SlashaccountsColonsignUp]
    
    inline def START_MFA_ENROLLMENT: Slashv2SlashaccountsSlashmfaEnrollmentColonstart = "/v2/accounts/mfaEnrollment:start".asInstanceOf[Slashv2SlashaccountsSlashmfaEnrollmentColonstart]
    
    inline def START_MFA_SIGN_IN: Slashv2SlashaccountsSlashmfaSignInColonstart = "/v2/accounts/mfaSignIn:start".asInstanceOf[Slashv2SlashaccountsSlashmfaSignInColonstart]
    
    inline def WITHDRAW_MFA: Slashv2SlashaccountsSlashmfaEnrollmentColonwithdraw = "/v2/accounts/mfaEnrollment:withdraw".asInstanceOf[Slashv2SlashaccountsSlashmfaEnrollmentColonwithdraw]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthStrings.`Content-Type`
    - typings.firebaseAuth.firebaseAuthStrings.`X-Firebase-Locale`
    - typings.firebaseAuth.firebaseAuthStrings.`X-Client-Version`
    - typings.firebaseAuth.firebaseAuthStrings.`X-Firebase-gmpid`
    - typings.firebaseAuth.firebaseAuthStrings.`X-Firebase-Client`
  */
  trait HttpHeader extends StObject
  object HttpHeader {
    
    inline def CONTENT_TYPE: `Content-Type` = "Content-Type".asInstanceOf[`Content-Type`]
    
    inline def X_CLIENT_VERSION: `X-Client-Version` = "X-Client-Version".asInstanceOf[`X-Client-Version`]
    
    inline def X_FIREBASE_CLIENT: `X-Firebase-Client` = "X-Firebase-Client".asInstanceOf[`X-Firebase-Client`]
    
    inline def X_FIREBASE_GMPID: `X-Firebase-gmpid` = "X-Firebase-gmpid".asInstanceOf[`X-Firebase-gmpid`]
    
    inline def X_FIREBASE_LOCALE: `X-Firebase-Locale` = "X-Firebase-Locale".asInstanceOf[`X-Firebase-Locale`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthStrings.POST
    - typings.firebaseAuth.firebaseAuthStrings.GET
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def GET: typings.firebaseAuth.firebaseAuthStrings.GET = "GET".asInstanceOf[typings.firebaseAuth.firebaseAuthStrings.GET]
    
    inline def POST: typings.firebaseAuth.firebaseAuthStrings.POST = "POST".asInstanceOf[typings.firebaseAuth.firebaseAuthStrings.POST]
  }
  
  trait PotentialResponse
    extends StObject
       with IdTokenResponse {
    
    var email: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
  }
  object PotentialResponse {
    
    inline def apply(localId: String): PotentialResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PotentialResponse]
    }
    
    extension [Self <: PotentialResponse](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    }
  }
}
