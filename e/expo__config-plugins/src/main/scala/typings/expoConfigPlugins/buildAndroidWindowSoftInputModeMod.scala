package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigandroid
import typings.expoConfigPlugins.anon.PickExpoConfigandroiduser
import typings.expoConfigPlugins.buildAndroidManifestMod.AndroidManifest
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidWindowSoftInputModeMod {
  
  @JSImport("@expo/config-plugins/build/android/WindowSoftInputMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWindowSoftInputModeMode(config: PickExpoConfigandroid): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowSoftInputModeMode")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setWindowSoftInputModeMode(config: PickExpoConfigandroiduser, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setWindowSoftInputModeMode")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
  
  @JSImport("@expo/config-plugins/build/android/WindowSoftInputMode", "withWindowSoftInputMode")
  @js.native
  val withWindowSoftInputMode: ConfigPlugin[Unit] = js.native
}
