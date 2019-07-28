package typings.fabric.fabricDashImplMod

import typings.fabric.Anon_R1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGradientOptions extends js.Object {
  /**
  	 * Color stops object eg. {0:string; 1:string;
  	 */
  var colorStops: js.UndefOr[js.Any] = js.undefined
  var coords: js.UndefOr[Anon_R1] = js.undefined
  var gradientTransform: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Horizontal offset for aligning gradients coming from SVG when outside pathgroups
  	 * @type Number
  	 */
  var offsetX: js.UndefOr[Double] = js.undefined
  /**
  	 * Vertical offset for aligning gradients coming from SVG when outside pathgroups
  	 * @type Number
  	 */
  var offsetY: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object IGradientOptions {
  @scala.inline
  def apply(
    colorStops: js.Any = null,
    coords: Anon_R1 = null,
    gradientTransform: js.Any = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    `type`: String = null
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

