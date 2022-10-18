package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PickExpoConfigandroid
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidGoogleServicesMod {
  
  @JSImport("@expo/config-plugins/build/android/GoogleServices", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyPlugin(config: PickExpoConfigandroid, appBuildGradle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPlugin")(config.asInstanceOf[js.Any], appBuildGradle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getGoogleServicesFilePath(config: PickExpoConfigandroid): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleServicesFilePath")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setClassPath(config: PickExpoConfigandroid, buildGradle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setClassPath")(config.asInstanceOf[js.Any], buildGradle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setGoogleServicesFile(config: PickExpoConfigandroid, projectRoot: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleServicesFile")(config.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def setGoogleServicesFile(config: PickExpoConfigandroid, projectRoot: String, targetPath: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleServicesFile")(config.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("@expo/config-plugins/build/android/GoogleServices", "withApplyPlugin")
  @js.native
  val withApplyPlugin: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/android/GoogleServices", "withClassPath")
  @js.native
  val withClassPath: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/android/GoogleServices", "withGoogleServicesFile")
  @js.native
  val withGoogleServicesFile: ConfigPlugin[Unit] = js.native
}
