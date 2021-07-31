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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputApi extends StObject {
  
  /**
    * Dispatches a key event to the page.
    */
  def dispatchKeyEvent(params: DispatchKeyEventRequest): js.Promise[Unit]
  
  /**
    * Dispatches a mouse event to the page.
    */
  def dispatchMouseEvent(params: DispatchMouseEventRequest): js.Promise[Unit]
  
  /**
    * Dispatches a touch event to the page.
    */
  def dispatchTouchEvent(params: DispatchTouchEventRequest): js.Promise[Unit]
  
  /**
    * Emulates touch event from the mouse event parameters.
    */
  def emulateTouchFromMouseEvent(params: EmulateTouchFromMouseEventRequest): js.Promise[Unit]
  
  /**
    * This method emulates inserting text that doesn't come from a key press,
    * for example an emoji keyboard or an IME.
    */
  def insertText(params: InsertTextRequest): js.Promise[Unit]
  
  /**
    * Ignores input events (useful while auditing page).
    */
  def setIgnoreInputEvents(params: SetIgnoreInputEventsRequest): js.Promise[Unit]
  
  /**
    * Synthesizes a pinch gesture over a time period by issuing appropriate touch events.
    */
  def synthesizePinchGesture(params: SynthesizePinchGestureRequest): js.Promise[Unit]
  
  /**
    * Synthesizes a scroll gesture over a time period by issuing appropriate touch events.
    */
  def synthesizeScrollGesture(params: SynthesizeScrollGestureRequest): js.Promise[Unit]
  
  /**
    * Synthesizes a tap gesture over a time period by issuing appropriate touch events.
    */
  def synthesizeTapGesture(params: SynthesizeTapGestureRequest): js.Promise[Unit]
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
  implicit class InputApiMutableBuilder[Self <: InputApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispatchKeyEvent(value: DispatchKeyEventRequest => js.Promise[Unit]): Self = StObject.set(x, "dispatchKeyEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDispatchMouseEvent(value: DispatchMouseEventRequest => js.Promise[Unit]): Self = StObject.set(x, "dispatchMouseEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDispatchTouchEvent(value: DispatchTouchEventRequest => js.Promise[Unit]): Self = StObject.set(x, "dispatchTouchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmulateTouchFromMouseEvent(value: EmulateTouchFromMouseEventRequest => js.Promise[Unit]): Self = StObject.set(x, "emulateTouchFromMouseEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertText(value: InsertTextRequest => js.Promise[Unit]): Self = StObject.set(x, "insertText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIgnoreInputEvents(value: SetIgnoreInputEventsRequest => js.Promise[Unit]): Self = StObject.set(x, "setIgnoreInputEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSynthesizePinchGesture(value: SynthesizePinchGestureRequest => js.Promise[Unit]): Self = StObject.set(x, "synthesizePinchGesture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSynthesizeScrollGesture(value: SynthesizeScrollGestureRequest => js.Promise[Unit]): Self = StObject.set(x, "synthesizeScrollGesture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSynthesizeTapGesture(value: SynthesizeTapGestureRequest => js.Promise[Unit]): Self = StObject.set(x, "synthesizeTapGesture", js.Any.fromFunction1(value))
  }
}
