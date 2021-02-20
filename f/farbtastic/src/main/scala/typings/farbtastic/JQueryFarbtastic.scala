package typings.farbtastic

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait Options extends StObject {
    
    var callback: js.UndefOr[Callback] = js.native
    
    var wheelWidth: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: Callback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackFunction1(value: /* color */ String => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setWheelWidth(value: Double): Self = StObject.set(x, "wheelWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelWidthUndefined: Self = StObject.set(x, "wheelWidth", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type Placeholder = String | Element | JQuery
}
