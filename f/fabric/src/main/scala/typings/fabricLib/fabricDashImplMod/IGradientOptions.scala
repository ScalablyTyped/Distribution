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
  var coords: js.UndefOr[fabricLib.Anon_R1] = js.undefined
  var gradientTransform: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Horizontal offset for aligning gradients coming from SVG when outside pathgroups
  	 * @type Number
  	 */
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Vertical offset for aligning gradients coming from SVG when outside pathgroups
  	 * @type Number
  	 */
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IGradientOptions {
  @scala.inline
  def apply(
    colorStops: js.Any = null,
    coords: fabricLib.Anon_R1 = null,
    gradientTransform: js.Any = null,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): IGradientOptions = {
    val __obj = js.Dynamic.literal()
    if (colorStops != null) __obj.updateDynamic("colorStops")(colorStops)
    if (coords != null) __obj.updateDynamic("coords")(coords)
    if (gradientTransform != null) __obj.updateDynamic("gradientTransform")(gradientTransform)
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IGradientOptions]
  }
}

