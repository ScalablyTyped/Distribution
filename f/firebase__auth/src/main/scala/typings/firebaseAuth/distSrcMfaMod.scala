package typings.firebaseAuth

import typings.firebaseAuth.distSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distSrcModelPublicTypesMod.MultiFactorError
import typings.firebaseAuth.distSrcModelPublicTypesMod.MultiFactorResolver
import typings.firebaseAuth.distSrcModelPublicTypesMod.MultiFactorUser
import typings.firebaseAuth.distSrcModelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMfaMod {
  
  @JSImport("@firebase/auth/dist/src/mfa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
}
