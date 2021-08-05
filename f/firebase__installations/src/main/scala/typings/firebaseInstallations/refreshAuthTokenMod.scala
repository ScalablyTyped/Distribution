package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import typings.firebaseInstallations.installationEntryMod.CompletedAuthToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refreshAuthTokenMod {
  
  @JSImport("@firebase/installations/dist/src/helpers/refresh-auth-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def refreshAuthToken(dependencies: FirebaseDependencies): js.Promise[CompletedAuthToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshAuthToken")(dependencies.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CompletedAuthToken]]
  inline def refreshAuthToken(dependencies: FirebaseDependencies, forceRefresh: Boolean): js.Promise[CompletedAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshAuthToken")(dependencies.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompletedAuthToken]]
}
