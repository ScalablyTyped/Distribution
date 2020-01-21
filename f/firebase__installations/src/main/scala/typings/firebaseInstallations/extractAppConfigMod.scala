package typings.firebaseInstallations

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseInstallations.appConfigMod.AppConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/helpers/extract-app-config", JSImport.Namespace)
@js.native
object extractAppConfigMod extends js.Object {
  def extractAppConfig(app: FirebaseApp): AppConfig = js.native
}

