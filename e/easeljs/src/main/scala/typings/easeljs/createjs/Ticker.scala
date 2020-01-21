package typings.easeljs.createjs

import typings.createjsLib.createjs.Event
import typings.easeljs.AnonEventObj
import typings.easeljs.AnonEventObjHandleEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Ticker")
@js.native
class Ticker () extends js.Object

/* static members */
@JSGlobal("createjs.Ticker")
@js.native
object Ticker extends js.Object {
  var RAF: String = js.native
  var RAF_SYNCHED: String = js.native
  var TIMEOUT: String = js.native
  // properties
  var framerate: Double = js.native
  var interval: Double = js.native
  var maxDelta: Double = js.native
  var paused: Boolean = js.native
  var timingMode: String = js.native
  /**
    * @deprecated
    */
  var useRAF: Boolean = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
  def addEventListener(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): js.Function = js.native
  def addEventListener(`type`: String, listener: AnonEventObj): js.Object = js.native
  def addEventListener(`type`: String, listener: AnonEventObjHandleEvent): js.Object = js.native
  def addEventListener(`type`: String, listener: AnonEventObjHandleEvent, useCapture: Boolean): js.Object = js.native
  def addEventListener(`type`: String, listener: AnonEventObj, useCapture: Boolean): js.Object = js.native
  // EventDispatcher mixins
  def addEventListener(`type`: String, listener: Stage): Stage = js.native
  def addEventListener(`type`: String, listener: Stage, useCapture: Boolean): Stage = js.native
  def dispatchEvent(eventObj: String): Boolean = js.native
  def dispatchEvent(eventObj: String, target: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: js.Object, target: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: Event): Boolean = js.native
  def dispatchEvent(eventObj: Event, target: js.Object): Boolean = js.native
  // methods
  def getEventTime(): Double = js.native
  def getEventTime(runTime: Boolean): Double = js.native
  /**
    * @deprecated - use the 'framerate' property instead
    */
  def getFPS(): Double = js.native
  /**
    * @deprecated - use the 'interval' property instead
    */
  def getInterval(): Double = js.native
  def getMeasuredFPS(): Double = js.native
  def getMeasuredFPS(ticks: Double): Double = js.native
  def getMeasuredTickTime(): Double = js.native
  def getMeasuredTickTime(ticks: Double): Double = js.native
  /**
    * @deprecated - use the 'paused' property instead
    */
  def getPaused(): Boolean = js.native
  def getTicks(): Double = js.native
  def getTicks(pauseable: Boolean): Double = js.native
  def getTime(): Double = js.native
  def getTime(runTime: Boolean): Double = js.native
  def hasEventListener(`type`: String): Boolean = js.native
  def init(): Unit = js.native
  def off(`type`: String, listener: js.Function): Unit = js.native
  def off(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = js.native
  def off(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): Unit = js.native
  def off(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  def off(`type`: String, listener: AnonEventObj): Unit = js.native
  def off(`type`: String, listener: AnonEventObjHandleEvent): Unit = js.native
  def off(`type`: String, listener: AnonEventObjHandleEvent, useCapture: Boolean): Unit = js.native
  def off(`type`: String, listener: AnonEventObj, useCapture: Boolean): Unit = js.native
   // It is necessary for "arguments.callee"
  def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
  def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.Any
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Function = js.native
  def on(`type`: String, listener: AnonEventObj): js.Object = js.native
  def on(`type`: String, listener: AnonEventObjHandleEvent): js.Object = js.native
  def on(`type`: String, listener: AnonEventObjHandleEvent, scope: js.Object): js.Object = js.native
  def on(`type`: String, listener: AnonEventObjHandleEvent, scope: js.Object, once: Boolean): js.Object = js.native
  def on(`type`: String, listener: AnonEventObjHandleEvent, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
  def on(
    `type`: String,
    listener: AnonEventObjHandleEvent,
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: AnonEventObj, scope: js.Object): js.Object = js.native
  def on(`type`: String, listener: AnonEventObj, scope: js.Object, once: Boolean): js.Object = js.native
  def on(`type`: String, listener: AnonEventObj, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
  def on(
    `type`: String,
    listener: AnonEventObj,
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def removeAllEventListeners(): Unit = js.native
  def removeAllEventListeners(`type`: String): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = js.native
  def removeEventListener(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: AnonEventObj): Unit = js.native
  def removeEventListener(`type`: String, listener: AnonEventObjHandleEvent): Unit = js.native
  def removeEventListener(`type`: String, listener: AnonEventObjHandleEvent, useCapture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: AnonEventObj, useCapture: Boolean): Unit = js.native
  def reset(): Unit = js.native
  /**
    * @deprecated - use the 'framerate' property instead
    */
  def setFPS(value: Double): Unit = js.native
  /**
    * @deprecated - use the 'interval' property instead
    */
  def setInterval(interval: Double): Unit = js.native
  /**
    * @deprecated - use the 'paused' property instead
    */
  def setPaused(value: Boolean): Unit = js.native
  def willTrigger(`type`: String): Boolean = js.native
}

