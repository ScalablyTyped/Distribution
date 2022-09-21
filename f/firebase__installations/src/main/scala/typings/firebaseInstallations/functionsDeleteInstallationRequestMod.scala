package typings.firebaseInstallations

import typings.firebaseInstallations.interfacesInstallationEntryMod.RegisteredInstallationEntry
import typings.firebaseInstallations.interfacesInstallationImplMod.AppConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsDeleteInstallationRequestMod {
  
  @JSImport("@firebase/installations/dist/src/functions/delete-installation-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteInstallationRequest(appConfig: AppConfig, installationEntry: RegisteredInstallationEntry): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteInstallationRequest")(appConfig.asInstanceOf[js.Any], installationEntry.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
