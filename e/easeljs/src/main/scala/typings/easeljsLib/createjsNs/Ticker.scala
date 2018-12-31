package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Ticker")
@js.native
class Ticker () extends js.Object

@JSGlobal("createjs.Ticker")
@js.native
object Ticker extends js.Object {
  var RAF: java.lang.String = js.native
  var RAF_SYNCHED: java.lang.String = js.native
  var TIMEOUT: java.lang.String = js.native
  // properties
  var framerate: scala.Double = js.native
  var interval: scala.Double = js.native
  var maxDelta: scala.Double = js.native
  var paused: scala.Boolean = js.native
  var timingMode: java.lang.String = js.native
  /**
    * @deprecated
    */
  var useRAF: scala.Boolean = js.native
  def addEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEvent): js.Object = js.native
  def addEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEventEventObj): js.Object = js.native
  def addEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEventEventObj, useCapture: scala.Boolean): js.Object = js.native
  def addEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEvent, useCapture: scala.Boolean): js.Object = js.native
  // EventDispatcher mixins
  def addEventListener(`type`: java.lang.String, listener: easeljsLib.createjsNs.Stage): easeljsLib.createjsNs.Stage = js.native
  def addEventListener(`type`: java.lang.String, listener: easeljsLib.createjsNs.Stage, useCapture: scala.Boolean): easeljsLib.createjsNs.Stage = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit]
  ): js.Function = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    useCapture: scala.Boolean
  ): js.Function = js.native
  def dispatchEvent(eventObj: createjsDashLibLib.createjsNs.Event): scala.Boolean = js.native
  def dispatchEvent(eventObj: createjsDashLibLib.createjsNs.Event, target: js.Object): scala.Boolean = js.native
  def dispatchEvent(eventObj: java.lang.String): scala.Boolean = js.native
  def dispatchEvent(eventObj: java.lang.String, target: js.Object): scala.Boolean = js.native
  def dispatchEvent(eventObj: js.Object): scala.Boolean = js.native
  def dispatchEvent(eventObj: js.Object, target: js.Object): scala.Boolean = js.native
  // methods
  def getEventTime(): scala.Double = js.native
  def getEventTime(runTime: scala.Boolean): scala.Double = js.native
  /**
    * @deprecated - use the 'framerate' property instead
    */
  def getFPS(): scala.Double = js.native
  /**
    * @deprecated - use the 'interval' property instead
    */
  def getInterval(): scala.Double = js.native
  def getMeasuredFPS(): scala.Double = js.native
  def getMeasuredFPS(ticks: scala.Double): scala.Double = js.native
  def getMeasuredTickTime(): scala.Double = js.native
  def getMeasuredTickTime(ticks: scala.Double): scala.Double = js.native
  /**
    * @deprecated - use the 'paused' property instead
    */
  def getPaused(): scala.Boolean = js.native
  def getTicks(): scala.Double = js.native
  def getTicks(pauseable: scala.Boolean): scala.Double = js.native
  def getTime(): scala.Double = js.native
  def getTime(runTime: scala.Boolean): scala.Double = js.native
  def hasEventListener(`type`: java.lang.String): scala.Boolean = js.native
  def init(): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEvent): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEventEventObj): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEventEventObj, useCapture: scala.Boolean): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEvent, useCapture: scala.Boolean): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def off(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit]
  ): scala.Unit = js.native
  def off(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  def on(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEvent): js.Object = js.native
  def on(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEventEventObj): js.Object = js.native
  def on(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEventEventObj, scope: js.Object): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: easeljsLib.Anon_HandleEventEventObj,
    scope: js.Object,
    once: scala.Boolean
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: easeljsLib.Anon_HandleEventEventObj,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: easeljsLib.Anon_HandleEventEventObj,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any,
    useCapture: scala.Boolean
  ): js.Object = js.native
  def on(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEvent, scope: js.Object): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: easeljsLib.Anon_HandleEvent,
    scope: js.Object,
    once: scala.Boolean
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: easeljsLib.Anon_HandleEvent,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: easeljsLib.Anon_HandleEvent,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any,
    useCapture: scala.Boolean
  ): js.Object = js.native
   // It is necessary for "arguments.callee"
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit]
  ): js.Function = js.native
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    scope: js.Object
  ): js.Function = js.native
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    scope: js.Object,
    once: scala.Boolean
  ): js.Function = js.native
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any
  ): js.Function = js.native
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any,
    useCapture: scala.Boolean
  ): js.Function = js.native
  def removeAllEventListeners(): scala.Unit = js.native
  def removeAllEventListeners(`type`: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEvent): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEventEventObj): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEventEventObj, useCapture: scala.Boolean): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_HandleEvent, useCapture: scala.Boolean): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit]
  ): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  /**
    * @deprecated - use the 'framerate' property instead
    */
  def setFPS(value: scala.Double): scala.Unit = js.native
  /**
    * @deprecated - use the 'interval' property instead
    */
  def setInterval(interval: scala.Double): scala.Unit = js.native
  /**
    * @deprecated - use the 'paused' property instead
    */
  def setPaused(value: scala.Boolean): scala.Unit = js.native
  def willTrigger(`type`: java.lang.String): scala.Boolean = js.native
}

