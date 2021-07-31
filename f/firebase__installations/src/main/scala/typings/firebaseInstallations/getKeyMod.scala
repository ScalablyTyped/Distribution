package typings.firebaseInstallations

import typings.firebaseInstallations.appConfigMod.AppConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getKeyMod {
  
  @JSImport("@firebase/installations/dist/src/util/get-key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getKey(appConfig: AppConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(appConfig.asInstanceOf[js.Any]).asInstanceOf[String]
}
