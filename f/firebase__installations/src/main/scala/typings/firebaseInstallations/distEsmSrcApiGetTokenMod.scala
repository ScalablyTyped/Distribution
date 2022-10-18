package typings.firebaseInstallations

import typings.firebaseInstallations.distEsmSrcInterfacesPublicTypesMod.Installations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcApiGetTokenMod {
  
  @JSImport("@firebase/installations/dist/esm/src/api/get-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getToken(installations: Installations): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getToken(installations: Installations, forceRefresh: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(installations.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
