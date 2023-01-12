package typings.editly.mod

import typings.editly.editlyStrings.canvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasLayer
  extends StObject
     with BaseLayer
     with Layer {
  
  /**
  		 * Custom JavaScript function.
  		 */
  def func(args: CustomCanvasFunctionArgs): OptionalPromise[CustomFunctionCallbacks]
  /**
  		 * Custom JavaScript function.
  		 */
  @JSName("func")
  var func_Original: CustomCanvasFunction
  
  /**
  		 * Layer type.
  		 */
  @JSName("type")
  var type_CanvasLayer: canvas
}
object CanvasLayer {
  
  inline def apply(func: /* args */ CustomCanvasFunctionArgs => OptionalPromise[CustomFunctionCallbacks]): CanvasLayer = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction1(func))
    __obj.updateDynamic("type")("canvas")
    __obj.asInstanceOf[CanvasLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasLayer] (val x: Self) extends AnyVal {
    
    inline def setFunc(value: /* args */ CustomCanvasFunctionArgs => OptionalPromise[CustomFunctionCallbacks]): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
    
    inline def setType(value: canvas): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
