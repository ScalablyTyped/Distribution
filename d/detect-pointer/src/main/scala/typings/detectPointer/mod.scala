package typings.detectPointer

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("detect-pointer", JSImport.Default)
  @js.native
  val default: typings.detectPointer.mod.detectPointer = js.native
  
  type _To = typings.detectPointer.mod.detectPointer
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typings.detectPointer.mod.detectPointer = default
  
  @js.native
  trait detectPointer extends StObject {
    
    var anyCoarse: Boolean = js.native
    
    var anyFine: Boolean = js.native
    
    var anyNone: Boolean = js.native
    
    var coarse: Boolean = js.native
    
    var fine: Boolean = js.native
    
    var none: Boolean = js.native
    
    def update(): Unit = js.native
  }
  object detectPointer {
    
    @scala.inline
    def apply(
      anyCoarse: Boolean,
      anyFine: Boolean,
      anyNone: Boolean,
      coarse: Boolean,
      fine: Boolean,
      none: Boolean,
      update: () => Unit
    ): typings.detectPointer.mod.detectPointer = {
      val __obj = js.Dynamic.literal(anyCoarse = anyCoarse.asInstanceOf[js.Any], anyFine = anyFine.asInstanceOf[js.Any], anyNone = anyNone.asInstanceOf[js.Any], coarse = coarse.asInstanceOf[js.Any], fine = fine.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[typings.detectPointer.mod.detectPointer]
    }
    
    @scala.inline
    implicit class detectPointerMutableBuilder[Self <: typings.detectPointer.mod.detectPointer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnyCoarse(value: Boolean): Self = StObject.set(x, "anyCoarse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyFine(value: Boolean): Self = StObject.set(x, "anyFine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyNone(value: Boolean): Self = StObject.set(x, "anyNone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoarse(value: Boolean): Self = StObject.set(x, "coarse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFine(value: Boolean): Self = StObject.set(x, "fine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNone(value: Boolean): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
