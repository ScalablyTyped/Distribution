package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import typings.firebaseInstallations.installationEntryMod.CompletedAuthToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/helpers/refresh-auth-token", JSImport.Namespace)
@js.native
object refreshAuthTokenMod extends js.Object {
  def refreshAuthToken(dependencies: FirebaseDependencies): js.Promise[CompletedAuthToken] = js.native
  def refreshAuthToken(dependencies: FirebaseDependencies, forceRefresh: Boolean): js.Promise[CompletedAuthToken] = js.native
}

