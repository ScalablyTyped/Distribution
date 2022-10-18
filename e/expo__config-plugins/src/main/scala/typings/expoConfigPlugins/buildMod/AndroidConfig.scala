package typings.expoConfigPlugins.buildMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfigPlugins.anon.Add
import typings.expoConfigPlugins.anon.Contents
import typings.expoConfigPlugins.anon.ExpoUsername
import typings.expoConfigPlugins.anon.Fallback
import typings.expoConfigPlugins.anon.Item
import typings.expoConfigPlugins.anon.ItemParent
import typings.expoConfigPlugins.anon.Items
import typings.expoConfigPlugins.anon.Kind
import typings.expoConfigPlugins.anon.KindName
import typings.expoConfigPlugins.anon.MinVersion
import typings.expoConfigPlugins.anon.Name
import typings.expoConfigPlugins.anon.NameParent
import typings.expoConfigPlugins.anon.PackageName
import typings.expoConfigPlugins.anon.Parent
import typings.expoConfigPlugins.anon.ParentXml
import typings.expoConfigPlugins.anon.PickExpoConfigUpdatesrunt
import typings.expoConfigPlugins.anon.PickExpoConfigUpdatessdkV
import typings.expoConfigPlugins.anon.PickExpoConfigandroid
import typings.expoConfigPlugins.anon.PickExpoConfigandroidStat
import typings.expoConfigPlugins.anon.PickExpoConfigandroiduser
import typings.expoConfigPlugins.anon.PickExpoConfigname
import typings.expoConfigPlugins.anon.PickExpoConfigorientation
import typings.expoConfigPlugins.anon.PickExpoConfigprimaryColo
import typings.expoConfigPlugins.anon.PickExpoConfigschemeandro
import typings.expoConfigPlugins.anon.PickExpoConfigversion
import typings.expoConfigPlugins.anon.RemovePropWhenValueIsNull
import typings.expoConfigPlugins.anon.Required
import typings.expoConfigPlugins.anon.TargetApi
import typings.expoConfigPlugins.anon.Xml
import typings.expoConfigPlugins.buildAndroidIntentFiltersMod.AndroidIntentFilters
import typings.expoConfigPlugins.buildAndroidManifestMod.AndroidManifest
import typings.expoConfigPlugins.buildAndroidManifestMod.ManifestActivity
import typings.expoConfigPlugins.buildAndroidManifestMod.ManifestApplication
import typings.expoConfigPlugins.buildAndroidManifestMod.ManifestIntentFilter
import typings.expoConfigPlugins.buildAndroidManifestMod.ManifestUsesPermission
import typings.expoConfigPlugins.buildAndroidPathsMod.ApplicationProjectFile
import typings.expoConfigPlugins.buildAndroidPathsMod.GradleProjectFile
import typings.expoConfigPlugins.buildAndroidPropertiesMod.PropertiesItem
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceGroupXML
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceItemXML
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceXML
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typings.expoConfigPlugins.buildUtilsBuildPropertiesDottypesMod.BuildPropertiesConfig
import typings.expoConfigPlugins.buildUtilsBuildPropertiesDottypesMod.ConfigToPropertyRuleType
import typings.expoConfigPlugins.buildUtilsUpdatesMod.ExpoConfigUpdates
import typings.expoConfigPlugins.buildUtilsXmlMod.XMLObject
import typings.expoConfigPlugins.expoConfigPluginsStrings.`dark-content`
import typings.expoConfigPlugins.expoConfigPluginsStrings.`light-content`
import typings.expoConfigPlugins.expoConfigPluginsStrings.default
import typings.expoConfigPlugins.expoConfigPluginsStrings.landscape
import typings.expoConfigPlugins.expoConfigPluginsStrings.portrait
import typings.expoConfigPlugins.expoConfigPluginsStrings.resource
import typings.expoConfigPlugins.expoConfigPluginsStrings.value
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AndroidConfig {
  
  object AllowBackup {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.AllowBackup")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAllowBackup(config: PickExpoConfigandroid): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllowBackup")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def getAllowBackupFromManifest(androidManifest: AndroidManifest): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllowBackupFromManifest")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
    
    inline def setAllowBackup(config: PickExpoConfigandroid, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setAllowBackup")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.AllowBackup.withAllowBackup")
    @js.native
    val withAllowBackup: ConfigPlugin[Unit] = js.native
  }
  
  object BuildProperties {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.BuildProperties")
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
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.BuildProperties.withJsEngineGradleProps")
    @js.native
    val withJsEngineGradleProps: ConfigPlugin[Unit] = js.native
  }
  
  object Colors {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Colors")
    @js.native
    val ^ : js.Any = js.native
    
    inline def assignColorValue(xml: ResourceXML, hasValueName: Name): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("assignColorValue")(xml.asInstanceOf[js.Any], hasValueName.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
    
    inline def getColorsAsObject(xml: ResourceXML): (Record[String, String]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorsAsObject")(xml.asInstanceOf[js.Any]).asInstanceOf[(Record[String, String]) | Null]
    
    inline def getObjectAsColorsXml(obj: Record[String, String]): ResourceXML = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectAsColorsXml")(obj.asInstanceOf[js.Any]).asInstanceOf[ResourceXML]
    
    inline def getProjectColorsXMLPathAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectColorsXMLPathAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def getProjectColorsXMLPathAsync(projectRoot: String, hasKind: Kind): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectColorsXMLPathAsync")(projectRoot.asInstanceOf[js.Any], hasKind.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def removeColorItem(named: String, contents: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("removeColorItem")(named.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
    
    inline def setColorItem(itemToAdd: ResourceItemXML, colorFileContentsJSON: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("setColorItem")(itemToAdd.asInstanceOf[js.Any], colorFileContentsJSON.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
  }
  
  object EasBuild {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.EasBuild")
    @js.native
    val ^ : js.Any = js.native
    
    inline def configureEasBuildAsync(projectRoot: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureEasBuildAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def getEasBuildGradlePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEasBuildGradlePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isEasBuildGradleConfiguredAsync(projectRoot: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEasBuildGradleConfiguredAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  }
  
  object GoogleMapsApiKey {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.GoogleMapsApiKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getGoogleMapsApiKey(config: PickExpoConfigandroid): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleMapsApiKey")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def setGoogleMapsApiKey(config: PickExpoConfigandroid, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleMapsApiKey")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.GoogleMapsApiKey.withGoogleMapsApiKey")
    @js.native
    val withGoogleMapsApiKey: ConfigPlugin[Unit] = js.native
  }
  
  object GoogleServices {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.GoogleServices")
    @js.native
    val ^ : js.Any = js.native
    
    inline def applyPlugin(config: PickExpoConfigandroid, appBuildGradle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPlugin")(config.asInstanceOf[js.Any], appBuildGradle.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getGoogleServicesFilePath(config: PickExpoConfigandroid): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleServicesFilePath")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def setClassPath(config: PickExpoConfigandroid, buildGradle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setClassPath")(config.asInstanceOf[js.Any], buildGradle.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def setGoogleServicesFile(config: PickExpoConfigandroid, projectRoot: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleServicesFile")(config.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def setGoogleServicesFile(config: PickExpoConfigandroid, projectRoot: String, targetPath: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("setGoogleServicesFile")(config.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.GoogleServices.withApplyPlugin")
    @js.native
    val withApplyPlugin: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.GoogleServices.withClassPath")
    @js.native
    val withClassPath: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.GoogleServices.withGoogleServicesFile")
    @js.native
    val withGoogleServicesFile: ConfigPlugin[Unit] = js.native
  }
  
  object IntentFilters {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.IntentFilters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def default(intentFilters: AndroidIntentFilters): js.Array[ManifestIntentFilter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(intentFilters.asInstanceOf[js.Any]).asInstanceOf[js.Array[ManifestIntentFilter]]
    
    inline def getIntentFilters(config: PickExpoConfigandroid): AndroidIntentFilters = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntentFilters")(config.asInstanceOf[js.Any]).asInstanceOf[AndroidIntentFilters]
    
    inline def setAndroidIntentFilters(config: PickExpoConfigandroid, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setAndroidIntentFilters")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.IntentFilters.withAndroidIntentFilters")
    @js.native
    val withAndroidIntentFilters: ConfigPlugin[Unit] = js.native
  }
  
  object Manifest {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Manifest")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addMetaDataItemToMainApplication(mainApplication: ManifestApplication, itemName: String, itemValue: String): ManifestApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("addMetaDataItemToMainApplication")(mainApplication.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any], itemValue.asInstanceOf[js.Any])).asInstanceOf[ManifestApplication]
    inline def addMetaDataItemToMainApplication(
      mainApplication: ManifestApplication,
      itemName: String,
      itemValue: String,
      itemType: resource | value
    ): ManifestApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("addMetaDataItemToMainApplication")(mainApplication.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any], itemValue.asInstanceOf[js.Any], itemType.asInstanceOf[js.Any])).asInstanceOf[ManifestApplication]
    
    inline def addUsesLibraryItemToMainApplication(mainApplication: ManifestApplication, item: Required): ManifestApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("addUsesLibraryItemToMainApplication")(mainApplication.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[ManifestApplication]
    
    inline def ensureToolsAvailable(manifest: AndroidManifest): AndroidManifest = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureToolsAvailable")(manifest.asInstanceOf[js.Any]).asInstanceOf[AndroidManifest]
    
    inline def findMetaDataItem(mainApplication: Any, itemName: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMetaDataItem")(mainApplication.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def findUsesLibraryItem(mainApplication: Any, itemName: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findUsesLibraryItem")(mainApplication.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getMainActivity(androidManifest: AndroidManifest): ManifestActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainActivity")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[ManifestActivity | Null]
    
    inline def getMainActivityOrThrow(androidManifest: AndroidManifest): ManifestActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainActivityOrThrow")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[ManifestActivity]
    
    inline def getMainApplication(androidManifest: AndroidManifest): ManifestApplication | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainApplication")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[ManifestApplication | Null]
    
    inline def getMainApplicationMetaDataValue(androidManifest: AndroidManifest, name: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMainApplicationMetaDataValue")(androidManifest.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    
    inline def getMainApplicationOrThrow(androidManifest: AndroidManifest): ManifestApplication = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainApplicationOrThrow")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[ManifestApplication]
    
    inline def getRunnableActivity(androidManifest: AndroidManifest): ManifestActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRunnableActivity")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[ManifestActivity | Null]
    
    inline def prefixAndroidKeys[T /* <: Record[String, Any] */](head: T): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixAndroidKeys")(head.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
    
    inline def readAndroidManifestAsync(manifestPath: String): js.Promise[AndroidManifest] = ^.asInstanceOf[js.Dynamic].applyDynamic("readAndroidManifestAsync")(manifestPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AndroidManifest]]
    
    inline def removeMetaDataItemFromMainApplication(mainApplication: Any, itemName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMetaDataItemFromMainApplication")(mainApplication.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def removeUsesLibraryItemFromMainApplication(mainApplication: ManifestApplication, itemName: String): ManifestApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("removeUsesLibraryItemFromMainApplication")(mainApplication.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any])).asInstanceOf[ManifestApplication]
    
    inline def writeAndroidManifestAsync(manifestPath: String, androidManifest: AndroidManifest): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAndroidManifestAsync")(manifestPath.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  object Name {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Name")
    @js.native
    val ^ : js.Any = js.native
    
    inline def applyNameSettingsGradle(config: PickExpoConfigname, settingsGradle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyNameSettingsGradle")(config.asInstanceOf[js.Any], settingsGradle.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getName(config: PickExpoConfigname): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def sanitizeNameForGradle(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeNameForGradle")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Name.withName")
    @js.native
    val withName: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Name.withNameSettingsGradle")
    @js.native
    val withNameSettingsGradle: ConfigPlugin[Unit] = js.native
  }
  
  object Orientation {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Orientation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Orientation.SCREEN_ORIENTATION_ATTRIBUTE")
    @js.native
    val SCREEN_ORIENTATION_ATTRIBUTE: /* "android:screenOrientation" */ String = js.native
    
    inline def getOrientation(config: PickExpoConfigorientation): default | portrait | landscape | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientation")(config.asInstanceOf[js.Any]).asInstanceOf[default | portrait | landscape | Null]
    
    inline def setAndroidOrientation(config: PickExpoConfigorientation, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setAndroidOrientation")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Orientation.withOrientation")
    @js.native
    val withOrientation: ConfigPlugin[Unit] = js.native
  }
  
  object Package {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Package")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApplicationIdAsync(projectRoot: String): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationIdAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
    
    inline def getPackage(config: PickExpoConfigandroid): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackage")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def renameJniOnDiskForType(hasProjectRootTypePackageName: PackageName): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renameJniOnDiskForType")(hasProjectRootTypePackageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def renamePackageOnDisk(config: PickExpoConfigandroid, projectRoot: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("renamePackageOnDisk")(config.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def renamePackageOnDiskForType(hasProjectRootTypePackageName: PackageName): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renamePackageOnDiskForType")(hasProjectRootTypePackageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def setPackageInAndroidManifest(config: PickExpoConfigandroid, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setPackageInAndroidManifest")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    
    inline def setPackageInBuildGradle(config: PickExpoConfigandroid, buildGradle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setPackageInBuildGradle")(config.asInstanceOf[js.Any], buildGradle.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Package.withPackageGradle")
    @js.native
    val withPackageGradle: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Package.withPackageManifest")
    @js.native
    val withPackageManifest: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Package.withPackageRefactor")
    @js.native
    val withPackageRefactor: ConfigPlugin[Unit] = js.native
  }
  
  object Paths {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Paths")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAndroidManifestAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidManifestAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    inline def getAppBuildGradleAsync(projectRoot: String): js.Promise[GradleProjectFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppBuildGradleAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GradleProjectFile]]
    
    inline def getAppBuildGradleFilePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppBuildGradleFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getFileInfo(filePath: String): Contents = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileInfo")(filePath.asInstanceOf[js.Any]).asInstanceOf[Contents]
    
    inline def getGradleFilePath(projectRoot: String, gradleName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getGradleFilePath")(projectRoot.asInstanceOf[js.Any], gradleName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getMainActivityAsync(projectRoot: String): js.Promise[ApplicationProjectFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainActivityAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ApplicationProjectFile]]
    
    inline def getMainApplicationAsync(projectRoot: String): js.Promise[ApplicationProjectFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainApplicationAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ApplicationProjectFile]]
    
    inline def getProjectBuildGradleAsync(projectRoot: String): js.Promise[GradleProjectFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectBuildGradleAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GradleProjectFile]]
    
    inline def getProjectBuildGradleFilePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectBuildGradleFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getProjectFilePath(projectRoot: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectFilePath")(projectRoot.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getProjectPathOrThrowAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectPathOrThrowAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    inline def getResourceFolderAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceFolderAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    inline def getResourceXMLPathAsync(projectRoot: String, hasKindName: KindName): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResourceXMLPathAsync")(projectRoot.asInstanceOf[js.Any], hasKindName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def getSettingsGradleAsync(projectRoot: String): js.Promise[GradleProjectFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettingsGradleAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GradleProjectFile]]
    
    inline def getSettingsGradleFilePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettingsGradleFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object Permissions {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Permissions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addBlockedPermissions(androidManifest: AndroidManifest, permissions: js.Array[String]): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("addBlockedPermissions")(androidManifest.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    
    inline def addPermission(androidManifest: AndroidManifest, permissionName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPermission")(androidManifest.asInstanceOf[js.Any], permissionName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addPermissionToManifest(permission: String, manifestPermissions: js.Array[ManifestUsesPermission]): js.Array[ManifestUsesPermission] = (^.asInstanceOf[js.Dynamic].applyDynamic("addPermissionToManifest")(permission.asInstanceOf[js.Any], manifestPermissions.asInstanceOf[js.Any])).asInstanceOf[js.Array[ManifestUsesPermission]]
    
    inline def ensurePermission(androidManifest: AndroidManifest, permissionName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ensurePermission")(androidManifest.asInstanceOf[js.Any], permissionName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def ensurePermissionNameFormat(permissionName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensurePermissionNameFormat")(permissionName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ensurePermissions(androidManifest: AndroidManifest, permissionNames: js.Array[String]): StringDictionary[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensurePermissions")(androidManifest.asInstanceOf[js.Any], permissionNames.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Boolean]]
    
    inline def getAndroidPermissions(config: PickExpoConfigandroid): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidPermissions")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def getPermissions(androidManifest: AndroidManifest): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPermissions")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def isPermissionAlreadyRequested(permission: String, manifestPermissions: js.Array[ManifestUsesPermission]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPermissionAlreadyRequested")(permission.asInstanceOf[js.Any], manifestPermissions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def removePermissions(androidManifest: AndroidManifest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removePermissions")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removePermissions(androidManifest: AndroidManifest, permissionNames: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removePermissions")(androidManifest.asInstanceOf[js.Any], permissionNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setAndroidPermissions(config: PickExpoConfigandroid, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setAndroidPermissions")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Permissions.withBlockedPermissions")
    @js.native
    val withBlockedPermissions: ConfigPlugin[js.Array[String] | String] = js.native
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Permissions.withInternalBlockedPermissions")
    @js.native
    val withInternalBlockedPermissions: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Permissions.withPermissions")
    @js.native
    val withPermissions: ConfigPlugin[js.Array[String] | Unit] = js.native
  }
  
  object PrimaryColor {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.PrimaryColor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPrimaryColor(config: PickExpoConfigprimaryColo): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrimaryColor")(config.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.PrimaryColor.withPrimaryColor")
    @js.native
    val withPrimaryColor: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.PrimaryColor.withPrimaryColorColors")
    @js.native
    val withPrimaryColorColors: ConfigPlugin[Unit] = js.native
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.PrimaryColor.withPrimaryColorStyles")
    @js.native
    val withPrimaryColorStyles: ConfigPlugin[Unit] = js.native
  }
  
  object Properties {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Properties")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parsePropertiesFile(contents: String): js.Array[PropertiesItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePropertiesFile")(contents.asInstanceOf[js.Any]).asInstanceOf[js.Array[PropertiesItem]]
    
    inline def propertiesListToString(props: js.Array[PropertiesItem]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("propertiesListToString")(props.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object Resources {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Resources")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildResourceGroup(parent: Items): ResourceGroupXML = ^.asInstanceOf[js.Dynamic].applyDynamic("buildResourceGroup")(parent.asInstanceOf[js.Any]).asInstanceOf[ResourceGroupXML]
    
    inline def buildResourceItem(hasNameValueTargetApiTranslatable: TargetApi): ResourceItemXML = ^.asInstanceOf[js.Dynamic].applyDynamic("buildResourceItem")(hasNameValueTargetApiTranslatable.asInstanceOf[js.Any]).asInstanceOf[ResourceItemXML]
    
    inline def ensureDefaultResourceXML(xml: XMLObject): ResourceXML = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDefaultResourceXML")(xml.asInstanceOf[js.Any]).asInstanceOf[ResourceXML]
    
    inline def findResourceGroup(xml: js.Array[ResourceGroupXML], group: NameParent): ResourceGroupXML | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findResourceGroup")(xml.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[ResourceGroupXML | Null]
    inline def findResourceGroup(xml: Unit, group: NameParent): ResourceGroupXML | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findResourceGroup")(xml.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[ResourceGroupXML | Null]
    
    inline def getObjectAsResourceGroup(group: Item): ResourceGroupXML = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectAsResourceGroup")(group.asInstanceOf[js.Any]).asInstanceOf[ResourceGroupXML]
    
    inline def getObjectAsResourceItems(obj: Record[String, String]): js.Array[ResourceItemXML] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectAsResourceItems")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[ResourceItemXML]]
    
    inline def getResourceItemsAsObject(xml: js.Array[ResourceItemXML]): (Record[String, String]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceItemsAsObject")(xml.asInstanceOf[js.Any]).asInstanceOf[(Record[String, String]) | Null]
    
    inline def readResourcesXMLAsync(hasPathFallback: Fallback): js.Promise[ResourceXML] = ^.asInstanceOf[js.Dynamic].applyDynamic("readResourcesXMLAsync")(hasPathFallback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResourceXML]]
  }
  
  object Scheme {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Scheme")
    @js.native
    val ^ : js.Any = js.native
    
    inline def appendScheme(scheme: String, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("appendScheme")(scheme.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    
    inline def ensureManifestHasValidIntentFilter(androidManifest: AndroidManifest): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureManifestHasValidIntentFilter")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def getScheme(config: typings.expoConfigPlugins.anon.Scheme): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScheme")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def getSchemesFromManifest(androidManifest: AndroidManifest): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemesFromManifest")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def getSchemesFromManifest(androidManifest: AndroidManifest, requestedHost: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSchemesFromManifest")(androidManifest.asInstanceOf[js.Any], requestedHost.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    inline def hasScheme(scheme: String, androidManifest: AndroidManifest): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasScheme")(scheme.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def removeScheme(scheme: String, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("removeScheme")(scheme.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    
    inline def setScheme(config: PickExpoConfigschemeandro, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setScheme")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Scheme.withScheme")
    @js.native
    val withScheme: ConfigPlugin[Unit] = js.native
  }
  
  object StatusBar {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.StatusBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getStatusBarColor(config: PickExpoConfigandroidStat): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarColor")(config.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    inline def getStatusBarStyle(config: PickExpoConfigandroidStat): `light-content` | `dark-content` = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarStyle")(config.asInstanceOf[js.Any]).asInstanceOf[`light-content` | `dark-content`]
    
    inline def getStatusBarTranslucent(config: PickExpoConfigandroidStat): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusBarTranslucent")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def setStatusBarColors(config: PickExpoConfigandroidStat, colors: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatusBarColors")(config.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
    
    inline def setStatusBarStyles(config: PickExpoConfigandroidStat, styles: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatusBarStyles")(config.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.StatusBar.withStatusBar")
    @js.native
    val withStatusBar: ConfigPlugin[Unit] = js.native
  }
  
  object Strings {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Strings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getProjectStringsXMLPathAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectStringsXMLPathAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def getProjectStringsXMLPathAsync(projectRoot: String, hasKind: Kind): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectStringsXMLPathAsync")(projectRoot.asInstanceOf[js.Any], hasKind.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def removeStringItem(named: String, stringFileContentsJSON: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("removeStringItem")(named.asInstanceOf[js.Any], stringFileContentsJSON.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
    
    inline def setStringItem(itemToAdd: js.Array[ResourceItemXML], stringFileContentsJSON: ResourceXML): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("setStringItem")(itemToAdd.asInstanceOf[js.Any], stringFileContentsJSON.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
  }
  
  object Styles {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Styles")
    @js.native
    val ^ : js.Any = js.native
    
    inline def assignStylesValue(xml: ResourceXML, hasAddValueTargetApiNameParent: Add): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("assignStylesValue")(xml.asInstanceOf[js.Any], hasAddValueTargetApiNameParent.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
    
    inline def getAppThemeLightNoActionBarGroup(): Parent = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppThemeLightNoActionBarGroup")().asInstanceOf[Parent]
    
    inline def getProjectStylesXMLPathAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectStylesXMLPathAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def getProjectStylesXMLPathAsync(projectRoot: String, hasKind: Kind): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectStylesXMLPathAsync")(projectRoot.asInstanceOf[js.Any], hasKind.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def getStyleParent(xml: ResourceXML, group: NameParent): ResourceGroupXML | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyleParent")(xml.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[ResourceGroupXML | Null]
    
    inline def getStylesGroupAsObject(xml: ResourceXML, group: NameParent): (Record[String, String]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStylesGroupAsObject")(xml.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[(Record[String, String]) | Null]
    
    inline def getStylesItem(hasNameXmlParent: Xml): ResourceItemXML | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getStylesItem")(hasNameXmlParent.asInstanceOf[js.Any]).asInstanceOf[ResourceItemXML | Null]
    
    inline def readStylesXMLAsync(hasPathFallback: Fallback): js.Promise[ResourceXML] = ^.asInstanceOf[js.Dynamic].applyDynamic("readStylesXMLAsync")(hasPathFallback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResourceXML]]
    
    inline def removeStylesItem(hasNameXmlParent: ParentXml): ResourceXML = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStylesItem")(hasNameXmlParent.asInstanceOf[js.Any]).asInstanceOf[ResourceXML]
    
    inline def setStylesItem(hasItemXmlParent: ItemParent): ResourceXML = ^.asInstanceOf[js.Dynamic].applyDynamic("setStylesItem")(hasItemXmlParent.asInstanceOf[js.Any]).asInstanceOf[ResourceXML]
  }
  
  object Updates {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Updates")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Updates.Config")
    @js.native
    object Config extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.expoConfigPlugins.buildAndroidUpdatesMod.Config & String] = js.native
      
      /* "expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH" */ val CHECK_ON_LAUNCH: typings.expoConfigPlugins.buildAndroidUpdatesMod.Config.CHECK_ON_LAUNCH & String = js.native
      
      /* "expo.modules.updates.CODE_SIGNING_CERTIFICATE" */ val CODE_SIGNING_CERTIFICATE: typings.expoConfigPlugins.buildAndroidUpdatesMod.Config.CODE_SIGNING_CERTIFICATE & String = js.native
      
      /* "expo.modules.updates.CODE_SIGNING_METADATA" */ val CODE_SIGNING_METADATA: typings.expoConfigPlugins.buildAndroidUpdatesMod.Config.CODE_SIGNING_METADATA & String = js.native
      
      /* "expo.modules.updates.ENABLED" */ val ENABLED: typings.expoConfigPlugins.buildAndroidUpdatesMod.Config.ENABLED & String = js.native
      
      /* "expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS" */ val LAUNCH_WAIT_MS: typings.expoConfigPlugins.buildAndroidUpdatesMod.Config.LAUNCH_WAIT_MS & String = js.native
      
      /* "expo.modules.updates.EXPO_RELEASE_CHANNEL" */ val RELEASE_CHANNEL: typings.expoConfigPlugins.buildAndroidUpdatesMod.Config.RELEASE_CHANNEL & String = js.native
      
      /* "expo.modules.updates.EXPO_RUNTIME_VERSION" */ val RUNTIME_VERSION: typings.expoConfigPlugins.buildAndroidUpdatesMod.Config.RUNTIME_VERSION & String = js.native
      
      /* "expo.modules.updates.EXPO_SDK_VERSION" */ val SDK_VERSION: typings.expoConfigPlugins.buildAndroidUpdatesMod.Config.SDK_VERSION & String = js.native
      
      /* "expo.modules.updates.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY" */ val UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY: typings.expoConfigPlugins.buildAndroidUpdatesMod.Config.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY & String = js.native
      
      /* "expo.modules.updates.EXPO_UPDATE_URL" */ val UPDATE_URL: typings.expoConfigPlugins.buildAndroidUpdatesMod.Config.UPDATE_URL & String = js.native
    }
    
    inline def areVersionsSynced(config: PickExpoConfigUpdatesrunt, androidManifest: AndroidManifest): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areVersionsSynced")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def ensureBuildGradleContainsConfigurationScript(projectRoot: String, buildGradleContents: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureBuildGradleContainsConfigurationScript")(projectRoot.asInstanceOf[js.Any], buildGradleContents.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def formatApplyLineForBuildGradle(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatApplyLineForBuildGradle")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isBuildGradleConfigured(projectRoot: String, buildGradleContents: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBuildGradleConfigured")(projectRoot.asInstanceOf[js.Any], buildGradleContents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isMainApplicationMetaDataSet(androidManifest: AndroidManifest): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMainApplicationMetaDataSet")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isMainApplicationMetaDataSynced(projectRoot: String, config: ExpoConfigUpdates, androidManifest: AndroidManifest): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMainApplicationMetaDataSynced")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isMainApplicationMetaDataSynced(projectRoot: String, config: ExpoConfigUpdates, androidManifest: AndroidManifest, username: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMainApplicationMetaDataSynced")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any], username.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def setUpdatesConfig(projectRoot: String, config: ExpoConfigUpdates, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdatesConfig")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    inline def setUpdatesConfig(projectRoot: String, config: ExpoConfigUpdates, androidManifest: AndroidManifest, username: String): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdatesConfig")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any], username.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    inline def setUpdatesConfig(
      projectRoot: String,
      config: ExpoConfigUpdates,
      androidManifest: AndroidManifest,
      username: String,
      expoUpdatesPackageVersion: String
    ): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdatesConfig")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any], username.asInstanceOf[js.Any], expoUpdatesPackageVersion.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    inline def setUpdatesConfig(
      projectRoot: String,
      config: ExpoConfigUpdates,
      androidManifest: AndroidManifest,
      username: Null,
      expoUpdatesPackageVersion: String
    ): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdatesConfig")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any], username.asInstanceOf[js.Any], expoUpdatesPackageVersion.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    
    inline def setVersionsConfig(config: PickExpoConfigUpdatessdkV, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setVersionsConfig")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Updates.withUpdates")
    @js.native
    val withUpdates: ConfigPlugin[ExpoUsername] = js.native
  }
  
  object Version {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Version")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getVersionCode(config: PickExpoConfigandroid): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionCode")(config.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getVersionName(config: PickExpoConfigversion): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionName")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def setMinBuildScriptExtVersion(buildGradle: String, hasNameMinVersion: MinVersion): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setMinBuildScriptExtVersion")(buildGradle.asInstanceOf[js.Any], hasNameMinVersion.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def setVersionCode(config: PickExpoConfigandroid, buildGradle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setVersionCode")(config.asInstanceOf[js.Any], buildGradle.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def setVersionName(config: PickExpoConfigversion, buildGradle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setVersionName")(config.asInstanceOf[js.Any], buildGradle.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Version.withBuildScriptExtMinimumVersion")
    @js.native
    val withBuildScriptExtMinimumVersion: ConfigPlugin[MinVersion] = js.native
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.Version.withVersion")
    @js.native
    val withVersion: ConfigPlugin[Unit] = js.native
  }
  
  object WindowSoftInputMode {
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.WindowSoftInputMode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getWindowSoftInputModeMode(config: PickExpoConfigandroid): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowSoftInputModeMode")(config.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def setWindowSoftInputModeMode(config: PickExpoConfigandroiduser, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setWindowSoftInputModeMode")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
    
    @JSImport("@expo/config-plugins/build", "AndroidConfig.WindowSoftInputMode.withWindowSoftInputMode")
    @js.native
    val withWindowSoftInputMode: ConfigPlugin[Unit] = js.native
  }
}
