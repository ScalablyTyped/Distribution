package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigsdkVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object versionsMod {
  
  @JSImport("@expo/config-plugins/build/utils/versions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gteSdkVersion(exp: PickExpoConfigsdkVersion, sdkVersion: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gteSdkVersion")(exp.asInstanceOf[js.Any], sdkVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lteSdkVersion(exp: PickExpoConfigsdkVersion, sdkVersion: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lteSdkVersion")(exp.asInstanceOf[js.Any], sdkVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
