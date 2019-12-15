package typings.atFirebaseInstallations

import typings.atFirebaseInstallations.distSrcInterfacesFirebaseDashDependenciesMod.FirebaseDependencies
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.CompletedAuthToken
import typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/generate-auth-token-request", JSImport.Namespace)
@js.native
object distSrcApiGenerateDashAuthDashTokenDashRequestMod extends js.Object {
  def generateAuthTokenRequest(
    hasAppConfigPlatformLoggerProvider: FirebaseDependencies,
    installationEntry: RegisteredInstallationEntry
  ): js.Promise[CompletedAuthToken] = js.native
}

