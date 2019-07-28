package typings.findDashPackageDashJson.findDashPackageDashJsonMod

import typings.findDashPackageDashJson.findDashPackageDashJsonNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Done extends FindResult {
  var done: `true`
  var filename: js.UndefOr[scala.Nothing] = js.undefined
  var value: js.UndefOr[scala.Nothing] = js.undefined
}

object Done {
  @scala.inline
  def apply(
    done: `true`,
    filename: js.UndefOr[scala.Nothing] = js.undefined,
    value: js.UndefOr[scala.Nothing] = js.undefined
  ): Done = {
    val __obj = js.Dynamic.literal(done = done)
    if (!js.isUndefined(filename)) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Done]
  }
}

