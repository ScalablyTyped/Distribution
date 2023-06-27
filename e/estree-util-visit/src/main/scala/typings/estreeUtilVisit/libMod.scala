package typings.estreeUtilVisit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("estree-util-visit/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("estree-util-visit/lib", "CONTINUE")
  @js.native
  val CONTINUE: js.Symbol = js.native
  
  @JSImport("estree-util-visit/lib", "EXIT")
  @js.native
  val EXIT: js.Symbol = js.native
  
  @JSImport("estree-util-visit/lib", "SKIP")
  @js.native
  val SKIP: js.Symbol = js.native
  
  inline def visit(tree: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("visit")(tree.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def visit(tree: Node, visitor: Visitor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(tree.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def visit(tree: Node, visitor: Visitors): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(tree.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Action = js.Symbol
  
  type ActionTuple = js.Tuple2[js.UndefOr[Action | Null | Unit], js.UndefOr[Index | Null]]
  
  type Index = Double
  
  type Node = typings.std.Node
  
  type Visitor = js.Function4[
    /* node */ Node, 
    /* key */ String | Null, 
    /* index */ Double | Null, 
    /* ancestors */ js.Array[Node], 
    js.UndefOr[Action | Index | ActionTuple | Null | Unit]
  ]
  
  trait Visitors extends StObject {
    
    /**
      * Handle nodes when entering (preorder).
      */
    var enter: js.UndefOr[Visitor | Null] = js.undefined
    
    /**
      * Handle nodes when leaving (postorder).
      */
    var leave: js.UndefOr[Visitor | Null] = js.undefined
  }
  object Visitors {
    
    inline def apply(): Visitors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Visitors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Visitors] (val x: Self) extends AnyVal {
      
      inline def setEnter(
        value: (/* node */ Node, /* key */ String | Null, /* index */ Double | Null, /* ancestors */ js.Array[Node]) => js.UndefOr[Action | Index | ActionTuple | Null | Unit]
      ): Self = StObject.set(x, "enter", js.Any.fromFunction4(value))
      
      inline def setEnterNull: Self = StObject.set(x, "enter", null)
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setLeave(
        value: (/* node */ Node, /* key */ String | Null, /* index */ Double | Null, /* ancestors */ js.Array[Node]) => js.UndefOr[Action | Index | ActionTuple | Null | Unit]
      ): Self = StObject.set(x, "leave", js.Any.fromFunction4(value))
      
      inline def setLeaveNull: Self = StObject.set(x, "leave", null)
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
}
