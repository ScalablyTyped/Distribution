package typings.atFirebaseInstallations

import typings.atFirebaseInstallations.distSrcInterfacesAppDashConfigMod.AppConfig
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.InProgressInstallationEntry
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/create-installation", JSImport.Namespace)
@js.native
object distSrcApiCreateDashInstallationMod extends js.Object {
  def createInstallation(appConfig: AppConfig, hasFid: InProgressInstallationEntry): js.Promise[RegisteredInstallationEntry] = js.native
}

