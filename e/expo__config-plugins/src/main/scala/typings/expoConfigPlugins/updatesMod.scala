package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.ExpoUsername
import typings.expoConfigPlugins.anon.PickExpoConfigUpdatesrunt
import typings.expoConfigPlugins.anon.PickExpoConfigUpdatessdkV
import typings.expoConfigPlugins.manifestMod.AndroidManifest
import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import typings.expoConfigPlugins.utilsUpdatesMod.ExpoConfigUpdates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatesMod {
  
  @JSImport("@expo/config-plugins/build/android/Updates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Config extends StObject
  @JSImport("@expo/config-plugins/build/android/Updates", "Config")
  @js.native
  object Config extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Config & String] = js.native
    
    @js.native
    sealed trait CHECK_ON_LAUNCH
      extends StObject
         with Config
    /* "expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH" */ val CHECK_ON_LAUNCH: typings.expoConfigPlugins.updatesMod.Config.CHECK_ON_LAUNCH & String = js.native
    
    @js.native
    sealed trait CODE_SIGNING_CERTIFICATE
      extends StObject
         with Config
    /* "expo.modules.updates.CODE_SIGNING_CERTIFICATE" */ val CODE_SIGNING_CERTIFICATE: typings.expoConfigPlugins.updatesMod.Config.CODE_SIGNING_CERTIFICATE & String = js.native
    
    @js.native
    sealed trait CODE_SIGNING_METADATA
      extends StObject
         with Config
    /* "expo.modules.updates.CODE_SIGNING_METADATA" */ val CODE_SIGNING_METADATA: typings.expoConfigPlugins.updatesMod.Config.CODE_SIGNING_METADATA & String = js.native
    
    @js.native
    sealed trait ENABLED
      extends StObject
         with Config
    /* "expo.modules.updates.ENABLED" */ val ENABLED: typings.expoConfigPlugins.updatesMod.Config.ENABLED & String = js.native
    
    @js.native
    sealed trait LAUNCH_WAIT_MS
      extends StObject
         with Config
    /* "expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS" */ val LAUNCH_WAIT_MS: typings.expoConfigPlugins.updatesMod.Config.LAUNCH_WAIT_MS & String = js.native
    
    @js.native
    sealed trait RELEASE_CHANNEL
      extends StObject
         with Config
    /* "expo.modules.updates.EXPO_RELEASE_CHANNEL" */ val RELEASE_CHANNEL: typings.expoConfigPlugins.updatesMod.Config.RELEASE_CHANNEL & String = js.native
    
    @js.native
    sealed trait RUNTIME_VERSION
      extends StObject
         with Config
    /* "expo.modules.updates.EXPO_RUNTIME_VERSION" */ val RUNTIME_VERSION: typings.expoConfigPlugins.updatesMod.Config.RUNTIME_VERSION & String = js.native
    
    @js.native
    sealed trait SDK_VERSION
      extends StObject
         with Config
    /* "expo.modules.updates.EXPO_SDK_VERSION" */ val SDK_VERSION: typings.expoConfigPlugins.updatesMod.Config.SDK_VERSION & String = js.native
    
    @js.native
    sealed trait UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY
      extends StObject
         with Config
    /* "expo.modules.updates.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY" */ val UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY: typings.expoConfigPlugins.updatesMod.Config.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY & String = js.native
    
    @js.native
    sealed trait UPDATE_URL
      extends StObject
         with Config
    /* "expo.modules.updates.EXPO_UPDATE_URL" */ val UPDATE_URL: typings.expoConfigPlugins.updatesMod.Config.UPDATE_URL & String = js.native
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
  
  @JSImport("@expo/config-plugins/build/android/Updates", "withUpdates")
  @js.native
  val withUpdates: ConfigPlugin[ExpoUsername] = js.native
}
