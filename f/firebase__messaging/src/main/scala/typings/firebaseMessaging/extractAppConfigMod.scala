package typings.firebaseMessaging

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseMessaging.appConfigMod.AppConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractAppConfigMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/helpers/extract-app-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractAppConfig(app: FirebaseApp): AppConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("extractAppConfig")(app.asInstanceOf[js.Any]).asInstanceOf[AppConfig]
}
