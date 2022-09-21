package typings.firebaseInstallations

import typings.firebaseInstallations.interfacesInstallationEntryMod.InProgressInstallationEntry
import typings.firebaseInstallations.interfacesInstallationEntryMod.InstallationEntry
import typings.firebaseInstallations.interfacesInstallationEntryMod.RegisteredInstallationEntry
import typings.firebaseInstallations.interfacesInstallationEntryMod.UnregisteredInstallationEntry
import typings.firebaseInstallations.interfacesInstallationImplMod.AppConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersIdbManagerMod {
  
  @JSImport("@firebase/installations/dist/src/helpers/idb-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[js.Promise[Unit]]
  
  inline def get(appConfig: AppConfig): js.Promise[js.UndefOr[InstallationEntry]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(appConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[InstallationEntry]]]
  
  inline def remove(appConfig: AppConfig): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(appConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def set(appConfig: AppConfig, value: InProgressInstallationEntry): js.Promise[InProgressInstallationEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(appConfig.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InProgressInstallationEntry]]
  inline def set(appConfig: AppConfig, value: RegisteredInstallationEntry): js.Promise[RegisteredInstallationEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(appConfig.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RegisteredInstallationEntry]]
  inline def set(appConfig: AppConfig, value: UnregisteredInstallationEntry): js.Promise[UnregisteredInstallationEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(appConfig.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UnregisteredInstallationEntry]]
  
  inline def update[ValueType /* <: js.UndefOr[InstallationEntry] */](
    appConfig: AppConfig,
    updateFn: js.Function1[/* previousValue */ js.UndefOr[InstallationEntry], ValueType]
  ): js.Promise[ValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(appConfig.asInstanceOf[js.Any], updateFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ValueType]]
}
