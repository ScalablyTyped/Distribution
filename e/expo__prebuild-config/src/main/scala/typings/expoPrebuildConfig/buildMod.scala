package typings.expoPrebuildConfig

import typings.expoConfigTypes.mod.ExpoConfig
import typings.expoPrebuildConfig.anon.BundleIdentifier
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("@expo/prebuild-config/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAutoPlugins(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoPlugins")().asInstanceOf[js.Array[String]]
  
  inline def getLegacyExpoPlugins(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegacyExpoPlugins")().asInstanceOf[js.Array[String]]
  
  inline def getPrebuildConfigAsync(projectRoot: String, props: BundleIdentifier): js.Promise[
    ReturnType[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof getConfig */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPrebuildConfigAsync")(projectRoot.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ReturnType[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof getConfig */ Any
    ]
  ]]
  
  @JSImport("@expo/prebuild-config/build", "withAndroidExpoPlugins")
  @js.native
  val withAndroidExpoPlugins: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin<{  package :string}> */ Any = js.native
  
  @JSImport("@expo/prebuild-config/build", "withIosExpoPlugins")
  @js.native
  val withIosExpoPlugins: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin<{  bundleIdentifier :string}> */ Any = js.native
  
  inline def withLegacyExpoPlugins(config: ExpoConfig): ExpoConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("withLegacyExpoPlugins")(config.asInstanceOf[js.Any]).asInstanceOf[ExpoConfig]
  
  @JSImport("@expo/prebuild-config/build", "withVersionedExpoSDKPlugins")
  @js.native
  val withVersionedExpoSDKPlugins: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin<{  expoUsername :string | null}> */ Any = js.native
}
