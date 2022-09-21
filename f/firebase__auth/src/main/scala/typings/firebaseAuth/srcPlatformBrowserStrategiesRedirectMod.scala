package typings.firebaseAuth

import typings.firebaseAuth.srcModelPublicTypesMod.Auth
import typings.firebaseAuth.srcModelPublicTypesMod.AuthProvider
import typings.firebaseAuth.srcModelPublicTypesMod.PopupRedirectResolver
import typings.firebaseAuth.srcModelPublicTypesMod.User
import typings.firebaseAuth.srcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPlatformBrowserStrategiesRedirectMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/platform_browser/strategies/redirect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _getRedirectResult(auth: Auth): js.Promise[UserCredential | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectResult")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential | Null]]
  inline def _getRedirectResult(auth: Auth, resolverExtern: Unit, bypassAuthState: Boolean): js.Promise[UserCredential | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectResult")(auth.asInstanceOf[js.Any], resolverExtern.asInstanceOf[js.Any], bypassAuthState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential | Null]]
  inline def _getRedirectResult(auth: Auth, resolverExtern: PopupRedirectResolver): js.Promise[UserCredential | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectResult")(auth.asInstanceOf[js.Any], resolverExtern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential | Null]]
  inline def _getRedirectResult(auth: Auth, resolverExtern: PopupRedirectResolver, bypassAuthState: Boolean): js.Promise[UserCredential | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectResult")(auth.asInstanceOf[js.Any], resolverExtern.asInstanceOf[js.Any], bypassAuthState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential | Null]]
  
  inline def _linkWithRedirect(user: User, provider: AuthProvider): js.Promise[Unit | scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("_linkWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit | scala.Nothing]]
  inline def _linkWithRedirect(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[Unit | scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("_linkWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit | scala.Nothing]]
  
  inline def _reauthenticateWithRedirect(user: User, provider: AuthProvider): js.Promise[Unit | scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("_reauthenticateWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit | scala.Nothing]]
  inline def _reauthenticateWithRedirect(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[Unit | scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("_reauthenticateWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit | scala.Nothing]]
  
  inline def _signInWithRedirect(auth: Auth, provider: AuthProvider): js.Promise[Unit | scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("_signInWithRedirect")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit | scala.Nothing]]
  inline def _signInWithRedirect(auth: Auth, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[Unit | scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("_signInWithRedirect")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit | scala.Nothing]]
  
  inline def getRedirectResult(auth: Auth): js.Promise[UserCredential | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectResult")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential | Null]]
  inline def getRedirectResult(auth: Auth, resolver: PopupRedirectResolver): js.Promise[UserCredential | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectResult")(auth.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential | Null]]
  
  inline def linkWithRedirect(user: User, provider: AuthProvider): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  inline def linkWithRedirect(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  
  inline def reauthenticateWithRedirect(user: User, provider: AuthProvider): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  inline def reauthenticateWithRedirect(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  
  inline def signInWithRedirect(auth: Auth, provider: AuthProvider): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithRedirect")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  inline def signInWithRedirect(auth: Auth, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithRedirect")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
}
