package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import typings.firebaseInstallations.installationEntryMod.CompletedAuthToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refreshAuthTokenMod {
  
  @JSImport("@firebase/installations/dist/src/helpers/refresh-auth-token", "refreshAuthToken")
  @js.native
  def refreshAuthToken(dependencies: FirebaseDependencies): js.Promise[CompletedAuthToken] = js.native
  @JSImport("@firebase/installations/dist/src/helpers/refresh-auth-token", "refreshAuthToken")
  @js.native
  def refreshAuthToken(dependencies: FirebaseDependencies, forceRefresh: Boolean): js.Promise[CompletedAuthToken] = js.native
}
