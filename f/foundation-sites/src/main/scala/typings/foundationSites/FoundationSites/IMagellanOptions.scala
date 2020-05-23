package typings.foundationSites.FoundationSites

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
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEasing: String = null,
    barOffset: js.UndefOr[Double] = js.undefined,
    deepLinking: js.UndefOr[Boolean] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined
  ): IMagellanOptions = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(barOffset)) __obj.updateDynamic("barOffset")(barOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deepLinking)) __obj.updateDynamic("deepLinking")(deepLinking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMagellanOptions]
  }
}

