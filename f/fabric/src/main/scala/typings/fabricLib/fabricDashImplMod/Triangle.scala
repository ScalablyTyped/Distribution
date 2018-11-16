package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Triangle")
@js.native
class Triangle () extends js.Object {
  /**
  	 * Constructor
  	 * @param [options] Options object
  	 */
  def this(options: ITriangleOptions) = this()
  /**
  	 * Returns complexity of an instance
  	 * @return complexity of this instance
  	 */
  def complexity(): scala.Double = js.native
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
- Dropped Object */ @JSImport("fabric/fabric-impl", "Triangle")
@js.native
object Triangle extends js.Object {
  /**
  	 * Returns Triangle instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Triangle = js.native
}

