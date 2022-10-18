package typings.firebaseInstallations

import typings.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.InProgressInstallationEntry
import typings.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.RegisteredInstallationEntry
import typings.firebaseInstallations.distEsmSrcInterfacesInstallationImplMod.FirebaseInstallationsImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcFunctionsCreateInstallationRequestMod {
  
  @JSImport("@firebase/installations/dist/esm/src/functions/create-installation-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInstallationRequest(
    hasAppConfigHeartbeatServiceProvider: FirebaseInstallationsImpl,
    hasFid: InProgressInstallationEntry
  ): js.Promise[RegisteredInstallationEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstallationRequest")(hasAppConfigHeartbeatServiceProvider.asInstanceOf[js.Any], hasFid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RegisteredInstallationEntry]]
}
