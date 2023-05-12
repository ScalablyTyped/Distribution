package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsSrcCoreCredentialsMod.AuthCredential
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.User
import typings.firebaseAuth.distBrowserCjsSrcModelUserMod.UserCredentialInternal
import typings.firebaseAuth.distBrowserCjsSrcModelUserMod.UserInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcCoreUserLinkUnlinkMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/core/user/link_unlink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertLinkedStatus(expected: Boolean, user: UserInternal, provider: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("_assertLinkedStatus")(expected.asInstanceOf[js.Any], user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def link(user: UserInternal, credential: AuthCredential): js.Promise[UserCredentialInternal] = (^.asInstanceOf[js.Dynamic].applyDynamic("_link")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredentialInternal]]
  inline def link(user: UserInternal, credential: AuthCredential, bypassAuthState: Boolean): js.Promise[UserCredentialInternal] = (^.asInstanceOf[js.Dynamic].applyDynamic("_link")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any], bypassAuthState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredentialInternal]]
  
  inline def unlink(user: User, providerId: String): js.Promise[User] = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any], providerId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[User]]
}
