package typings.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object MoveOptions {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined, overwrite: js.UndefOr[Boolean] = js.undefined): MoveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveOptions]
  }
}

