package typings.egjsAxes

import typings.egjsAxes.declarationInputTypeInputTypeMod.InputType
import typings.egjsAxes.declarationInputTypeInputTypeMod.InputTypeObserver
import typings.egjsAxes.declarationTypesMod.ElementType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationInputTypePinchInputMod {
  
  @JSImport("@egjs/axes/declaration/inputType/PinchInput", "PinchInput")
  @js.native
  open class PinchInput protected ()
    extends StObject
       with InputType {
    def this(el: ElementType) = this()
    def this(el: ElementType, options: PinchInputOption) = this()
    
    /* private */ var _activeEvent: Any = js.native
    
    /* private */ var _attachEvent: Any = js.native
    
    /* private */ var _baseValue: Any = js.native
    
    /* private */ var _detachEvent: Any = js.native
    
    /* private */ var _enabled: Any = js.native
    
    /* private */ var _getDistance: Any = js.native
    
    /* private */ var _getOffset: Any = js.native
    
    /* private */ var _isOverThreshold: Any = js.native
    
    /* private */ var _observer: Any = js.native
    
    /* private */ var _onPinchEnd: Any = js.native
    
    /* private */ var _onPinchMove: Any = js.native
    
    /* private */ var _onPinchStart: Any = js.native
    
    /* private */ var _originalCssProps: Any = js.native
    
    /* private */ var _pinchFlag: Any = js.native
    
    /* CompleteClass */
    var axes: js.Array[String] = js.native
    
    /* CompleteClass */
    override def connect(observer: InputTypeObserver): InputType = js.native
    
    /* CompleteClass */
    override def destroy(): Any = js.native
    
    @JSName("disable")
    def disable_MPinchInput(): this.type = js.native
    
    /* CompleteClass */
    override def disconnect(): Any = js.native
    
    /* CompleteClass */
    var element: HTMLElement = js.native
    
    @JSName("enable")
    def enable_MPinchInput(): this.type = js.native
    
    def isEnabled(): Boolean = js.native
    
    /* CompleteClass */
    override def mapAxes(axes: js.Array[String]): Any = js.native
    
    var options: PinchInputOption = js.native
  }
  
  trait PinchInputOption extends StObject {
    
    var inputType: js.UndefOr[js.Array[String]] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var touchAction: js.UndefOr[String] = js.undefined
  }
  object PinchInputOption {
    
    inline def apply(): PinchInputOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinchInputOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PinchInputOption] (val x: Self) extends AnyVal {
      
      inline def setInputType(value: js.Array[String]): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
      
      inline def setInputTypeVarargs(value: String*): Self = StObject.set(x, "inputType", js.Array(value*))
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      inline def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
    }
  }
}
