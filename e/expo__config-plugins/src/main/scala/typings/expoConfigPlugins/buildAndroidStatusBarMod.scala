package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigandroidStat
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceXML
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typings.expoConfigPlugins.expoConfigPluginsStrings.`dark-content`
import typings.expoConfigPlugins.expoConfigPluginsStrings.`light-content`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidStatusBarMod {
  
  @JSImport("@expo/config-plugins/build/android/StatusBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStatusBarColor(config: PickExpoConfigandroidStat): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarColor")(config.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getStatusBarStyle(config: PickExpoConfigandroidStat): `light-content` | `dark-content` = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarStyle")(config.asInstanceOf[js.Any]).asInstanceOf[`light-content` | `dark-content`]
  
  inline def getStatusBarTranslucent(config: PickExpoConfigandroidStat): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarTranslucent")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def setStatusBarColors(config: PickExpoConfigandroidStat, colors: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatusBarColors")(config.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
  
  inline def setStatusBarStyles(config: PickExpoConfigandroidStat, styles: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatusBarStyles")(config.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
  
  @JSImport("@expo/config-plugins/build/android/StatusBar", "withStatusBar")
  @js.native
  val withStatusBar: ConfigPlugin[Unit] = js.native
}
