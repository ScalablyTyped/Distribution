package typings.expoPrebuildConfig

import typings.expoConfigTypes.mod.ExpoConfig
import typings.expoPrebuildConfig.anon.Idiom
import typings.expoPrebuildConfig.anon.PickExpoConfigiconios
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsIconsWithIosIconsMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/icons/withIosIcons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/icons/withIosIcons", "ICON_CONTENTS")
  @js.native
  val ICON_CONTENTS: js.Array[Idiom] = js.native
  
  inline def getIcons(config: PickExpoConfigiconios): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIcons")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setIconsAsync(config: ExpoConfig, projectRoot: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIconsAsync")(config.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("@expo/prebuild-config/build/plugins/icons/withIosIcons", "withIosIcons")
  @js.native
  val withIosIcons: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
}
