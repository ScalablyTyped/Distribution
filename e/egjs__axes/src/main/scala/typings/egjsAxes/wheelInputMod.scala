package typings.egjsAxes

import typings.egjsAxes.inputTypeMod.IInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wheelInputMod {
  
  @JSImport("@egjs/axes/inputType/WheelInput", "WheelInput")
  @js.native
  class WheelInput protected () extends IInputType {
    def this(el: js.Any) = this()
    def this(el: js.Any, options: WheelInputOption) = this()
    
    var _isEnabled: js.Any = js.native
    
    var _timer: js.Any = js.native
    
    /* private */ def attachEvent(observer: js.Any): js.Any = js.native
    
    /* private */ def dettachEvent(): js.Any = js.native
    
    @JSName("disable")
    def disable_MWheelInput(): this.type = js.native
    
    @JSName("enable")
    def enable_MWheelInput(): this.type = js.native
    
    @JSName("isEnable")
    def isEnable_MWheelInput(): Boolean = js.native
    
    var observer: js.Any = js.native
    
    /* private */ def onWheel(event: js.Any): js.Any = js.native
    
    var options: WheelInputOption = js.native
  }
  
  @js.native
  trait WheelInputOption extends StObject {
    
    var scale: js.UndefOr[Double] = js.native
    
    var throttle: js.UndefOr[Double] = js.native
  }
  object WheelInputOption {
    
    @scala.inline
    def apply(): WheelInputOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WheelInputOption]
    }
    
    @scala.inline
    implicit class WheelInputOptionMutableBuilder[Self <: WheelInputOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
}
