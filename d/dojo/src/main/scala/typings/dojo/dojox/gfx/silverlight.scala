package typings.dojo.dojox.gfx

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/silverlight.html
  *
  * This the graphics rendering bridge for the Microsoft Silverlight plugin.
  * Silverlight is a faster implementation on IE6-8 than the default 2d graphics, VML
  *
  */
trait silverlight extends js.Object {
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
    * @param node a Silverlight node
    */
  def attachNode(node: HTMLElement): Unit
  /**
    * creates a surface from a Node
    *
    * @param node a Silverlight node
    */
  def attachSurface(node: HTMLElement): Unit
  /**
    * creates a surface (Silverlight)
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px"
    * @param height height of surface, e.g., "100px"
    */
  def createSurface(parentNode: HTMLElement, width: String, height: String): Unit
}

object silverlight {
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
    createSurface: (HTMLElement, String, String) => Unit
  ): silverlight = {
    val __obj = js.Dynamic.literal(Circle = js.Any.fromFunction0(Circle), Ellipse = js.Any.fromFunction0(Ellipse), Group = js.Any.fromFunction0(Group), Image = js.Any.fromFunction0(Image), Line = js.Any.fromFunction0(Line), Path = js.Any.fromFunction0(Path), Polyline = js.Any.fromFunction0(Polyline), Rect = js.Any.fromFunction0(Rect), Shape = js.Any.fromFunction0(Shape), Surface = js.Any.fromFunction0(Surface), Text = js.Any.fromFunction0(Text), TextPath = js.Any.fromFunction0(TextPath), attachNode = js.Any.fromFunction1(attachNode), attachSurface = js.Any.fromFunction1(attachSurface), createSurface = js.Any.fromFunction3(createSurface))
    __obj.asInstanceOf[silverlight]
  }
}

