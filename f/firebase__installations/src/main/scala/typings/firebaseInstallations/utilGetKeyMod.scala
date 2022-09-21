package typings.firebaseInstallations

import typings.firebaseInstallations.interfacesInstallationImplMod.AppConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilGetKeyMod {
  
  @JSImport("@firebase/installations/dist/src/util/get-key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getKey(appConfig: AppConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(appConfig.asInstanceOf[js.Any]).asInstanceOf[String]
}
