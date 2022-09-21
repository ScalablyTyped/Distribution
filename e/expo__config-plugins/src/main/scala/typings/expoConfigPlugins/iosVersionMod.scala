package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigios
import typings.expoConfigPlugins.anon.PickExpoConfigversion
import typings.expoConfigPlugins.iosConfigTypesMod.InfoPlist
import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosVersionMod {
  
  @JSImport("@expo/config-plugins/build/ios/Version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBuildNumber(config: PickExpoConfigios): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBuildNumber")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getVersion(config: PickExpoConfigversion): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setBuildNumber(config: PickExpoConfigios, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setBuildNumber")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  inline def setVersion(config: PickExpoConfigversion, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setVersion")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  @JSImport("@expo/config-plugins/build/ios/Version", "withBuildNumber")
  @js.native
  val withBuildNumber: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/ios/Version", "withVersion")
  @js.native
  val withVersion: ConfigPlugin[Unit] = js.native
}
