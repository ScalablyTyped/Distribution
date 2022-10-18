package typings.firebaseInstallationsCompat

import typings.firebaseInstallations.mod.Installations
import typings.firebaseInstallationsCompat.appCompatMod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTestingUtilMod {
  
  @JSImport("@firebase/installations-compat/dist/src/testing/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFakeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")().asInstanceOf[FirebaseApp]
  
  inline def getFakeInstallations(): Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeInstallations")().asInstanceOf[Installations]
}
