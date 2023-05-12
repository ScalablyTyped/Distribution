package typings.expoConfig

import typings.expoConfig.anon.PickExpoConfigsdkVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildGetExpoSDKVersionMod {
  
  @JSImport("@expo/config/build/getExpoSDKVersion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getExpoSDKVersion(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExpoSDKVersion")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getExpoSDKVersion(projectRoot: String, exp: PickExpoConfigsdkVersion): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpoSDKVersion")(projectRoot.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[String]
}
