package typings.estreeUtilVisit

import typings.estreeUtilVisit.libMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estree-util-visit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("estree-util-visit", "CONTINUE")
  @js.native
  val CONTINUE: js.Symbol = js.native
  
  @JSImport("estree-util-visit", "EXIT")
  @js.native
  val EXIT: js.Symbol = js.native
  
  @JSImport("estree-util-visit", "SKIP")
  @js.native
  val SKIP: js.Symbol = js.native
  
  inline def visit(tree: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("visit")(tree.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def visit(tree: Node, visitor: typings.estreeUtilVisit.libMod.Visitor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(tree.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def visit(tree: Node, visitor: typings.estreeUtilVisit.libMod.Visitors): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(tree.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Action = typings.estreeUtilVisit.libMod.Action
  
  type ActionTuple = typings.estreeUtilVisit.libMod.ActionTuple
  
  type Index = typings.estreeUtilVisit.libMod.Index
  
  type Visitor = typings.estreeUtilVisit.libMod.Visitor
  
  type Visitors = typings.estreeUtilVisit.libMod.Visitors
}
