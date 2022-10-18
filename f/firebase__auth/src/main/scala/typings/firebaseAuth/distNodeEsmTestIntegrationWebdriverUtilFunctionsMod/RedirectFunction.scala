package typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RedirectFunction extends StObject
@JSImport("@firebase/auth/dist/node-esm/test/integration/webdriver/util/functions", "RedirectFunction")
@js.native
object RedirectFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RedirectFunction & String] = js.native
  
  @js.native
  sealed trait CREATE_FAKE_GOOGLE_USER
    extends StObject
       with RedirectFunction
  /* "redirect.createFakeGoogleUser" */ val CREATE_FAKE_GOOGLE_USER: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.CREATE_FAKE_GOOGLE_USER & String = js.native
  
  @js.native
  sealed trait GENERATE_CREDENTIAL_FROM_RESULT
    extends StObject
       with RedirectFunction
  /* "redirect.generateCredentialFromRedirectResultAndStore" */ val GENERATE_CREDENTIAL_FROM_RESULT: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.GENERATE_CREDENTIAL_FROM_RESULT & String = js.native
  
  @js.native
  sealed trait IDP_LINK_REDIRECT
    extends StObject
       with RedirectFunction
  /* "redirect.idpLinkRedirect" */ val IDP_LINK_REDIRECT: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.IDP_LINK_REDIRECT & String = js.native
  
  @js.native
  sealed trait IDP_REAUTH_REDIRECT
    extends StObject
       with RedirectFunction
  /* "redirect.idpReauthRedirect" */ val IDP_REAUTH_REDIRECT: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.IDP_REAUTH_REDIRECT & String = js.native
  
  @js.native
  sealed trait IDP_REDIRECT
    extends StObject
       with RedirectFunction
  /* "redirect.idpRedirect" */ val IDP_REDIRECT: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.IDP_REDIRECT & String = js.native
  
  @js.native
  sealed trait LINK_WITH_ERROR_CREDENTIAL
    extends StObject
       with RedirectFunction
  /* "redirect.linkWithErrorCredential" */ val LINK_WITH_ERROR_CREDENTIAL: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.LINK_WITH_ERROR_CREDENTIAL & String = js.native
  
  @js.native
  sealed trait REDIRECT_RESULT
    extends StObject
       with RedirectFunction
  /* "redirect.redirectResult" */ val REDIRECT_RESULT: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.REDIRECT_RESULT & String = js.native
  
  @js.native
  sealed trait SIGN_IN_WITH_REDIRECT_CREDENTIAL
    extends StObject
       with RedirectFunction
  /* "redirect.signInWithRedirectCredential" */ val SIGN_IN_WITH_REDIRECT_CREDENTIAL: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.SIGN_IN_WITH_REDIRECT_CREDENTIAL & String = js.native
  
  @js.native
  sealed trait TRY_TO_SIGN_IN_UNVERIFIED
    extends StObject
       with RedirectFunction
  /* "redirect.tryToSignInUnverified" */ val TRY_TO_SIGN_IN_UNVERIFIED: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.TRY_TO_SIGN_IN_UNVERIFIED & String = js.native
}
