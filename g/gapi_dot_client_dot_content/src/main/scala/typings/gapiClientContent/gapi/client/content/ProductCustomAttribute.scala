package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductCustomAttribute extends js.Object {
  /** The name of the attribute. Underscores will be replaced by spaces upon insertion. */
  var name: js.UndefOr[String] = js.undefined
  /** The type of the attribute. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Free-form unit of the attribute. Unit can only be used for values of type INT or FLOAT. */
  var unit: js.UndefOr[String] = js.undefined
  /** The value of the attribute. */
  var value: js.UndefOr[String] = js.undefined
}

object ProductCustomAttribute {
  @scala.inline
  def apply(name: String = null, `type`: String = null, unit: String = null, value: String = null): ProductCustomAttribute = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductCustomAttribute]
  }
}

