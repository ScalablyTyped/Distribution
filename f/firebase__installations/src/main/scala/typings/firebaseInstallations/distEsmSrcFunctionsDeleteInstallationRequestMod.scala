package typings.firebaseInstallations

import typings.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.RegisteredInstallationEntry
import typings.firebaseInstallations.distEsmSrcInterfacesInstallationImplMod.AppConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcFunctionsDeleteInstallationRequestMod {
  
  @JSImport("@firebase/installations/dist/esm/src/functions/delete-installation-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteInstallationRequest(appConfig: AppConfig, installationEntry: RegisteredInstallationEntry): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteInstallationRequest")(appConfig.asInstanceOf[js.Any], installationEntry.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
