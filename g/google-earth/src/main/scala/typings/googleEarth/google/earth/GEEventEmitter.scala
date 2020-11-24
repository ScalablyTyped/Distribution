package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GEEventEmitter extends js.Object {
  
  /**
    * Triggers an event when the user clicks a location in Google Earth with the mouse.
    */
  def click(event: KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user double clicks a location in Google Earth with the mouse.
    */
  def dblclick(event: KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user presses the mouse button over a location in Google Earth.
    */
  def mousedown(event: KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user moves the mouse inside Google Earth.
    */
  def mousemove(event: KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user moves the mouse off of the object in Google Earth.
    */
  def mouseout(event: KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user moves the mouse pointer over a location in Google Earth.
    */
  def mouseover(event: KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user releases the mouse button over a location in Google Earth.
    */
  def mouseup(event: KmlMouseEvent): Unit = js.native
}
object GEEventEmitter {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit
  ): GEEventEmitter = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup))
    __obj.asInstanceOf[GEEventEmitter]
  }
  
  @scala.inline
  implicit class GEEventEmitterOps[Self <: GEEventEmitter] (val x: Self) extends AnyVal {
    
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
    def setClick(value: KmlMouseEvent => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDblclick(value: KmlMouseEvent => Unit): Self = this.set("dblclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMousedown(value: KmlMouseEvent => Unit): Self = this.set("mousedown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMousemove(value: KmlMouseEvent => Unit): Self = this.set("mousemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseout(value: KmlMouseEvent => Unit): Self = this.set("mouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseover(value: KmlMouseEvent => Unit): Self = this.set("mouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseup(value: KmlMouseEvent => Unit): Self = this.set("mouseup", js.Any.fromFunction1(value))
  }
}
