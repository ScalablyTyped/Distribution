package typings.firebaseInstallations

import typings.firebaseInstallations.appConfigMod.AppConfig
import typings.firebaseInstallations.installationEntryMod.InProgressInstallationEntry
import typings.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createInstallationRequestMod {
  
  @JSImport("@firebase/installations/dist/src/api/create-installation-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInstallationRequest(appConfig: AppConfig, hasFid: InProgressInstallationEntry): js.Promise[RegisteredInstallationEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstallationRequest")(appConfig.asInstanceOf[js.Any], hasFid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RegisteredInstallationEntry]]
}
