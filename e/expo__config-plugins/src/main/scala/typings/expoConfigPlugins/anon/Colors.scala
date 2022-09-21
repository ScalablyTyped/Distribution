package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.createBaseModMod.BaseModProviderMethods
import typings.expoConfigPlugins.manifestMod.AndroidManifest
import typings.expoConfigPlugins.pathsMod.ApplicationProjectFile
import typings.expoConfigPlugins.pathsMod.GradleProjectFile
import typings.expoConfigPlugins.propertiesMod.PropertiesItem
import typings.expoConfigPlugins.resourcesMod.ResourceXML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  var appBuildGradle: BaseModProviderMethods[GradleProjectFile, PartialPickBaseModOptions]
  
  var colors: BaseModProviderMethods[ResourceXML, PartialPickBaseModOptions]
  
  var colorsNight: BaseModProviderMethods[ResourceXML, PartialPickBaseModOptions]
  
  var dangerous: BaseModProviderMethods[Any, PartialPickBaseModOptions]
  
  var gradleProperties: BaseModProviderMethods[js.Array[PropertiesItem], PartialPickBaseModOptions]
  
  var mainActivity: BaseModProviderMethods[ApplicationProjectFile, PartialPickBaseModOptions]
  
  var mainApplication: BaseModProviderMethods[ApplicationProjectFile, PartialPickBaseModOptions]
  
  var manifest: BaseModProviderMethods[AndroidManifest, PartialPickBaseModOptions]
  
  var projectBuildGradle: BaseModProviderMethods[GradleProjectFile, PartialPickBaseModOptions]
  
  var settingsGradle: BaseModProviderMethods[GradleProjectFile, PartialPickBaseModOptions]
  
  var strings: BaseModProviderMethods[ResourceXML, PartialPickBaseModOptions]
  
  var styles: BaseModProviderMethods[ResourceXML, PartialPickBaseModOptions]
}
object Colors {
  
  inline def apply(
    appBuildGradle: BaseModProviderMethods[GradleProjectFile, PartialPickBaseModOptions],
    colors: BaseModProviderMethods[ResourceXML, PartialPickBaseModOptions],
    colorsNight: BaseModProviderMethods[ResourceXML, PartialPickBaseModOptions],
    dangerous: BaseModProviderMethods[Any, PartialPickBaseModOptions],
    gradleProperties: BaseModProviderMethods[js.Array[PropertiesItem], PartialPickBaseModOptions],
    mainActivity: BaseModProviderMethods[ApplicationProjectFile, PartialPickBaseModOptions],
    mainApplication: BaseModProviderMethods[ApplicationProjectFile, PartialPickBaseModOptions],
    manifest: BaseModProviderMethods[AndroidManifest, PartialPickBaseModOptions],
    projectBuildGradle: BaseModProviderMethods[GradleProjectFile, PartialPickBaseModOptions],
    settingsGradle: BaseModProviderMethods[GradleProjectFile, PartialPickBaseModOptions],
    strings: BaseModProviderMethods[ResourceXML, PartialPickBaseModOptions],
    styles: BaseModProviderMethods[ResourceXML, PartialPickBaseModOptions]
  ): Colors = {
    val __obj = js.Dynamic.literal(appBuildGradle = appBuildGradle.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], colorsNight = colorsNight.asInstanceOf[js.Any], dangerous = dangerous.asInstanceOf[js.Any], gradleProperties = gradleProperties.asInstanceOf[js.Any], mainActivity = mainActivity.asInstanceOf[js.Any], mainApplication = mainApplication.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], projectBuildGradle = projectBuildGradle.asInstanceOf[js.Any], settingsGradle = settingsGradle.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  extension [Self <: Colors](x: Self) {
    
    inline def setAppBuildGradle(value: BaseModProviderMethods[GradleProjectFile, PartialPickBaseModOptions]): Self = StObject.set(x, "appBuildGradle", value.asInstanceOf[js.Any])
    
    inline def setColors(value: BaseModProviderMethods[ResourceXML, PartialPickBaseModOptions]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsNight(value: BaseModProviderMethods[ResourceXML, PartialPickBaseModOptions]): Self = StObject.set(x, "colorsNight", value.asInstanceOf[js.Any])
    
    inline def setDangerous(value: BaseModProviderMethods[Any, PartialPickBaseModOptions]): Self = StObject.set(x, "dangerous", value.asInstanceOf[js.Any])
    
    inline def setGradleProperties(value: BaseModProviderMethods[js.Array[PropertiesItem], PartialPickBaseModOptions]): Self = StObject.set(x, "gradleProperties", value.asInstanceOf[js.Any])
    
    inline def setMainActivity(value: BaseModProviderMethods[ApplicationProjectFile, PartialPickBaseModOptions]): Self = StObject.set(x, "mainActivity", value.asInstanceOf[js.Any])
    
    inline def setMainApplication(value: BaseModProviderMethods[ApplicationProjectFile, PartialPickBaseModOptions]): Self = StObject.set(x, "mainApplication", value.asInstanceOf[js.Any])
    
    inline def setManifest(value: BaseModProviderMethods[AndroidManifest, PartialPickBaseModOptions]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setProjectBuildGradle(value: BaseModProviderMethods[GradleProjectFile, PartialPickBaseModOptions]): Self = StObject.set(x, "projectBuildGradle", value.asInstanceOf[js.Any])
    
    inline def setSettingsGradle(value: BaseModProviderMethods[GradleProjectFile, PartialPickBaseModOptions]): Self = StObject.set(x, "settingsGradle", value.asInstanceOf[js.Any])
    
    inline def setStrings(value: BaseModProviderMethods[ResourceXML, PartialPickBaseModOptions]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: BaseModProviderMethods[ResourceXML, PartialPickBaseModOptions]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
