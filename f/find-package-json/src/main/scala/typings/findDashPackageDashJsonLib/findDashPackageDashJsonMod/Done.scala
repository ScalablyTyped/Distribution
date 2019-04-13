package typings
package findDashPackageDashJsonLib.findDashPackageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Done extends FindResult {
  var done: findDashPackageDashJsonLib.findDashPackageDashJsonLibNumbers.`true`
  var filename: js.UndefOr[scala.Nothing]
  var value: js.UndefOr[scala.Nothing]
}

object Done {
  @scala.inline
  def apply(
    done: findDashPackageDashJsonLib.findDashPackageDashJsonLibNumbers.`true`,
    filename: js.UndefOr[scala.Nothing] = js.undefined,
    value: js.UndefOr[scala.Nothing] = js.undefined
  ): Done = {
    val __obj = js.Dynamic.literal(done = done)
    if (!js.isUndefined(filename)) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Done]
  }
}

