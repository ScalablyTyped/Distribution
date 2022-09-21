package typings.firebaseAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jwtMod {
  
  @JSImport("@firebase/auth/dist/cordova/test/helpers/jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeJWT(claims: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeJWT")(claims.asInstanceOf[js.Any]).asInstanceOf[String]
}
