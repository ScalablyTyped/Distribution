package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Polygon")
@js.native
class Polygon protected () extends Polyline {
  /**
  	 * Constructor
  	 * @param points Array of points
  	 * @param [options] Options object
  	 */
  def this(points: js.Array[fabricLib.Anon_X]) = this()
  def this(points: js.Array[fabricLib.Anon_X], options: IPolylineOptions) = this()
}

/* static members */
@JSImport("fabric/fabric-impl", "Polygon")
@js.native
object Polygon extends js.Object {
  /**
  	 * Returns Polygon instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Polygon = js.native
  def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.IPolylineOptions): fabricLib.fabricDashImplMod.Polygon = js.native
  /**
  	 * Returns fabric.Polygon instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Polygon = js.native
}

