package typings
package fsDashExtraDashPLib.fsDashExtraDashPMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveOptions extends js.Object {
  var limit: js.UndefOr[scala.Double] = js.undefined
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
}

object MoveOptions {
  @scala.inline
  def apply(limit: scala.Int | scala.Double = null, overwrite: js.UndefOr[scala.Boolean] = js.undefined): MoveOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[MoveOptions]
  }
}

