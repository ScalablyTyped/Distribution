package typings.firebaseInstallations

import typings.firebaseInstallations.installationEntryMod.InProgressInstallationEntry
import typings.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import typings.firebaseInstallations.installationImplMod.FirebaseInstallationsImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createInstallationRequestMod {
  
  @JSImport("@firebase/installations/dist/esm/src/functions/create-installation-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInstallationRequest(
    hasAppConfigHeartbeatServiceProvider: FirebaseInstallationsImpl,
    hasFid: InProgressInstallationEntry
  ): js.Promise[RegisteredInstallationEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstallationRequest")(hasAppConfigHeartbeatServiceProvider.asInstanceOf[js.Any], hasFid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RegisteredInstallationEntry]]
}
