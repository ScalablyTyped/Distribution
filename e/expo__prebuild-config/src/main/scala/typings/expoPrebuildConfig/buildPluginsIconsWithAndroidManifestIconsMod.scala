package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.PickExpoConfigandroid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsIconsWithAndroidManifestIconsMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/icons/withAndroidManifestIcons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setRoundIconManifest(
    config: PickExpoConfigandroid,
    manifest: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Manifest.AndroidManifest */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setRoundIconManifest")(config.asInstanceOf[js.Any], manifest.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/icons/withAndroidManifestIcons", "withAndroidManifestIcons")
  @js.native
  val withAndroidManifestIcons: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
}
