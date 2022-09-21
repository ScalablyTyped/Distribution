package typings.focusLock

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusablesMod {
  
  @JSImport("focus-lock/dist/es5/focusables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFocusableIn(topNode: HTMLElement): js.Array[FocusableIn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableIn")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[FocusableIn]]
  
  inline def getFocusabledIn(topNode: HTMLElement): js.Array[FocusableIn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusabledIn")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[FocusableIn]]
  
  trait FocusableIn extends StObject {
    
    /**
      * true, if this node is a focus-guard (system node)
      */
    var guard: Boolean
    
    /**
      * tab index
      */
    var index: Double
    
    /**
      * true, if this node belongs to a Lock
      */
    var lockItem: Boolean
    
    var node: HTMLElement
  }
  object FocusableIn {
    
    inline def apply(guard: Boolean, index: Double, lockItem: Boolean, node: HTMLElement): FocusableIn = {
      val __obj = js.Dynamic.literal(guard = guard.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], lockItem = lockItem.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusableIn]
    }
    
    extension [Self <: FocusableIn](x: Self) {
      
      inline def setGuard(value: Boolean): Self = StObject.set(x, "guard", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLockItem(value: Boolean): Self = StObject.set(x, "lockItem", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
