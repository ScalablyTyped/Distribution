package typings.firebaseInstallations

import typings.firebaseInstallations.interfacesInstallationEntryMod.CompletedAuthToken
import typings.firebaseInstallations.interfacesInstallationEntryMod.RegisteredInstallationEntry
import typings.firebaseInstallations.interfacesInstallationImplMod.FirebaseInstallationsImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsGenerateAuthTokenRequestMod {
  
  @JSImport("@firebase/installations/dist/src/functions/generate-auth-token-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateAuthTokenRequest(
    hasAppConfigHeartbeatServiceProvider: FirebaseInstallationsImpl,
    installationEntry: RegisteredInstallationEntry
  ): js.Promise[CompletedAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthTokenRequest")(hasAppConfigHeartbeatServiceProvider.asInstanceOf[js.Any], installationEntry.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompletedAuthToken]]
}
