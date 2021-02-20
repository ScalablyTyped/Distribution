package typings.egjsAxes

import typings.egjsAxes.axesMod.AxesOption
import typings.egjsAxes.axisManagerMod.Axis
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypeMod {
  
  @JSImport("@egjs/axes/inputType/InputType", "SUPPORT_TOUCH")
  @js.native
  val SUPPORT_TOUCH: Boolean = js.native
  
  @JSImport("@egjs/axes/inputType/InputType", "UNIQUEKEY")
  @js.native
  val UNIQUEKEY: /* "_EGJS_AXES_INPUTTYPE_" */ String = js.native
  
  @JSImport("@egjs/axes/inputType/InputType", "convertInputType")
  @js.native
  def convertInputType(): js.Any = js.native
  @JSImport("@egjs/axes/inputType/InputType", "convertInputType")
  @js.native
  def convertInputType(inputType: js.Array[String]): js.Any = js.native
  
  @JSImport("@egjs/axes/inputType/InputType", "createHammer")
  @js.native
  def createHammer(element: HTMLElement, recognizers: js.Any): js.Any = js.native
  @JSImport("@egjs/axes/inputType/InputType", "createHammer")
  @js.native
  def createHammer(element: HTMLElement, recognizers: js.Any, inputClass: js.Any): js.Any = js.native
  
  @JSImport("@egjs/axes/inputType/InputType", "toAxis")
  @js.native
  def toAxis(source: js.Array[String], offset: js.Array[Double]): Axis = js.native
  
  @js.native
  trait IInputType extends StObject {
    
    var axes: js.Array[String] = js.native
    
    def connect(observer: IInputTypeObserver): IInputType = js.native
    
    def destroy(): js.Any = js.native
    
    var disable: js.UndefOr[js.Function0[_]] = js.native
    
    def disconnect(): js.Any = js.native
    
    var element: HTMLElement = js.native
    
    var enable: js.UndefOr[js.Function0[_]] = js.native
    
    var hammer: js.UndefOr[js.Any] = js.native
    
    var isEnable: js.UndefOr[js.Function0[Boolean]] = js.native
    
    def mapAxes(axes: js.Array[String]): js.Any = js.native
  }
  object IInputType {
    
    @scala.inline
    def apply(
      axes: js.Array[String],
      connect: IInputTypeObserver => IInputType,
      destroy: () => js.Any,
      disconnect: () => js.Any,
      element: HTMLElement,
      mapAxes: js.Array[String] => js.Any
    ): IInputType = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], connect = js.Any.fromFunction1(connect), destroy = js.Any.fromFunction0(destroy), disconnect = js.Any.fromFunction0(disconnect), element = element.asInstanceOf[js.Any], mapAxes = js.Any.fromFunction1(mapAxes))
      __obj.asInstanceOf[IInputType]
    }
    
    @scala.inline
    implicit class IInputTypeMutableBuilder[Self <: IInputType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: js.Array[String]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxesVarargs(value: String*): Self = StObject.set(x, "axes", js.Array(value :_*))
      
      @scala.inline
      def setConnect(value: IInputTypeObserver => IInputType): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroy(value: () => js.Any): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisable(value: () => _): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setDisconnect(value: () => js.Any): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnable(value: () => _): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setHammer(value: js.Any): Self = StObject.set(x, "hammer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHammerUndefined: Self = StObject.set(x, "hammer", js.undefined)
      
      @scala.inline
      def setIsEnable(value: () => Boolean): Self = StObject.set(x, "isEnable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEnableUndefined: Self = StObject.set(x, "isEnable", js.undefined)
      
      @scala.inline
      def setMapAxes(value: js.Array[String] => js.Any): Self = StObject.set(x, "mapAxes", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IInputTypeObserver extends StObject {
    
    def change(inputType: IInputType, event: js.Any, offset: Axis): js.Any = js.native
    
    def hold(inputType: IInputType, event: js.Any): js.Any = js.native
    
    var options: AxesOption = js.native
    
    def release(inputType: IInputType, event: js.Any, offset: Axis): js.Any = js.native
    def release(inputType: IInputType, event: js.Any, offset: Axis, duration: Double): js.Any = js.native
  }
}
