package typings.firebaseInstallations.commonMod

import typings.firebaseInstallations.appConfigMod.AppConfig
import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/common", "getHeaders")
@js.native
object getHeaders extends js.Object {
  def apply(hasApiKey: AppConfig): Headers = js.native
}

