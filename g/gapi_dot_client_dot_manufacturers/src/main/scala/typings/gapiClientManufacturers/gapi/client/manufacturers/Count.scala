package typings.gapiClientManufacturers.gapi.client.manufacturers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  /** The unit in which these products are counted. */
  var unit: js.UndefOr[String] = js.undefined
  /** The numeric value of the number of products in a package. */
  var value: js.UndefOr[String] = js.undefined
}

object Count {
  @scala.inline
  def apply(unit: String = null, value: String = null): Count = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

