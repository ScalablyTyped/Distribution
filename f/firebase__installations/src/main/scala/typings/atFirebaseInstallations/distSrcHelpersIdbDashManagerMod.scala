package typings.atFirebaseInstallations

import typings.atFirebaseInstallations.distSrcInterfacesAppDashConfigMod.AppConfig
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.InProgressInstallationEntry
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.InstallationEntry
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.RegisteredInstallationEntry
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.UnregisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/helpers/idb-manager", JSImport.Namespace)
@js.native
object distSrcHelpersIdbDashManagerMod extends js.Object {
  def clear(): js.Promise[Unit] = js.native
  def get(appConfig: AppConfig): js.Promise[js.UndefOr[InstallationEntry]] = js.native
  def remove(appConfig: AppConfig): js.Promise[Unit] = js.native
  def set(appConfig: AppConfig, value: InProgressInstallationEntry): js.Promise[InProgressInstallationEntry] = js.native
  def set(appConfig: AppConfig, value: RegisteredInstallationEntry): js.Promise[RegisteredInstallationEntry] = js.native
  def set(appConfig: AppConfig, value: UnregisteredInstallationEntry): js.Promise[UnregisteredInstallationEntry] = js.native
  def update[ValueType /* <: js.UndefOr[InstallationEntry] */](
    appConfig: AppConfig,
    updateFn: js.Function1[/* previousValue */ js.UndefOr[InstallationEntry], ValueType]
  ): js.Promise[ValueType] = js.native
}

