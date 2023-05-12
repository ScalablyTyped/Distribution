package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.MultiFactorError
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.MultiFactorResolver
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.MultiFactorUser
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcMfaMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/mfa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
}
