package typings.expoPrebuildConfig

import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withDefaultPluginsMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/withDefaultPlugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAutoPlugins(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoPlugins")().asInstanceOf[js.Array[String]]
  
  inline def getLegacyExpoPlugins(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegacyExpoPlugins")().asInstanceOf[js.Array[String]]
  
  @JSImport("@expo/prebuild-config/build/plugins/withDefaultPlugins", "withAndroidExpoPlugins")
  @js.native
  val withAndroidExpoPlugins: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin<{  package :string}> */ Any = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/withDefaultPlugins", "withIosExpoPlugins")
  @js.native
  val withIosExpoPlugins: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin<{  bundleIdentifier :string}> */ Any = js.native
  
  inline def withLegacyExpoPlugins(config: ExpoConfig): ExpoConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("withLegacyExpoPlugins")(config.asInstanceOf[js.Any]).asInstanceOf[ExpoConfig]
  
  @JSImport("@expo/prebuild-config/build/plugins/withDefaultPlugins", "withVersionedExpoSDKPlugins")
  @js.native
  val withVersionedExpoSDKPlugins: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin<{  expoUsername :string | null}> */ Any = js.native
}
