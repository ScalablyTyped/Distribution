package typings.gematriya.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geresh extends js.Object {
  var geresh: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var punctuate: js.UndefOr[Boolean] = js.undefined
}

object Geresh {
  @scala.inline
  def apply(
    geresh: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    punctuate: js.UndefOr[Boolean] = js.undefined
  ): Geresh = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(geresh)) __obj.updateDynamic("geresh")(geresh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(punctuate)) __obj.updateDynamic("punctuate")(punctuate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geresh]
  }
}

