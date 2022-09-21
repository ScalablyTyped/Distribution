package typings.firebaseAuth

import typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.MultiFactorError
import typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.MultiFactorResolver
import typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.MultiFactorUser
import typings.firebaseAuth.nodeEsmSrcModelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeEsmSrcMfaMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/mfa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
}
