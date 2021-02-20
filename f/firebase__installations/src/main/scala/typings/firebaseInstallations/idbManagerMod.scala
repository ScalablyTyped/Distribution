package typings.firebaseInstallations

import typings.firebaseInstallations.appConfigMod.AppConfig
import typings.firebaseInstallations.installationEntryMod.InProgressInstallationEntry
import typings.firebaseInstallations.installationEntryMod.InstallationEntry
import typings.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import typings.firebaseInstallations.installationEntryMod.UnregisteredInstallationEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idbManagerMod {
  
  @JSImport("@firebase/installations/dist/src/helpers/idb-manager", "clear")
  @js.native
  def clear(): js.Promise[Unit] = js.native
  
  @JSImport("@firebase/installations/dist/src/helpers/idb-manager", "get")
  @js.native
  def get(appConfig: AppConfig): js.Promise[js.UndefOr[InstallationEntry]] = js.native
  
  @JSImport("@firebase/installations/dist/src/helpers/idb-manager", "remove")
  @js.native
  def remove(appConfig: AppConfig): js.Promise[Unit] = js.native
  
  @JSImport("@firebase/installations/dist/src/helpers/idb-manager", "set")
  @js.native
  def set(appConfig: AppConfig, value: InProgressInstallationEntry): js.Promise[InProgressInstallationEntry] = js.native
  @JSImport("@firebase/installations/dist/src/helpers/idb-manager", "set")
  @js.native
  def set(appConfig: AppConfig, value: RegisteredInstallationEntry): js.Promise[RegisteredInstallationEntry] = js.native
  @JSImport("@firebase/installations/dist/src/helpers/idb-manager", "set")
  @js.native
  def set(appConfig: AppConfig, value: UnregisteredInstallationEntry): js.Promise[UnregisteredInstallationEntry] = js.native
  
  @JSImport("@firebase/installations/dist/src/helpers/idb-manager", "update")
  @js.native
  def update[ValueType /* <: js.UndefOr[InstallationEntry] */](
    appConfig: AppConfig,
    updateFn: js.Function1[/* previousValue */ js.UndefOr[InstallationEntry], ValueType]
  ): js.Promise[ValueType] = js.native
}
