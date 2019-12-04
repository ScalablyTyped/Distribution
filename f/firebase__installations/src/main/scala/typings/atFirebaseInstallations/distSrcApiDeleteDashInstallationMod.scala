package typings.atFirebaseInstallations

import typings.atFirebaseInstallations.distSrcInterfacesAppDashConfigMod.AppConfig
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/delete-installation", JSImport.Namespace)
@js.native
object distSrcApiDeleteDashInstallationMod extends js.Object {
  def deleteInstallation(appConfig: AppConfig, installationEntry: RegisteredInstallationEntry): js.Promise[Unit] = js.native
}

