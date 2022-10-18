package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildAndroidManifestMod.AndroidManifest
import typings.expoConfigPlugins.buildAndroidPathsMod.ApplicationProjectFile
import typings.expoConfigPlugins.buildAndroidPathsMod.GradleProjectFile
import typings.expoConfigPlugins.buildAndroidPropertiesMod.PropertiesItem
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceXML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppBuildGradle extends StObject {
  
  /**
    * Modify the `android/app/build.gradle` as a string.
    */
  var appBuildGradle: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[GradleProjectFile]] = js.undefined
  
  /**
    * Modify the `android/app/src/main/res/values/colors.xml` as JSON (parsed with [`xml2js`](https://www.npmjs.com/package/xml2js)).
    */
  var colors: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[ResourceXML]] = js.undefined
  
  /**
    * Modify the `android/app/src/main/res/values-night/colors.xml` as JSON (parsed with [`xml2js`](https://www.npmjs.com/package/xml2js)).
    */
  var colorsNight: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[ResourceXML]] = js.undefined
  
  /**
    * Dangerously make a modification before any other android mods have been run.
    */
  var dangerous: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[Any]] = js.undefined
  
  /**
    * Modify the `android/gradle.properties` as a `Properties.PropertiesItem[]`.
    */
  var gradleProperties: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[js.Array[PropertiesItem]]] = js.undefined
  
  /**
    * Modify the `android/app/src/main/<package>/MainActivity.java` as a string.
    */
  var mainActivity: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[ApplicationProjectFile]] = js.undefined
  
  /**
    * Modify the `android/app/src/main/<package>/MainApplication.java` as a string.
    */
  var mainApplication: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[ApplicationProjectFile]] = js.undefined
  
  /**
    * Modify the `android/app/src/main/AndroidManifest.xml` as JSON (parsed with [`xml2js`](https://www.npmjs.com/package/xml2js)).
    */
  var manifest: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[AndroidManifest]] = js.undefined
  
  /**
    * Modify the `android/build.gradle` as a string.
    */
  var projectBuildGradle: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[GradleProjectFile]] = js.undefined
  
  /**
    * Modify the `android/settings.gradle` as a string.
    */
  var settingsGradle: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[GradleProjectFile]] = js.undefined
  
  /**
    * Modify the `android/app/src/main/res/values/strings.xml` as JSON (parsed with [`xml2js`](https://www.npmjs.com/package/xml2js)).
    */
  var strings: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[ResourceXML]] = js.undefined
  
  /**
    * Modify the `android/app/src/main/res/values/styles.xml` as JSON (parsed with [`xml2js`](https://www.npmjs.com/package/xml2js)).
    */
  var styles: js.UndefOr[typings.expoConfigPlugins.buildPluginDottypesMod.Mod[ResourceXML]] = js.undefined
}
object AppBuildGradle {
  
  inline def apply(): AppBuildGradle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBuildGradle]
  }
  
  extension [Self <: AppBuildGradle](x: Self) {
    
    inline def setAppBuildGradle(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[GradleProjectFile]): Self = StObject.set(x, "appBuildGradle", value.asInstanceOf[js.Any])
    
    inline def setAppBuildGradleUndefined: Self = StObject.set(x, "appBuildGradle", js.undefined)
    
    inline def setColors(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[ResourceXML]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsNight(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[ResourceXML]): Self = StObject.set(x, "colorsNight", value.asInstanceOf[js.Any])
    
    inline def setColorsNightUndefined: Self = StObject.set(x, "colorsNight", js.undefined)
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setDangerous(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[Any]): Self = StObject.set(x, "dangerous", value.asInstanceOf[js.Any])
    
    inline def setDangerousUndefined: Self = StObject.set(x, "dangerous", js.undefined)
    
    inline def setGradleProperties(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[js.Array[PropertiesItem]]): Self = StObject.set(x, "gradleProperties", value.asInstanceOf[js.Any])
    
    inline def setGradlePropertiesUndefined: Self = StObject.set(x, "gradleProperties", js.undefined)
    
    inline def setMainActivity(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[ApplicationProjectFile]): Self = StObject.set(x, "mainActivity", value.asInstanceOf[js.Any])
    
    inline def setMainActivityUndefined: Self = StObject.set(x, "mainActivity", js.undefined)
    
    inline def setMainApplication(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[ApplicationProjectFile]): Self = StObject.set(x, "mainApplication", value.asInstanceOf[js.Any])
    
    inline def setMainApplicationUndefined: Self = StObject.set(x, "mainApplication", js.undefined)
    
    inline def setManifest(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[AndroidManifest]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setProjectBuildGradle(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[GradleProjectFile]): Self = StObject.set(x, "projectBuildGradle", value.asInstanceOf[js.Any])
    
    inline def setProjectBuildGradleUndefined: Self = StObject.set(x, "projectBuildGradle", js.undefined)
    
    inline def setSettingsGradle(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[GradleProjectFile]): Self = StObject.set(x, "settingsGradle", value.asInstanceOf[js.Any])
    
    inline def setSettingsGradleUndefined: Self = StObject.set(x, "settingsGradle", js.undefined)
    
    inline def setStrings(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[ResourceXML]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    inline def setStyles(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[ResourceXML]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
