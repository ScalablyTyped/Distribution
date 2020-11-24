package typings.firebaseMessaging

import typings.firebaseMessaging.appConfigMod.AppConfig
import typings.firebaseMessaging.mod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/messaging/dist/helpers/extract-app-config", JSImport.Namespace)
@js.native
object extractAppConfigMod extends js.Object {
  
  def extractAppConfig(app: FirebaseApp): AppConfig = js.native
}
