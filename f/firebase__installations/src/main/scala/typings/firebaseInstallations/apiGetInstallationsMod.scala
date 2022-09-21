package typings.firebaseInstallations

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseInstallations.interfacesPublicTypesMod.Installations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiGetInstallationsMod {
  
  @JSImport("@firebase/installations/dist/src/api/get-installations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstallations(): Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")().asInstanceOf[Installations]
  inline def getInstallations(app: FirebaseApp): Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")(app.asInstanceOf[js.Any]).asInstanceOf[Installations]
}
