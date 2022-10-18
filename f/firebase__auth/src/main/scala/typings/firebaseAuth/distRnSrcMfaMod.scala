package typings.firebaseAuth

import typings.firebaseAuth.distRnSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distRnSrcModelPublicTypesMod.MultiFactorError
import typings.firebaseAuth.distRnSrcModelPublicTypesMod.MultiFactorResolver
import typings.firebaseAuth.distRnSrcModelPublicTypesMod.MultiFactorUser
import typings.firebaseAuth.distRnSrcModelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcMfaMod {
  
  @JSImport("@firebase/auth/dist/rn/src/mfa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
}
