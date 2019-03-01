package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMagellanOptions extends js.Object {
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var animationEasing: js.UndefOr[java.lang.String] = js.undefined
  var barOffset: js.UndefOr[scala.Double] = js.undefined
  var deepLinking: js.UndefOr[scala.Boolean] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object IMagellanOptions {
  @scala.inline
  def apply(
    activeClass: java.lang.String = null,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: java.lang.String = null,
    barOffset: scala.Int | scala.Double = null,
    deepLinking: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null
  ): IMagellanOptions = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (barOffset != null) __obj.updateDynamic("barOffset")(barOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(deepLinking)) __obj.updateDynamic("deepLinking")(deepLinking)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMagellanOptions]
  }
}

