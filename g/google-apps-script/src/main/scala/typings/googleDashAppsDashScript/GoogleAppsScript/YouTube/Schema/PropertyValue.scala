package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyValue extends js.Object {
  var property: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object PropertyValue {
  @scala.inline
  def apply(property: String = null, value: String = null): PropertyValue = {
    val __obj = js.Dynamic.literal()
    if (property != null) __obj.updateDynamic("property")(property)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PropertyValue]
  }
}

