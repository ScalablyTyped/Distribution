package typings.detectPointer

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("detect-pointer", JSImport.Default)
  @js.native
  val default: typings.detectPointer.mod.detectPointer = js.native
  
  type _To = typings.detectPointer.mod.detectPointer
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typings.detectPointer.mod.detectPointer = default
  
  trait detectPointer extends StObject {
    
    var anyCoarse: Boolean
    
    var anyFine: Boolean
    
    var anyNone: Boolean
    
    var coarse: Boolean
    
    var fine: Boolean
    
    var none: Boolean
    
    def update(): Unit
  }
  object detectPointer {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: typings.detectPointer.mod.detectPointer] (val x: Self) extends AnyVal {
      
      inline def setAnyCoarse(value: Boolean): Self = StObject.set(x, "anyCoarse", value.asInstanceOf[js.Any])
      
      inline def setAnyFine(value: Boolean): Self = StObject.set(x, "anyFine", value.asInstanceOf[js.Any])
      
      inline def setAnyNone(value: Boolean): Self = StObject.set(x, "anyNone", value.asInstanceOf[js.Any])
      
      inline def setCoarse(value: Boolean): Self = StObject.set(x, "coarse", value.asInstanceOf[js.Any])
      
      inline def setFine(value: Boolean): Self = StObject.set(x, "fine", value.asInstanceOf[js.Any])
      
      inline def setNone(value: Boolean): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
