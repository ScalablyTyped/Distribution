package typings.egjsAxes

import typings.egjsAxes.inputTypeMod.IInputType
import typings.egjsAxes.inputTypeMod.IInputTypeObserver
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wheelInputMod {
  
  @JSImport("@egjs/axes/inputType/WheelInput", "WheelInput")
  @js.native
  class WheelInput protected ()
    extends StObject
       with IInputType {
    def this(el: js.Any) = this()
    def this(el: js.Any, options: WheelInputOption) = this()
    
    var _isEnabled: js.Any = js.native
    
    var _timer: js.Any = js.native
    
    /* private */ def attachEvent(observer: js.Any): js.Any = js.native
    
    /* CompleteClass */
    var axes: js.Array[String] = js.native
    
    /* CompleteClass */
    override def connect(observer: IInputTypeObserver): IInputType = js.native
    
    /* CompleteClass */
    override def destroy(): js.Any = js.native
    
    /* private */ def dettachEvent(): js.Any = js.native
    
    @JSName("disable")
    def disable_MWheelInput(): this.type = js.native
    
    /* CompleteClass */
    override def disconnect(): js.Any = js.native
    
    /* CompleteClass */
    var element: HTMLElement = js.native
    
    @JSName("enable")
    def enable_MWheelInput(): this.type = js.native
    
    @JSName("isEnable")
    def isEnable_MWheelInput(): Boolean = js.native
    
    /* CompleteClass */
    override def mapAxes(axes: js.Array[String]): js.Any = js.native
    
    var observer: js.Any = js.native
    
    /* private */ def onWheel(event: js.Any): js.Any = js.native
    
    var options: WheelInputOption = js.native
  }
  
  trait WheelInputOption extends StObject {
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var throttle: js.UndefOr[Double] = js.undefined
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
