package typings.firebaseAuth

import typings.firebaseAuth.nodeSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.nodeSrcModelPublicTypesMod.MultiFactorError
import typings.firebaseAuth.nodeSrcModelPublicTypesMod.MultiFactorResolver
import typings.firebaseAuth.nodeSrcModelPublicTypesMod.MultiFactorUser
import typings.firebaseAuth.nodeSrcModelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeSrcMfaMod {
  
  @JSImport("@firebase/auth/dist/node/src/mfa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
}
