package typings.embroiderMacros

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGlimmerGetConfigMod {
  
  @JSImport("@embroider/macros/src/glimmer/get-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    node: Any,
    userConfigs: StringDictionary[Any],
    baseDir: String,
    moduleName: String,
    own: Boolean,
    packageCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageCache */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], userConfigs.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any], own.asInstanceOf[js.Any], packageCache.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def default(
    node: Any,
    userConfigs: StringDictionary[Any],
    baseDir: Unit,
    moduleName: String,
    own: Boolean,
    packageCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageCache */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], userConfigs.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any], own.asInstanceOf[js.Any], packageCache.asInstanceOf[js.Any])).asInstanceOf[Any]
}
