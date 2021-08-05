package typings.fabric.fabricImplMod

import typings.std.Event
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUtilDomEvent extends StObject {
  
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
  
  inline def apply(
    addListener: (HTMLElement, String, js.Function) => Unit,
    getPointer: (Event, HTMLCanvasElement) => Point,
    removeListener: (HTMLElement, String, js.Function) => Unit
  ): IUtilDomEvent = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction3(addListener), getPointer = js.Any.fromFunction2(getPointer), removeListener = js.Any.fromFunction3(removeListener))
    __obj.asInstanceOf[IUtilDomEvent]
  }
  
  extension [Self <: IUtilDomEvent](x: Self) {
    
    inline def setAddListener(value: (HTMLElement, String, js.Function) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction3(value))
    
    inline def setGetPointer(value: (Event, HTMLCanvasElement) => Point): Self = StObject.set(x, "getPointer", js.Any.fromFunction2(value))
    
    inline def setRemoveListener(value: (HTMLElement, String, js.Function) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction3(value))
  }
}
