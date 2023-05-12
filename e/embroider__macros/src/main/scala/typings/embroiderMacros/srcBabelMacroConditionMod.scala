package typings.embroiderMacros

import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.ConditionalExpression_
import typings.babelTypes.mod.IfStatement_
import typings.embroiderMacros.anon.NodePathCallExpressionget
import typings.embroiderMacros.embroiderMacrosStrings.test
import typings.embroiderMacros.srcBabelStateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBabelMacroConditionMod {
  
  @JSImport("@embroider/macros/src/babel/macro-condition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(conditionalPath: MacroConditionPath, state: State): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(conditionalPath.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isMacroConditionPath(path: NodePath[IfStatement_ | ConditionalExpression_]): /* is @embroider/macros.@embroider/macros/src/babel/macro-condition.MacroConditionPath */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacroConditionPath")(path.asInstanceOf[js.Any]).asInstanceOf[/* is @embroider/macros.@embroider/macros/src/babel/macro-condition.MacroConditionPath */ Boolean]
  
  @js.native
  trait MacroConditionPath extends NodePath[IfStatement_ | ConditionalExpression_] {
    
    @JSName("get")
    def get_test(test: test): NodePathCallExpressionget = js.native
  }
}
