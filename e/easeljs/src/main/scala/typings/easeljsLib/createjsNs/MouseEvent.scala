package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.MouseEvent")
@js.native
class MouseEvent protected ()
  extends createjsDashLibLib.createjsNs.Event {
  def this(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: scala.Boolean, stageX: scala.Double, stageY: scala.Double, nativeEvent: easeljsLib.NativeMouseEvent, pointerID: scala.Double, primary: scala.Boolean, rawX: scala.Double, rawY: scala.Double) = this()
  // properties
  var isTouch: scala.Boolean = js.native
  var localX: scala.Double = js.native
  var localY: scala.Double = js.native
  var mouseMoveOutside: scala.Boolean = js.native
  var nativeEvent: easeljsLib.NativeMouseEvent = js.native
  var pointerID: scala.Double = js.native
  var primary: scala.Boolean = js.native
  var rawX: scala.Double = js.native
  var rawY: scala.Double = js.native
  var relatedTarget: DisplayObject = js.native
  var stageX: scala.Double = js.native
  var stageY: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_EventObj): js.Object = js.native
  def addEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_EventObjHandleEvent): js.Object = js.native
  def addEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_EventObjHandleEvent, useCapture: scala.Boolean): js.Object = js.native
  def addEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_EventObj, useCapture: scala.Boolean): js.Object = js.native
  // EventDispatcher mixins
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
  def hasEventListener(`type`: java.lang.String): scala.Boolean = js.native
  def off(`type`: java.lang.String, listener: easeljsLib.Anon_EventObj): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: easeljsLib.Anon_EventObjHandleEvent): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: easeljsLib.Anon_EventObjHandleEvent, useCapture: scala.Boolean): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: easeljsLib.Anon_EventObj, useCapture: scala.Boolean): scala.Unit = js.native
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
  def on(`type`: java.lang.String, listener: easeljsLib.Anon_EventObj): js.Object = js.native
  def on(`type`: java.lang.String, listener: easeljsLib.Anon_EventObjHandleEvent): js.Object = js.native
  def on(`type`: java.lang.String, listener: easeljsLib.Anon_EventObjHandleEvent, scope: js.Object): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: easeljsLib.Anon_EventObjHandleEvent,
    scope: js.Object,
    once: scala.Boolean
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: easeljsLib.Anon_EventObjHandleEvent,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: easeljsLib.Anon_EventObjHandleEvent,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any,
    useCapture: scala.Boolean
  ): js.Object = js.native
  def on(`type`: java.lang.String, listener: easeljsLib.Anon_EventObj, scope: js.Object): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: easeljsLib.Anon_EventObj,
    scope: js.Object,
    once: scala.Boolean
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: easeljsLib.Anon_EventObj,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: easeljsLib.Anon_EventObj,
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
  def removeEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_EventObj): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_EventObjHandleEvent): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_EventObjHandleEvent, useCapture: scala.Boolean): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: easeljsLib.Anon_EventObj, useCapture: scala.Boolean): scala.Unit = js.native
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
  def willTrigger(`type`: java.lang.String): scala.Boolean = js.native
}

