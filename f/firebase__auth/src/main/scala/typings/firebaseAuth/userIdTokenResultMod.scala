package typings.firebaseAuth

import typings.firebaseAuth.modelPublicTypesMod.IdTokenResult
import typings.firebaseAuth.modelPublicTypesMod.ParsedToken
import typings.firebaseAuth.modelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userIdTokenResultMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/core/user/id_token_result", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIdToken(user: User): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdToken")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getIdToken(user: User, forceRefresh: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIdToken")(user.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getIdTokenResult(user: User): js.Promise[IdTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdTokenResult")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IdTokenResult]]
  inline def getIdTokenResult(user: User, forceRefresh: Boolean): js.Promise[IdTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIdTokenResult")(user.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IdTokenResult]]
  
  inline def parseToken(token: String): ParsedToken | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_parseToken")(token.asInstanceOf[js.Any]).asInstanceOf[ParsedToken | Null]
  
  inline def tokenExpiresIn(token: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_tokenExpiresIn")(token.asInstanceOf[js.Any]).asInstanceOf[Double]
}
