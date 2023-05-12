package typings.embroiderMacros

import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.CallExpression_
import typings.embroiderMacros.srcBabelStateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBabelModuleExistsMod {
  
  @JSImport("@embroider/macros/src/babel/module-exists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: NodePath[CallExpression_], state: State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
