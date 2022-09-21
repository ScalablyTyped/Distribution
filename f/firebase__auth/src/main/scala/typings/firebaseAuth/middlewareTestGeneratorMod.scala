package typings.firebaseAuth

import typings.firebaseAuth.mod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareTestGeneratorMod {
  
  @JSImport("@firebase/auth/dist/cordova/test/integration/flows/middleware_test_generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateMiddlewareTests(authGetter: js.Function0[Auth], signIn: js.Function0[js.Promise[Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMiddlewareTests")(authGetter.asInstanceOf[js.Any], signIn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
