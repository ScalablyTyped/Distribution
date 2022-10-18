package typings.egjsAxes

import typings.cfcsCore.declarationReactiveReactiveAdapterMod.ReactiveAdapter
import typings.egjsAxes.declarationAxesMod.AxesOption
import typings.egjsAxes.declarationAxisManagerMod.Axis
import typings.egjsAxes.declarationAxisManagerMod.AxisOption
import typings.egjsAxes.declarationInputTypeMoveKeyInputMod.MoveKeyInputOption
import typings.egjsAxes.declarationInputTypePanInputMod.PanInputOption
import typings.egjsAxes.declarationInputTypePinchInputMod.PinchInputOption
import typings.egjsAxes.declarationInputTypeWheelInputMod.WheelInputOption
import typings.egjsAxes.declarationReactiveMod.AxesData
import typings.egjsAxes.declarationTypesMod.AxesEvents
import typings.egjsAxes.declarationTypesMod.AxesReactiveState
import typings.egjsAxes.declarationTypesMod.ElementType
import typings.egjsAxes.declarationTypesMod.ObjectInterface
import typings.egjsAxes.egjsAxesStrings.animationEnd
import typings.egjsAxes.egjsAxesStrings.animationStart
import typings.egjsAxes.egjsAxesStrings.change
import typings.egjsAxes.egjsAxesStrings.connect
import typings.egjsAxes.egjsAxesStrings.disconnect
import typings.egjsAxes.egjsAxesStrings.finish
import typings.egjsAxes.egjsAxesStrings.get
import typings.egjsAxes.egjsAxesStrings.hold
import typings.egjsAxes.egjsAxesStrings.isBounceArea
import typings.egjsAxes.egjsAxesStrings.release
import typings.egjsAxes.egjsAxesStrings.setAxis
import typings.egjsAxes.egjsAxesStrings.setBy
import typings.egjsAxes.egjsAxesStrings.setOptions
import typings.egjsAxes.egjsAxesStrings.setTo
import typings.egjsAxes.egjsAxesStrings.stopAnimation
import typings.egjsAxes.egjsAxesStrings.updateAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@egjs/axes", JSImport.Default)
  @js.native
  open class default ()
    extends typings.egjsAxes.declarationAxesMod.default {
    def this(axis: ObjectInterface[AxisOption]) = this()
    def this(axis: Unit, options: AxesOption) = this()
    def this(axis: ObjectInterface[AxisOption], options: AxesOption) = this()
    def this(axis: Unit, options: Unit, startPos: Axis) = this()
    def this(axis: Unit, options: AxesOption, startPos: Axis) = this()
    def this(axis: ObjectInterface[AxisOption], options: Unit, startPos: Axis) = this()
    def this(axis: ObjectInterface[AxisOption], options: AxesOption, startPos: Axis) = this()
  }
  object default {
    
    @JSImport("@egjs/axes", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@egjs/axes", "default.DIRECTION_ALL")
    @js.native
    def DIRECTION_ALL: Double = js.native
    inline def DIRECTION_ALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_ALL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.DIRECTION_DOWN")
    @js.native
    def DIRECTION_DOWN: Double = js.native
    inline def DIRECTION_DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_DOWN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.DIRECTION_HORIZONTAL")
    @js.native
    def DIRECTION_HORIZONTAL: Double = js.native
    inline def DIRECTION_HORIZONTAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_HORIZONTAL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.DIRECTION_LEFT")
    @js.native
    def DIRECTION_LEFT: Double = js.native
    inline def DIRECTION_LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_LEFT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.DIRECTION_NONE")
    @js.native
    def DIRECTION_NONE: Double = js.native
    inline def DIRECTION_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_NONE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.DIRECTION_RIGHT")
    @js.native
    def DIRECTION_RIGHT: Double = js.native
    inline def DIRECTION_RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_RIGHT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.DIRECTION_UP")
    @js.native
    def DIRECTION_UP: Double = js.native
    inline def DIRECTION_UP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_UP")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.DIRECTION_VERTICAL")
    @js.native
    def DIRECTION_VERTICAL: Double = js.native
    inline def DIRECTION_VERTICAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_VERTICAL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.MoveKeyInput")
    @js.native
    def MoveKeyInput: Any = js.native
    inline def MoveKeyInput_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MoveKeyInput")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.PanInput")
    @js.native
    def PanInput: Any = js.native
    inline def PanInput_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PanInput")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.PinchInput")
    @js.native
    def PinchInput: Any = js.native
    inline def PinchInput_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PinchInput")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.RotatePanInput")
    @js.native
    def RotatePanInput: Any = js.native
    inline def RotatePanInput_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotatePanInput")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.TRANSFORM")
    @js.native
    def TRANSFORM: String = js.native
    inline def TRANSFORM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSFORM")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes", "default.WheelInput")
    @js.native
    def WheelInput: Any = js.native
    inline def WheelInput_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelInput")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@egjs/axes", "AXES_EVENTS")
  @js.native
  val AXES_EVENTS: js.Tuple6[hold, release, change, animationStart, animationEnd, finish] = js.native
  
  @JSImport("@egjs/axes", "AXES_METHODS")
  @js.native
  val AXES_METHODS: js.Tuple10[
    connect, 
    disconnect, 
    get, 
    setTo, 
    setBy, 
    setOptions, 
    setAxis, 
    stopAnimation, 
    updateAnimation, 
    isBounceArea
  ] = js.native
  
  @JSImport("@egjs/axes", "MoveKeyInput")
  @js.native
  open class MoveKeyInput protected ()
    extends typings.egjsAxes.declarationInputTypeMoveKeyInputMod.MoveKeyInput {
    def this(el: ElementType) = this()
    def this(el: ElementType, options: MoveKeyInputOption) = this()
  }
  
  @JSImport("@egjs/axes", "PanInput")
  @js.native
  open class PanInput protected ()
    extends typings.egjsAxes.declarationInputTypePanInputMod.PanInput {
    def this(el: ElementType) = this()
    def this(el: ElementType, options: PanInputOption) = this()
  }
  
  @JSImport("@egjs/axes", "PinchInput")
  @js.native
  open class PinchInput protected ()
    extends typings.egjsAxes.declarationInputTypePinchInputMod.PinchInput {
    def this(el: ElementType) = this()
    def this(el: ElementType, options: PinchInputOption) = this()
  }
  
  @JSImport("@egjs/axes", "REACTIVE_AXES")
  @js.native
  val REACTIVE_AXES: ReactiveAdapter[
    typings.egjsAxes.declarationAxesMod.default, 
    AxesReactiveState, 
    /* keyof @egjs/axes.@egjs/axes/declaration/types.AxesMethods */ String, 
    AxesData, 
    AxesEvents
  ] = js.native
  
  @JSImport("@egjs/axes", "RotatePanInput")
  @js.native
  open class RotatePanInput protected ()
    extends typings.egjsAxes.declarationInputTypeRotatePanInputMod.RotatePanInput {
    def this(el: ElementType) = this()
    def this(el: ElementType, options: PanInputOption) = this()
  }
  
  @JSImport("@egjs/axes", "WheelInput")
  @js.native
  open class WheelInput protected ()
    extends typings.egjsAxes.declarationInputTypeWheelInputMod.WheelInput {
    def this(el: ElementType) = this()
    def this(el: ElementType, options: WheelInputOption) = this()
  }
}
