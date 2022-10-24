package typings.expoConfigPlugins.buildMod

import typings.expoConfigPlugins.anon.Colors
import typings.expoConfigPlugins.anon.Dangerous
import typings.expoConfigPlugins.anon.FnCall
import typings.expoConfigPlugins.anon.FnCallProps
import typings.expoConfigPlugins.anon.ForwardedBaseModOptionspr
import typings.expoConfigPlugins.anon.ForwardedBaseModOptionsprProviders
import typings.expoConfigPlugins.anon.Platform
import typings.expoConfigPlugins.buildPluginDottypesMod.ExportedConfig
import typings.expoConfigPlugins.buildPluginsCreateBaseModMod.BaseModProviderMethods
import typings.expoConfigPlugins.buildPluginsCreateBaseModMod.ForwardedBaseModOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseMods {
  
  @JSImport("@expo/config-plugins/build", "BaseMods")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAndroidModFileProviders(): Colors = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidModFileProviders")().asInstanceOf[Colors]
  @JSImport("@expo/config-plugins/build", "BaseMods.getAndroidModFileProviders")
  @js.native
  def getAndroidModFileProviders_FBaseMods: js.Function0[Colors] = js.native
  
  inline def getAndroidModFileProviders_FBaseMods_=(x: js.Function0[Colors]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAndroidModFileProviders")(x.asInstanceOf[js.Any])
  
  inline def getIosModFileProviders(): Dangerous = ^.asInstanceOf[js.Dynamic].applyDynamic("getIosModFileProviders")().asInstanceOf[Dangerous]
  @JSImport("@expo/config-plugins/build", "BaseMods.getIosModFileProviders")
  @js.native
  def getIosModFileProviders_FBaseMods: js.Function0[Dangerous] = js.native
  
  inline def getIosModFileProviders_FBaseMods_=(x: js.Function0[Dangerous]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getIosModFileProviders")(x.asInstanceOf[js.Any])
  
  @JSImport("@expo/config-plugins/build", "BaseMods.provider")
  @js.native
  def provider: FnCallProps = js.native
  inline def provider[ModType, Props /* <: ForwardedBaseModOptions */](props: BaseModProviderMethods[ModType, Props]): BaseModProviderMethods[ModType, Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("provider")(props.asInstanceOf[js.Any]).asInstanceOf[BaseModProviderMethods[ModType, Props]]
  inline def provider_=(x: FnCallProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("provider")(x.asInstanceOf[js.Any])
  
  @JSImport("@expo/config-plugins/build", "BaseMods.withAndroidBaseMods")
  @js.native
  def withAndroidBaseMods: js.Function2[
    /* config */ ExportedConfig, 
    /* param1 */ js.UndefOr[ForwardedBaseModOptionspr], 
    ExportedConfig
  ] = js.native
  inline def withAndroidBaseMods(config: ExportedConfig): ExportedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("withAndroidBaseMods")(config.asInstanceOf[js.Any]).asInstanceOf[ExportedConfig]
  inline def withAndroidBaseMods(config: ExportedConfig, param1: ForwardedBaseModOptionspr): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withAndroidBaseMods")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]
  inline def withAndroidBaseMods_=(
    x: js.Function2[
      /* config */ ExportedConfig, 
      /* param1 */ js.UndefOr[ForwardedBaseModOptionspr], 
      ExportedConfig
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withAndroidBaseMods")(x.asInstanceOf[js.Any])
  
  @JSImport("@expo/config-plugins/build", "BaseMods.withGeneratedBaseMods")
  @js.native
  def withGeneratedBaseMods: FnCall = js.native
  inline def withGeneratedBaseMods[ModName /* <: String */](config: ExportedConfig, param1: ForwardedBaseModOptions & Platform[ModName]): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withGeneratedBaseMods")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]
  inline def withGeneratedBaseMods_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withGeneratedBaseMods")(x.asInstanceOf[js.Any])
  
  @JSImport("@expo/config-plugins/build", "BaseMods.withIosBaseMods")
  @js.native
  def withIosBaseMods: js.Function2[
    /* config */ ExportedConfig, 
    /* param1 */ js.UndefOr[ForwardedBaseModOptionsprProviders], 
    ExportedConfig
  ] = js.native
  inline def withIosBaseMods(config: ExportedConfig): ExportedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("withIosBaseMods")(config.asInstanceOf[js.Any]).asInstanceOf[ExportedConfig]
  inline def withIosBaseMods(config: ExportedConfig, param1: ForwardedBaseModOptionsprProviders): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withIosBaseMods")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]
  inline def withIosBaseMods_=(
    x: js.Function2[
      /* config */ ExportedConfig, 
      /* param1 */ js.UndefOr[ForwardedBaseModOptionsprProviders], 
      ExportedConfig
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withIosBaseMods")(x.asInstanceOf[js.Any])
}
