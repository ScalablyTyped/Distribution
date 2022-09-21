package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.RemovePropWhenValueIsNull
import typings.expoConfigPlugins.buildPropertiesTypesMod.BuildPropertiesConfig
import typings.expoConfigPlugins.buildPropertiesTypesMod.ConfigToPropertyRuleType
import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosBuildPropertiesMod {
  
  @JSImport("@expo/config-plugins/build/ios/BuildProperties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBuildPodfilePropsConfigPlugin[SourceConfigType /* <: BuildPropertiesConfig */](configToPropertyRules: js.Array[ConfigToPropertyRuleType[SourceConfigType]]): ConfigPlugin[SourceConfigType | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuildPodfilePropsConfigPlugin")(configToPropertyRules.asInstanceOf[js.Any]).asInstanceOf[ConfigPlugin[SourceConfigType | Unit]]
  inline def createBuildPodfilePropsConfigPlugin[SourceConfigType /* <: BuildPropertiesConfig */](configToPropertyRules: js.Array[ConfigToPropertyRuleType[SourceConfigType]], name: String): ConfigPlugin[SourceConfigType | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuildPodfilePropsConfigPlugin")(configToPropertyRules.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[SourceConfigType | Unit]]
  
  inline def updateIosBuildPropertiesFromConfig[SourceConfigType /* <: BuildPropertiesConfig */](
    config: SourceConfigType,
    podfileProperties: Record[String, String],
    configToPropertyRules: js.Array[ConfigToPropertyRuleType[SourceConfigType]]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIosBuildPropertiesFromConfig")(config.asInstanceOf[js.Any], podfileProperties.asInstanceOf[js.Any], configToPropertyRules.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  
  inline def updateIosBuildProperty(podfileProperties: Record[String, String], name: String): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIosBuildProperty")(podfileProperties.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def updateIosBuildProperty(podfileProperties: Record[String, String], name: String, value: String): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIosBuildProperty")(podfileProperties.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def updateIosBuildProperty(
    podfileProperties: Record[String, String],
    name: String,
    value: String,
    options: RemovePropWhenValueIsNull
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIosBuildProperty")(podfileProperties.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def updateIosBuildProperty(
    podfileProperties: Record[String, String],
    name: String,
    value: Null,
    options: RemovePropWhenValueIsNull
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIosBuildProperty")(podfileProperties.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def updateIosBuildProperty(
    podfileProperties: Record[String, String],
    name: String,
    value: Unit,
    options: RemovePropWhenValueIsNull
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIosBuildProperty")(podfileProperties.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  
  @JSImport("@expo/config-plugins/build/ios/BuildProperties", "withJsEnginePodfileProps")
  @js.native
  val withJsEnginePodfileProps: ConfigPlugin[Unit] = js.native
}
