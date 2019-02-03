package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Triangle")
@js.native
/**
	 * Constructor
	 * @param [options] Options object
	 */
class Triangle () extends Object {
  def this(options: ITriangleOptions) = this()
  /**
  	 * Returns SVG representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(): java.lang.String = js.native
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Triangle")
@js.native
object Triangle extends js.Object {
  /**
  	 * Returns Triangle instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Triangle = js.native
}

