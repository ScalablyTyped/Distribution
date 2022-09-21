package typings.firebaseAuth

import typings.firebaseAuth.modelPublicTypesMod.Auth
import typings.firebaseAuth.modelPublicTypesMod.MultiFactorError
import typings.firebaseAuth.modelPublicTypesMod.MultiFactorResolver
import typings.firebaseAuth.modelPublicTypesMod.MultiFactorUser
import typings.firebaseAuth.modelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esm2017SrcMfaMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/mfa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
}
