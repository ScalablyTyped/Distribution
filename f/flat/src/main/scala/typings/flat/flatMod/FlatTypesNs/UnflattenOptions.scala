package typings.flat.flatMod.FlatTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnflattenOptions extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
  var `object`: js.UndefOr[Boolean] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object UnflattenOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    `object`: js.UndefOr[Boolean] = js.undefined,
    overwrite: js.UndefOr[Boolean] = js.undefined
  ): UnflattenOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[UnflattenOptions]
  }
}

