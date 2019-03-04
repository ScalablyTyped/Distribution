package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewBox extends js.Object {
  /**
  	 * Height of viewbox
  	 */
  var height: scala.Double
  /**
  	 * Width of viewbox
  	 */
  var width: scala.Double
  /**
  	 * x-cooridnate of viewbox
  	 */
  var x: scala.Double
  /**
  	 * y-coordinate of viewbox
  	 */
  var y: scala.Double
}

object IViewBox {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): IViewBox = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[IViewBox]
  }
}

