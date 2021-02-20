package typings.easeljs.global.createjs

import typings.createjsLib.createjs.Event
import typings.easeljs.anon.HandleEvent
import typings.easeljs.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.Ticker")
@js.native
class Ticker ()
  extends typings.easeljs.createjs.Ticker
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
  
  @JSGlobal("createjs.Ticker.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
  @JSGlobal("createjs.Ticker.addEventListener")
  @js.native
  def addEventListener(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: HandleEvent): js.Object = js.native
  @JSGlobal("createjs.Ticker.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: HandleEvent, useCapture: Boolean): js.Object = js.native
  @JSGlobal("createjs.Ticker.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: `0`): js.Object = js.native
  @JSGlobal("createjs.Ticker.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: `0`, useCapture: Boolean): js.Object = js.native
  // EventDispatcher mixins
  @JSGlobal("createjs.Ticker.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: typings.easeljs.createjs.Stage): typings.easeljs.createjs.Stage = js.native
  @JSGlobal("createjs.Ticker.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: typings.easeljs.createjs.Stage, useCapture: Boolean): typings.easeljs.createjs.Stage = js.native
  
  @JSGlobal("createjs.Ticker.dispatchEvent")
  @js.native
  def dispatchEvent(eventObj: String): Boolean = js.native
  @JSGlobal("createjs.Ticker.dispatchEvent")
  @js.native
  def dispatchEvent(eventObj: String, target: js.Object): Boolean = js.native
  @JSGlobal("createjs.Ticker.dispatchEvent")
  @js.native
  def dispatchEvent(eventObj: js.Object): Boolean = js.native
  @JSGlobal("createjs.Ticker.dispatchEvent")
  @js.native
  def dispatchEvent(eventObj: js.Object, target: js.Object): Boolean = js.native
  @JSGlobal("createjs.Ticker.dispatchEvent")
  @js.native
  def dispatchEvent(eventObj: Event): Boolean = js.native
  @JSGlobal("createjs.Ticker.dispatchEvent")
  @js.native
  def dispatchEvent(eventObj: Event, target: js.Object): Boolean = js.native
  
  // properties
  @JSGlobal("createjs.Ticker.framerate")
  @js.native
  def framerate: Double = js.native
  @scala.inline
  def framerate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("framerate")(x.asInstanceOf[js.Any])
  
  // methods
  @JSGlobal("createjs.Ticker.getEventTime")
  @js.native
  def getEventTime(): Double = js.native
  @JSGlobal("createjs.Ticker.getEventTime")
  @js.native
  def getEventTime(runTime: Boolean): Double = js.native
  
  /**
    * @deprecated - use the 'framerate' property instead
    */
  @JSGlobal("createjs.Ticker.getFPS")
  @js.native
  def getFPS(): Double = js.native
  
  /**
    * @deprecated - use the 'interval' property instead
    */
  @JSGlobal("createjs.Ticker.getInterval")
  @js.native
  def getInterval(): Double = js.native
  
  @JSGlobal("createjs.Ticker.getMeasuredFPS")
  @js.native
  def getMeasuredFPS(): Double = js.native
  @JSGlobal("createjs.Ticker.getMeasuredFPS")
  @js.native
  def getMeasuredFPS(ticks: Double): Double = js.native
  
  @JSGlobal("createjs.Ticker.getMeasuredTickTime")
  @js.native
  def getMeasuredTickTime(): Double = js.native
  @JSGlobal("createjs.Ticker.getMeasuredTickTime")
  @js.native
  def getMeasuredTickTime(ticks: Double): Double = js.native
  
  /**
    * @deprecated - use the 'paused' property instead
    */
  @JSGlobal("createjs.Ticker.getPaused")
  @js.native
  def getPaused(): Boolean = js.native
  
  @JSGlobal("createjs.Ticker.getTicks")
  @js.native
  def getTicks(): Double = js.native
  @JSGlobal("createjs.Ticker.getTicks")
  @js.native
  def getTicks(pauseable: Boolean): Double = js.native
  
  @JSGlobal("createjs.Ticker.getTime")
  @js.native
  def getTime(): Double = js.native
  @JSGlobal("createjs.Ticker.getTime")
  @js.native
  def getTime(runTime: Boolean): Double = js.native
  
  @JSGlobal("createjs.Ticker.hasEventListener")
  @js.native
  def hasEventListener(`type`: String): Boolean = js.native
  
  @JSGlobal("createjs.Ticker.init")
  @js.native
  def init(): Unit = js.native
  
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
  
  @JSGlobal("createjs.Ticker.off")
  @js.native
  def off(`type`: String, listener: js.Function): Unit = js.native
  @JSGlobal("createjs.Ticker.off")
  @js.native
  def off(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = js.native
  @JSGlobal("createjs.Ticker.off")
  @js.native
  def off(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSGlobal("createjs.Ticker.off")
  @js.native
  def off(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  @JSGlobal("createjs.Ticker.off")
  @js.native
  def off(`type`: String, listener: HandleEvent): Unit = js.native
  @JSGlobal("createjs.Ticker.off")
  @js.native
  def off(`type`: String, listener: HandleEvent, useCapture: Boolean): Unit = js.native
  @JSGlobal("createjs.Ticker.off")
  @js.native
  def off(`type`: String, listener: `0`): Unit = js.native
  @JSGlobal("createjs.Ticker.off")
  @js.native
  def off(`type`: String, listener: `0`, useCapture: Boolean): Unit = js.native
  
  // It is necessary for "arguments.callee"
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.Any
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.Any,
    useCapture: Boolean
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: Boolean
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.Any
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.Any
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.Any,
    useCapture: Boolean
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.Any
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Function = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: HandleEvent): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.Any
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: HandleEvent, scope: js.UndefOr[scala.Nothing], once: Boolean): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.Any
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: HandleEvent, scope: js.Object): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.Any
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: Boolean,
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: `0`): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.Any
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: `0`, scope: js.UndefOr[scala.Nothing], once: Boolean): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: `0`, scope: js.UndefOr[scala.Nothing], once: Boolean, data: js.Any): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: `0`, scope: js.Object): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: `0`, scope: js.Object, once: js.UndefOr[scala.Nothing], data: js.Any): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.Object,
    once: Boolean,
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
  @JSGlobal("createjs.Ticker.on")
  @js.native
  def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: js.Any, useCapture: Boolean): js.Object = js.native
  
  @JSGlobal("createjs.Ticker.paused")
  @js.native
  def paused: Boolean = js.native
  @scala.inline
  def paused_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paused")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.Ticker.removeAllEventListeners")
  @js.native
  def removeAllEventListeners(): Unit = js.native
  @JSGlobal("createjs.Ticker.removeAllEventListeners")
  @js.native
  def removeAllEventListeners(`type`: String): Unit = js.native
  
  @JSGlobal("createjs.Ticker.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  @JSGlobal("createjs.Ticker.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = js.native
  @JSGlobal("createjs.Ticker.removeEventListener")
  @js.native
  def removeEventListener(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSGlobal("createjs.Ticker.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  @JSGlobal("createjs.Ticker.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: HandleEvent): Unit = js.native
  @JSGlobal("createjs.Ticker.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: HandleEvent, useCapture: Boolean): Unit = js.native
  @JSGlobal("createjs.Ticker.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: `0`): Unit = js.native
  @JSGlobal("createjs.Ticker.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: `0`, useCapture: Boolean): Unit = js.native
  
  @JSGlobal("createjs.Ticker.reset")
  @js.native
  def reset(): Unit = js.native
  
  /**
    * @deprecated - use the 'framerate' property instead
    */
  @JSGlobal("createjs.Ticker.setFPS")
  @js.native
  def setFPS(value: Double): Unit = js.native
  
  /**
    * @deprecated - use the 'interval' property instead
    */
  @JSGlobal("createjs.Ticker.setInterval")
  @js.native
  def setInterval(interval: Double): Unit = js.native
  
  /**
    * @deprecated - use the 'paused' property instead
    */
  @JSGlobal("createjs.Ticker.setPaused")
  @js.native
  def setPaused(value: Boolean): Unit = js.native
  
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
  
  @JSGlobal("createjs.Ticker.willTrigger")
  @js.native
  def willTrigger(`type`: String): Boolean = js.native
}
