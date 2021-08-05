package typings.dom4

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://dom.spec.whatwg.org/#childnode
  */
trait ChildNode extends StObject {
  
  /**
    * Inserts `nodes` just after this node, while replacing strings with equivalent `Text` nodes.
    */
  def after(nodes: (Node | String)*): Unit
  
  /**
    * Inserts `nodes` just before this node, while replacing strings with equivalent `Text` nodes.
    */
  def before(nodes: (Node | String)*): Unit
  
  /**
    * Removes this node.
    */
  def remove(): Unit
  
  /**
    * Replaces this node with `nodes`, while replacing strings in nodes with equivalent Text nodes.
    */
  def replaceWith(nodes: (Node | String)*): Unit
}
object ChildNode {
  
  inline def apply(
    after: /* repeated */ Node | String => Unit,
    before: /* repeated */ Node | String => Unit,
    remove: () => Unit,
    replaceWith: /* repeated */ Node | String => Unit
  ): ChildNode = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), remove = js.Any.fromFunction0(remove), replaceWith = js.Any.fromFunction1(replaceWith))
    __obj.asInstanceOf[ChildNode]
  }
  
  extension [Self <: ChildNode](x: Self) {
    
    inline def setAfter(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    inline def setBefore(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setReplaceWith(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
  }
}
