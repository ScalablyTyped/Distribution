package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Weight extends js.Object {
  /** The weight unit. */
  var unit: js.UndefOr[String] = js.undefined
  /** The weight represented as a number. */
  var value: js.UndefOr[String] = js.undefined
}

object Weight {
  @scala.inline
  def apply(unit: String = null, value: String = null): Weight = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weight]
  }
}

