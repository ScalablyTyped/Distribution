package typings.egjsAxes

import typings.egjsAxes.inputTypeMod.InputType
import typings.egjsAxes.inputTypeMod.InputTypeObserver
import typings.egjsAxes.typesMod.ActiveEvent
import typings.egjsAxes.typesMod.ElementType
import typings.egjsAxes.typesMod.InputEventType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panInputMod {
  
  @JSImport("@egjs/axes/declaration/inputType/PanInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@egjs/axes/declaration/inputType/PanInput", "PanInput")
  @js.native
  open class PanInput protected ()
    extends StObject
       with InputType {
    def this(el: ElementType) = this()
    def this(el: ElementType, options: PanInputOption) = this()
    
    /* protected */ var _activeEvent: ActiveEvent = js.native
    
    /* private */ var _atRightEdge: Any = js.native
    
    /* private */ var _attachElementEvent: Any = js.native
    
    /* protected */ def _attachWindowEvent(activeEvent: ActiveEvent): Unit = js.native
    
    /* private */ var _detachElementEvent: Any = js.native
    
    /* protected */ def _detachWindowEvent(activeEvent: ActiveEvent): Unit = js.native
    
    /* protected */ var _direction: Double = js.native
    
    /* private */ var _dragged: Any = js.native
    
    /* protected */ var _enabled: Boolean = js.native
    
    /* private */ var _getDistance: Any = js.native
    
    /* protected */ def _getOffset(properties: js.Array[Double], direction: js.Array[Boolean]): js.Array[Double] = js.native
    
    /* private */ var _isOverThreshold: Any = js.native
    
    /* protected */ var _observer: InputTypeObserver = js.native
    
    /* protected */ def _onPanend(event: InputEventType): Unit = js.native
    
    /* protected */ def _onPanmove(event: InputEventType): Unit = js.native
    
    /* protected */ def _onPanstart(event: InputEventType): Unit = js.native
    
    /* private */ var _originalCssProps: Any = js.native
    
    /* private */ var _preventClickWhenDragged: Any = js.native
    
    /* private */ var _rightEdgeTimer: Any = js.native
    
    /* private */ var _voidFunction: Any = js.native
    
    /* CompleteClass */
    var axes: js.Array[String] = js.native
    
    /* CompleteClass */
    override def connect(observer: InputTypeObserver): InputType = js.native
    
    /* CompleteClass */
    override def destroy(): Any = js.native
    
    @JSName("disable")
    def disable_MPanInput(): this.type = js.native
    
    /* CompleteClass */
    override def disconnect(): Any = js.native
    
    /* CompleteClass */
    var element: HTMLElement = js.native
    
    @JSName("enable")
    def enable_MPanInput(): this.type = js.native
    
    def isEnabled(): Boolean = js.native
    
    /* CompleteClass */
    override def mapAxes(axes: js.Array[String]): Any = js.native
    
    var options: PanInputOption = js.native
    
    def release(): this.type = js.native
  }
  
  inline def getDirectionByAngle(angle: Double, thresholdAngle: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionByAngle")(angle.asInstanceOf[js.Any], thresholdAngle.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait PanInputOption extends StObject {
    
    var iOSEdgeSwipeThreshold: js.UndefOr[Double] = js.undefined
    
    var inputButton: js.UndefOr[js.Array[String]] = js.undefined
    
    var inputType: js.UndefOr[js.Array[String]] = js.undefined
    
    var preventClickOnDrag: js.UndefOr[Boolean] = js.undefined
    
    var releaseOnScroll: js.UndefOr[Boolean] = js.undefined
    
    var scale: js.UndefOr[js.Array[Double]] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var thresholdAngle: js.UndefOr[Double] = js.undefined
    
    var touchAction: js.UndefOr[String] = js.undefined
  }
  object PanInputOption {
    
    inline def apply(): PanInputOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanInputOption]
    }
    
    extension [Self <: PanInputOption](x: Self) {
      
      inline def setIOSEdgeSwipeThreshold(value: Double): Self = StObject.set(x, "iOSEdgeSwipeThreshold", value.asInstanceOf[js.Any])
      
      inline def setIOSEdgeSwipeThresholdUndefined: Self = StObject.set(x, "iOSEdgeSwipeThreshold", js.undefined)
      
      inline def setInputButton(value: js.Array[String]): Self = StObject.set(x, "inputButton", value.asInstanceOf[js.Any])
      
      inline def setInputButtonUndefined: Self = StObject.set(x, "inputButton", js.undefined)
      
      inline def setInputButtonVarargs(value: String*): Self = StObject.set(x, "inputButton", js.Array(value*))
      
      inline def setInputType(value: js.Array[String]): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
      
      inline def setInputTypeVarargs(value: String*): Self = StObject.set(x, "inputType", js.Array(value*))
      
      inline def setPreventClickOnDrag(value: Boolean): Self = StObject.set(x, "preventClickOnDrag", value.asInstanceOf[js.Any])
      
      inline def setPreventClickOnDragUndefined: Self = StObject.set(x, "preventClickOnDrag", js.undefined)
      
      inline def setReleaseOnScroll(value: Boolean): Self = StObject.set(x, "releaseOnScroll", value.asInstanceOf[js.Any])
      
      inline def setReleaseOnScrollUndefined: Self = StObject.set(x, "releaseOnScroll", js.undefined)
      
      inline def setScale(value: js.Array[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdAngle(value: Double): Self = StObject.set(x, "thresholdAngle", value.asInstanceOf[js.Any])
      
      inline def setThresholdAngleUndefined: Self = StObject.set(x, "thresholdAngle", js.undefined)
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      inline def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
    }
  }
}
