package typings.gapiClientPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  /**
    * The type of address. Possible values include, but are not limited to, the following values:
    * - "account" - Google account email address.
    * - "home" - Home email address.
    * - "work" - Work email address.
    * - "other" - Other.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** The email address. */
  var value: js.UndefOr[String] = js.undefined
}

object Value {
  @scala.inline
  def apply(`type`: String = null, value: String = null): Value = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

