package typings.egjsAxes

import typings.egjsAxes.constMod.DIRECTION
import typings.egjsAxes.inputTypeMod.IInputType
import typings.egjsAxes.inputTypeMod.IInputTypeObserver
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panInputMod {
  
  @JSImport("@egjs/axes/inputType/PanInput", "PanInput")
  @js.native
  class PanInput protected ()
    extends StObject
       with IInputType {
    def this(el: String) = this()
    def this(el: HTMLElement) = this()
    def this(el: String, options: PanInputOption) = this()
    def this(el: HTMLElement, options: PanInputOption) = this()
    
    var _direction: js.Any = js.native
    
    /* private */ def attachEvent(observer: js.Any): js.Any = js.native
    
    /* CompleteClass */
    var axes: js.Array[String] = js.native
    
    /* CompleteClass */
    override def connect(observer: IInputTypeObserver): IInputType = js.native
    
    /* CompleteClass */
    override def destroy(): js.Any = js.native
    
    /* private */ def dettachEvent(): js.Any = js.native
    
    @JSName("disable")
    def disable_MPanInput(): this.type = js.native
    
    /* CompleteClass */
    override def disconnect(): js.Any = js.native
    
    /* CompleteClass */
    var element: HTMLElement = js.native
    
    @JSName("enable")
    def enable_MPanInput(): this.type = js.native
    
    /* private */ def getOffset(properties: js.Any, useDirection: js.Any): js.Any = js.native
    
    @JSName("isEnable")
    def isEnable_MPanInput(): Boolean = js.native
    
    /* CompleteClass */
    override def mapAxes(axes: js.Array[String]): js.Any = js.native
    
    var observer: js.Any = js.native
    
    /* private */ def onHammerInput(event: js.Any): js.Any = js.native
    
    /* private */ def onPanend(event: js.Any): js.Any = js.native
    
    /* private */ def onPanmove(event: js.Any): js.Any = js.native
    
    var options: PanInputOption = js.native
  }
  /* static members */
  object PanInput {
    
    @JSImport("@egjs/axes/inputType/PanInput", "PanInput")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getDirectionByAngle(angle: Double, thresholdAngle: Double): DIRECTION = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionByAngle")(angle.asInstanceOf[js.Any], thresholdAngle.asInstanceOf[js.Any])).asInstanceOf[DIRECTION]
    
    @scala.inline
    def getNextOffset(speeds: js.Array[Double], deceleration: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextOffset")(speeds.asInstanceOf[js.Any], deceleration.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    @scala.inline
    def useDirection(checkType: DIRECTION, direction: DIRECTION): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useDirection")(checkType.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def useDirection(checkType: DIRECTION, direction: DIRECTION, userDirection: DIRECTION): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useDirection")(checkType.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], userDirection.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  trait PanInputOption extends StObject {
    
    var inputType: js.UndefOr[js.Array[String]] = js.undefined
    
    var scale: js.UndefOr[js.Array[Double]] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var thresholdAngle: js.UndefOr[Double] = js.undefined
  }
  object PanInputOption {
    
    @scala.inline
    def apply(): PanInputOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanInputOption]
    }
    
    @scala.inline
    implicit class PanInputOptionMutableBuilder[Self <: PanInputOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputType(value: js.Array[String]): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
      
      @scala.inline
      def setInputTypeVarargs(value: String*): Self = StObject.set(x, "inputType", js.Array(value :_*))
      
      @scala.inline
      def setScale(value: js.Array[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value :_*))
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdAngle(value: Double): Self = StObject.set(x, "thresholdAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdAngleUndefined: Self = StObject.set(x, "thresholdAngle", js.undefined)
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
