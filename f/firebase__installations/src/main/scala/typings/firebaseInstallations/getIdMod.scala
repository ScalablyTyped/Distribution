package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getIdMod {
  
  @JSImport("@firebase/installations/dist/src/functions/get-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getId(dependencies: FirebaseDependencies): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(dependencies.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
