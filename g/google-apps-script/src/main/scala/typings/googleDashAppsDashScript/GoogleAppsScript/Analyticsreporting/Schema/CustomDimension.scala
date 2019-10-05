package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimension extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object CustomDimension {
  @scala.inline
  def apply(index: Int | Double = null, value: String = null): CustomDimension = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CustomDimension]
  }
}

