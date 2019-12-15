package typings.atFirebaseInstallations

import typings.atFirebaseInstallations.distSrcInterfacesAppDashConfigMod.AppConfig
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.InProgressInstallationEntry
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/create-installation-request", JSImport.Namespace)
@js.native
object distSrcApiCreateDashInstallationDashRequestMod extends js.Object {
  def createInstallationRequest(appConfig: AppConfig, hasFid: InProgressInstallationEntry): js.Promise[RegisteredInstallationEntry] = js.native
}

