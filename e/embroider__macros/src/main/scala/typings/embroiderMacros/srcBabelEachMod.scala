package typings.embroiderMacros

import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.CallExpression_
import typings.babelTypes.mod.ForOfStatement_
import typings.babelTypes.mod.Identifier_
import typings.embroiderMacros.anon.TypeofBabel
import typings.embroiderMacros.embroiderMacrosStrings.callee
import typings.embroiderMacros.embroiderMacrosStrings.right
import typings.embroiderMacros.srcBabelStateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBabelEachMod {
  
  @JSImport("@embroider/macros/src/babel/each", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def insertEach(path: EachPath, state: State, context: TypeofBabel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertEach")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isEachPath(path: NodePath[ForOfStatement_]): /* is @embroider/macros.@embroider/macros/src/babel/each.EachPath */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEachPath")(path.asInstanceOf[js.Any]).asInstanceOf[/* is @embroider/macros.@embroider/macros/src/babel/each.EachPath */ Boolean]
  
  @js.native
  trait CallEachExpression extends NodePath[CallExpression_] {
    
    @JSName("get")
    def get_callee(callee: callee): NodePath[Identifier_] = js.native
  }
  
  @js.native
  trait EachPath extends NodePath[ForOfStatement_] {
    
    @JSName("get")
    def get_right(right: right): CallEachExpression = js.native
  }
}
