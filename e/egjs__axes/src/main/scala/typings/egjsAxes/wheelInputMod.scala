package typings.egjsAxes

import typings.egjsAxes.inputTypeMod.InputType
import typings.egjsAxes.inputTypeMod.InputTypeObserver
import typings.egjsAxes.typesMod.ElementType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wheelInputMod {
  
  @JSImport("@egjs/axes/declaration/inputType/WheelInput", "WheelInput")
  @js.native
  open class WheelInput protected ()
    extends StObject
       with InputType {
    def this(el: ElementType) = this()
    def this(el: ElementType, options: WheelInputOption) = this()
    
    /* private */ var _attachEvent: Any = js.native
    
    /* private */ var _detachEvent: Any = js.native
    
    /* private */ var _direction: Any = js.native
    
    /* private */ var _enabled: Any = js.native
    
    /* private */ var _getOffset: Any = js.native
    
    /* private */ var _holding: Any = js.native
    
    /* private */ var _observer: Any = js.native
    
    /* private */ var _onWheel: Any = js.native
    
    /* private */ var _timer: Any = js.native
    
    /* CompleteClass */
    var axes: js.Array[String] = js.native
    
    /* CompleteClass */
    override def connect(observer: InputTypeObserver): InputType = js.native
    
    /* CompleteClass */
    override def destroy(): Any = js.native
    
    @JSName("disable")
    def disable_MWheelInput(): this.type = js.native
    
    /* CompleteClass */
    override def disconnect(): Any = js.native
    
    /* CompleteClass */
    var element: HTMLElement = js.native
    
    @JSName("enable")
    def enable_MWheelInput(): this.type = js.native
    
    def isEnabled(): Boolean = js.native
    
    /* CompleteClass */
    override def mapAxes(axes: js.Array[String]): Any = js.native
    
    var options: WheelInputOption = js.native
  }
  
  trait WheelInputOption extends StObject {
    
    var releaseDelay: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var useAnimation: js.UndefOr[Boolean] = js.undefined
    
    var useNormalized: js.UndefOr[Boolean] = js.undefined
  }
  object WheelInputOption {
    
    inline def apply(): WheelInputOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WheelInputOption]
    }
    
    extension [Self <: WheelInputOption](x: Self) {
      
      inline def setReleaseDelay(value: Double): Self = StObject.set(x, "releaseDelay", value.asInstanceOf[js.Any])
      
      inline def setReleaseDelayUndefined: Self = StObject.set(x, "releaseDelay", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setUseAnimation(value: Boolean): Self = StObject.set(x, "useAnimation", value.asInstanceOf[js.Any])
      
      inline def setUseAnimationUndefined: Self = StObject.set(x, "useAnimation", js.undefined)
      
      inline def setUseNormalized(value: Boolean): Self = StObject.set(x, "useNormalized", value.asInstanceOf[js.Any])
      
      inline def setUseNormalizedUndefined: Self = StObject.set(x, "useNormalized", js.undefined)
    }
  }
}
