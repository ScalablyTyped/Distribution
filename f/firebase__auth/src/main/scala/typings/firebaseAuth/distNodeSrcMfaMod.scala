package typings.firebaseAuth

import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.MultiFactorError
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.MultiFactorResolver
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.MultiFactorUser
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcMfaMod {
  
  @JSImport("@firebase/auth/dist/node/src/mfa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
}
