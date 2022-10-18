package typings.expoMetroConfig

import typings.babelCore.mod.PluginItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTransformerGetBabelConfigMod {
  
  @JSImport("@expo/metro-config/build/transformer/getBabelConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBabelConfig(
    filename: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformerOptions */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBabelConfig")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getBabelConfig(
    filename: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BabelTransformerOptions */ Any,
    plugins: PluginItem
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBabelConfig")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Any]
}
