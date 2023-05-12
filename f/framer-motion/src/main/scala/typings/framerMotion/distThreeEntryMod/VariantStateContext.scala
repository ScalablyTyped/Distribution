package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariantStateContext extends StObject {
  
  var animate: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var exit: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var initial: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var whileDrag: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var whileFocus: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var whileHover: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var whileTap: js.UndefOr[String | js.Array[String]] = js.undefined
}
object VariantStateContext {
  
  inline def apply(): VariantStateContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantStateContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariantStateContext] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: String | js.Array[String]): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnimateVarargs(value: String*): Self = StObject.set(x, "animate", js.Array(value*))
    
    inline def setExit(value: String | js.Array[String]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setExitVarargs(value: String*): Self = StObject.set(x, "exit", js.Array(value*))
    
    inline def setInitial(value: String | js.Array[String]): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setInitialVarargs(value: String*): Self = StObject.set(x, "initial", js.Array(value*))
    
    inline def setWhileDrag(value: String | js.Array[String]): Self = StObject.set(x, "whileDrag", value.asInstanceOf[js.Any])
    
    inline def setWhileDragUndefined: Self = StObject.set(x, "whileDrag", js.undefined)
    
    inline def setWhileDragVarargs(value: String*): Self = StObject.set(x, "whileDrag", js.Array(value*))
    
    inline def setWhileFocus(value: String | js.Array[String]): Self = StObject.set(x, "whileFocus", value.asInstanceOf[js.Any])
    
    inline def setWhileFocusUndefined: Self = StObject.set(x, "whileFocus", js.undefined)
    
    inline def setWhileFocusVarargs(value: String*): Self = StObject.set(x, "whileFocus", js.Array(value*))
    
    inline def setWhileHover(value: String | js.Array[String]): Self = StObject.set(x, "whileHover", value.asInstanceOf[js.Any])
    
    inline def setWhileHoverUndefined: Self = StObject.set(x, "whileHover", js.undefined)
    
    inline def setWhileHoverVarargs(value: String*): Self = StObject.set(x, "whileHover", js.Array(value*))
    
    inline def setWhileTap(value: String | js.Array[String]): Self = StObject.set(x, "whileTap", value.asInstanceOf[js.Any])
    
    inline def setWhileTapUndefined: Self = StObject.set(x, "whileTap", js.undefined)
    
    inline def setWhileTapVarargs(value: String*): Self = StObject.set(x, "whileTap", js.Array(value*))
  }
}
