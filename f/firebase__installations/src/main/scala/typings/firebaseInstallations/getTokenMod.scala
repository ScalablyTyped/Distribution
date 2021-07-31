package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTokenMod {
  
  @JSImport("@firebase/installations/dist/src/functions/get-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getToken(dependencies: FirebaseDependencies): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(dependencies.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def getToken(dependencies: FirebaseDependencies, forceRefresh: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(dependencies.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
