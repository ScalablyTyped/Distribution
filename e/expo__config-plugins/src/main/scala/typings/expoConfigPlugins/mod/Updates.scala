package typings.expoConfigPlugins.mod

import typings.expoConfigPlugins.anon.PickExpoConfigUpdatesowne
import typings.expoConfigPlugins.anon.PickExpoConfigUpdatessdkVSdkVersion
import typings.expoConfigPlugins.anon.PickExpoConfigUpdatesupda
import typings.expoConfigPlugins.anon.PickExpoConfigversion
import typings.expoConfigPlugins.anon.PickExpoConfigversionandr
import typings.expoConfigPlugins.anon.PickExpoConfigversionrunt
import typings.expoConfigPlugins.expoConfigPluginsStrings.ALWAYS
import typings.expoConfigPlugins.expoConfigPluginsStrings.ERROR_RECOVERY_ONLY
import typings.expoConfigPlugins.expoConfigPluginsStrings.NEVER
import typings.expoConfigPlugins.expoConfigPluginsStrings.android
import typings.expoConfigPlugins.expoConfigPluginsStrings.ios
import typings.expoConfigTypes.mod.ExpoConfig
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Updates {
  
  @JSImport("@expo/config-plugins/build", "Updates")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAppVersion(config: PickExpoConfigversion): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppVersion")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getExpoUpdatesPackageVersion(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExpoUpdatesPackageVersion")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getNativeVersion(config: PickExpoConfigversionandr, platform: android | ios): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getNativeVersion")(config.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getRuntimeVersion(config: PickExpoConfigversionrunt, platform: android | ios): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeVersion")(config.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def getRuntimeVersionNullable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasConfigPlatform because its type Parameters<typeof getRuntimeVersion> is not an array type */ hasConfigPlatform: Parameters[
      js.Function2[/* config */ PickExpoConfigversionrunt, /* platform */ android | ios, String | Null]
    ]
  ): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeVersionNullable")(hasConfigPlatform.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getSDKVersion(config: PickExpoConfigUpdatessdkVSdkVersion): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSDKVersion")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getUpdateUrl(config: PickExpoConfigUpdatesowne): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getUpdateUrl")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def getUpdateUrl(config: PickExpoConfigUpdatesowne, username: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getUpdateUrl")(config.asInstanceOf[js.Any], username.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def getUpdatesCheckOnLaunch(config: PickExpoConfigUpdatesupda): NEVER | ERROR_RECOVERY_ONLY | ALWAYS = ^.asInstanceOf[js.Dynamic].applyDynamic("getUpdatesCheckOnLaunch")(config.asInstanceOf[js.Any]).asInstanceOf[NEVER | ERROR_RECOVERY_ONLY | ALWAYS]
  inline def getUpdatesCheckOnLaunch(config: PickExpoConfigUpdatesupda, expoUpdatesPackageVersion: String): NEVER | ERROR_RECOVERY_ONLY | ALWAYS = (^.asInstanceOf[js.Dynamic].applyDynamic("getUpdatesCheckOnLaunch")(config.asInstanceOf[js.Any], expoUpdatesPackageVersion.asInstanceOf[js.Any])).asInstanceOf[NEVER | ERROR_RECOVERY_ONLY | ALWAYS]
  
  inline def getUpdatesCodeSigningCertificate(projectRoot: String, config: PickExpoConfigUpdatesupda): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUpdatesCodeSigningCertificate")(projectRoot.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getUpdatesCodeSigningMetadata(config: PickExpoConfigUpdatesupda): /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@expo/config-types.anon.CheckAutomatically | undefined>['codeSigningMetadata'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getUpdatesCodeSigningMetadata")(config.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@expo/config-types.anon.CheckAutomatically | undefined>['codeSigningMetadata'] */ js.Any]
  
  inline def getUpdatesCodeSigningMetadataStringified(config: PickExpoConfigUpdatesupda): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUpdatesCodeSigningMetadataStringified")(config.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getUpdatesEnabled(config: PickExpoConfigUpdatesupda): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getUpdatesEnabled")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getUpdatesTimeout(config: PickExpoConfigUpdatesupda): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getUpdatesTimeout")(config.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def withRuntimeVersion(config: ExpoConfig): ExpoConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("withRuntimeVersion")(config.asInstanceOf[js.Any]).asInstanceOf[ExpoConfig]
}
