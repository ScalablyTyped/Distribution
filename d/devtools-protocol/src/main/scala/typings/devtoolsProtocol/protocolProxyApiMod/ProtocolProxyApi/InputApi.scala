package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.Input.DispatchKeyEventRequest
import typings.devtoolsProtocol.mod.Protocol.Input.DispatchMouseEventRequest
import typings.devtoolsProtocol.mod.Protocol.Input.DispatchTouchEventRequest
import typings.devtoolsProtocol.mod.Protocol.Input.EmulateTouchFromMouseEventRequest
import typings.devtoolsProtocol.mod.Protocol.Input.InsertTextRequest
import typings.devtoolsProtocol.mod.Protocol.Input.SetIgnoreInputEventsRequest
import typings.devtoolsProtocol.mod.Protocol.Input.SynthesizePinchGestureRequest
import typings.devtoolsProtocol.mod.Protocol.Input.SynthesizeScrollGestureRequest
import typings.devtoolsProtocol.mod.Protocol.Input.SynthesizeTapGestureRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputApi extends js.Object {
  /**
    * Dispatches a key event to the page.
    */
  def dispatchKeyEvent(params: DispatchKeyEventRequest): js.Promise[Unit] = js.native
  /**
    * Dispatches a mouse event to the page.
    */
  def dispatchMouseEvent(params: DispatchMouseEventRequest): js.Promise[Unit] = js.native
  /**
    * Dispatches a touch event to the page.
    */
  def dispatchTouchEvent(params: DispatchTouchEventRequest): js.Promise[Unit] = js.native
  /**
    * Emulates touch event from the mouse event parameters.
    */
  def emulateTouchFromMouseEvent(params: EmulateTouchFromMouseEventRequest): js.Promise[Unit] = js.native
  /**
    * This method emulates inserting text that doesn't come from a key press,
    * for example an emoji keyboard or an IME.
    */
  def insertText(params: InsertTextRequest): js.Promise[Unit] = js.native
  /**
    * Ignores input events (useful while auditing page).
    */
  def setIgnoreInputEvents(params: SetIgnoreInputEventsRequest): js.Promise[Unit] = js.native
  /**
    * Synthesizes a pinch gesture over a time period by issuing appropriate touch events.
    */
  def synthesizePinchGesture(params: SynthesizePinchGestureRequest): js.Promise[Unit] = js.native
  /**
    * Synthesizes a scroll gesture over a time period by issuing appropriate touch events.
    */
  def synthesizeScrollGesture(params: SynthesizeScrollGestureRequest): js.Promise[Unit] = js.native
  /**
    * Synthesizes a tap gesture over a time period by issuing appropriate touch events.
    */
  def synthesizeTapGesture(params: SynthesizeTapGestureRequest): js.Promise[Unit] = js.native
}

object InputApi {
  @scala.inline
  def apply(
    dispatchKeyEvent: DispatchKeyEventRequest => js.Promise[Unit],
    dispatchMouseEvent: DispatchMouseEventRequest => js.Promise[Unit],
    dispatchTouchEvent: DispatchTouchEventRequest => js.Promise[Unit],
    emulateTouchFromMouseEvent: EmulateTouchFromMouseEventRequest => js.Promise[Unit],
    insertText: InsertTextRequest => js.Promise[Unit],
    setIgnoreInputEvents: SetIgnoreInputEventsRequest => js.Promise[Unit],
    synthesizePinchGesture: SynthesizePinchGestureRequest => js.Promise[Unit],
    synthesizeScrollGesture: SynthesizeScrollGestureRequest => js.Promise[Unit],
    synthesizeTapGesture: SynthesizeTapGestureRequest => js.Promise[Unit]
  ): InputApi = {
    val __obj = js.Dynamic.literal(dispatchKeyEvent = js.Any.fromFunction1(dispatchKeyEvent), dispatchMouseEvent = js.Any.fromFunction1(dispatchMouseEvent), dispatchTouchEvent = js.Any.fromFunction1(dispatchTouchEvent), emulateTouchFromMouseEvent = js.Any.fromFunction1(emulateTouchFromMouseEvent), insertText = js.Any.fromFunction1(insertText), setIgnoreInputEvents = js.Any.fromFunction1(setIgnoreInputEvents), synthesizePinchGesture = js.Any.fromFunction1(synthesizePinchGesture), synthesizeScrollGesture = js.Any.fromFunction1(synthesizeScrollGesture), synthesizeTapGesture = js.Any.fromFunction1(synthesizeTapGesture))
    __obj.asInstanceOf[InputApi]
  }
  @scala.inline
  implicit class InputApiOps[Self <: InputApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDispatchKeyEvent(value: DispatchKeyEventRequest => js.Promise[Unit]): Self = this.set("dispatchKeyEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setDispatchMouseEvent(value: DispatchMouseEventRequest => js.Promise[Unit]): Self = this.set("dispatchMouseEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setDispatchTouchEvent(value: DispatchTouchEventRequest => js.Promise[Unit]): Self = this.set("dispatchTouchEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setEmulateTouchFromMouseEvent(value: EmulateTouchFromMouseEventRequest => js.Promise[Unit]): Self = this.set("emulateTouchFromMouseEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertText(value: InsertTextRequest => js.Promise[Unit]): Self = this.set("insertText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIgnoreInputEvents(value: SetIgnoreInputEventsRequest => js.Promise[Unit]): Self = this.set("setIgnoreInputEvents", js.Any.fromFunction1(value))
    @scala.inline
    def setSynthesizePinchGesture(value: SynthesizePinchGestureRequest => js.Promise[Unit]): Self = this.set("synthesizePinchGesture", js.Any.fromFunction1(value))
    @scala.inline
    def setSynthesizeScrollGesture(value: SynthesizeScrollGestureRequest => js.Promise[Unit]): Self = this.set("synthesizeScrollGesture", js.Any.fromFunction1(value))
    @scala.inline
    def setSynthesizeTapGesture(value: SynthesizeTapGestureRequest => js.Promise[Unit]): Self = this.set("synthesizeTapGesture", js.Any.fromFunction1(value))
  }
  
}

