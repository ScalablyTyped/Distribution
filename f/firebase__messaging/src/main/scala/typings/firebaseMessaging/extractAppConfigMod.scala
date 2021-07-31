package typings.firebaseMessaging

import typings.firebaseMessaging.appConfigMod.AppConfig
import typings.firebaseMessaging.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractAppConfigMod {
  
  @JSImport("@firebase/messaging/dist/helpers/extract-app-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def extractAppConfig(app: FirebaseApp): AppConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("extractAppConfig")(app.asInstanceOf[js.Any]).asInstanceOf[AppConfig]
}
