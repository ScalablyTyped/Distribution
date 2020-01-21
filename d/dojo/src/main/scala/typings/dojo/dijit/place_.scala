package typings.dojo.dijit

import typings.dojo.dijit.place.Position
import typings.dojo.dijit.place.Rectangle
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/place.html
  *
  * Code to place a DOMNode relative to another DOMNode.
  * Load using require(["dijit/place"], function(place){ ... }).
  * 
  */
@js.native
trait place_ extends js.Object {
  /**
    * Position node adjacent or kitty-corner to anchor
    * such that it's fully visible in viewport.
    * Place node such that corner of node touches a corner of
    * aroundNode, and that node is fully visible.
    * 
    * @param node             
    * @param anchor Either a DOMNode or a rectangle (object with x, y, width, height).             
    * @param positions Ordered list of positions to try matching up.before: places drop down to the left of the anchor node/widget, or to the right in the case  of RTL scripts like Hebrew and Arabic; aligns either the top of the drop down  with the top of the anchor, or the bottom of the drop down with bottom of the anchor.after: places drop down to the right of the anchor node/widget, or to the left in the case  of RTL scripts like Hebrew and Arabic; aligns either the top of the drop down  with the top of the anchor, or the bottom of the drop down with bottom of the anchor.before-centered: centers drop down to the left of the anchor node/widget, or to the right  in the case of RTL scripts like Hebrew and Arabicafter-centered: centers drop down to the right of the anchor node/widget, or to the left  in the case of RTL scripts like Hebrew and Arabicabove-centered: drop down is centered above anchor nodeabove: drop down goes above anchor node, left sides alignedabove-alt: drop down goes above anchor node, right sides alignedbelow-centered: drop down is centered above anchor nodebelow: drop down goes below anchor nodebelow-alt: drop down goes below anchor node, right sides aligned             
    * @param leftToRight True if widget is LTR, false if widget is RTL.   Affects the behavior of "above" and "below"positions slightly.             
    * @param layoutNode               OptionalFor things like tooltip, they are displayed differently (and have different dimensions)based on their orientation relative to the parent.   This adjusts the popup based on orientation.             
    */
  def around(
    node: HTMLElement,
    anchor: Rectangle,
    positions: js.Array[String],
    leftToRight: Boolean,
    layoutNode: js.Function
  ): js.Any = js.native
  /**
    * Position node adjacent or kitty-corner to anchor
    * such that it's fully visible in viewport.
    * Place node such that corner of node touches a corner of
    * aroundNode, and that node is fully visible.
    * 
    * @param node             
    * @param anchor Either a DOMNode or a rectangle (object with x, y, width, height).             
    * @param positions Ordered list of positions to try matching up.before: places drop down to the left of the anchor node/widget, or to the right in the case  of RTL scripts like Hebrew and Arabic; aligns either the top of the drop down  with the top of the anchor, or the bottom of the drop down with bottom of the anchor.after: places drop down to the right of the anchor node/widget, or to the left in the case  of RTL scripts like Hebrew and Arabic; aligns either the top of the drop down  with the top of the anchor, or the bottom of the drop down with bottom of the anchor.before-centered: centers drop down to the left of the anchor node/widget, or to the right  in the case of RTL scripts like Hebrew and Arabicafter-centered: centers drop down to the right of the anchor node/widget, or to the left  in the case of RTL scripts like Hebrew and Arabicabove-centered: drop down is centered above anchor nodeabove: drop down goes above anchor node, left sides alignedabove-alt: drop down goes above anchor node, right sides alignedbelow-centered: drop down is centered above anchor nodebelow: drop down goes below anchor nodebelow-alt: drop down goes below anchor node, right sides aligned             
    * @param leftToRight True if widget is LTR, false if widget is RTL.   Affects the behavior of "above" and "below"positions slightly.             
    * @param layoutNode               OptionalFor things like tooltip, they are displayed differently (and have different dimensions)based on their orientation relative to the parent.   This adjusts the popup based on orientation.             
    */
  def around(
    node: HTMLElement,
    anchor: HTMLElement,
    positions: js.Array[String],
    leftToRight: Boolean,
    layoutNode: js.Function
  ): js.Any = js.native
  /**
    * Positions node kitty-corner to the rectangle centered at (pos.x, pos.y) with width and height of
    * padding.x  2 and padding.y  2, or zero if padding not specified.  Picks first corner in corners[]
    * where node is fully visible, or the corner where it's most visible.
    * 
    * Node is assumed to be absolutely or relatively positioned.
    * 
    * @param node The node to position             
    * @param pos Object like {x: 10, y: 20}             
    * @param corners Array of Strings representing order to try corners of the node in, like ["TR", "BL"].Possible values are:"BL" - bottom left"BR" - bottom right"TL" - top left"TR" - top right             
    * @param padding               OptionalOptional param to set padding, to put some buffer around the element you want to position.Defaults to zero.             
    * @param layoutNode For things like tooltip, they are displayed differently (and have different dimensions)based on their orientation relative to the parent.  This adjusts the popup based on orientation.             
    */
  def at(node: HTMLElement, pos: Position, corners: js.Array[String], padding: Position, layoutNode: js.Any): js.Any = js.native
}

