package typings
package flatLib.flatMod.FlatTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenOptions extends js.Object {
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var maxDepth: js.UndefOr[scala.Double] = js.undefined
  var safe: js.UndefOr[scala.Boolean] = js.undefined
}

object FlattenOptions {
  @scala.inline
  def apply(
    delimiter: java.lang.String = null,
    maxDepth: scala.Int | scala.Double = null,
    safe: js.UndefOr[scala.Boolean] = js.undefined
  ): FlattenOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe)
    __obj.asInstanceOf[FlattenOptions]
  }
}

