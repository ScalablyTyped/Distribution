package typings.expoConfig

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfig.anon.AppName
import typings.expoConfig.anon.Config
import typings.expoConfig.anon.PartialExpoConfig
import typings.expoConfig.anon.PickExpoConfigsdkVersion
import typings.expoConfig.buildConfigDottypesMod.ConfigFilePaths
import typings.expoConfig.buildConfigDottypesMod.GetConfigOptions
import typings.expoConfig.buildConfigDottypesMod.PackageJSONConfig
import typings.expoConfig.buildConfigDottypesMod.ProjectConfig
import typings.expoConfig.buildConfigDottypesMod.ProjectTarget
import typings.expoConfig.buildConfigDottypesMod.WriteConfigOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildConfigMod {
  
  @JSImport("@expo/config/build/Config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/config/build/Config", "ProjectPrivacy")
  @js.native
  object ProjectPrivacy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoConfig.buildConfigDottypesMod.ProjectPrivacy & String] = js.native
    
    /* "public" */ val PUBLIC: typings.expoConfig.buildConfigDottypesMod.ProjectPrivacy.PUBLIC & String = js.native
    
    /* "unlisted" */ val UNLISTED: typings.expoConfig.buildConfigDottypesMod.ProjectPrivacy.UNLISTED & String = js.native
  }
  
  inline def getConfig(projectRoot: String): ProjectConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[ProjectConfig]
  inline def getConfig(projectRoot: String, options: GetConfigOptions): ProjectConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProjectConfig]
  
  inline def getConfigFilePaths(projectRoot: String): ConfigFilePaths = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigFilePaths")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[ConfigFilePaths]
  
  inline def getDefaultTarget(projectRoot: String): ProjectTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTarget")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[ProjectTarget]
  inline def getDefaultTarget(projectRoot: String, exp: PickExpoConfigsdkVersion): ProjectTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTarget")(projectRoot.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[ProjectTarget]
  
  inline def getNameFromConfig(): AppName = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameFromConfig")().asInstanceOf[AppName]
  inline def getNameFromConfig(exp: Record[String, Any]): AppName = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameFromConfig")(exp.asInstanceOf[js.Any]).asInstanceOf[AppName]
  
  inline def getPackageJson(projectRoot: String): PackageJSONConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageJson")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[PackageJSONConfig]
  
  inline def getProjectConfigDescription(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectConfigDescription")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getProjectConfigDescriptionWithPaths(projectRoot: String, projectConfig: ConfigFilePaths): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectConfigDescriptionWithPaths")(projectRoot.asInstanceOf[js.Any], projectConfig.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getWebOutputPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebOutputPath")().asInstanceOf[String]
  inline def getWebOutputPath(config: StringDictionary[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebOutputPath")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def modifyConfigAsync(projectRoot: String, modifications: PartialExpoConfig): js.Promise[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyConfigAsync")(projectRoot.asInstanceOf[js.Any], modifications.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config]]
  inline def modifyConfigAsync(
    projectRoot: String,
    modifications: PartialExpoConfig,
    readOptions: Unit,
    writeOptions: WriteConfigOptions
  ): js.Promise[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyConfigAsync")(projectRoot.asInstanceOf[js.Any], modifications.asInstanceOf[js.Any], readOptions.asInstanceOf[js.Any], writeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config]]
  inline def modifyConfigAsync(projectRoot: String, modifications: PartialExpoConfig, readOptions: GetConfigOptions): js.Promise[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyConfigAsync")(projectRoot.asInstanceOf[js.Any], modifications.asInstanceOf[js.Any], readOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config]]
  inline def modifyConfigAsync(
    projectRoot: String,
    modifications: PartialExpoConfig,
    readOptions: GetConfigOptions,
    writeOptions: WriteConfigOptions
  ): js.Promise[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyConfigAsync")(projectRoot.asInstanceOf[js.Any], modifications.asInstanceOf[js.Any], readOptions.asInstanceOf[js.Any], writeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config]]
}
