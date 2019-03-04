package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilDomEvent extends js.Object {
  /**
  	 * Adds an event listener to an element
  	 */
  def addListener(element: stdLib.HTMLElement, eventName: java.lang.String, handler: js.Function): scala.Unit
  /**
  	 * Cross-browser wrapper for getting event's coordinates
  	 * @param event Event object
  	 * @param upperCanvasEl &lt;canvas> element on which object selection is drawn
  	 */
  def getPointer(event: stdLib.Event, upperCanvasEl: stdLib.HTMLCanvasElement): Point
  /**
  	 * Removes an event listener from an element
  	 */
  def removeListener(element: stdLib.HTMLElement, eventName: java.lang.String, handler: js.Function): scala.Unit
}

object IUtilDomEvent {
  @scala.inline
  def apply(
    addListener: js.Function3[stdLib.HTMLElement, java.lang.String, js.Function, scala.Unit],
    getPointer: js.Function2[stdLib.Event, stdLib.HTMLCanvasElement, Point],
    removeListener: js.Function3[stdLib.HTMLElement, java.lang.String, js.Function, scala.Unit]
  ): IUtilDomEvent = {
    val __obj = js.Dynamic.literal(addListener = addListener, getPointer = getPointer, removeListener = removeListener)
  
    __obj.asInstanceOf[IUtilDomEvent]
  }
}

