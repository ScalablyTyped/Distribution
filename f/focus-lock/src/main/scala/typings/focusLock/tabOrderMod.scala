package typings.focusLock

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabOrderMod {
  
  @JSImport("focus-lock/dist/es5/utils/tabOrder", "orderByTabIndex")
  @js.native
  def orderByTabIndex(nodes: js.Array[HTMLInputElement], filterNegative: Boolean): js.Array[NodeIndex] = js.native
  @JSImport("focus-lock/dist/es5/utils/tabOrder", "orderByTabIndex")
  @js.native
  def orderByTabIndex(nodes: js.Array[HTMLInputElement], filterNegative: Boolean, keepGuards: Boolean): js.Array[NodeIndex] = js.native
  
  @JSImport("focus-lock/dist/es5/utils/tabOrder", "tabSort")
  @js.native
  def tabSort(a: NodeIndex, b: NodeIndex): Double = js.native
  
  @js.native
  trait NodeIndex extends StObject {
    
    var index: Double = js.native
    
    var node: HTMLInputElement = js.native
    
    var tabIndex: Double = js.native
  }
  object NodeIndex {
    
    @scala.inline
    def apply(index: Double, node: HTMLInputElement, tabIndex: Double): NodeIndex = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeIndex]
    }
    
    @scala.inline
    implicit class NodeIndexMutableBuilder[Self <: NodeIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: HTMLInputElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
}
