package typings
package fsDashExtraDashPLib.fsDashExtraDashPMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOptions extends js.Object {
  var dereference: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[
    stdLib.RegExp | (js.Function2[/* file */ java.lang.String, /* stat */ nodeLib.fsMod.Stats, scala.Boolean])
  ] = js.undefined
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  var passStats: js.UndefOr[scala.Boolean] = js.undefined
}

object CopyOptions {
  @scala.inline
  def apply(
    dereference: js.UndefOr[scala.Boolean] = js.undefined,
    filter: stdLib.RegExp | (js.Function2[/* file */ java.lang.String, /* stat */ nodeLib.fsMod.Stats, scala.Boolean]) = null,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    passStats: js.UndefOr[scala.Boolean] = js.undefined
  ): CopyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (!js.isUndefined(passStats)) __obj.updateDynamic("passStats")(passStats)
    __obj.asInstanceOf[CopyOptions]
  }
}

