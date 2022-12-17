package typings.expoConfigPlugins.buildMod

import typings.expoConfigPlugins.anon.Action
import typings.expoConfigPlugins.anon.ActionMod
import typings.expoConfigPlugins.anon.AssertMissingModProviders
import typings.expoConfigPlugins.anon.Introspect
import typings.expoConfigPlugins.anon.IsLegacyPlugin
import typings.expoConfigPlugins.anon.Plugin
import typings.expoConfigPlugins.buildAndroidManifestMod.AndroidManifest
import typings.expoConfigPlugins.buildAndroidPathsMod.ApplicationProjectFile
import typings.expoConfigPlugins.buildAndroidPathsMod.GradleProjectFile
import typings.expoConfigPlugins.buildAndroidPropertiesMod.PropertiesItem
import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceXML
import typings.expoConfigPlugins.buildIosIosConfigDottypesMod.ExpoPlist
import typings.expoConfigPlugins.buildIosIosConfigDottypesMod.InfoPlist
import typings.expoConfigPlugins.buildIosPathsMod.AppDelegateProjectFile
import typings.expoConfigPlugins.buildMod.^
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typings.expoConfigPlugins.buildPluginDottypesMod.ExportedConfig
import typings.expoConfigPlugins.buildPluginDottypesMod.Mod
import typings.expoConfigPlugins.buildPluginDottypesMod.ModPlatform
import typings.expoConfigPlugins.buildPluginDottypesMod.StaticPlugin
import typings.expoConfigPlugins.buildPluginsCreateBaseModMod.ForwardedBaseModOptions
import typings.expoConfigPlugins.buildPluginsWithModMod.BaseModOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def compileModsAsync(config: ExportedConfig, props: AssertMissingModProviders): js.Promise[ExportedConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileModsAsync")(config.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExportedConfig]]

inline def createRunOncePlugin[T](plugin: ConfigPlugin[T], name: String): ConfigPlugin[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRunOncePlugin")(plugin.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[T]]
inline def createRunOncePlugin[T](plugin: ConfigPlugin[T], name: String, version: String): ConfigPlugin[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRunOncePlugin")(plugin.asInstanceOf[js.Any], name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[ConfigPlugin[T]]

inline def evalModsAsync(config: ExportedConfig, param1: Introspect): js.Promise[ExportedConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("evalModsAsync")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExportedConfig]]

inline def withAndroidColors: ConfigPlugin[Mod[ResourceXML]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withAndroidColors").asInstanceOf[ConfigPlugin[Mod[ResourceXML]]]

inline def withAndroidColorsNight: ConfigPlugin[Mod[ResourceXML]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withAndroidColorsNight").asInstanceOf[ConfigPlugin[Mod[ResourceXML]]]

inline def withAndroidManifest: ConfigPlugin[Mod[AndroidManifest]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withAndroidManifest").asInstanceOf[ConfigPlugin[Mod[AndroidManifest]]]

inline def withAndroidStyles: ConfigPlugin[Mod[ResourceXML]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withAndroidStyles").asInstanceOf[ConfigPlugin[Mod[ResourceXML]]]

inline def withAppBuildGradle: ConfigPlugin[Mod[GradleProjectFile]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withAppBuildGradle").asInstanceOf[ConfigPlugin[Mod[GradleProjectFile]]]

inline def withAppDelegate: ConfigPlugin[Mod[AppDelegateProjectFile]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withAppDelegate").asInstanceOf[ConfigPlugin[Mod[AppDelegateProjectFile]]]

inline def withBaseMod[T](config: ExportedConfig, param1: BaseModOptions & ActionMod[T]): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withBaseMod")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]

inline def withDangerousMod: ConfigPlugin[js.Tuple2[ModPlatform, Mod[Any]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withDangerousMod").asInstanceOf[ConfigPlugin[js.Tuple2[ModPlatform, Mod[Any]]]]

inline def withDefaultBaseMods(config: ExportedConfig): ExportedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultBaseMods")(config.asInstanceOf[js.Any]).asInstanceOf[ExportedConfig]
inline def withDefaultBaseMods(config: ExportedConfig, props: ForwardedBaseModOptions): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultBaseMods")(config.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]

inline def withEntitlementsPlist: ConfigPlugin[
Mod[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withEntitlementsPlist").asInstanceOf[ConfigPlugin[
Mod[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
]]]

inline def withExpoPlist: ConfigPlugin[Mod[ExpoPlist]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withExpoPlist").asInstanceOf[ConfigPlugin[Mod[ExpoPlist]]]

inline def withGradleProperties: ConfigPlugin[Mod[js.Array[PropertiesItem]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withGradleProperties").asInstanceOf[ConfigPlugin[Mod[js.Array[PropertiesItem]]]]

inline def withInfoPlist: ConfigPlugin[Mod[InfoPlist]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withInfoPlist").asInstanceOf[ConfigPlugin[Mod[InfoPlist]]]

inline def withMainActivity: ConfigPlugin[Mod[ApplicationProjectFile]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withMainActivity").asInstanceOf[ConfigPlugin[Mod[ApplicationProjectFile]]]

inline def withMainApplication: ConfigPlugin[Mod[ApplicationProjectFile]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withMainApplication").asInstanceOf[ConfigPlugin[Mod[ApplicationProjectFile]]]

inline def withMod[T](config: ExportedConfig, param1: Action[T]): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withMod")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]

inline def withPlugins: ConfigPlugin[js.Array[StaticPlugin[Any] | ConfigPlugin[Unit] | String]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withPlugins").asInstanceOf[ConfigPlugin[js.Array[StaticPlugin[Any] | ConfigPlugin[Unit] | String]]]

inline def withPodfileProperties: ConfigPlugin[Mod[Record[String, String]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withPodfileProperties").asInstanceOf[ConfigPlugin[Mod[Record[String, String]]]]

inline def withProjectBuildGradle: ConfigPlugin[Mod[GradleProjectFile]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withProjectBuildGradle").asInstanceOf[ConfigPlugin[Mod[GradleProjectFile]]]

inline def withRunOnce: ConfigPlugin[Plugin] = ^.asInstanceOf[js.Dynamic].selectDynamic("withRunOnce").asInstanceOf[ConfigPlugin[Plugin]]

inline def withSettingsGradle: ConfigPlugin[Mod[GradleProjectFile]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withSettingsGradle").asInstanceOf[ConfigPlugin[Mod[GradleProjectFile]]]

inline def withStaticPlugin: ConfigPlugin[IsLegacyPlugin] = ^.asInstanceOf[js.Dynamic].selectDynamic("withStaticPlugin").asInstanceOf[ConfigPlugin[IsLegacyPlugin]]

inline def withStringsXml: ConfigPlugin[Mod[ResourceXML]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withStringsXml").asInstanceOf[ConfigPlugin[Mod[ResourceXML]]]

inline def withXcodeProject: ConfigPlugin[
Mod[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
]] = ^.asInstanceOf[js.Dynamic].selectDynamic("withXcodeProject").asInstanceOf[ConfigPlugin[
Mod[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
]]]
