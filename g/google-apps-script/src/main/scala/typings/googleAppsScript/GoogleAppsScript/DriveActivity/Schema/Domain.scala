package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var legacyId: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Domain {
  @scala.inline
  def apply(legacyId: String = null, name: String = null): Domain = {
    val __obj = js.Dynamic.literal()
    if (legacyId != null) __obj.updateDynamic("legacyId")(legacyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
}

