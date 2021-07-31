package typings.easeljs.global.createjs

import typings.createjsLib.createjs.Event
import typings.easeljs.anon.HandleEvent
import typings.easeljs.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.Ticker")
@js.native
class Ticker ()
  extends StObject
     with typings.easeljs.createjs.Ticker
/* static members */
object Ticker {
  
  @JSGlobal("createjs.Ticker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("createjs.Ticker.RAF")
  @js.native
  def RAF: String = js.native
  @scala.inline
  def RAF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RAF")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.Ticker.RAF_SYNCHED")
  @js.native
  def RAF_SYNCHED: String = js.native
  @scala.inline
  def RAF_SYNCHED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RAF_SYNCHED")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.Ticker.TIMEOUT")
  @js.native
  def TIMEOUT: String = js.native
  @scala.inline
  def TIMEOUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def addEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def addEventListener(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def addEventListener(`type`: String, listener: HandleEvent): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def addEventListener(`type`: String, listener: HandleEvent, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def addEventListener(`type`: String, listener: `0`): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def addEventListener(`type`: String, listener: `0`, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  // EventDispatcher mixins
  @scala.inline
  def addEventListener(`type`: String, listener: typings.easeljs.createjs.Stage): typings.easeljs.createjs.Stage = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.easeljs.createjs.Stage]
  @scala.inline
  def addEventListener(`type`: String, listener: typings.easeljs.createjs.Stage, useCapture: Boolean): typings.easeljs.createjs.Stage = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.easeljs.createjs.Stage]
  
  @scala.inline
  def dispatchEvent(eventObj: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(eventObj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def dispatchEvent(eventObj: String, target: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(eventObj.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def dispatchEvent(eventObj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(eventObj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def dispatchEvent(eventObj: js.Object, target: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(eventObj.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def dispatchEvent(eventObj: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(eventObj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def dispatchEvent(eventObj: Event, target: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(eventObj.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  // properties
  @JSGlobal("createjs.Ticker.framerate")
  @js.native
  def framerate: Double = js.native
  @scala.inline
  def framerate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("framerate")(x.asInstanceOf[js.Any])
  
  // methods
  @scala.inline
  def getEventTime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventTime")().asInstanceOf[Double]
  @scala.inline
  def getEventTime(runTime: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventTime")(runTime.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @deprecated - use the 'framerate' property instead
    */
  @scala.inline
  def getFPS(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFPS")().asInstanceOf[Double]
  
  /**
    * @deprecated - use the 'interval' property instead
    */
  @scala.inline
  def getInterval(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterval")().asInstanceOf[Double]
  
  @scala.inline
  def getMeasuredFPS(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeasuredFPS")().asInstanceOf[Double]
  @scala.inline
  def getMeasuredFPS(ticks: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeasuredFPS")(ticks.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getMeasuredTickTime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeasuredTickTime")().asInstanceOf[Double]
  @scala.inline
  def getMeasuredTickTime(ticks: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeasuredTickTime")(ticks.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @deprecated - use the 'paused' property instead
    */
  @scala.inline
  def getPaused(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaused")().asInstanceOf[Boolean]
  
  @scala.inline
  def getTicks(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTicks")().asInstanceOf[Double]
  @scala.inline
  def getTicks(pauseable: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTicks")(pauseable.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getTime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTime")().asInstanceOf[Double]
  @scala.inline
  def getTime(runTime: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTime")(runTime.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def hasEventListener(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEventListener")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  
  @JSGlobal("createjs.Ticker.interval")
  @js.native
  def interval: Double = js.native
  @scala.inline
  def interval_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interval")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.Ticker.maxDelta")
  @js.native
  def maxDelta: Double = js.native
  @scala.inline
  def maxDelta_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDelta")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def off(`type`: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(`type`: String, listener: js.Function, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(`type`: String, listener: HandleEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(`type`: String, listener: HandleEvent, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(`type`: String, listener: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def off(`type`: String, listener: `0`, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // It is necessary for "arguments.callee"
  @scala.inline
  def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.Any
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: Unit,
    useCapture: Boolean
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Unit,
    data: js.Any
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Unit,
    data: js.Any,
    useCapture: Boolean
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Unit,
    data: Unit,
    useCapture: Boolean
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: Unit,
    once: Boolean
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: Unit,
    once: Boolean,
    data: js.Any
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: Unit,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: Unit,
    once: Boolean,
    data: Unit,
    useCapture: Boolean
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: Unit,
    once: Unit,
    data: js.Any
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: Unit,
    once: Unit,
    data: js.Any,
    useCapture: Boolean
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: Unit,
    once: Unit,
    data: Unit,
    useCapture: Boolean
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def on(`type`: String, listener: HandleEvent): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: HandleEvent, scope: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean, data: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: Boolean,
    data: Unit,
    useCapture: Boolean
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Unit, data: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: Unit,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: Unit,
    data: Unit,
    useCapture: Boolean
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: HandleEvent, scope: Unit, once: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: HandleEvent, scope: Unit, once: Boolean, data: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: Unit,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: HandleEvent, scope: Unit, once: Boolean, data: Unit, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: HandleEvent, scope: Unit, once: Unit, data: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: HandleEvent, scope: Unit, once: Unit, data: js.Any, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: HandleEvent, scope: Unit, once: Unit, data: Unit, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: js.Any, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: Unit, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: js.Object, once: Unit, data: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: js.Object, once: Unit, data: js.Any, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: js.Object, once: Unit, data: Unit, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: Unit, once: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: Unit, once: Boolean, data: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: Unit, once: Boolean, data: js.Any, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: Unit, once: Boolean, data: Unit, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: Unit, once: Unit, data: js.Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: Unit, once: Unit, data: js.Any, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def on(`type`: String, listener: `0`, scope: Unit, once: Unit, data: Unit, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @JSGlobal("createjs.Ticker.paused")
  @js.native
  def paused: Boolean = js.native
  @scala.inline
  def paused_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paused")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def removeAllEventListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllEventListeners")().asInstanceOf[Unit]
  @scala.inline
  def removeAllEventListeners(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllEventListeners")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def removeEventListener(`type`: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeEventListener(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeEventListener(`type`: String, listener: HandleEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeEventListener(`type`: String, listener: HandleEvent, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeEventListener(`type`: String, listener: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeEventListener(`type`: String, listener: `0`, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  /**
    * @deprecated - use the 'framerate' property instead
    */
  @scala.inline
  def setFPS(value: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFPS")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @deprecated - use the 'interval' property instead
    */
  @scala.inline
  def setInterval(interval: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @deprecated - use the 'paused' property instead
    */
  @scala.inline
  def setPaused(value: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPaused")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("createjs.Ticker.timingMode")
  @js.native
  def timingMode: String = js.native
  @scala.inline
  def timingMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timingMode")(x.asInstanceOf[js.Any])
  
  /**
    * @deprecated
    */
  @JSGlobal("createjs.Ticker.useRAF")
  @js.native
  def useRAF: Boolean = js.native
  @scala.inline
  def useRAF_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useRAF")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def willTrigger(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("willTrigger")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
