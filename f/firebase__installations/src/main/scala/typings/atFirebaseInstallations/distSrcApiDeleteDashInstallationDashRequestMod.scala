package typings.atFirebaseInstallations

import typings.atFirebaseInstallations.distSrcInterfacesAppDashConfigMod.AppConfig
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/delete-installation-request", JSImport.Namespace)
@js.native
object distSrcApiDeleteDashInstallationDashRequestMod extends js.Object {
  def deleteInstallationRequest(appConfig: AppConfig, installationEntry: RegisteredInstallationEntry): js.Promise[Unit] = js.native
}

