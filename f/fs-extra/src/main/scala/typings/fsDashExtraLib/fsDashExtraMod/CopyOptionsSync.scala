package typings
package fsDashExtraLib.fsDashExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOptionsSync extends CopyOptions {
  @JSName("filter")
  var filter_CopyOptionsSync: js.UndefOr[CopyFilterSync] = js.undefined
}

object CopyOptionsSync {
  @scala.inline
  def apply(
    dereference: js.UndefOr[scala.Boolean] = js.undefined,
    errorOnExist: js.UndefOr[scala.Boolean] = js.undefined,
    filter: CopyFilterSync = null,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    preserveTimestamps: js.UndefOr[scala.Boolean] = js.undefined,
    recursive: js.UndefOr[scala.Boolean] = js.undefined
  ): CopyOptionsSync = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference)
    if (!js.isUndefined(errorOnExist)) __obj.updateDynamic("errorOnExist")(errorOnExist)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (!js.isUndefined(preserveTimestamps)) __obj.updateDynamic("preserveTimestamps")(preserveTimestamps)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[CopyOptionsSync]
  }
}

