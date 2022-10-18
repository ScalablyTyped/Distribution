package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.ExpoConfigProperty
import typings.expoConfigPlugins.buildIosIosConfigDottypesMod.ExpoPlist
import typings.expoConfigPlugins.buildIosIosConfigDottypesMod.InfoPlist
import typings.expoConfigPlugins.buildIosPathsMod.AppDelegateProjectFile
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typings.expoConfigPlugins.buildPluginDottypesMod.Mod
import typings.expoConfigTypes.mod.ExpoConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsIosPluginsMod {
  
  @JSImport("@expo/config-plugins/build/plugins/ios-plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEntitlementsPlugin(action: MutateEntitlementsPlistAction, name: String): ConfigPlugin[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEntitlementsPlugin")(action.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[Unit]]
  
  inline def createInfoPlistPlugin(action: MutateInfoPlistAction): ConfigPlugin[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInfoPlistPlugin")(action.asInstanceOf[js.Any]).asInstanceOf[ConfigPlugin[Unit]]
  inline def createInfoPlistPlugin(action: MutateInfoPlistAction, name: String): ConfigPlugin[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInfoPlistPlugin")(action.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[Unit]]
  
  inline def createInfoPlistPluginWithPropertyGuard(action: MutateInfoPlistAction, settings: ExpoConfigProperty): ConfigPlugin[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInfoPlistPluginWithPropertyGuard")(action.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[Unit]]
  inline def createInfoPlistPluginWithPropertyGuard(action: MutateInfoPlistAction, settings: ExpoConfigProperty, name: String): ConfigPlugin[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInfoPlistPluginWithPropertyGuard")(action.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[Unit]]
  
  @JSImport("@expo/config-plugins/build/plugins/ios-plugins", "withAppDelegate")
  @js.native
  val withAppDelegate: ConfigPlugin[Mod[AppDelegateProjectFile]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/ios-plugins", "withEntitlementsPlist")
  @js.native
  val withEntitlementsPlist: ConfigPlugin[
    Mod[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
    ]
  ] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/ios-plugins", "withExpoPlist")
  @js.native
  val withExpoPlist: ConfigPlugin[Mod[ExpoPlist]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/ios-plugins", "withInfoPlist")
  @js.native
  val withInfoPlist: ConfigPlugin[Mod[InfoPlist]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/ios-plugins", "withPodfileProperties")
  @js.native
  val withPodfileProperties: ConfigPlugin[Mod[Record[String, String]]] = js.native
  
  @JSImport("@expo/config-plugins/build/plugins/ios-plugins", "withXcodeProject")
  @js.native
  val withXcodeProject: ConfigPlugin[
    Mod[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ]
  ] = js.native
  
  type MutateEntitlementsPlistAction = js.Function2[
    /* expo */ ExpoConfig, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ /* entitlements */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
  ]
  
  type MutateInfoPlistAction = js.Function2[/* expo */ ExpoConfig, /* infoPlist */ InfoPlist, js.Promise[InfoPlist] | InfoPlist]
}
