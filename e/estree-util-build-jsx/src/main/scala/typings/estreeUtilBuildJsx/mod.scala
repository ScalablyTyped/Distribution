package typings.estreeUtilBuildJsx

import typings.estree.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estree-util-build-jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildJsx[Tree /* <: Node */](tree: Tree): Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("buildJsx")(tree.asInstanceOf[js.Any]).asInstanceOf[Tree]
  inline def buildJsx[Tree /* <: Node */](tree: Tree, options: typings.estreeUtilBuildJsx.libMod.Options): Tree = (^.asInstanceOf[js.Dynamic].applyDynamic("buildJsx")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Tree]
  
  type BuildJsxOptions = Options
  
  type Options = typings.estreeUtilBuildJsx.libMod.Options
  
  type Runtime = typings.estreeUtilBuildJsx.libMod.Runtime
}
