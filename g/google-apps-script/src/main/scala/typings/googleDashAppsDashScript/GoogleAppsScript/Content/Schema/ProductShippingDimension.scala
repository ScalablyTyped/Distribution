package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductShippingDimension extends js.Object {
  var unit: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ProductShippingDimension {
  @scala.inline
  def apply(unit: String = null, value: Int | Double = null): ProductShippingDimension = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductShippingDimension]
  }
}

