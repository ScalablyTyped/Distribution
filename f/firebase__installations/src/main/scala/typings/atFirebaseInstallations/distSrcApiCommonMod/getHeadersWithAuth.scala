package typings.atFirebaseInstallations.distSrcApiCommonMod

import typings.atFirebaseInstallations.distSrcInterfacesAppDashConfigMod.AppConfig
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.RegisteredInstallationEntry
import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/common", "getHeadersWithAuth")
@js.native
object getHeadersWithAuth extends js.Object {
  def apply(appConfig: AppConfig, hasRefreshToken: RegisteredInstallationEntry): Headers = js.native
}

