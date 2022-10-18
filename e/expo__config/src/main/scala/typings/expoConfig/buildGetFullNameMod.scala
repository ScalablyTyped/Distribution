package typings.expoConfig

import typings.expoConfig.anon.PickExpoConfigowner
import typings.expoConfig.anon.PickExpoConfigownerslug
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildGetFullNameMod {
  
  @JSImport("@expo/config/build/getFullName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAccountUsername(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountUsername")().asInstanceOf[String]
  inline def getAccountUsername(manifest: PickExpoConfigowner): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountUsername")(manifest.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFullName(manifest: PickExpoConfigownerslug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullName")(manifest.asInstanceOf[js.Any]).asInstanceOf[String]
}
