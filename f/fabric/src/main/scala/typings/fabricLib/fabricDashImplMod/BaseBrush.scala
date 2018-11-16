package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "BaseBrush")
@js.native
class BaseBrush () extends js.Object {
  /**
  	 * Color of a brush
  	 */
  var color: java.lang.String = js.native
  /**
  	 * Shadow object representing shadow of this shape.
  	 * <b>Backwards incompatibility note:</b> This property replaces "shadowColor" (String), "shadowOffsetX" (Number),
  	 * "shadowOffsetY" (Number) and "shadowBlur" (Number) since v1.2.12
  	 */
  var shadow: Shadow | java.lang.String = js.native
  /**
  	 * Stroke Dash Array.
  	 */
  var strokeDashArray: js.Array[_] = js.native
  /**
  	 * Line endings style of a brush (one of "butt", "round", "square")
  	 */
  var strokeLineCap: java.lang.String = js.native
  /**
  	 * Corner style of a brush (one of "bevil", "round", "miter")
  	 */
  var strokeLineJoin: java.lang.String = js.native
  /**
  	 * Width of a brush
  	 */
  var width: scala.Double = js.native
  /**
  	 * Sets shadow of an object
  	 * @param [options] Options object or string (e.g. "2px 2px 10px rgba(0,0,0,0.2)")
  	 */
  def setShadow(options: java.lang.String): BaseBrush = js.native
  /**
  	 * Sets shadow of an object
  	 * @param [options] Options object or string (e.g. "2px 2px 10px rgba(0,0,0,0.2)")
  	 */
  def setShadow(options: js.Any): BaseBrush = js.native
}

