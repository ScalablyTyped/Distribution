package typings.focusLock

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusablesMod {
  
  @JSImport("focus-lock/dist/es5/focusables", "getFocusabledIn")
  @js.native
  def getFocusabledIn(topNode: HTMLElement): js.Array[FocusableIn] = js.native
  
  @js.native
  trait FocusableIn extends StObject {
    
    var guard: Boolean = js.native
    
    var index: Double = js.native
    
    var lockItem: Boolean = js.native
    
    var node: HTMLElement = js.native
  }
  object FocusableIn {
    
    @scala.inline
    def apply(guard: Boolean, index: Double, lockItem: Boolean, node: HTMLElement): FocusableIn = {
      val __obj = js.Dynamic.literal(guard = guard.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], lockItem = lockItem.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusableIn]
    }
    
    @scala.inline
    implicit class FocusableInMutableBuilder[Self <: FocusableIn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGuard(value: Boolean): Self = StObject.set(x, "guard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockItem(value: Boolean): Self = StObject.set(x, "lockItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
