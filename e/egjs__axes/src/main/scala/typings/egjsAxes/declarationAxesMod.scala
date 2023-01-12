package typings.egjsAxes

import typings.cfcsCore.declarationReactiveReactiveSubscribeMod.ReactiveSubscribe
import typings.egjsAxes.declarationAnimationAnimationManagerMod.AnimationManager
import typings.egjsAxes.declarationAxisManagerMod.Axis
import typings.egjsAxes.declarationAxisManagerMod.AxisManager
import typings.egjsAxes.declarationAxisManagerMod.AxisOption
import typings.egjsAxes.declarationEventManagerMod.EventManager
import typings.egjsAxes.declarationInputObserverMod.InputObserver
import typings.egjsAxes.declarationInputTypeInputTypeMod.InputType
import typings.egjsAxes.declarationInterruptManagerMod.InterruptManager
import typings.egjsAxes.declarationTypesMod.AxesEvents
import typings.egjsAxes.declarationTypesMod.AxesReactiveState
import typings.egjsAxes.declarationTypesMod.ObjectInterface
import typings.egjsAxes.declarationTypesMod.UpdateAnimationOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationAxesMod {
  
  @JSImport("@egjs/axes/declaration/Axes", JSImport.Default)
  @js.native
  open class default () extends Axes {
    def this(axis: ObjectInterface[AxisOption]) = this()
    def this(axis: Unit, options: AxesOption) = this()
    def this(axis: ObjectInterface[AxisOption], options: AxesOption) = this()
    def this(axis: Unit, options: Unit, startPos: Axis) = this()
    def this(axis: Unit, options: AxesOption, startPos: Axis) = this()
    def this(axis: ObjectInterface[AxisOption], options: Unit, startPos: Axis) = this()
    def this(axis: ObjectInterface[AxisOption], options: AxesOption, startPos: Axis) = this()
  }
  object default {
    
    @JSImport("@egjs/axes/declaration/Axes", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.DIRECTION_ALL")
    @js.native
    def DIRECTION_ALL: Double = js.native
    inline def DIRECTION_ALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_ALL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.DIRECTION_DOWN")
    @js.native
    def DIRECTION_DOWN: Double = js.native
    inline def DIRECTION_DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_DOWN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.DIRECTION_HORIZONTAL")
    @js.native
    def DIRECTION_HORIZONTAL: Double = js.native
    inline def DIRECTION_HORIZONTAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_HORIZONTAL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.DIRECTION_LEFT")
    @js.native
    def DIRECTION_LEFT: Double = js.native
    inline def DIRECTION_LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_LEFT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.DIRECTION_NONE")
    @js.native
    def DIRECTION_NONE: Double = js.native
    inline def DIRECTION_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_NONE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.DIRECTION_RIGHT")
    @js.native
    def DIRECTION_RIGHT: Double = js.native
    inline def DIRECTION_RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_RIGHT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.DIRECTION_UP")
    @js.native
    def DIRECTION_UP: Double = js.native
    inline def DIRECTION_UP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_UP")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.DIRECTION_VERTICAL")
    @js.native
    def DIRECTION_VERTICAL: Double = js.native
    inline def DIRECTION_VERTICAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_VERTICAL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.MoveKeyInput")
    @js.native
    def MoveKeyInput: Any = js.native
    inline def MoveKeyInput_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MoveKeyInput")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.PanInput")
    @js.native
    def PanInput: Any = js.native
    inline def PanInput_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PanInput")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.PinchInput")
    @js.native
    def PinchInput: Any = js.native
    inline def PinchInput_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PinchInput")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.RotatePanInput")
    @js.native
    def RotatePanInput: Any = js.native
    inline def RotatePanInput_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotatePanInput")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.TRANSFORM")
    @js.native
    def TRANSFORM: String = js.native
    inline def TRANSFORM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSFORM")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@egjs/axes/declaration/Axes", "default.WheelInput")
    @js.native
    def WheelInput: Any = js.native
    inline def WheelInput_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelInput")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - typings.egjsAxes.declarationTypesMod.AxesReactiveState because Inheritance from two classes. Inlined  */ @js.native
  trait Axes
    extends typings.egjsComponent.mod.default[AxesEvents]
       with ReactiveSubscribe[AxesReactiveState] {
    
    /* private */ var _inputs: Any = js.native
    
    var animationManager: AnimationManager = js.native
    
    var axis: ObjectInterface[AxisOption] = js.native
    
    var axisManager: AxisManager = js.native
    
    def connect(axes: String, inputType: InputType): this.type = js.native
    def connect(axes: js.Array[String], inputType: InputType): this.type = js.native
    
    def destroy(): Unit = js.native
    
    def disconnect(): this.type = js.native
    def disconnect(inputType: InputType): this.type = js.native
    
    var eventManager: EventManager = js.native
    
    def get(): Axis = js.native
    def get(axes: js.Array[String]): Axis = js.native
    
    var inputObserver: InputObserver = js.native
    
    var interruptManager: InterruptManager = js.native
    
    def isBounceArea(): Boolean = js.native
    def isBounceArea(axes: js.Array[String]): Boolean = js.native
    
    var options: AxesOption = js.native
    
    def setAxis(axis: ObjectInterface[AxisOption]): this.type = js.native
    
    def setBy(pos: Axis): this.type = js.native
    def setBy(pos: Axis, duration: Double): this.type = js.native
    
    def setOptions(options: AxesOption): this.type = js.native
    
    def setTo(pos: Axis): this.type = js.native
    def setTo(pos: Axis, duration: Double): this.type = js.native
    
    def stopAnimation(): this.type = js.native
    
    def updateAnimation(options: UpdateAnimationOption): this.type = js.native
  }
  
  trait AxesOption extends StObject {
    
    var deceleration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var interruptable: js.UndefOr[Boolean] = js.undefined
    
    var maximumDuration: js.UndefOr[Double] = js.undefined
    
    var minimumDuration: js.UndefOr[Double] = js.undefined
    
    var nested: js.UndefOr[Boolean] = js.undefined
    
    var round: js.UndefOr[Double] = js.undefined
  }
  object AxesOption {
    
    inline def apply(): AxesOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxesOption] (val x: Self) extends AnyVal {
      
      inline def setDeceleration(value: Double): Self = StObject.set(x, "deceleration", value.asInstanceOf[js.Any])
      
      inline def setDecelerationUndefined: Self = StObject.set(x, "deceleration", js.undefined)
      
      inline def setEasing(value: /* x */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setInterruptable(value: Boolean): Self = StObject.set(x, "interruptable", value.asInstanceOf[js.Any])
      
      inline def setInterruptableUndefined: Self = StObject.set(x, "interruptable", js.undefined)
      
      inline def setMaximumDuration(value: Double): Self = StObject.set(x, "maximumDuration", value.asInstanceOf[js.Any])
      
      inline def setMaximumDurationUndefined: Self = StObject.set(x, "maximumDuration", js.undefined)
      
      inline def setMinimumDuration(value: Double): Self = StObject.set(x, "minimumDuration", value.asInstanceOf[js.Any])
      
      inline def setMinimumDurationUndefined: Self = StObject.set(x, "minimumDuration", js.undefined)
      
      inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
      
      inline def setRound(value: Double): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    }
  }
}
