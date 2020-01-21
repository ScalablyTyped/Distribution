package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends js.Object {
  /** Name of the property. */
  var name: js.UndefOr[String] = js.undefined
  /** Value of numeric properties. */
  var uint64Value: js.UndefOr[String] = js.undefined
  /** Value of the property. */
  var value: js.UndefOr[String] = js.undefined
}

object Property {
  @scala.inline
  def apply(name: String = null, uint64Value: String = null, value: String = null): Property = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (uint64Value != null) __obj.updateDynamic("uint64Value")(uint64Value.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
}

