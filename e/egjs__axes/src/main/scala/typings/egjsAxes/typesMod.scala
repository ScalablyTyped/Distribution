package typings.egjsAxes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.cfcsCore.typesMod.Ref
import typings.egjsAxes.anon.DestPos
import typings.egjsAxes.anon.X
import typings.egjsAxes.axesMod.default
import typings.egjsAxes.axisManagerMod.Axis
import typings.egjsAxes.inputTypeMod.InputType
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.Record
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.egjsAxes.mouseEventInputMod.MouseEventInput
    - typings.egjsAxes.touchEventInputMod.TouchEventInput
    - typings.egjsAxes.touchMouseEventInputMod.TouchMouseEventInput
    - typings.egjsAxes.pointerEventInputMod.PointerEventInput
  */
  trait ActiveEvent extends StObject
  
  trait AnimationParam extends StObject {
    
    var delta: Axis
    
    var depaPos: Axis
    
    var destPos: Axis
    
    var done: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var duration: Double
    
    var input: js.UndefOr[InputType] = js.undefined
    
    var inputEvent: js.UndefOr[Any] = js.undefined
    
    var isTrusted: js.UndefOr[Boolean] = js.undefined
    
    var setTo: js.UndefOr[
        js.Function2[/* destPos */ js.UndefOr[Axis], /* duration */ js.UndefOr[Double], DestPos]
      ] = js.undefined
    
    var startTime: js.UndefOr[Double] = js.undefined
    
    var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object AnimationParam {
    
    inline def apply(delta: Axis, depaPos: Axis, destPos: Axis, duration: Double): AnimationParam = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], depaPos = depaPos.asInstanceOf[js.Any], destPos = destPos.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationParam]
    }
    
    extension [Self <: AnimationParam](x: Self) {
      
      inline def setDelta(value: Axis): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setDepaPos(value: Axis): Self = StObject.set(x, "depaPos", value.asInstanceOf[js.Any])
      
      inline def setDestPos(value: Axis): Self = StObject.set(x, "destPos", value.asInstanceOf[js.Any])
      
      inline def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setInput(value: InputType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputEvent(value: Any): Self = StObject.set(x, "inputEvent", value.asInstanceOf[js.Any])
      
      inline def setInputEventUndefined: Self = StObject.set(x, "inputEvent", js.undefined)
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
      
      inline def setSetTo(value: (/* destPos */ js.UndefOr[Axis], /* duration */ js.UndefOr[Double]) => DestPos): Self = StObject.set(x, "setTo", js.Any.fromFunction2(value))
      
      inline def setSetToUndefined: Self = StObject.set(x, "setTo", js.undefined)
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    }
  }
  
  trait AxesEvents extends StObject {
    
    var animationEnd: OnAnimationEnd
    
    var animationStart: OnAnimationStart
    
    var change: OnChange
    
    var finish: OnFinish
    
    var hold: OnHold
    
    var release: OnRelease
  }
  object AxesEvents {
    
    inline def apply(
      animationEnd: OnAnimationEnd,
      animationStart: OnAnimationStart,
      change: OnChange,
      finish: OnFinish,
      hold: OnHold,
      release: OnRelease
    ): AxesEvents = {
      val __obj = js.Dynamic.literal(animationEnd = animationEnd.asInstanceOf[js.Any], animationStart = animationStart.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], hold = hold.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxesEvents]
    }
    
    extension [Self <: AxesEvents](x: Self) {
      
      inline def setAnimationEnd(value: OnAnimationEnd): Self = StObject.set(x, "animationEnd", value.asInstanceOf[js.Any])
      
      inline def setAnimationStart(value: OnAnimationStart): Self = StObject.set(x, "animationStart", value.asInstanceOf[js.Any])
      
      inline def setChange(value: OnChange): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: OnFinish): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      inline def setHold(value: OnHold): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      inline def setRelease(value: OnRelease): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    }
  }
  
  type AxesMethods = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in 'connect' | 'disconnect' | 'get' | 'setTo' | 'setBy' | 'setOptions' | 'setAxis' | 'stopAnimation' | 'updateAnimation' | 'isBounceArea' ]: @egjs/axes.@egjs/axes/declaration/Axes.default[key]}
    */ typings.egjsAxes.egjsAxesStrings.AxesMethods & TopLevel[default]
  
  type AxesReactiveState = StringDictionary[Any]
  
  type ElementType = String | HTMLElement | Ref[HTMLElement]
  
  trait ExtendedEvent extends StObject {
    
    var angle: Double
    
    var center: X
    
    var deltaX: Double
    
    var deltaY: Double
    
    var offsetX: Double
    
    var offsetY: Double
    
    var preventSystemEvent: Boolean
    
    var scale: Double
    
    var srcEvent: InputEventType
    
    var velocityX: Double
    
    var velocityY: Double
  }
  object ExtendedEvent {
    
    inline def apply(
      angle: Double,
      center: X,
      deltaX: Double,
      deltaY: Double,
      offsetX: Double,
      offsetY: Double,
      preventSystemEvent: Boolean,
      scale: Double,
      srcEvent: InputEventType,
      velocityX: Double,
      velocityY: Double
    ): ExtendedEvent = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], preventSystemEvent = preventSystemEvent.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedEvent]
    }
    
    extension [Self <: ExtendedEvent](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setCenter(value: X): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setPreventSystemEvent(value: Boolean): Self = StObject.set(x, "preventSystemEvent", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSrcEvent(value: InputEventType): Self = StObject.set(x, "srcEvent", value.asInstanceOf[js.Any])
      
      inline def setVelocityX(value: Double): Self = StObject.set(x, "velocityX", value.asInstanceOf[js.Any])
      
      inline def setVelocityY(value: Double): Self = StObject.set(x, "velocityY", value.asInstanceOf[js.Any])
    }
  }
  
  type InputEventType = PointerEvent | MouseEvent | TouchEvent
  
  trait LatestInterval extends StObject {
    
    var deltaX: Double
    
    var deltaY: Double
    
    var timestamp: Double
  }
  object LatestInterval {
    
    inline def apply(deltaX: Double, deltaY: Double, timestamp: Double): LatestInterval = {
      val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[LatestInterval]
    }
    
    extension [Self <: LatestInterval](x: Self) {
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  type ObjectInterface[T] = Record[String | Double, T]
  
  trait OnAnimationEnd extends StObject {
    
    var isTrusted: Boolean
  }
  object OnAnimationEnd {
    
    inline def apply(isTrusted: Boolean): OnAnimationEnd = {
      val __obj = js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnAnimationEnd]
    }
    
    extension [Self <: OnAnimationEnd](x: Self) {
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnAnimationStart extends StObject {
    
    var delta: Axis = js.native
    
    var depaPos: Axis = js.native
    
    var destPos: Axis = js.native
    
    def done(): Unit = js.native
    
    var duration: Double = js.native
    
    var input: js.UndefOr[InputType | Null] = js.native
    
    var inputEvent: js.UndefOr[Any] = js.native
    
    var isTrusted: Boolean = js.native
    
    def setTo(): Unit = js.native
    def setTo(destPos: Unit, duration: Double): Unit = js.native
    def setTo(destPos: Axis): Unit = js.native
    def setTo(destPos: Axis, duration: Double): Unit = js.native
    
    var startTime: js.UndefOr[Double] = js.native
    
    def stop(): Unit = js.native
  }
  
  @js.native
  trait OnChange extends StObject {
    
    var bounceRatio: Axis = js.native
    
    var delta: Axis = js.native
    
    var holding: Boolean = js.native
    
    var input: InputType | Null = js.native
    
    var inputEvent: Any = js.native
    
    var isTrusted: Boolean = js.native
    
    var pos: Axis = js.native
    
    def set(): Unit = js.native
    def set(toPos: Unit, userDuration: Double): Unit = js.native
    def set(toPos: Axis): Unit = js.native
    def set(toPos: Axis, userDuration: Double): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  trait OnFinish extends StObject {
    
    var isTrusted: Boolean
  }
  object OnFinish {
    
    inline def apply(isTrusted: Boolean): OnFinish = {
      val __obj = js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnFinish]
    }
    
    extension [Self <: OnFinish](x: Self) {
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnHold extends StObject {
    
    var input: InputType | Null
    
    var inputEvent: Any
    
    var isTrusted: Boolean
    
    var pos: Record[String, Any]
  }
  object OnHold {
    
    inline def apply(inputEvent: Any, isTrusted: Boolean, pos: Record[String, Any]): OnHold = {
      val __obj = js.Dynamic.literal(inputEvent = inputEvent.asInstanceOf[js.Any], isTrusted = isTrusted.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], input = null)
      __obj.asInstanceOf[OnHold]
    }
    
    extension [Self <: OnHold](x: Self) {
      
      inline def setInput(value: InputType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputEvent(value: Any): Self = StObject.set(x, "inputEvent", value.asInstanceOf[js.Any])
      
      inline def setInputNull: Self = StObject.set(x, "input", null)
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Record[String, Any]): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnRelease extends StObject {
    
    var bounceRatio: Axis = js.native
    
    var delta: Axis = js.native
    
    var depaPos: Axis = js.native
    
    var destPos: Axis = js.native
    
    def done(): Unit = js.native
    
    var duration: Double = js.native
    
    var input: js.UndefOr[InputType | Null] = js.native
    
    var inputEvent: js.UndefOr[Any] = js.native
    
    var isTrusted: js.UndefOr[Boolean] = js.native
    
    def setTo(): Unit = js.native
    def setTo(destPos: Unit, duration: Double): Unit = js.native
    def setTo(destPos: Axis): Unit = js.native
    def setTo(destPos: Axis, duration: Double): Unit = js.native
    
    var startTime: js.UndefOr[Double] = js.native
  }
  
  trait UpdateAnimationOption extends StObject {
    
    var destPos: js.UndefOr[Axis] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var restart: js.UndefOr[Boolean] = js.undefined
  }
  object UpdateAnimationOption {
    
    inline def apply(): UpdateAnimationOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAnimationOption]
    }
    
    extension [Self <: UpdateAnimationOption](x: Self) {
      
      inline def setDestPos(value: Axis): Self = StObject.set(x, "destPos", value.asInstanceOf[js.Any])
      
      inline def setDestPosUndefined: Self = StObject.set(x, "destPos", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setRestart(value: Boolean): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
    }
  }
}
