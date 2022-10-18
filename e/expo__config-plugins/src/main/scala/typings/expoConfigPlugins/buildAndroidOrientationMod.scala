package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigorientation
import typings.expoConfigPlugins.buildAndroidManifestMod.AndroidManifest
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typings.expoConfigPlugins.expoConfigPluginsStrings.default
import typings.expoConfigPlugins.expoConfigPluginsStrings.landscape
import typings.expoConfigPlugins.expoConfigPluginsStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidOrientationMod {
  
  @JSImport("@expo/config-plugins/build/android/Orientation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/config-plugins/build/android/Orientation", "SCREEN_ORIENTATION_ATTRIBUTE")
  @js.native
  val SCREEN_ORIENTATION_ATTRIBUTE: /* "android:screenOrientation" */ String = js.native
  
  inline def getOrientation(config: PickExpoConfigorientation): default | portrait | landscape | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientation")(config.asInstanceOf[js.Any]).asInstanceOf[default | portrait | landscape | Null]
  
  inline def setAndroidOrientation(config: PickExpoConfigorientation, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setAndroidOrientation")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
  
  @JSImport("@expo/config-plugins/build/android/Orientation", "withOrientation")
  @js.native
  val withOrientation: ConfigPlugin[Unit] = js.native
}
