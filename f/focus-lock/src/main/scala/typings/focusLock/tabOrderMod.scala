package typings.focusLock

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabOrderMod {
  
  @JSImport("focus-lock/dist/es5/utils/tabOrder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def orderByTabIndex(nodes: js.Array[HTMLElement], filterNegative: Boolean): js.Array[NodeIndex] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderByTabIndex")(nodes.asInstanceOf[js.Any], filterNegative.asInstanceOf[js.Any])).asInstanceOf[js.Array[NodeIndex]]
  inline def orderByTabIndex(nodes: js.Array[HTMLElement], filterNegative: Boolean, keepGuards: Boolean): js.Array[NodeIndex] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderByTabIndex")(nodes.asInstanceOf[js.Any], filterNegative.asInstanceOf[js.Any], keepGuards.asInstanceOf[js.Any])).asInstanceOf[js.Array[NodeIndex]]
  
  inline def tabSort(a: NodeIndex, b: NodeIndex): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tabSort")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait NodeIndex extends StObject {
    
    var index: Double
    
    var node: HTMLElement
    
    var tabIndex: Double
  }
  object NodeIndex {
    
    inline def apply(index: Double, node: HTMLElement, tabIndex: Double): NodeIndex = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeIndex]
    }
    
    extension [Self <: NodeIndex](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
}
