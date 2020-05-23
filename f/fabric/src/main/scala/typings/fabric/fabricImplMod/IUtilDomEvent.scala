package typings.fabric.fabricImplMod

import typings.std.Event
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilDomEvent extends js.Object {
  /**
    * Adds an event listener to an element
    */
  def addListener(element: HTMLElement, eventName: String, handler: js.Function): Unit
  /**
    * Cross-browser wrapper for getting event's coordinates
    * @param event Event object
    * @param upperCanvasEl &lt;canvas> element on which object selection is drawn
    */
  def getPointer(event: Event, upperCanvasEl: HTMLCanvasElement): Point
  /**
    * Removes an event listener from an element
    */
  def removeListener(element: HTMLElement, eventName: String, handler: js.Function): Unit
}

object IUtilDomEvent {
  @scala.inline
  def apply(
    addListener: (HTMLElement, String, js.Function) => Unit,
    getPointer: (Event, HTMLCanvasElement) => Point,
    removeListener: (HTMLElement, String, js.Function) => Unit
  ): IUtilDomEvent = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction3(addListener), getPointer = js.Any.fromFunction2(getPointer), removeListener = js.Any.fromFunction3(removeListener))
    __obj.asInstanceOf[IUtilDomEvent]
  }
}

