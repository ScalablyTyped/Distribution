package typings.gapiClientCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /**
    * The type of the scope. Possible values are:
    * - "default" - The public scope. This is the default value.
    * - "user" - Limits the scope to a single user.
    * - "group" - Limits the scope to a group.
    * - "domain" - Limits the scope to a domain.  Note: The permissions granted to the "default", or public, scope apply to any user, authenticated or not.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** The email address of a user or group, or the name of a domain, depending on the scope type. Omitted for type "default". */
  var value: js.UndefOr[String] = js.undefined
}

object Type {
  @scala.inline
  def apply(`type`: String = null, value: String = null): Type = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

