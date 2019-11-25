package typings.foundationDashSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMagellanOptions extends js.Object {
  var activeClass: js.UndefOr[String] = js.undefined
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationEasing: js.UndefOr[String] = js.undefined
  var barOffset: js.UndefOr[Double] = js.undefined
  var deepLinking: js.UndefOr[Boolean] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object IMagellanOptions {
  @scala.inline
  def apply(
    activeClass: String = null,
    animationDuration: Int | Double = null,
    animationEasing: String = null,
    barOffset: Int | Double = null,
    deepLinking: js.UndefOr[Boolean] = js.undefined,
    threshold: Int | Double = null
  ): IMagellanOptions = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (barOffset != null) __obj.updateDynamic("barOffset")(barOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(deepLinking)) __obj.updateDynamic("deepLinking")(deepLinking.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMagellanOptions]
  }
}

