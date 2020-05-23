package typings.fuseJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOpts extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
}

object SearchOpts {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined): SearchOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOpts]
  }
}

