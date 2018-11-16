package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Circle")
@js.native
class Circle () extends ICircleOptions {
  def this(options: ICircleOptions) = this()
  /**
  	 * Returns complexity of an instance
  	 * @return complexity of this instance
  	 */
  def complexity(): scala.Double = js.native
  /**
  	 * Returns horizontal radius of an object (according to how an object is scaled)
  	 */
  def getRadiusX(): scala.Double = js.native
  /**
  	 * Returns vertical radius of an object (according to how an object is scaled)
  	 */
  def getRadiusY(): scala.Double = js.native
  /**
  	 * Sets radius of an object (and updates width accordingly)
  	 */
  def setRadius(value: scala.Double): scala.Double = js.native
  /**
  	 * Returns object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return object representation of an instance
  	 */
  def toObject(): js.Any = js.native
  /**
  	 * Returns object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return object representation of an instance
  	 */
  def toObject(propertiesToInclude: js.Array[java.lang.String]): js.Any = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(): java.lang.String = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Circle")
@js.native
object Circle extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by {@link fabric.Circle.fromElement})
  	 */
  var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
  /**
  	 * Returns Circle instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.ICircleOptions): fabricLib.fabricDashImplMod.Circle = js.native
  /**
  	 * Returns Circle instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Circle = js.native
}

