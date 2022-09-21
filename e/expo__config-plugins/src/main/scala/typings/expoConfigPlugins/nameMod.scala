package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigname
import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nameMod {
  
  @JSImport("@expo/config-plugins/build/android/Name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyNameSettingsGradle(config: PickExpoConfigname, settingsGradle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyNameSettingsGradle")(config.asInstanceOf[js.Any], settingsGradle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getName(config: PickExpoConfigname): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def sanitizeNameForGradle(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeNameForGradle")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@expo/config-plugins/build/android/Name", "withName")
  @js.native
  val withName: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/android/Name", "withNameSettingsGradle")
  @js.native
  val withNameSettingsGradle: ConfigPlugin[Unit] = js.native
}
