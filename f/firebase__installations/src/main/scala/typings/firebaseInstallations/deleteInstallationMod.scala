package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteInstallationMod {
  
  @JSImport("@firebase/installations/dist/src/functions/delete-installation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deleteInstallation(dependencies: FirebaseDependencies): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteInstallation")(dependencies.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
