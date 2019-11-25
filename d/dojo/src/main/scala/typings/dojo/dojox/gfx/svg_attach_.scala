package typings.dojo.dojox.gfx

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/svg_attach.html
  *
  * This the graphics rendering bridge for browsers compliant with W3C SVG1.0.
  * This is the preferred renderer to use for interactive and accessible graphics.
  *
  */
@JSName("svg_attach")
trait svg_attach_ extends js.Object {
  /**
    *
    */
  var dasharray: js.Object
  /**
    *
    */
  var useSvgWeb: Boolean
  /**
    *
    */
  var xmlns: js.Object
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
    * creates a shape from a Node
    *
    * @param node an SVG node
    */
  def attachNode(node: HTMLElement): Unit
  /**
    * creates a surface from a Node
    *
    * @param node an SVG node
    */
  def attachSurface(node: HTMLElement): Unit
  /**
    *
    * @param parentNode
    * @param width
    * @param height
    */
  def createSurface(parentNode: js.Any, width: js.Any, height: js.Any): Unit
  /**
    * Adds the gfxElement to event.gfxTarget if none exists. This new
    * property will carry the GFX element associated with this event.
    *
    * @param event The current input event (MouseEvent or TouchEvent)
    * @param gfxElement The GFX target element
    */
  def fixTarget(event: js.Object, gfxElement: js.Object): Unit
  /**
    * looks up a node by its external name
    *
    * @param name an SVG external reference
    */
  def getRef(name: String): js.Any
}

object svg_attach_ {
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
    attachNode: HTMLElement => Unit,
    attachSurface: HTMLElement => Unit,
    createSurface: (js.Any, js.Any, js.Any) => Unit,
    dasharray: js.Object,
    fixTarget: (js.Object, js.Object) => Unit,
    getRef: String => js.Any,
    useSvgWeb: Boolean,
    xmlns: js.Object
  ): svg_attach_ = {
    val __obj = js.Dynamic.literal(Circle = js.Any.fromFunction0(Circle), Ellipse = js.Any.fromFunction0(Ellipse), Group = js.Any.fromFunction0(Group), Image = js.Any.fromFunction0(Image), Line = js.Any.fromFunction0(Line), Path = js.Any.fromFunction0(Path), Polyline = js.Any.fromFunction0(Polyline), Rect = js.Any.fromFunction0(Rect), Shape = js.Any.fromFunction0(Shape), Surface = js.Any.fromFunction0(Surface), Text = js.Any.fromFunction0(Text), TextPath = js.Any.fromFunction0(TextPath), attachNode = js.Any.fromFunction1(attachNode), attachSurface = js.Any.fromFunction1(attachSurface), createSurface = js.Any.fromFunction3(createSurface), dasharray = dasharray.asInstanceOf[js.Any], fixTarget = js.Any.fromFunction2(fixTarget), getRef = js.Any.fromFunction1(getRef), useSvgWeb = useSvgWeb.asInstanceOf[js.Any], xmlns = xmlns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[svg_attach_]
  }
}

