package typings.firebaseInstallations

import typings.firebaseInstallations.interfacesInstallationEntryMod.InProgressInstallationEntry
import typings.firebaseInstallations.interfacesInstallationEntryMod.RegisteredInstallationEntry
import typings.firebaseInstallations.interfacesInstallationImplMod.FirebaseInstallationsImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsCreateInstallationRequestMod {
  
  @JSImport("@firebase/installations/dist/src/functions/create-installation-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInstallationRequest(
    hasAppConfigHeartbeatServiceProvider: FirebaseInstallationsImpl,
    hasFid: InProgressInstallationEntry
  ): js.Promise[RegisteredInstallationEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstallationRequest")(hasAppConfigHeartbeatServiceProvider.asInstanceOf[js.Any], hasFid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RegisteredInstallationEntry]]
}
