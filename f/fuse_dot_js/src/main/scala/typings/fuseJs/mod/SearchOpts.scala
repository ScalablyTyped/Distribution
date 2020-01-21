package typings.fuseJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOpts extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
}

object SearchOpts {
  @scala.inline
  def apply(limit: Int | Double = null): SearchOpts = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOpts]
  }
}

