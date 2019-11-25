package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomGroup extends js.Object {
  var attributes: js.UndefOr[js.Array[CustomAttribute]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object CustomGroup {
  @scala.inline
  def apply(attributes: js.Array[CustomAttribute] = null, name: String = null): CustomGroup = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomGroup]
  }
}

