package typings.dojo.dojox.gfx

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/canvasWithEvents.html
  *
  * This the graphics rendering bridge for W3C Canvas compliant browsers which extends
  * the basic canvas drawing renderer bridge to add additional support for graphics events
  * on Shapes.
  * Since Canvas is an immediate mode graphics api, with no object graph or
  * eventing capabilities, use of the canvas module alone will only add in drawing support.
  * This additional module, canvasWithEvents extends this module with additional support
  * for handling events on Canvas.  By default, the support for events is now included
  * however, if only drawing capabilities are needed, canvas event module can be disabled
  * using the dojoConfig option, canvasEvents:true|false.
  *
  */
trait canvasWithEvents extends js.Object {
  /**
    *
    */
  def Circle(): Unit
  /**
    *
    */
  def Ellipse(): Unit
  /**
    *
    */
  def Group(): Unit
  /**
    *
    */
  def Image(): Unit
  /**
    *
    */
  def Line(): Unit
  /**
    *
    */
  def Path(): Unit
  /**
    *
    */
  def Polyline(): Unit
  /**
    *
    */
  def Rect(): Unit
  /**
    *
    */
  def Shape(): Unit
  /**
    *
    */
  def Surface(): Unit
  /**
    *
    */
  def Text(): Unit
  /**
    *
    */
  def TextPath(): Unit
  /**
    * creates a surface (Canvas)
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px"
    * @param height height of surface, e.g., "100px"
    */
  def createSurface(parentNode: HTMLElement, width: String, height: String): Unit
}

object canvasWithEvents {
  @scala.inline
  def apply(
    Circle: () => Unit,
    Ellipse: () => Unit,
    Group: () => Unit,
    Image: () => Unit,
    Line: () => Unit,
    Path: () => Unit,
    Polyline: () => Unit,
    Rect: () => Unit,
    Shape: () => Unit,
    Surface: () => Unit,
    Text: () => Unit,
    TextPath: () => Unit,
    createSurface: (HTMLElement, String, String) => Unit
  ): canvasWithEvents = {
    val __obj = js.Dynamic.literal(Circle = js.Any.fromFunction0(Circle), Ellipse = js.Any.fromFunction0(Ellipse), Group = js.Any.fromFunction0(Group), Image = js.Any.fromFunction0(Image), Line = js.Any.fromFunction0(Line), Path = js.Any.fromFunction0(Path), Polyline = js.Any.fromFunction0(Polyline), Rect = js.Any.fromFunction0(Rect), Shape = js.Any.fromFunction0(Shape), Surface = js.Any.fromFunction0(Surface), Text = js.Any.fromFunction0(Text), TextPath = js.Any.fromFunction0(TextPath), createSurface = js.Any.fromFunction3(createSurface))
    __obj.asInstanceOf[canvasWithEvents]
  }
}

