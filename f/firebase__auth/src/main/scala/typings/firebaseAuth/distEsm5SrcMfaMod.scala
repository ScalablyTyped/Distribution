package typings.firebaseAuth

import typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.MultiFactorError
import typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.MultiFactorResolver
import typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.MultiFactorUser
import typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcMfaMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/mfa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
}
