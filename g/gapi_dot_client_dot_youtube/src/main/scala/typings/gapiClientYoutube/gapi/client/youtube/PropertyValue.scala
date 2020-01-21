package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyValue extends js.Object {
  /** A property. */
  var property: js.UndefOr[String] = js.undefined
  /** The property's value. */
  var value: js.UndefOr[String] = js.undefined
}

object PropertyValue {
  @scala.inline
  def apply(property: String = null, value: String = null): PropertyValue = {
    val __obj = js.Dynamic.literal()
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyValue]
  }
}

