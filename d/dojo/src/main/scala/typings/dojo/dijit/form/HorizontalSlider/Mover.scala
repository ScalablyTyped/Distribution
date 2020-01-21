package typings.dojo.dijit.form.HorizontalSlider

import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/HorizontalSlider._Mover.html
  *
  * 
  * @param node a node (or node's id) to be moved     
  * @param e a mouse event, which started the move;only pageX and pageY properties are used     
  * @param host       Optionalobject which implements the functionality of the move,and defines proper events (onMoveStart and onMoveStop)     
  */
@JSGlobal("dijit.form.HorizontalSlider._Mover")
@js.native
class Mover protected ()
  extends typings.dojo.dojo.dnd.Mover {
  def this(node: HTMLElement, e: Event_) = this()
  def this(node: HTMLElement, e: Event_, host: js.Object) = this()
  def destroy(e: js.Any): Unit = js.native
  /**
    * 
    * @param e             
    */
  def onMouseMove(e: js.Any): Unit = js.native
}

