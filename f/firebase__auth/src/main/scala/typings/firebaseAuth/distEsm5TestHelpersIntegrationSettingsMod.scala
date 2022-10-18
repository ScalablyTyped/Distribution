package typings.firebaseAuth

import typings.firebaseApp.mod.FirebaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5TestHelpersIntegrationSettingsMod {
  
  @JSImport("@firebase/auth/dist/esm5/test/helpers/integration/settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/esm5/test/helpers/integration/settings", "API_KEY")
  @js.native
  val API_KEY: Any = js.native
  
  @JSImport("@firebase/auth/dist/esm5/test/helpers/integration/settings", "AUTH_DOMAIN")
  @js.native
  val AUTH_DOMAIN: Any = js.native
  
  @JSImport("@firebase/auth/dist/esm5/test/helpers/integration/settings", "PROJECT_ID")
  @js.native
  val PROJECT_ID: Any = js.native
  
  @JSImport("@firebase/auth/dist/esm5/test/helpers/integration/settings", "USE_EMULATOR")
  @js.native
  val USE_EMULATOR: Boolean = js.native
  
  inline def getAppConfig(): FirebaseOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppConfig")().asInstanceOf[FirebaseOptions]
  
  inline def getEmulatorUrl(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEmulatorUrl")().asInstanceOf[String | Null]
}
