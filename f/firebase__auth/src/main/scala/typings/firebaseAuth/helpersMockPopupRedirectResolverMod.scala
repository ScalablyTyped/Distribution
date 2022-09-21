package typings.firebaseAuth

import typings.firebaseAuth.modelPopupRedirectMod.EventManager
import typings.firebaseAuth.modelPublicTypesMod.PopupRedirectResolver
import typings.firebaseAuth.platformBrowserUtilPopupMod.AuthPopup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMockPopupRedirectResolverMod {
  
  @JSImport("@firebase/auth/dist/esm2017/test/helpers/mock_popup_redirect_resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeMockPopupRedirectResolver(): PopupRedirectResolver = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMockPopupRedirectResolver")().asInstanceOf[PopupRedirectResolver]
  inline def makeMockPopupRedirectResolver(eventManager: Unit, authPopup: Unit, webStorageSupported: Boolean): PopupRedirectResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMockPopupRedirectResolver")(eventManager.asInstanceOf[js.Any], authPopup.asInstanceOf[js.Any], webStorageSupported.asInstanceOf[js.Any])).asInstanceOf[PopupRedirectResolver]
  inline def makeMockPopupRedirectResolver(eventManager: Unit, authPopup: AuthPopup): PopupRedirectResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMockPopupRedirectResolver")(eventManager.asInstanceOf[js.Any], authPopup.asInstanceOf[js.Any])).asInstanceOf[PopupRedirectResolver]
  inline def makeMockPopupRedirectResolver(eventManager: Unit, authPopup: AuthPopup, webStorageSupported: Boolean): PopupRedirectResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMockPopupRedirectResolver")(eventManager.asInstanceOf[js.Any], authPopup.asInstanceOf[js.Any], webStorageSupported.asInstanceOf[js.Any])).asInstanceOf[PopupRedirectResolver]
  inline def makeMockPopupRedirectResolver(eventManager: EventManager): PopupRedirectResolver = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMockPopupRedirectResolver")(eventManager.asInstanceOf[js.Any]).asInstanceOf[PopupRedirectResolver]
  inline def makeMockPopupRedirectResolver(eventManager: EventManager, authPopup: Unit, webStorageSupported: Boolean): PopupRedirectResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMockPopupRedirectResolver")(eventManager.asInstanceOf[js.Any], authPopup.asInstanceOf[js.Any], webStorageSupported.asInstanceOf[js.Any])).asInstanceOf[PopupRedirectResolver]
  inline def makeMockPopupRedirectResolver(eventManager: EventManager, authPopup: AuthPopup): PopupRedirectResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMockPopupRedirectResolver")(eventManager.asInstanceOf[js.Any], authPopup.asInstanceOf[js.Any])).asInstanceOf[PopupRedirectResolver]
  inline def makeMockPopupRedirectResolver(eventManager: EventManager, authPopup: AuthPopup, webStorageSupported: Boolean): PopupRedirectResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMockPopupRedirectResolver")(eventManager.asInstanceOf[js.Any], authPopup.asInstanceOf[js.Any], webStorageSupported.asInstanceOf[js.Any])).asInstanceOf[PopupRedirectResolver]
}
