package typings.firebaseAuth.authMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * We need to mark this interface as internal explicitly to exclude it in the public typings, because
  * it references AuthInternal which has a circular dependency with UserInternal.
  *
  * @internal
  */
@js.native
trait PopupRedirectResolverInternal
  extends StObject
     with PopupRedirectResolver {
  
  def _completeRedirectFn(auth: Auth, resolver: PopupRedirectResolver, bypassAuthState: Boolean): js.Promise[UserCredential | Null] = js.native
  
  def _initialize(auth: AuthInternal): js.Promise[EventManager] = js.native
  
  def _isIframeWebStorageSupported(auth: AuthInternal, cb: js.Function1[/* support */ Boolean, Any]): Unit = js.native
  
  def _openPopup(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType): js.Promise[AuthPopup] = js.native
  def _openPopup(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType, eventId: String): js.Promise[AuthPopup] = js.native
  
  def _openRedirect(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType): js.Promise[Unit | scala.Nothing] = js.native
  def _openRedirect(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType, eventId: String): js.Promise[Unit | scala.Nothing] = js.native
  
  def _originValidation(auth: Auth): js.Promise[Unit] = js.native
  
  def _overrideRedirectResult(auth: AuthInternal, resultGetter: js.Function0[js.Promise[UserCredentialInternal | Null]]): Unit = js.native
  
  var _redirectPersistence: Persistence = js.native
  
  var _shouldInitProactively: Boolean = js.native
}
