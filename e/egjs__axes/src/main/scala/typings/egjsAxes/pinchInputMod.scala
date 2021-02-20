package typings.egjsAxes

import typings.egjsAxes.inputTypeMod.IInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinchInputMod {
  
  @JSImport("@egjs/axes/inputType/PinchInput", "PinchInput")
  @js.native
  class PinchInput protected () extends IInputType {
    def this(el: js.Any) = this()
    def this(el: js.Any, options: PinchInputOption) = this()
    
    var _prev: js.Any = js.native
    
    /* private */ def attachEvent(observer: js.Any): js.Any = js.native
    
    /* private */ def dettachEvent(): js.Any = js.native
    
    @JSName("disable")
    def disable_MPinchInput(): this.type = js.native
    
    @JSName("enable")
    def enable_MPinchInput(): this.type = js.native
    
    @JSName("isEnable")
    def isEnable_MPinchInput(): Boolean = js.native
    
    var observer: js.Any = js.native
    
    /* private */ def onPinchEnd(event: js.Any): js.Any = js.native
    
    /* private */ def onPinchMove(event: js.Any): js.Any = js.native
    
    /* private */ def onPinchStart(event: js.Any): js.Any = js.native
    
    var options: PinchInputOption = js.native
  }
  
  @js.native
  trait PinchInputOption extends StObject {
    
    var scale: js.UndefOr[Double] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
  }
  object PinchInputOption {
    
    @scala.inline
    def apply(): PinchInputOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinchInputOption]
    }
    
    @scala.inline
    implicit class PinchInputOptionMutableBuilder[Self <: PinchInputOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
