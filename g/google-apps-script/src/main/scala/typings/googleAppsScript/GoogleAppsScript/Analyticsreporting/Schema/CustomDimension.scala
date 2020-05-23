package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimension extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object CustomDimension {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, value: String = null): CustomDimension = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDimension]
  }
}

