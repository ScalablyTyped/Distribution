package typings.firebaseAuth

import typings.firebaseAuth.rnSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.rnSrcModelPublicTypesMod.MultiFactorError
import typings.firebaseAuth.rnSrcModelPublicTypesMod.MultiFactorResolver
import typings.firebaseAuth.rnSrcModelPublicTypesMod.MultiFactorUser
import typings.firebaseAuth.rnSrcModelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rnSrcMfaMod {
  
  @JSImport("@firebase/auth/dist/rn/src/mfa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
}
