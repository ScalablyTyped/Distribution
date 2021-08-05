package typings.farbtastic

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryFarbtastic {
  
  type Callback = CallbackFunction | Placeholder
  
  type CallbackFunction = js.Function1[/* color */ String, js.Any]
  
  @js.native
  trait Farbtastic extends StObject {
    
    var color: String = js.native
    
    var hsl: js.Array[Double] = js.native
    
    def linkTo(callback: Callback): Farbtastic = js.native
    
    var linked: CallbackFunction | JQuery = js.native
    
    def setColor(color: String): Farbtastic = js.native
    def setColor(color: js.Array[Double]): Farbtastic = js.native
    
    def setHSL(hsl: js.Array[Double]): Farbtastic = js.native
  }
  
  trait Options extends StObject {
    
    var callback: js.UndefOr[Callback] = js.undefined
    
    var wheelWidth: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackFunction1(value: /* color */ String => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setWheelWidth(value: Double): Self = StObject.set(x, "wheelWidth", value.asInstanceOf[js.Any])
      
      inline def setWheelWidthUndefined: Self = StObject.set(x, "wheelWidth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type Placeholder = String | Element | JQuery
}
