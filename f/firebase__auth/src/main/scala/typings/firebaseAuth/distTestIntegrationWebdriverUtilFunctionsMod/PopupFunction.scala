package typings.firebaseAuth.distTestIntegrationWebdriverUtilFunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PopupFunction extends StObject
@JSImport("@firebase/auth/dist/test/integration/webdriver/util/functions", "PopupFunction")
@js.native
object PopupFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PopupFunction & String] = js.native
  
  @js.native
  sealed trait CREATE_FAKE_GOOGLE_USER
    extends StObject
       with PopupFunction
  /* "popup.createFakeGoogleUser" */ val CREATE_FAKE_GOOGLE_USER: typings.firebaseAuth.distTestIntegrationWebdriverUtilFunctionsMod.PopupFunction.CREATE_FAKE_GOOGLE_USER & String = js.native
  
  @js.native
  sealed trait GENERATE_CREDENTIAL_FROM_RESULT
    extends StObject
       with PopupFunction
  /* "popup.generateCredentialFromResult" */ val GENERATE_CREDENTIAL_FROM_RESULT: typings.firebaseAuth.distTestIntegrationWebdriverUtilFunctionsMod.PopupFunction.GENERATE_CREDENTIAL_FROM_RESULT & String = js.native
  
  @js.native
  sealed trait IDP_LINK_POPUP
    extends StObject
       with PopupFunction
  /* "popup.idpLinkPopup" */ val IDP_LINK_POPUP: typings.firebaseAuth.distTestIntegrationWebdriverUtilFunctionsMod.PopupFunction.IDP_LINK_POPUP & String = js.native
  
  @js.native
  sealed trait IDP_POPUP
    extends StObject
       with PopupFunction
  /* "popup.idpPopup" */ val IDP_POPUP: typings.firebaseAuth.distTestIntegrationWebdriverUtilFunctionsMod.PopupFunction.IDP_POPUP & String = js.native
  
  @js.native
  sealed trait IDP_REAUTH_POPUP
    extends StObject
       with PopupFunction
  /* "popup.idpReauthPopup" */ val IDP_REAUTH_POPUP: typings.firebaseAuth.distTestIntegrationWebdriverUtilFunctionsMod.PopupFunction.IDP_REAUTH_POPUP & String = js.native
  
  @js.native
  sealed trait LINK_WITH_ERROR_CREDENTIAL
    extends StObject
       with PopupFunction
  /* "popup.linkWithErrorCredential" */ val LINK_WITH_ERROR_CREDENTIAL: typings.firebaseAuth.distTestIntegrationWebdriverUtilFunctionsMod.PopupFunction.LINK_WITH_ERROR_CREDENTIAL & String = js.native
  
  @js.native
  sealed trait POPUP_RESULT
    extends StObject
       with PopupFunction
  /* "popup.popupResult" */ val POPUP_RESULT: typings.firebaseAuth.distTestIntegrationWebdriverUtilFunctionsMod.PopupFunction.POPUP_RESULT & String = js.native
  
  @js.native
  sealed trait SIGN_IN_WITH_POPUP_CREDENTIAL
    extends StObject
       with PopupFunction
  /* "popup.signInWithPopupCredential" */ val SIGN_IN_WITH_POPUP_CREDENTIAL: typings.firebaseAuth.distTestIntegrationWebdriverUtilFunctionsMod.PopupFunction.SIGN_IN_WITH_POPUP_CREDENTIAL & String = js.native
  
  @js.native
  sealed trait TRY_TO_SIGN_IN_UNVERIFIED
    extends StObject
       with PopupFunction
  /* "popup.tryToSignInUnverified" */ val TRY_TO_SIGN_IN_UNVERIFIED: typings.firebaseAuth.distTestIntegrationWebdriverUtilFunctionsMod.PopupFunction.TRY_TO_SIGN_IN_UNVERIFIED & String = js.native
}
