package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.AssertMissingModProviders
import typings.expoConfigPlugins.anon.Introspect
import typings.expoConfigPlugins.buildPluginDottypesMod.ExportedConfig
import typings.expoConfigPlugins.buildPluginsCreateBaseModMod.ForwardedBaseModOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsModCompilerMod {
  
  @JSImport("@expo/config-plugins/build/plugins/mod-compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileModsAsync(config: ExportedConfig, props: AssertMissingModProviders): js.Promise[ExportedConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileModsAsync")(config.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExportedConfig]]
  
  inline def evalModsAsync(config: ExportedConfig, param1: Introspect): js.Promise[ExportedConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("evalModsAsync")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExportedConfig]]
  
  inline def withDefaultBaseMods(config: ExportedConfig): ExportedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultBaseMods")(config.asInstanceOf[js.Any]).asInstanceOf[ExportedConfig]
  inline def withDefaultBaseMods(config: ExportedConfig, props: ForwardedBaseModOptions): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultBaseMods")(config.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]
  
  inline def withIntrospectionBaseMods(config: ExportedConfig): ExportedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("withIntrospectionBaseMods")(config.asInstanceOf[js.Any]).asInstanceOf[ExportedConfig]
  inline def withIntrospectionBaseMods(config: ExportedConfig, props: ForwardedBaseModOptions): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withIntrospectionBaseMods")(config.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]
}
