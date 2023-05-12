package typings.estreeWalker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWalkerMod {
  
  @JSImport("estree-walker/types/walker", "WalkerBase")
  @js.native
  open class WalkerBase () extends StObject {
    
    /** @type {WalkerContext} */
    var context: WalkerContext = js.native
    
    /**
      * @template {Node} Parent
      * @param {Parent | null | undefined} parent
      * @param {keyof Parent | null | undefined} prop
      * @param {number | null | undefined} index
      */
    def remove[Parent_1 /* <: typings.estree.mod.Node */](): Unit = js.native
    def remove[Parent_1 /* <: typings.estree.mod.Node */](parent: Parent_1): Unit = js.native
    def remove[Parent_1 /* <: typings.estree.mod.Node */](parent: Parent_1, prop: /* keyof Parent_1 */ String): Unit = js.native
    def remove[Parent_1 /* <: typings.estree.mod.Node */](parent: Parent_1, prop: /* keyof Parent_1 */ String, index: Double): Unit = js.native
    def remove[Parent_1 /* <: typings.estree.mod.Node */](parent: Parent_1, prop: Null, index: Double): Unit = js.native
    def remove[Parent_1 /* <: typings.estree.mod.Node */](parent: Parent_1, prop: Unit, index: Double): Unit = js.native
    def remove[Parent_1 /* <: typings.estree.mod.Node */](parent: Null, prop: /* keyof Parent_1 */ String): Unit = js.native
    def remove[Parent_1 /* <: typings.estree.mod.Node */](parent: Null, prop: /* keyof Parent_1 */ String, index: Double): Unit = js.native
    def remove[Parent_1 /* <: typings.estree.mod.Node */](parent: Null, prop: Null, index: Double): Unit = js.native
    def remove[Parent_1 /* <: typings.estree.mod.Node */](parent: Null, prop: Unit, index: Double): Unit = js.native
    def remove[Parent_1 /* <: typings.estree.mod.Node */](parent: Unit, prop: /* keyof Parent_1 */ String): Unit = js.native
    def remove[Parent_1 /* <: typings.estree.mod.Node */](parent: Unit, prop: /* keyof Parent_1 */ String, index: Double): Unit = js.native
    def remove[Parent_1 /* <: typings.estree.mod.Node */](parent: Unit, prop: Null, index: Double): Unit = js.native
    def remove[Parent_1 /* <: typings.estree.mod.Node */](parent: Unit, prop: Unit, index: Double): Unit = js.native
    
    /**
      * @template {Node} Parent
      * @param {Parent | null | undefined} parent
      * @param {keyof Parent | null | undefined} prop
      * @param {number | null | undefined} index
      * @param {Node} node
      */
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Parent, prop: /* keyof Parent */ String, index: Double, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Parent, prop: /* keyof Parent */ String, index: Null, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Parent, prop: /* keyof Parent */ String, index: Unit, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Parent, prop: Null, index: Double, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Parent, prop: Null, index: Null, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Parent, prop: Null, index: Unit, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Parent, prop: Unit, index: Double, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Parent, prop: Unit, index: Null, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Parent, prop: Unit, index: Unit, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Null, prop: /* keyof Parent */ String, index: Double, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Null, prop: /* keyof Parent */ String, index: Null, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Null, prop: /* keyof Parent */ String, index: Unit, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Null, prop: Null, index: Double, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Null, prop: Null, index: Null, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Null, prop: Null, index: Unit, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Null, prop: Unit, index: Double, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Null, prop: Unit, index: Null, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Null, prop: Unit, index: Unit, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Unit, prop: /* keyof Parent */ String, index: Double, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Unit, prop: /* keyof Parent */ String, index: Null, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Unit, prop: /* keyof Parent */ String, index: Unit, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Unit, prop: Null, index: Double, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Unit, prop: Null, index: Null, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Unit, prop: Null, index: Unit, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Unit, prop: Unit, index: Double, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Unit, prop: Unit, index: Null, node: Node): Unit = js.native
    def replace[Parent /* <: typings.estree.mod.Node */](parent: Unit, prop: Unit, index: Unit, node: Node): Unit = js.native
    
    /** @type {Node | null} */
    var replacement: Node | Null = js.native
    
    /** @type {boolean} */
    var should_remove: Boolean = js.native
    
    /** @type {boolean} */
    var should_skip: Boolean = js.native
  }
  
  type Node = typings.estree.mod.Node
  
  trait WalkerContext extends StObject {
    
    def remove(): Unit
    
    def replace(node: Node): Unit
    
    def skip(): Unit
  }
  object WalkerContext {
    
    inline def apply(remove: () => Unit, replace: Node => Unit, skip: () => Unit): WalkerContext = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove), replace = js.Any.fromFunction1(replace), skip = js.Any.fromFunction0(skip))
      __obj.asInstanceOf[WalkerContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WalkerContext] (val x: Self) extends AnyVal {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setReplace(value: Node => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      inline def setSkip(value: () => Unit): Self = StObject.set(x, "skip", js.Any.fromFunction0(value))
    }
  }
}
