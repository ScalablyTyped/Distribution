package typings.doubleclickGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyLoadOptionsConfig extends js.Object {
  var fetchMarginPercent: js.UndefOr[Double] = js.undefined
  var mobileScaling: js.UndefOr[Double] = js.undefined
  var renderMarginPercent: js.UndefOr[Double] = js.undefined
}

object LazyLoadOptionsConfig {
  @scala.inline
  def apply(
    fetchMarginPercent: js.UndefOr[Double] = js.undefined,
    mobileScaling: js.UndefOr[Double] = js.undefined,
    renderMarginPercent: js.UndefOr[Double] = js.undefined
  ): LazyLoadOptionsConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetchMarginPercent)) __obj.updateDynamic("fetchMarginPercent")(fetchMarginPercent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileScaling)) __obj.updateDynamic("mobileScaling")(mobileScaling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderMarginPercent)) __obj.updateDynamic("renderMarginPercent")(renderMarginPercent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyLoadOptionsConfig]
  }
}

