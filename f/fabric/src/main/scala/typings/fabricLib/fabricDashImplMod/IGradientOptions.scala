package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGradientOptions extends js.Object {
  /**
  	 * Color stops object eg. {0:string; 1:string;
  	 */
  var colorStops: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Radius of start point (only for radial gradients)
  	 */
  var r1: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Radius of end point (only for radial gradients)
  	 */
  var r2: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * @param [options.type] Type of gradient 'radial' or 'linear'
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * x-coordinate of start point
  	 */
  var x1: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * x-coordinate of end point
  	 */
  var x2: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * y-coordinate of start point
  	 */
  var y1: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * y-coordinate of end point
  	 */
  var y2: js.UndefOr[scala.Double] = js.undefined
}

