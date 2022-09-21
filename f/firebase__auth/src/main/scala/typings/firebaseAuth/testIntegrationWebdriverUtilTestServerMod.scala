package typings.firebaseAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testIntegrationWebdriverUtilTestServerMod {
  
  @JSImport("@firebase/auth/dist/node/test/integration/webdriver/util/test_server", "authTestServer")
  @js.native
  val authTestServer: AuthTestServer_ = js.native
  
  @js.native
  trait AuthTestServer_ extends StObject {
    
    def address: String = js.native
    
    /* private */ var app: Any = js.native
    
    /* private */ var server: Any = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): Unit = js.native
  }
}
