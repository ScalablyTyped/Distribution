package typings.dynatable.JQueryDynatable

import typings.dynatable.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingIndicator extends StObject {
  
  /** Insert the processing indicator inside the page */
  def attach(): Unit
  
  /**
    * Generate the html markup for the processing indicator
    *
    * @return A jQuery object containing the generated html
    */
  def create(): JQuery
  
  /** Hide the processing indicator */
  def hide(): Unit
  
  /** Set up the processing indicator */
  def init(): Unit
  
  /**
    * Position the processing indicator at the center
    *
    * @return A jQuery object containing the processing indicator
    */
  def position(): JQuery
  
  /** Show the processing indicator */
  def show(): Unit
}
object ProcessingIndicator {
  
  inline def apply(
    attach: () => Unit,
    create: () => JQuery,
    hide: () => Unit,
    init: () => Unit,
    position: () => JQuery,
    show: () => Unit
  ): ProcessingIndicator = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), create = js.Any.fromFunction0(create), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), position = js.Any.fromFunction0(position), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ProcessingIndicator]
  }
  
  extension [Self <: ProcessingIndicator](x: Self) {
    
    inline def setAttach(value: () => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction0(value))
    
    inline def setCreate(value: () => JQuery): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setPosition(value: () => JQuery): Self = StObject.set(x, "position", js.Any.fromFunction0(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
