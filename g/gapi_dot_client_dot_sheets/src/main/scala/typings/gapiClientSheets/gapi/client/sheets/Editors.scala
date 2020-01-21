package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Editors extends js.Object {
  /**
    * True if anyone in the document's domain has edit access to the protected
    * range.  Domain protection is only supported on documents within a domain.
    */
  var domainUsersCanEdit: js.UndefOr[Boolean] = js.undefined
  /** The email addresses of groups with edit access to the protected range. */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  /** The email addresses of users with edit access to the protected range. */
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
    if (!js.isUndefined(domainUsersCanEdit)) __obj.updateDynamic("domainUsersCanEdit")(domainUsersCanEdit.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editors]
  }
}

