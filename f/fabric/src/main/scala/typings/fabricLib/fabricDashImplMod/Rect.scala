package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Rect")
@js.native
class Rect () extends IRectOptions {
  /**
  	 * Constructor
  	 * @param [options] Options object
  	 */
  def this(options: IRectOptions) = this()
  /**
  	 * Returns complexity of an instance
  	 * @return complexity
  	 */
  def complexity(): scala.Double = js.native
  def initialize(): Rect = js.native
  def initialize(points: js.Array[scala.Double]): Rect = js.native
  def initialize(points: js.Array[scala.Double], options: js.Any): Rect = js.native
  /**
  	 * Returns object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return object representation of an instance
  	 */
  def toObject(propertiesToInclude: js.Array[_]): js.Any = js.native
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
- Dropped Object */ @JSImport("fabric/fabric-impl", "Rect")
@js.native
object Rect extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by `fabric.Rect.fromElement`)
  	 */
  var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
  /**
  	 * Returns Rect instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Rect = js.native
  /**
  	 * Returns Rect instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.IRectOptions): fabricLib.fabricDashImplMod.Rect = js.native
  /**
  	 * Returns Rect instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Rect = js.native
}

