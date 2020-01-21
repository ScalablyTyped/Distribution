package typings.gapiClientMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setting extends js.Object {
  /**
    * The setting's ID. The following IDs are valid:
    * - locale - The key to the user’s language/locale (BCP 47 identifier) that Glassware should use to render localized content.
    * - timezone - The key to the user’s current time zone region as defined in the tz database. Example: America/Los_Angeles.
    */
  var id: js.UndefOr[String] = js.undefined
  /** The type of resource. This is always mirror#setting. */
  var kind: js.UndefOr[String] = js.undefined
  /** The setting value, as a string. */
  var value: js.UndefOr[String] = js.undefined
}

object Setting {
  @scala.inline
  def apply(id: String = null, kind: String = null, value: String = null): Setting = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Setting]
  }
}

