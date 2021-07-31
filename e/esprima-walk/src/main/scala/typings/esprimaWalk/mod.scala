package typings.esprimaWalk

import typings.estree.mod.Node
import typings.estree.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Walk the provided AST; fn is called once for each node with a `type`
    * @param {ESTree.Program} ast program to walk
    * @param {function} fn function invoked for each node with type
    */
  @scala.inline
  def apply(ast: Program, fn: js.Function1[/* node */ Node, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("esprima-walk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def walk(ast: Program, fn: js.Function1[/* node */ Node, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def walkAddParent(ast: Program, fn: js.Function1[/* node */ NodeWithParent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkAddParent")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait NodeWithParent
    extends StObject
       with typings.std.Node {
    
    var parent: js.UndefOr[typings.std.Node] = js.native
  }
}
