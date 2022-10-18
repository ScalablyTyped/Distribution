package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigandroid
import typings.expoConfigPlugins.buildAndroidManifestMod.AndroidManifest
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidAllowBackupMod {
  
  @JSImport("@expo/config-plugins/build/android/AllowBackup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllowBackup(config: PickExpoConfigandroid): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllowBackup")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getAllowBackupFromManifest(androidManifest: AndroidManifest): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllowBackupFromManifest")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def setAllowBackup(config: PickExpoConfigandroid, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setAllowBackup")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
  
  @JSImport("@expo/config-plugins/build/android/AllowBackup", "withAllowBackup")
  @js.native
  val withAllowBackup: ConfigPlugin[Unit] = js.native
}
