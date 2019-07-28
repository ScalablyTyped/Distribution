package typings.doubleclickDashGpt.googletagNs

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
    fetchMarginPercent: Int | Double = null,
    mobileScaling: Int | Double = null,
    renderMarginPercent: Int | Double = null
  ): LazyLoadOptionsConfig = {
    val __obj = js.Dynamic.literal()
    if (fetchMarginPercent != null) __obj.updateDynamic("fetchMarginPercent")(fetchMarginPercent.asInstanceOf[js.Any])
    if (mobileScaling != null) __obj.updateDynamic("mobileScaling")(mobileScaling.asInstanceOf[js.Any])
    if (renderMarginPercent != null) __obj.updateDynamic("renderMarginPercent")(renderMarginPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyLoadOptionsConfig]
  }
}

