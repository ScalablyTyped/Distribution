package typings.firebaseInstallations

import typings.firebaseInstallations.distSrcInterfacesInstallationImplMod.AppConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilGetKeyMod {
  
  @JSImport("@firebase/installations/dist/src/util/get-key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getKey(appConfig: AppConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(appConfig.asInstanceOf[js.Any]).asInstanceOf[String]
}
