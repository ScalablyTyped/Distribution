package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.RemovePropWhenValueIsNull
import typings.expoConfigPlugins.buildAndroidPropertiesMod.PropertiesItem
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typings.expoConfigPlugins.buildUtilsBuildPropertiesDottypesMod.BuildPropertiesConfig
import typings.expoConfigPlugins.buildUtilsBuildPropertiesDottypesMod.ConfigToPropertyRuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidBuildPropertiesMod {
  
  @JSImport("@expo/config-plugins/build/android/BuildProperties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBuildGradlePropsConfigPlugin[SourceConfigType /* <: BuildPropertiesConfig */](configToPropertyRules: js.Array[ConfigToPropertyRuleType[SourceConfigType]]): ConfigPlugin[
    /* import warning: importer.ImportType#apply Failed type conversion: SourceConfigType extends @expo/config-types.@expo/config-types.ExpoConfig ? void : SourceConfigType */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuildGradlePropsConfigPlugin")(configToPropertyRules.asInstanceOf[js.Any]).asInstanceOf[ConfigPlugin[
    /* import warning: importer.ImportType#apply Failed type conversion: SourceConfigType extends @expo/config-types.@expo/config-types.ExpoConfig ? void : SourceConfigType */ js.Any
  ]]
  inline def createBuildGradlePropsConfigPlugin[SourceConfigType /* <: BuildPropertiesConfig */](configToPropertyRules: js.Array[ConfigToPropertyRuleType[SourceConfigType]], name: String): ConfigPlugin[
    /* import warning: importer.ImportType#apply Failed type conversion: SourceConfigType extends @expo/config-types.@expo/config-types.ExpoConfig ? void : SourceConfigType */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuildGradlePropsConfigPlugin")(configToPropertyRules.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[
    /* import warning: importer.ImportType#apply Failed type conversion: SourceConfigType extends @expo/config-types.@expo/config-types.ExpoConfig ? void : SourceConfigType */ js.Any
  ]]
  
  inline def updateAndroidBuildPropertiesFromConfig[SourceConfigType /* <: BuildPropertiesConfig */](
    config: SourceConfigType,
    gradleProperties: js.Array[PropertiesItem],
    configToPropertyRules: js.Array[ConfigToPropertyRuleType[SourceConfigType]]
  ): js.Array[PropertiesItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAndroidBuildPropertiesFromConfig")(config.asInstanceOf[js.Any], gradleProperties.asInstanceOf[js.Any], configToPropertyRules.asInstanceOf[js.Any])).asInstanceOf[js.Array[PropertiesItem]]
  
  inline def updateAndroidBuildProperty(gradleProperties: js.Array[PropertiesItem], name: String): js.Array[PropertiesItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAndroidBuildProperty")(gradleProperties.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[PropertiesItem]]
  inline def updateAndroidBuildProperty(gradleProperties: js.Array[PropertiesItem], name: String, value: String): js.Array[PropertiesItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAndroidBuildProperty")(gradleProperties.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[PropertiesItem]]
  inline def updateAndroidBuildProperty(
    gradleProperties: js.Array[PropertiesItem],
    name: String,
    value: String,
    options: RemovePropWhenValueIsNull
  ): js.Array[PropertiesItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAndroidBuildProperty")(gradleProperties.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[PropertiesItem]]
  inline def updateAndroidBuildProperty(
    gradleProperties: js.Array[PropertiesItem],
    name: String,
    value: Null,
    options: RemovePropWhenValueIsNull
  ): js.Array[PropertiesItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAndroidBuildProperty")(gradleProperties.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[PropertiesItem]]
  inline def updateAndroidBuildProperty(
    gradleProperties: js.Array[PropertiesItem],
    name: String,
    value: Unit,
    options: RemovePropWhenValueIsNull
  ): js.Array[PropertiesItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAndroidBuildProperty")(gradleProperties.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[PropertiesItem]]
  
  @JSImport("@expo/config-plugins/build/android/BuildProperties", "withJsEngineGradleProps")
  @js.native
  val withJsEngineGradleProps: ConfigPlugin[Unit] = js.native
}
