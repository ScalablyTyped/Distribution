package typings.firebaseInstallations

import typings.firebaseInstallations.publicTypesMod.Installations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteInstallationsMod {
  
  @JSImport("@firebase/installations/dist/esm/src/api/delete-installations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteInstallations(installations: Installations): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteInstallations")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
