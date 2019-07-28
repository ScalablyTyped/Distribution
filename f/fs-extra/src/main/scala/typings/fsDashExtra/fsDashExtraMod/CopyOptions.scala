package typings.fsDashExtra.fsDashExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOptions extends js.Object {
  var dereference: js.UndefOr[Boolean] = js.undefined
  var errorOnExist: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[CopyFilterSync | CopyFilterAsync] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
  var preserveTimestamps: js.UndefOr[Boolean] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object CopyOptions {
  @scala.inline
  def apply(
    dereference: js.UndefOr[Boolean] = js.undefined,
    errorOnExist: js.UndefOr[Boolean] = js.undefined,
    filter: CopyFilterSync | CopyFilterAsync = null,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    preserveTimestamps: js.UndefOr[Boolean] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined
  ): CopyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference)
    if (!js.isUndefined(errorOnExist)) __obj.updateDynamic("errorOnExist")(errorOnExist)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (!js.isUndefined(preserveTimestamps)) __obj.updateDynamic("preserveTimestamps")(preserveTimestamps)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[CopyOptions]
  }
}

