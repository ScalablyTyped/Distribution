package typings.fabric.fabricMod.fabric

import typings.fabric.Anon_X
import typings.fabric.fabricDashImplMod.IPolylineOptions
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Polyline")
@js.native
class Polyline protected ()
  extends typings.fabric.fabricDashImplMod.Polyline {
  /**
  	 * Constructor
  	 * @param points Array of points (where each point is an object with x and y)
  	 * @param [options] Options object
  	 * @param [skipOffset] Whether points offsetting should be skipped
  	 */
  def this(points: js.Array[Anon_X]) = this()
  def this(points: js.Array[Anon_X], options: IPolylineOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Polyline")
@js.native
object Polyline extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
  	 */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
  	 * Returns Polyline  instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: SVGElement): typings.fabric.fabricDashImplMod.Polyline = js.native
  def fromElement(element: SVGElement, options: IPolylineOptions): typings.fabric.fabricDashImplMod.Polyline = js.native
  /**
  	 * Returns fabric.Polyline instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): typings.fabric.fabricDashImplMod.Polyline = js.native
}

