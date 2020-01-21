package typings.gematriya

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGeresh extends js.Object {
  var geresh: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var punctuate: js.UndefOr[Boolean] = js.undefined
}

object AnonGeresh {
  @scala.inline
  def apply(
    geresh: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    punctuate: js.UndefOr[Boolean] = js.undefined
  ): AnonGeresh = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(geresh)) __obj.updateDynamic("geresh")(geresh.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(punctuate)) __obj.updateDynamic("punctuate")(punctuate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeresh]
  }
}

