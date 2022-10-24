package typings.firebaseInstallations

import typings.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.CompletedAuthToken
import typings.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.RegisteredInstallationEntry
import typings.firebaseInstallations.distEsmSrcInterfacesInstallationImplMod.FirebaseInstallationsImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcFunctionsGenerateAuthTokenRequestMod {
  
  @JSImport("@firebase/installations/dist/esm/src/functions/generate-auth-token-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateAuthTokenRequest(param0: FirebaseInstallationsImpl, installationEntry: RegisteredInstallationEntry): js.Promise[CompletedAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthTokenRequest")(param0.asInstanceOf[js.Any], installationEntry.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompletedAuthToken]]
}
