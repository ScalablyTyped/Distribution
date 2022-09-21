package typings.firebaseInstallations

import typings.firebaseInstallations.publicTypesMod.Installations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getIdMod {
  
  @JSImport("@firebase/installations/dist/esm/src/api/get-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getId(installations: Installations): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
