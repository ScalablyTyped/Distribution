package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.MinVersion
import typings.expoConfigPlugins.anon.PickExpoConfigandroid
import typings.expoConfigPlugins.anon.PickExpoConfigversion
import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object versionMod {
  
  @JSImport("@expo/config-plugins/build/android/Version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVersionCode(config: PickExpoConfigandroid): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionCode")(config.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getVersionName(config: PickExpoConfigversion): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionName")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setMinBuildScriptExtVersion(buildGradle: String, hasNameMinVersion: MinVersion): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setMinBuildScriptExtVersion")(buildGradle.asInstanceOf[js.Any], hasNameMinVersion.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setVersionCode(config: PickExpoConfigandroid, buildGradle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setVersionCode")(config.asInstanceOf[js.Any], buildGradle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setVersionName(config: PickExpoConfigversion, buildGradle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setVersionName")(config.asInstanceOf[js.Any], buildGradle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@expo/config-plugins/build/android/Version", "withBuildScriptExtMinimumVersion")
  @js.native
  val withBuildScriptExtMinimumVersion: ConfigPlugin[MinVersion] = js.native
  
  @JSImport("@expo/config-plugins/build/android/Version", "withVersion")
  @js.native
  val withVersion: ConfigPlugin[Unit] = js.native
}
