package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoOffset extends js.Object {
  var offsetPercentage: js.UndefOr[Double] = js.undefined
  var offsetSeconds: js.UndefOr[Double] = js.undefined
}

object VideoOffset {
  @scala.inline
  def apply(
    offsetPercentage: js.UndefOr[Double] = js.undefined,
    offsetSeconds: js.UndefOr[Double] = js.undefined
  ): VideoOffset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offsetPercentage)) __obj.updateDynamic("offsetPercentage")(offsetPercentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetSeconds)) __obj.updateDynamic("offsetSeconds")(offsetSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOffset]
  }
}

