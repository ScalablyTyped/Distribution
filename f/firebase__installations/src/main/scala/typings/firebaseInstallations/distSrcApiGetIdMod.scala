package typings.firebaseInstallations

import typings.firebaseInstallations.distSrcInterfacesPublicTypesMod.Installations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiGetIdMod {
  
  @JSImport("@firebase/installations/dist/src/api/get-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getId(installations: Installations): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
