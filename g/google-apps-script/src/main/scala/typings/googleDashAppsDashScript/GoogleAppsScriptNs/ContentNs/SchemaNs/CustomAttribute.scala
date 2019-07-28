package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAttribute extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object CustomAttribute {
  @scala.inline
  def apply(name: String = null, `type`: String = null, unit: String = null, value: String = null): CustomAttribute = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CustomAttribute]
  }
}

