package typings.embroiderMacros

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGlimmerDependencySatisfiesMod {
  
  @JSImport("@embroider/macros/src/glimmer/dependency-satisfies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    node: Any,
    baseDir: String,
    moduleName: String,
    packageCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageCache */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any], packageCache.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(
    node: Any,
    baseDir: Unit,
    moduleName: String,
    packageCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageCache */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any], packageCache.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
