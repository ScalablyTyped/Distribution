package typings.expoConfigPlugins

import typings.expoConfigPlugins.buildAndroidManifestMod.AndroidManifest
import typings.expoConfigPlugins.buildAndroidPathsMod.ApplicationProjectFile
import typings.expoConfigPlugins.buildAndroidPathsMod.GradleProjectFile
import typings.expoConfigPlugins.buildAndroidPropertiesMod.PropertiesItem
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceXML
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typings.expoConfigPlugins.buildPluginDottypesMod.Mod
import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsAndroidPluginsMod {
  
  @JSImport("@expo/config-plugins/build/plugins/android-plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAndroidManifestPlugin(action: MutateDataAction[AndroidManifest], name: String): ConfigPlugin[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAndroidManifestPlugin")(action.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[Unit]]
  
  inline def createStringsXmlPlugin(action: MutateDataAction[ResourceXML], name: String): ConfigPlugin[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStringsXmlPlugin")(action.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[Unit]]
  
  @JSImport("@expo/config-plugins/build/plugins/android-plugins", "withAndroidColors")
  @js.native
  val withAndroidColors: ConfigPlugin[Mod[ResourceXML]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/android-plugins", "withAndroidColorsNight")
  @js.native
  val withAndroidColorsNight: ConfigPlugin[Mod[ResourceXML]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/android-plugins", "withAndroidManifest")
  @js.native
  val withAndroidManifest: ConfigPlugin[Mod[AndroidManifest]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/android-plugins", "withAndroidStyles")
  @js.native
  val withAndroidStyles: ConfigPlugin[Mod[ResourceXML]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/android-plugins", "withAppBuildGradle")
  @js.native
  val withAppBuildGradle: ConfigPlugin[Mod[GradleProjectFile]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/android-plugins", "withGradleProperties")
  @js.native
  val withGradleProperties: ConfigPlugin[Mod[js.Array[PropertiesItem]]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/android-plugins", "withMainActivity")
  @js.native
  val withMainActivity: ConfigPlugin[Mod[ApplicationProjectFile]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/android-plugins", "withMainApplication")
  @js.native
  val withMainApplication: ConfigPlugin[Mod[ApplicationProjectFile]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/android-plugins", "withProjectBuildGradle")
  @js.native
  val withProjectBuildGradle: ConfigPlugin[Mod[GradleProjectFile]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/android-plugins", "withSettingsGradle")
  @js.native
  val withSettingsGradle: ConfigPlugin[Mod[GradleProjectFile]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/android-plugins", "withStringsXml")
  @js.native
  val withStringsXml: ConfigPlugin[Mod[ResourceXML]] = js.native
  
  type MutateDataAction[T] = js.Function2[/* expo */ ExpoConfig, /* data */ T, OptionalPromise[T]]
  
  type OptionalPromise[T] = T | js.Promise[T]
}
