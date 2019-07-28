package typings.fsDashExtraDashP.fsDashExtraDashPMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOptions extends js.Object {
  var dereference: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[
    RegExp | (js.Function2[/* file */ String, /* stat */ typings.node.fsMod.Stats, Boolean])
  ] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
  var passStats: js.UndefOr[Boolean] = js.undefined
}

object CopyOptions {
  @scala.inline
  def apply(
    dereference: js.UndefOr[Boolean] = js.undefined,
    filter: RegExp | (js.Function2[/* file */ String, /* stat */ typings.node.fsMod.Stats, Boolean]) = null,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    passStats: js.UndefOr[Boolean] = js.undefined
  ): CopyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (!js.isUndefined(passStats)) __obj.updateDynamic("passStats")(passStats)
    __obj.asInstanceOf[CopyOptions]
  }
}

