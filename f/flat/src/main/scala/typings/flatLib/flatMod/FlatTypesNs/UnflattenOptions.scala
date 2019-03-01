package typings
package flatLib.flatMod.FlatTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnflattenOptions extends js.Object {
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var `object`: js.UndefOr[scala.Boolean] = js.undefined
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
}

object UnflattenOptions {
  @scala.inline
  def apply(
    delimiter: java.lang.String = null,
    `object`: js.UndefOr[scala.Boolean] = js.undefined,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined
  ): UnflattenOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[UnflattenOptions]
  }
}

