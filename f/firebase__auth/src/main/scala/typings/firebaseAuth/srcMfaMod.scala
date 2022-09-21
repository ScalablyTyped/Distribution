package typings.firebaseAuth

import typings.firebaseAuth.publicTypesMod.Auth
import typings.firebaseAuth.publicTypesMod.MultiFactorError
import typings.firebaseAuth.publicTypesMod.MultiFactorResolver
import typings.firebaseAuth.publicTypesMod.MultiFactorUser
import typings.firebaseAuth.publicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMfaMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/mfa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
}
