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
  
  inline def createInstallationRequest(param0: FirebaseInstallationsImpl, param1: InProgressInstallationEntry): js.Promise[RegisteredInstallationEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstallationRequest")(param0.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RegisteredInstallationEntry]]
}
