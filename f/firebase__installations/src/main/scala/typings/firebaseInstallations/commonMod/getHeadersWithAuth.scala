package typings.firebaseInstallations.commonMod

import typings.firebaseInstallations.appConfigMod.AppConfig
import typings.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/common", "getHeadersWithAuth")
@js.native
object getHeadersWithAuth extends js.Object {
  def apply(appConfig: AppConfig, hasRefreshToken: RegisteredInstallationEntry): Headers = js.native
}

