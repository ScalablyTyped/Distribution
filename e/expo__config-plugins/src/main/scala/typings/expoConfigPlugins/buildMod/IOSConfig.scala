package typings.expoConfigPlugins.buildMod

import typings.expoConfigPlugins.anon.AddFileToProject
import typings.expoConfigPlugins.anon.BridgingHeader
import typings.expoConfigPlugins.anon.BridgingHeaderProject
import typings.expoConfigPlugins.anon.BuildConfiguration
import typings.expoConfigPlugins.anon.Configuration
import typings.expoConfigPlugins.anon.ConfigurationListId
import typings.expoConfigPlugins.anon.ExpoUsername
import typings.expoConfigPlugins.anon.FileContents
import typings.expoConfigPlugins.anon.FilePath_
import typings.expoConfigPlugins.anon.Filepath
import typings.expoConfigPlugins.anon.Framework
import typings.expoConfigPlugins.anon.GroupName
import typings.expoConfigPlugins.anon.Language
import typings.expoConfigPlugins.anon.OsType
import typings.expoConfigPlugins.anon.PartialPickExpoConfigsche
import typings.expoConfigPlugins.anon.PickExpoConfigUpdatessdkV
import typings.expoConfigPlugins.anon.PickExpoConfigios
import typings.expoConfigPlugins.anon.PickExpoConfigiossdkVersi
import typings.expoConfigPlugins.anon.PickExpoConfiglocales
import typings.expoConfigPlugins.anon.PickExpoConfigname
import typings.expoConfigPlugins.anon.PickExpoConfigorientation
import typings.expoConfigPlugins.anon.PickExpoConfigversion
import typings.expoConfigPlugins.anon.PickModPropsInfoPlistproj
import typings.expoConfigPlugins.anon.Project
import typings.expoConfigPlugins.anon.ProjectName
import typings.expoConfigPlugins.anon.ProjectProjectRoot
import typings.expoConfigPlugins.anon.ProjectRoot
import typings.expoConfigPlugins.anon.RemovePropWhenValueIsNull
import typings.expoConfigPlugins.anon.Target
import typings.expoConfigPlugins.buildIosIosConfigDottypesMod.ExpoPlist
import typings.expoConfigPlugins.buildIosIosConfigDottypesMod.InfoPlist
import typings.expoConfigPlugins.buildIosIosConfigDottypesMod.InterfaceOrientation
import typings.expoConfigPlugins.buildIosLocalesMod.ExpoConfigLocales
import typings.expoConfigPlugins.buildIosLocalesMod.LocaleJson
import typings.expoConfigPlugins.buildIosLocalesMod.ResolvedLocalesJson
import typings.expoConfigPlugins.buildIosPathsMod.AppDelegateProjectFile
import typings.expoConfigPlugins.buildIosProvisioningProfileMod.ProvisioningProfileSettings
import typings.expoConfigPlugins.buildIosTargetMod.TargetType
import typings.expoConfigPlugins.buildIosUpdatesMod.ShellScriptBuildPhase
import typings.expoConfigPlugins.buildIosUtilsXcodeprojMod.ConfigurationListEntry
import typings.expoConfigPlugins.buildIosUtilsXcodeprojMod.ConfigurationSectionEntry
import typings.expoConfigPlugins.buildIosUtilsXcodeprojMod.NativeTargetSectionEntry
import typings.expoConfigPlugins.buildIosUtilsXcodeprojMod.ProjectSectionEntry
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typings.expoConfigPlugins.buildPluginDottypesMod.ModProps
import typings.expoConfigPlugins.buildUtilsBuildPropertiesDottypesMod.BuildPropertiesConfig
import typings.expoConfigPlugins.buildUtilsBuildPropertiesDottypesMod.ConfigToPropertyRuleType
import typings.expoConfigPlugins.buildUtilsGenerateCodeMod.MergeResults
import typings.expoConfigPlugins.buildUtilsUpdatesMod.ExpoConfigUpdates
import typings.expoConfigPlugins.expoConfigPluginsBooleans.`false`
import typings.expoConfigPlugins.expoConfigPluginsStrings.default
import typings.expoConfigPlugins.expoConfigPluginsStrings.landscape
import typings.expoConfigPlugins.expoConfigPluginsStrings.portrait
import typings.expoConfigTypes.mod.ExpoConfig
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IOSConfig {
  
  object Bitcode {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Bitcode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getBitcode(config: PickExpoConfigios): typings.expoConfigPlugins.buildIosBitcodeMod.Bitcode = ^.asInstanceOf[js.Dynamic].applyDynamic("getBitcode")(config.asInstanceOf[js.Any]).asInstanceOf[typings.expoConfigPlugins.buildIosBitcodeMod.Bitcode]
    
    inline def setBitcode(bitcode: typings.expoConfigPlugins.buildIosBitcodeMod.Bitcode, param1: Project): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setBitcode")(bitcode.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def setBitcodeWithConfig(config: PickExpoConfigios, param1: Project): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setBitcodeWithConfig")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Bitcode.withBitcode")
    @js.native
    val withBitcode: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Bitcode.withCustomBitcode")
    @js.native
    val withCustomBitcode: ConfigPlugin[typings.expoConfigPlugins.buildIosBitcodeMod.Bitcode] = js.native
  }
  
  object BuildProperties {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.BuildProperties")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createBuildPodfilePropsConfigPlugin[SourceConfigType /* <: BuildPropertiesConfig */](configToPropertyRules: js.Array[ConfigToPropertyRuleType[SourceConfigType]]): ConfigPlugin[
        /* import warning: importer.ImportType#apply Failed type conversion: SourceConfigType extends @expo/config-types.@expo/config-types.ExpoConfig ? void : SourceConfigType */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuildPodfilePropsConfigPlugin")(configToPropertyRules.asInstanceOf[js.Any]).asInstanceOf[ConfigPlugin[
        /* import warning: importer.ImportType#apply Failed type conversion: SourceConfigType extends @expo/config-types.@expo/config-types.ExpoConfig ? void : SourceConfigType */ js.Any
      ]]
    inline def createBuildPodfilePropsConfigPlugin[SourceConfigType /* <: BuildPropertiesConfig */](configToPropertyRules: js.Array[ConfigToPropertyRuleType[SourceConfigType]], name: String): ConfigPlugin[
        /* import warning: importer.ImportType#apply Failed type conversion: SourceConfigType extends @expo/config-types.@expo/config-types.ExpoConfig ? void : SourceConfigType */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuildPodfilePropsConfigPlugin")(configToPropertyRules.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[
        /* import warning: importer.ImportType#apply Failed type conversion: SourceConfigType extends @expo/config-types.@expo/config-types.ExpoConfig ? void : SourceConfigType */ js.Any
      ]]
    
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
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.BuildProperties.withJsEnginePodfileProps")
    @js.native
    val withJsEnginePodfileProps: ConfigPlugin[Unit] = js.native
  }
  
  object BuildScheme {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.BuildScheme")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApplicationTargetNameForSchemeAsync(projectRoot: String, scheme: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationTargetNameForSchemeAsync")(projectRoot.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def getArchiveBuildConfigurationForSchemeAsync(projectRoot: String, scheme: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getArchiveBuildConfigurationForSchemeAsync")(projectRoot.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def getRunnableSchemesFromXcodeproj(projectRoot: String): js.Array[OsType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRunnableSchemesFromXcodeproj")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[OsType]]
    inline def getRunnableSchemesFromXcodeproj(projectRoot: String, param1: Configuration): js.Array[OsType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRunnableSchemesFromXcodeproj")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Array[OsType]]
    
    inline def getSchemesFromXcodeproj(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemesFromXcodeproj")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  object BundleIdentifier {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.BundleIdentifier")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getBundleIdentifier(config: PickExpoConfigios): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBundleIdentifier")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    /**
      * Gets the bundle identifier defined in the Xcode project found in the project directory.
      *
      * A bundle identifier is stored as a value in XCBuildConfiguration entry.
      * Those entries exist for every pair (build target, build configuration).
      * Unless target name is passed, the first target defined in the pbxproj is used
      * (to keep compatibility with the inaccurate legacy implementation of this function).
      * The build configuration is usually 'Release' or 'Debug'. However, it could be any arbitrary string.
      * Defaults to 'Release'.
      *
      * @param {string} projectRoot Path to project root containing the ios directory
      * @param {string} targetName Target name
      * @param {string} buildConfiguration Build configuration. Defaults to 'Release'.
      * @returns {string | null} bundle identifier of the Xcode project or null if the project is not configured
      */
    inline def getBundleIdentifierFromPbxproj(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBundleIdentifierFromPbxproj")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    inline def getBundleIdentifierFromPbxproj(projectRoot: String, param1: BuildConfiguration): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getBundleIdentifierFromPbxproj")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    
    inline def resetAllPlistBundleIdentifiers(projectRoot: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetAllPlistBundleIdentifiers")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def resetPlistBundleIdentifier(plistPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetPlistBundleIdentifier")(plistPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * In Turtle v1 we set the bundleIdentifier directly on Info.plist rather
      * than in pbxproj
      */
    inline def setBundleIdentifier(config: ExpoConfig, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setBundleIdentifier")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    /**
      * Updates the bundle identifier for pbx projects inside the ios directory of the given project root
      *
      * @param {string} projectRoot Path to project root containing the ios directory
      * @param {string} bundleIdentifier Desired bundle identifier
      * @param {boolean} [updateProductName=true]  Whether to update PRODUCT_NAME
      */
    inline def setBundleIdentifierForPbxproj(projectRoot: String, bundleIdentifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBundleIdentifierForPbxproj")(projectRoot.asInstanceOf[js.Any], bundleIdentifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setBundleIdentifierForPbxproj(projectRoot: String, bundleIdentifier: String, updateProductName: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBundleIdentifierForPbxproj")(projectRoot.asInstanceOf[js.Any], bundleIdentifier.asInstanceOf[js.Any], updateProductName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Updates the bundle identifier for a given pbxproj
      *
      * @param {string} pbxprojPath Path to pbxproj file
      * @param {string} bundleIdentifier Bundle identifier to set in the pbxproj
      * @param {boolean} [updateProductName=true]  Whether to update PRODUCT_NAME
      */
    inline def updateBundleIdentifierForPbxproj(pbxprojPath: String, bundleIdentifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateBundleIdentifierForPbxproj")(pbxprojPath.asInstanceOf[js.Any], bundleIdentifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updateBundleIdentifierForPbxproj(pbxprojPath: String, bundleIdentifier: String, updateProductName: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateBundleIdentifierForPbxproj")(pbxprojPath.asInstanceOf[js.Any], bundleIdentifier.asInstanceOf[js.Any], updateProductName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.BundleIdentifier.withBundleIdentifier")
    @js.native
    val withBundleIdentifier: ConfigPlugin[typings.expoConfigPlugins.anon.BundleIdentifier] = js.native
  }
  
  object DeviceFamily {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.DeviceFamily")
    @js.native
    val ^ : js.Any = js.native
    
    inline def formatDeviceFamilies(deviceFamilies: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDeviceFamilies")(deviceFamilies.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getDeviceFamilies(config: PickExpoConfigios): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceFamilies")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    inline def getIsTabletOnly(config: PickExpoConfigios): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsTabletOnly")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def getSupportsTablet(config: PickExpoConfigios): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportsTablet")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def setDeviceFamily(config: PickExpoConfigios, param1: Project): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setDeviceFamily")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.DeviceFamily.withDeviceFamily")
    @js.native
    val withDeviceFamily: ConfigPlugin[Unit] = js.native
  }
  
  object Entitlements {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Entitlements")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ensureApplicationTargetEntitlementsFileConfigured(projectRoot: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureApplicationTargetEntitlementsFileConfigured")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getEntitlementsPath(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntitlementsPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    inline def getEntitlementsPath(projectRoot: String, param1: BuildConfiguration): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntitlementsPath")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    
    inline def setAssociatedDomains(
      config: ExpoConfig,
      param1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setAssociatedDomains")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Entitlements.withAssociatedDomains")
    @js.native
    val withAssociatedDomains: ConfigPlugin[Unit] = js.native
  }
  
  object Google {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Google")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getGoogleServicesFile(config: PickExpoConfigios): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleServicesFile")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def getGoogleSignInReservedClientId(config: PickExpoConfigios, modRequest: PickModPropsInfoPlistproj): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleSignInReservedClientId")(config.asInstanceOf[js.Any], modRequest.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    
    inline def setGoogleConfig(config: PickExpoConfigios, infoPlist: InfoPlist, modRequest: ModProps[InfoPlist]): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleConfig")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any], modRequest.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    inline def setGoogleServicesFile(config: PickExpoConfigios, param1: ProjectRoot): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleServicesFile")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def setGoogleSignInReservedClientId(config: PickExpoConfigios, infoPlist: InfoPlist, modRequest: PickModPropsInfoPlistproj): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleSignInReservedClientId")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any], modRequest.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Google.withGoogle")
    @js.native
    val withGoogle: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Google.withGoogleServicesFile")
    @js.native
    val withGoogleServicesFile: ConfigPlugin[Unit] = js.native
  }
  
  object Locales {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Locales")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getLocales(config: PickExpoConfiglocales): (Record[String, String | LocaleJson]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocales")(config.asInstanceOf[js.Any]).asInstanceOf[(Record[String, String | LocaleJson]) | Null]
    
    inline def getResolvedLocalesAsync(projectRoot: String, input: ExpoConfigLocales): js.Promise[ResolvedLocalesJson] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolvedLocalesAsync")(projectRoot.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResolvedLocalesJson]]
    
    inline def setLocalesAsync(config: PickExpoConfiglocales, param1: ProjectProjectRoot): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocalesAsync")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
      ]]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Locales.withLocales")
    @js.native
    val withLocales: ConfigPlugin[Unit] = js.native
  }
  
  object Maps {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Maps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Maps.MATCH_INIT")
    @js.native
    val MATCH_INIT: js.RegExp = js.native
    
    inline def addGoogleMapsAppDelegateImport(src: String): MergeResults = ^.asInstanceOf[js.Dynamic].applyDynamic("addGoogleMapsAppDelegateImport")(src.asInstanceOf[js.Any]).asInstanceOf[MergeResults]
    
    inline def addGoogleMapsAppDelegateInit(src: String, apiKey: String): MergeResults = (^.asInstanceOf[js.Dynamic].applyDynamic("addGoogleMapsAppDelegateInit")(src.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[MergeResults]
    
    inline def addMapsCocoaPods(src: String): MergeResults = ^.asInstanceOf[js.Dynamic].applyDynamic("addMapsCocoaPods")(src.asInstanceOf[js.Any]).asInstanceOf[MergeResults]
    
    inline def getGoogleMapsApiKey(config: PickExpoConfigios): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleMapsApiKey")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def removeGoogleMapsAppDelegateImport(src: String): MergeResults = ^.asInstanceOf[js.Dynamic].applyDynamic("removeGoogleMapsAppDelegateImport")(src.asInstanceOf[js.Any]).asInstanceOf[MergeResults]
    
    inline def removeGoogleMapsAppDelegateInit(src: String): MergeResults = ^.asInstanceOf[js.Dynamic].applyDynamic("removeGoogleMapsAppDelegateInit")(src.asInstanceOf[js.Any]).asInstanceOf[MergeResults]
    
    inline def removeMapsCocoaPods(src: String): MergeResults = ^.asInstanceOf[js.Dynamic].applyDynamic("removeMapsCocoaPods")(src.asInstanceOf[js.Any]).asInstanceOf[MergeResults]
    
    inline def setGoogleMapsApiKey(config: PickExpoConfigios, param1: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleMapsApiKey")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Maps.withMaps")
    @js.native
    val withMaps: ConfigPlugin[Unit] = js.native
  }
  
  object Name {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Name")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getName(config: PickExpoConfigname): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def setDisplayName(configOrName: String, param1: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayName")(configOrName.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    inline def setDisplayName(configOrName: PickExpoConfigname, param1: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayName")(configOrName.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    inline def setName(config: PickExpoConfigname, param1: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setName")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    inline def setProductName(
      config: PickExpoConfigname,
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setProductName")(config.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Name.withDisplayName")
    @js.native
    val withDisplayName: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Name.withName")
    @js.native
    val withName: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Name.withProductName")
    @js.native
    val withProductName: ConfigPlugin[Unit] = js.native
  }
  
  object Orientation {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Orientation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Orientation.LANDSCAPE_ORIENTATIONS")
    @js.native
    val LANDSCAPE_ORIENTATIONS: js.Array[InterfaceOrientation] = js.native
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Orientation.PORTRAIT_ORIENTATIONS")
    @js.native
    val PORTRAIT_ORIENTATIONS: js.Array[InterfaceOrientation] = js.native
    
    inline def getOrientation(config: PickExpoConfigorientation): default | portrait | landscape | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientation")(config.asInstanceOf[js.Any]).asInstanceOf[default | portrait | landscape | Null]
    
    inline def setOrientation(config: PickExpoConfigorientation, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setOrientation")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Orientation.withOrientation")
    @js.native
    val withOrientation: ConfigPlugin[Unit] = js.native
  }
  
  object Paths {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Paths")
    @js.native
    val ^ : js.Any = js.native
    
    inline def findSchemeNames(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSchemeNames")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def findSchemePaths(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSchemePaths")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def getAllEntitlementsPaths(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllEntitlementsPaths")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def getAllInfoPlistPaths(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllInfoPlistPaths")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def getAllPBXProjectPaths(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllPBXProjectPaths")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def getAllXcodeProjectPaths(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllXcodeProjectPaths")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def getAppDelegate(projectRoot: String): AppDelegateProjectFile = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppDelegate")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[AppDelegateProjectFile]
    
    inline def getAppDelegateFilePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppDelegateFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getAppDelegateHeaderFilePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppDelegateHeaderFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getAppDelegateObjcHeaderFilePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppDelegateObjcHeaderFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getEntitlementsPath(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntitlementsPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def getExpoPlistPath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExpoPlistPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getFileInfo(filePath: String): Language = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileInfo")(filePath.asInstanceOf[js.Any]).asInstanceOf[Language]
    
    inline def getInfoPlistPath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfoPlistPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getPBXProjectPath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPBXProjectPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getSourceRoot(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getSupportingPath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportingPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getXcodeProjectPath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getXcodeProjectPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object Permissions {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Permissions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def applyPermissions_false[Defaults /* <: Record[String, String] */](
      defaults: Defaults,
      permissions: Partial[Record[/* keyof Defaults */ String, String | `false`]],
      infoPlist: InfoPlist
    ): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPermissions")(defaults.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    inline def createPermissionsPlugin[Defaults /* <: Record[String, String] */](defaults: Defaults): ConfigPlugin[Record[/* keyof Defaults */ String, js.UndefOr[String | `false`]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPermissionsPlugin")(defaults.asInstanceOf[js.Any]).asInstanceOf[ConfigPlugin[Record[/* keyof Defaults */ String, js.UndefOr[String | `false`]]]]
    inline def createPermissionsPlugin[Defaults /* <: Record[String, String] */](defaults: Defaults, name: String): ConfigPlugin[Record[/* keyof Defaults */ String, js.UndefOr[String | `false`]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPermissionsPlugin")(defaults.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[Record[/* keyof Defaults */ String, js.UndefOr[String | `false`]]]]
  }
  
  object ProvisioningProfile {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.ProvisioningProfile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def setProvisioningProfileForPbxproj(projectRoot: String, param1: ProvisioningProfileSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setProvisioningProfileForPbxproj")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object RequiresFullScreen {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.RequiresFullScreen")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getRequiresFullScreen(config: PickExpoConfigiossdkVersi): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequiresFullScreen")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def setRequiresFullScreen(config: PickExpoConfigios, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setRequiresFullScreen")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.RequiresFullScreen.withRequiresFullScreen")
    @js.native
    val withRequiresFullScreen: ConfigPlugin[Unit] = js.native
  }
  
  object Scheme {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Scheme")
    @js.native
    val ^ : js.Any = js.native
    
    inline def appendScheme(scheme: String, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("appendScheme")(scheme.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    inline def appendScheme(scheme: Null, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("appendScheme")(scheme.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    inline def getScheme(config: typings.expoConfigPlugins.anon.Scheme): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScheme")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def getSchemesFromPlist(infoPlist: InfoPlist): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemesFromPlist")(infoPlist.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def hasScheme(scheme: String, infoPlist: InfoPlist): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasScheme")(scheme.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def removeScheme(scheme: String, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("removeScheme")(scheme.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    inline def removeScheme(scheme: Null, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("removeScheme")(scheme.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    inline def setScheme(config: PartialPickExpoConfigsche, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setScheme")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Scheme.withScheme")
    @js.native
    val withScheme: ConfigPlugin[Unit] = js.native
  }
  
  object Swift {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Swift")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createBridgingHeaderFile(param0: BridgingHeader): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBridgingHeaderFile")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def ensureSwiftBridgingHeaderSetup(param0: ProjectProjectRoot): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureSwiftBridgingHeaderSetup")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getDesignatedSwiftBridgingHeaderFileReference(param0: Project): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDesignatedSwiftBridgingHeaderFileReference")(param0.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def linkBridgingHeaderFile(param0: BridgingHeaderProject): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("linkBridgingHeaderFile")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Swift.withNoopSwiftFile")
    @js.native
    val withNoopSwiftFile: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Swift.withSwiftBridgingHeader")
    @js.native
    val withSwiftBridgingHeader: ConfigPlugin[Unit] = js.native
  }
  
  object Target {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Target")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Target.TargetType")
    @js.native
    object TargetType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.expoConfigPlugins.buildIosTargetMod.TargetType & String] = js.native
      
      /* "com.apple.product-type.application" */ val APPLICATION: typings.expoConfigPlugins.buildIosTargetMod.TargetType.APPLICATION & String = js.native
      
      /* "com.apple.product-type.application.on-demand-install-capable" */ val APP_CLIP: typings.expoConfigPlugins.buildIosTargetMod.TargetType.APP_CLIP & String = js.native
      
      /* "com.apple.product-type.app-extension" */ val EXTENSION: typings.expoConfigPlugins.buildIosTargetMod.TargetType.EXTENSION & String = js.native
      
      /* "other" */ val OTHER: typings.expoConfigPlugins.buildIosTargetMod.TargetType.OTHER & String = js.native
      
      /* "com.apple.product-type.app-extension.messages-sticker-pack" */ val STICKER_PACK_EXTENSION: typings.expoConfigPlugins.buildIosTargetMod.TargetType.STICKER_PACK_EXTENSION & String = js.native
      
      /* "com.apple.product-type.application.watchapp" */ val WATCH: typings.expoConfigPlugins.buildIosTargetMod.TargetType.WATCH & String = js.native
    }
    
    inline def findApplicationTargetWithDependenciesAsync(projectRoot: String, scheme: String): js.Promise[typings.expoConfigPlugins.buildIosTargetMod.Target] = (^.asInstanceOf[js.Dynamic].applyDynamic("findApplicationTargetWithDependenciesAsync")(projectRoot.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.expoConfigPlugins.buildIosTargetMod.Target]]
    
    inline def findFirstNativeTarget(
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): NativeTargetSectionEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNativeTarget")(project.asInstanceOf[js.Any]).asInstanceOf[NativeTargetSectionEntry]
    
    inline def findNativeTargetByName(
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any,
      targetName: String
    ): NativeTargetSectionEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("findNativeTargetByName")(project.asInstanceOf[js.Any], targetName.asInstanceOf[js.Any])).asInstanceOf[NativeTargetSectionEntry]
    
    inline def findSignableTargets(
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): js.Array[NativeTargetSectionEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSignableTargets")(project.asInstanceOf[js.Any]).asInstanceOf[js.Array[NativeTargetSectionEntry]]
    
    inline def getNativeTargets(
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): js.Array[NativeTargetSectionEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeTargets")(project.asInstanceOf[js.Any]).asInstanceOf[js.Array[NativeTargetSectionEntry]]
    
    inline def getXCBuildConfigurationFromPbxproj(
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XCBuildConfiguration */ Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getXCBuildConfigurationFromPbxproj")(project.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XCBuildConfiguration */ Any) | Null]
    inline def getXCBuildConfigurationFromPbxproj(
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any,
      param1: BuildConfiguration
    ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XCBuildConfiguration */ Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getXCBuildConfigurationFromPbxproj")(project.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XCBuildConfiguration */ Any) | Null]
    
    inline def isTargetOfType(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXNativeTarget */ Any,
      targetType: TargetType
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTargetOfType")(target.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object Updates {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Updates")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Updates.Config")
    @js.native
    object Config extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.expoConfigPlugins.buildIosUpdatesMod.Config & String] = js.native
      
      /* "EXUpdatesCheckOnLaunch" */ val CHECK_ON_LAUNCH: typings.expoConfigPlugins.buildIosUpdatesMod.Config.CHECK_ON_LAUNCH & String = js.native
      
      /* "EXUpdatesCodeSigningCertificate" */ val CODE_SIGNING_CERTIFICATE: typings.expoConfigPlugins.buildIosUpdatesMod.Config.CODE_SIGNING_CERTIFICATE & String = js.native
      
      /* "EXUpdatesCodeSigningMetadata" */ val CODE_SIGNING_METADATA: typings.expoConfigPlugins.buildIosUpdatesMod.Config.CODE_SIGNING_METADATA & String = js.native
      
      /* "EXUpdatesEnabled" */ val ENABLED: typings.expoConfigPlugins.buildIosUpdatesMod.Config.ENABLED & String = js.native
      
      /* "EXUpdatesLaunchWaitMs" */ val LAUNCH_WAIT_MS: typings.expoConfigPlugins.buildIosUpdatesMod.Config.LAUNCH_WAIT_MS & String = js.native
      
      /* "EXUpdatesReleaseChannel" */ val RELEASE_CHANNEL: typings.expoConfigPlugins.buildIosUpdatesMod.Config.RELEASE_CHANNEL & String = js.native
      
      /* "EXUpdatesRuntimeVersion" */ val RUNTIME_VERSION: typings.expoConfigPlugins.buildIosUpdatesMod.Config.RUNTIME_VERSION & String = js.native
      
      /* "EXUpdatesSDKVersion" */ val SDK_VERSION: typings.expoConfigPlugins.buildIosUpdatesMod.Config.SDK_VERSION & String = js.native
      
      /* "EXUpdatesRequestHeaders" */ val UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY: typings.expoConfigPlugins.buildIosUpdatesMod.Config.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY & String = js.native
      
      /* "EXUpdatesURL" */ val UPDATE_URL: typings.expoConfigPlugins.buildIosUpdatesMod.Config.UPDATE_URL & String = js.native
    }
    
    inline def ensureBundleReactNativePhaseContainsConfigurationScript(
      projectRoot: String,
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.XcodeProject */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureBundleReactNativePhaseContainsConfigurationScript")(projectRoot.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getBundleReactNativePhase(
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.XcodeProject */ Any
    ): ShellScriptBuildPhase = ^.asInstanceOf[js.Dynamic].applyDynamic("getBundleReactNativePhase")(project.asInstanceOf[js.Any]).asInstanceOf[ShellScriptBuildPhase]
    
    inline def isPlistConfigurationSet(expoPlist: ExpoPlist): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlistConfigurationSet")(expoPlist.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isPlistConfigurationSynced(projectRoot: String, config: ExpoConfigUpdates, expoPlist: ExpoPlist): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPlistConfigurationSynced")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expoPlist.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isPlistConfigurationSynced(projectRoot: String, config: ExpoConfigUpdates, expoPlist: ExpoPlist, username: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPlistConfigurationSynced")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expoPlist.asInstanceOf[js.Any], username.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isPlistVersionConfigurationSynced(config: PickExpoConfigUpdatessdkV, expoPlist: ExpoPlist): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPlistVersionConfigurationSynced")(config.asInstanceOf[js.Any], expoPlist.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isShellScriptBuildPhaseConfigured(
      projectRoot: String,
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.XcodeProject */ Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isShellScriptBuildPhaseConfigured")(projectRoot.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def setUpdatesConfig(projectRoot: String, config: ExpoConfigUpdates, expoPlist: ExpoPlist): ExpoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdatesConfig")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expoPlist.asInstanceOf[js.Any])).asInstanceOf[ExpoPlist]
    inline def setUpdatesConfig(projectRoot: String, config: ExpoConfigUpdates, expoPlist: ExpoPlist, username: String): ExpoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdatesConfig")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expoPlist.asInstanceOf[js.Any], username.asInstanceOf[js.Any])).asInstanceOf[ExpoPlist]
    inline def setUpdatesConfig(
      projectRoot: String,
      config: ExpoConfigUpdates,
      expoPlist: ExpoPlist,
      username: String,
      expoUpdatesPackageVersion: String
    ): ExpoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdatesConfig")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expoPlist.asInstanceOf[js.Any], username.asInstanceOf[js.Any], expoUpdatesPackageVersion.asInstanceOf[js.Any])).asInstanceOf[ExpoPlist]
    inline def setUpdatesConfig(
      projectRoot: String,
      config: ExpoConfigUpdates,
      expoPlist: ExpoPlist,
      username: Null,
      expoUpdatesPackageVersion: String
    ): ExpoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdatesConfig")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expoPlist.asInstanceOf[js.Any], username.asInstanceOf[js.Any], expoUpdatesPackageVersion.asInstanceOf[js.Any])).asInstanceOf[ExpoPlist]
    
    inline def setVersionsConfig(config: ExpoConfigUpdates, expoPlist: ExpoPlist): ExpoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setVersionsConfig")(config.asInstanceOf[js.Any], expoPlist.asInstanceOf[js.Any])).asInstanceOf[ExpoPlist]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Updates.withUpdates")
    @js.native
    val withUpdates: ConfigPlugin[ExpoUsername] = js.native
  }
  
  object UsesNonExemptEncryption {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.UsesNonExemptEncryption")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getUsesNonExemptEncryption(config: PickExpoConfigios): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsesNonExemptEncryption")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
    
    inline def setUsesNonExemptEncryption(config: PickExpoConfigios, param1: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setUsesNonExemptEncryption")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.UsesNonExemptEncryption.withUsesNonExemptEncryption")
    @js.native
    val withUsesNonExemptEncryption: ConfigPlugin[Unit] = js.native
  }
  
  object Version {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Version")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getBuildNumber(config: PickExpoConfigios): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBuildNumber")(config.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getVersion(config: PickExpoConfigversion): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")(config.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def setBuildNumber(config: PickExpoConfigios, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setBuildNumber")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    inline def setVersion(config: PickExpoConfigversion, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setVersion")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Version.withBuildNumber")
    @js.native
    val withBuildNumber: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.Version.withVersion")
    @js.native
    val withVersion: ConfigPlugin[Unit] = js.native
  }
  
  object XcodeProjectFile {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.XcodeProjectFile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createBuildSourceFile(param0: FileContents): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuildSourceFile")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.XcodeProjectFile.withBuildSourceFile")
    @js.native
    val withBuildSourceFile: ConfigPlugin[FilePath_] = js.native
  }
  
  object XcodeUtils {
    
    @JSImport("@expo/config-plugins/build", "IOSConfig.XcodeUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addBuildSourceFileToGroup(param0: Filepath): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addBuildSourceFileToGroup")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def addFileToGroupAndLink(param0: AddFileToProject): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addFileToGroupAndLink")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def addFramework(param0: Framework): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addFramework")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def addResourceFileToGroup(param0: GroupName): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addResourceFileToGroup")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def ensureGroupRecursively(
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any,
      filepath: String
    ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXGroup */ Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureGroupRecursively")(project.asInstanceOf[js.Any], filepath.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXGroup */ Any) | Null]
    
    inline def getApplicationNativeTarget(param0: ProjectName): Target = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationNativeTarget")(param0.asInstanceOf[js.Any]).asInstanceOf[Target]
    
    inline def getBuildConfigurationForListIdAndName(
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any,
      param1: ConfigurationListId
    ): ConfigurationSectionEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("getBuildConfigurationForListIdAndName")(project.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ConfigurationSectionEntry]
    
    inline def getBuildConfigurationsForListId(
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any,
      configurationListId: String
    ): js.Array[ConfigurationSectionEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBuildConfigurationsForListId")(project.asInstanceOf[js.Any], configurationListId.asInstanceOf[js.Any])).asInstanceOf[js.Array[ConfigurationSectionEntry]]
    
    inline def getHackyProjectName(projectRoot: String, config: ExpoConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHackyProjectName")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getPbxproj(projectRoot: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPbxproj")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getProductName(
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProductName")(project.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getProjectName(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectName")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getProjectSection(
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): (Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.PBXProject */ Any
      ]) & (Record[String, String]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectSection")(project.asInstanceOf[js.Any]).asInstanceOf[(Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.PBXProject */ Any
      ]) & (Record[String, String])]
    
    inline def getXCConfigurationListEntries(
      project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): js.Array[ConfigurationListEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getXCConfigurationListEntries")(project.asInstanceOf[js.Any]).asInstanceOf[js.Array[ConfigurationListEntry]]
    
    inline def isBuildConfig(param0: ConfigurationSectionEntry): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuildConfig")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNotComment(
      param0: ConfigurationListEntry | ConfigurationSectionEntry | NativeTargetSectionEntry | ProjectSectionEntry
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotComment")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNotTestHost(param0: ConfigurationSectionEntry): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotTestHost")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def resolvePathOrProject(projectRootOrProject: String): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePathOrProject")(projectRootOrProject.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any) | Null]
    inline def resolvePathOrProject(
      projectRootOrProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePathOrProject")(projectRootOrProject.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any) | Null]
    
    inline def sanitizedName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizedName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def unquote(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unquote")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
