package typings.easeljs.createjs

import typings.createjsLib.createjs.Event
import typings.easeljs.Anon0
import typings.easeljs.AnonHandleEvent
import typings.easeljs.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.MouseEvent")
@js.native
class MouseEvent protected () extends Event {
  def this(
    `type`: String,
    bubbles: Boolean,
    cancelable: Boolean,
    stageX: Double,
    stageY: Double,
    nativeEvent: NativeMouseEvent,
    pointerID: Double,
    primary: Boolean,
    rawX: Double,
    rawY: Double
  ) = this()
  // properties
  var isTouch: Boolean = js.native
  var localX: Double = js.native
  var localY: Double = js.native
  var mouseMoveOutside: Boolean = js.native
  var nativeEvent: NativeMouseEvent = js.native
  var pointerID: Double = js.native
  var primary: Boolean = js.native
  var rawX: Double = js.native
  var rawY: Double = js.native
  var relatedTarget: DisplayObject = js.native
  var stageX: Double = js.native
  var stageY: Double = js.native
  // EventDispatcher mixins
  def addEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
  def addEventListener(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): js.Function = js.native
  def addEventListener(`type`: String, listener: Anon0): js.Object = js.native
  def addEventListener(`type`: String, listener: Anon0, useCapture: Boolean): js.Object = js.native
  def addEventListener(`type`: String, listener: AnonHandleEvent): js.Object = js.native
  def addEventListener(`type`: String, listener: AnonHandleEvent, useCapture: Boolean): js.Object = js.native
  def dispatchEvent(eventObj: String): Boolean = js.native
  def dispatchEvent(eventObj: String, target: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: js.Object, target: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: Event): Boolean = js.native
  def dispatchEvent(eventObj: Event, target: js.Object): Boolean = js.native
  def hasEventListener(`type`: String): Boolean = js.native
  def off(`type`: String, listener: js.Function): Unit = js.native
  def off(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = js.native
  def off(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): Unit = js.native
  def off(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  def off(`type`: String, listener: Anon0): Unit = js.native
  def off(`type`: String, listener: Anon0, useCapture: Boolean): Unit = js.native
  def off(`type`: String, listener: AnonHandleEvent): Unit = js.native
  def off(`type`: String, listener: AnonHandleEvent, useCapture: Boolean): Unit = js.native
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
  def on(`type`: String, listener: Anon0): js.Object = js.native
  def on(`type`: String, listener: Anon0, scope: js.Object): js.Object = js.native
  def on(`type`: String, listener: Anon0, scope: js.Object, once: Boolean): js.Object = js.native
  def on(`type`: String, listener: Anon0, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
  def on(
    `type`: String,
    listener: Anon0,
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: AnonHandleEvent): js.Object = js.native
  def on(`type`: String, listener: AnonHandleEvent, scope: js.Object): js.Object = js.native
  def on(`type`: String, listener: AnonHandleEvent, scope: js.Object, once: Boolean): js.Object = js.native
  def on(`type`: String, listener: AnonHandleEvent, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
  def on(
    `type`: String,
    listener: AnonHandleEvent,
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
  def removeEventListener(`type`: String, listener: Anon0): Unit = js.native
  def removeEventListener(`type`: String, listener: Anon0, useCapture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: AnonHandleEvent): Unit = js.native
  def removeEventListener(`type`: String, listener: AnonHandleEvent, useCapture: Boolean): Unit = js.native
  def willTrigger(`type`: String): Boolean = js.native
}

