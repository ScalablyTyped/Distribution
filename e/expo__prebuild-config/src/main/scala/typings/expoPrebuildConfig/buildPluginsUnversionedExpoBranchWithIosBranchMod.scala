package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.PickExpoConfigios
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsUnversionedExpoBranchWithIosBranchMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-branch/withIosBranch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBranchApiKey(config: PickExpoConfigios): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBranchApiKey")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setBranchApiKey(
    config: PickExpoConfigios,
    infoPlist: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfoPlist */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setBranchApiKey")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-branch/withIosBranch", "withIosBranch")
  @js.native
  val withIosBranch: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
}
