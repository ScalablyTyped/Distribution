package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Editors extends js.Object {
  var domainUsersCanEdit: js.UndefOr[Boolean] = js.undefined
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  var users: js.UndefOr[js.Array[String]] = js.undefined
}

object Editors {
  @scala.inline
  def apply(
    domainUsersCanEdit: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null,
    users: js.Array[String] = null
  ): Editors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(domainUsersCanEdit)) __obj.updateDynamic("domainUsersCanEdit")(domainUsersCanEdit.get.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editors]
  }
}

