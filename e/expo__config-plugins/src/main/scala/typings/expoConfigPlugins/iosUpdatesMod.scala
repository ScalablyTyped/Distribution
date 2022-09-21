package typings.expoConfigPlugins

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfigPlugins.anon.ExpoUsername
import typings.expoConfigPlugins.anon.PickExpoConfigUpdatessdkV
import typings.expoConfigPlugins.expoConfigPluginsStrings.PBXShellScriptBuildPhase
import typings.expoConfigPlugins.iosConfigTypesMod.ExpoPlist
import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import typings.expoConfigPlugins.utilsUpdatesMod.ExpoConfigUpdates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosUpdatesMod {
  
  @JSImport("@expo/config-plugins/build/ios/Updates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Config extends StObject
  @JSImport("@expo/config-plugins/build/ios/Updates", "Config")
  @js.native
  object Config extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Config & String] = js.native
    
    @js.native
    sealed trait CHECK_ON_LAUNCH
      extends StObject
         with Config
    /* "EXUpdatesCheckOnLaunch" */ val CHECK_ON_LAUNCH: typings.expoConfigPlugins.iosUpdatesMod.Config.CHECK_ON_LAUNCH & String = js.native
    
    @js.native
    sealed trait CODE_SIGNING_CERTIFICATE
      extends StObject
         with Config
    /* "EXUpdatesCodeSigningCertificate" */ val CODE_SIGNING_CERTIFICATE: typings.expoConfigPlugins.iosUpdatesMod.Config.CODE_SIGNING_CERTIFICATE & String = js.native
    
    @js.native
    sealed trait CODE_SIGNING_METADATA
      extends StObject
         with Config
    /* "EXUpdatesCodeSigningMetadata" */ val CODE_SIGNING_METADATA: typings.expoConfigPlugins.iosUpdatesMod.Config.CODE_SIGNING_METADATA & String = js.native
    
    @js.native
    sealed trait ENABLED
      extends StObject
         with Config
    /* "EXUpdatesEnabled" */ val ENABLED: typings.expoConfigPlugins.iosUpdatesMod.Config.ENABLED & String = js.native
    
    @js.native
    sealed trait LAUNCH_WAIT_MS
      extends StObject
         with Config
    /* "EXUpdatesLaunchWaitMs" */ val LAUNCH_WAIT_MS: typings.expoConfigPlugins.iosUpdatesMod.Config.LAUNCH_WAIT_MS & String = js.native
    
    @js.native
    sealed trait RELEASE_CHANNEL
      extends StObject
         with Config
    /* "EXUpdatesReleaseChannel" */ val RELEASE_CHANNEL: typings.expoConfigPlugins.iosUpdatesMod.Config.RELEASE_CHANNEL & String = js.native
    
    @js.native
    sealed trait RUNTIME_VERSION
      extends StObject
         with Config
    /* "EXUpdatesRuntimeVersion" */ val RUNTIME_VERSION: typings.expoConfigPlugins.iosUpdatesMod.Config.RUNTIME_VERSION & String = js.native
    
    @js.native
    sealed trait SDK_VERSION
      extends StObject
         with Config
    /* "EXUpdatesSDKVersion" */ val SDK_VERSION: typings.expoConfigPlugins.iosUpdatesMod.Config.SDK_VERSION & String = js.native
    
    @js.native
    sealed trait UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY
      extends StObject
         with Config
    /* "EXUpdatesRequestHeaders" */ val UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY: typings.expoConfigPlugins.iosUpdatesMod.Config.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY & String = js.native
    
    @js.native
    sealed trait UPDATE_URL
      extends StObject
         with Config
    /* "EXUpdatesURL" */ val UPDATE_URL: typings.expoConfigPlugins.iosUpdatesMod.Config.UPDATE_URL & String = js.native
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
  
  @JSImport("@expo/config-plugins/build/ios/Updates", "withUpdates")
  @js.native
  val withUpdates: ConfigPlugin[ExpoUsername] = js.native
  
  trait ShellScriptBuildPhase
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var isa: PBXShellScriptBuildPhase
    
    var name: String
    
    var shellScript: String
  }
  object ShellScriptBuildPhase {
    
    inline def apply(name: String, shellScript: String): ShellScriptBuildPhase = {
      val __obj = js.Dynamic.literal(isa = "PBXShellScriptBuildPhase", name = name.asInstanceOf[js.Any], shellScript = shellScript.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShellScriptBuildPhase]
    }
    
    extension [Self <: ShellScriptBuildPhase](x: Self) {
      
      inline def setIsa(value: PBXShellScriptBuildPhase): Self = StObject.set(x, "isa", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShellScript(value: String): Self = StObject.set(x, "shellScript", value.asInstanceOf[js.Any])
    }
  }
}
