package typings.dojo.dojox.gfx

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/vml_attach.html
  *
  * This the default graphics rendering bridge for IE6-7.
  * This renderer is very slow.  For best performance on IE6-8, use Silverlight plugin.
  * IE9+ defaults to the standard W3C SVG renderer.
  *
  */
@JSName("vml_attach")
@js.native
trait vml_attach_ extends js.Object {
  /**
    *
    */
  var text_alignment: js.Object = js.native
  /**
    *
    */
  var xmlns: String = js.native
  /**
    *
    */
  def Circle(): Unit = js.native
  /**
    *
    */
  def Ellipse(): Unit = js.native
  /**
    *
    */
  def Group(): Unit = js.native
  /**
    *
    */
  def Image(): Unit = js.native
  /**
    *
    */
  def Line(): Unit = js.native
  /**
    *
    */
  def Path(): Unit = js.native
  /**
    *
    */
  def Polyline(): Unit = js.native
  /**
    *
    */
  def Rect(): Unit = js.native
  /**
    *
    */
  def Shape(): Unit = js.native
  /**
    *
    */
  def Surface(): Unit = js.native
  /**
    *
    */
  def Text(): Unit = js.native
  /**
    *
    */
  def TextPath(): Unit = js.native
  /**
    * creates a shape from a Node
    *
    * @param node a VML node
    */
  def attachNode(node: HTMLElement): Unit = js.native
  /**
    * creates a surface from a Node
    *
    * @param node a VML node
    */
  def attachSurface(node: HTMLElement): Unit = js.native
  /**
    * creates a surface (VML)
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px" or 100
    * @param height height of surface, e.g., "100px" or 100
    */
  def createSurface(parentNode: HTMLElement, width: String, height: String): js.Any = js.native
  /**
    * creates a surface (VML)
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px" or 100
    * @param height height of surface, e.g., "100px" or 100
    */
  def createSurface(parentNode: HTMLElement, width: String, height: Double): js.Any = js.native
  /**
    * creates a surface (VML)
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px" or 100
    * @param height height of surface, e.g., "100px" or 100
    */
  def createSurface(parentNode: HTMLElement, width: Double, height: String): js.Any = js.native
  /**
    * creates a surface (VML)
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px" or 100
    * @param height height of surface, e.g., "100px" or 100
    */
  def createSurface(parentNode: HTMLElement, width: Double, height: Double): js.Any = js.native
  /**
    * Adds the gfxElement to event.gfxTarget if none exists. This new
    * property will carry the GFX element associated with this event.
    *
    * @param event The current input event (MouseEvent or TouchEvent)
    * @param gfxElement The GFX target element
    */
  def fixTarget(event: js.Object, gfxElement: js.Object): Unit = js.native
}

