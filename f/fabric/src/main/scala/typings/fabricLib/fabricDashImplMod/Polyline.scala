package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Polyline")
@js.native
class Polyline protected () extends IPolylineOptions {
  /**
  	 * Constructor
  	 * @param points Array of points (where each point is an object with x and y)
  	 * @param [options] Options object
  	 * @param [skipOffset] Whether points offsetting should be skipped
  	 */
  def this(points: js.Array[fabricLib.Anon_Y]) = this()
  /**
  	 * Constructor
  	 * @param points Array of points (where each point is an object with x and y)
  	 * @param [options] Options object
  	 * @param [skipOffset] Whether points offsetting should be skipped
  	 */
  def this(points: js.Array[fabricLib.Anon_Y], options: IPolylineOptions) = this()
  /**
  	 * Returns complexity of an instance
  	 * @return complexity of this instance
  	 */
  def complexity(): scala.Double = js.native
  def initialize(points: js.Array[Point]): scala.Unit = js.native
  def initialize(points: js.Array[Point], options: IPolylineOptions): scala.Unit = js.native
  /**
  	 * Returns object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return Object representation of an instance
  	 */
  def toObject(): js.Any = js.native
  /**
  	 * Returns object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return Object representation of an instance
  	 */
  def toObject(propertiesToInclude: js.Array[java.lang.String]): js.Any = js.native
  /**
  	 * Returns SVG representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(): java.lang.String = js.native
  /**
  	 * Returns SVG representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Polyline")
@js.native
object Polyline extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
  	 */
  var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
  /**
  	 * Returns Polyline  instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Polyline = js.native
  /**
  	 * Returns Polyline  instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.IPolylineOptions): fabricLib.fabricDashImplMod.Polyline = js.native
  /**
  	 * Returns fabric.Polyline instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Polyline = js.native
}

