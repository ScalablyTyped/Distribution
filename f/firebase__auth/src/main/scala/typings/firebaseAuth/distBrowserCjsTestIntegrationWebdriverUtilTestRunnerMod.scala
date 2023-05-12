package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsTestIntegrationWebdriverUtilAuthDriverMod.AuthDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsTestIntegrationWebdriverUtilTestRunnerMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/test/integration/webdriver/util/test_runner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def browserDescribe(title: String, generator: js.Function2[/* driver */ AuthDriver, /* browser */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("browserDescribe")(title.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
