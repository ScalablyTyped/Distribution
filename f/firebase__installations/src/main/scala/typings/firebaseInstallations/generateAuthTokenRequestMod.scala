package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import typings.firebaseInstallations.installationEntryMod.CompletedAuthToken
import typings.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateAuthTokenRequestMod {
  
  @JSImport("@firebase/installations/dist/src/api/generate-auth-token-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def generateAuthTokenRequest(
    hasAppConfigPlatformLoggerProvider: FirebaseDependencies,
    installationEntry: RegisteredInstallationEntry
  ): js.Promise[CompletedAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthTokenRequest")(hasAppConfigPlatformLoggerProvider.asInstanceOf[js.Any], installationEntry.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompletedAuthToken]]
}
