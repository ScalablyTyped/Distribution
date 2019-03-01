package typings
package gapiDotClientDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  /**
    * The type of the scope. Possible values are:
    * - "default" - The public scope. This is the default value.
    * - "user" - Limits the scope to a single user.
    * - "group" - Limits the scope to a group.
    * - "domain" - Limits the scope to a domain.  Note: The permissions granted to the "default", or public, scope apply to any user, authenticated or not.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The email address of a user or group, or the name of a domain, depending on the scope type. Omitted for type "default". */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Type {
  @scala.inline
  def apply(`type`: java.lang.String = null, value: java.lang.String = null): Anon_Type = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Type]
  }
}

