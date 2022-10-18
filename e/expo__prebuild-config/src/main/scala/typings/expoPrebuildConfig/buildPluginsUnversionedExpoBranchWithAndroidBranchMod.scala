package typings.expoPrebuildConfig

import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsUnversionedExpoBranchWithAndroidBranchMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-branch/withAndroidBranch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBranchApiKey(config: ExpoConfig): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBranchApiKey")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setBranchApiKey(
    config: ExpoConfig,
    androidManifest: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Manifest.AndroidManifest */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setBranchApiKey")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-branch/withAndroidBranch", "withAndroidBranch")
  @js.native
  val withAndroidBranch: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
}
