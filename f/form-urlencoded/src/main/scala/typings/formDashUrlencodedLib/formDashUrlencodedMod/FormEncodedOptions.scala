package typings
package formDashUrlencodedLib.formDashUrlencodedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormEncodedOptions extends js.Object {
  var ignorenull: js.UndefOr[scala.Boolean] = js.undefined
  var skipIndex: js.UndefOr[scala.Boolean] = js.undefined
  var sorted: js.UndefOr[scala.Boolean] = js.undefined
}

object FormEncodedOptions {
  @scala.inline
  def apply(
    ignorenull: js.UndefOr[scala.Boolean] = js.undefined,
    skipIndex: js.UndefOr[scala.Boolean] = js.undefined,
    sorted: js.UndefOr[scala.Boolean] = js.undefined
  ): FormEncodedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignorenull)) __obj.updateDynamic("ignorenull")(ignorenull)
    if (!js.isUndefined(skipIndex)) __obj.updateDynamic("skipIndex")(skipIndex)
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted)
    __obj.asInstanceOf[FormEncodedOptions]
  }
}

