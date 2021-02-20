package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import typings.firebaseInstallations.installationEntryMod.CompletedAuthToken
import typings.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateAuthTokenRequestMod {
  
  @JSImport("@firebase/installations/dist/src/api/generate-auth-token-request", "generateAuthTokenRequest")
  @js.native
  def generateAuthTokenRequest(
    hasAppConfigPlatformLoggerProvider: FirebaseDependencies,
    installationEntry: RegisteredInstallationEntry
  ): js.Promise[CompletedAuthToken] = js.native
}
