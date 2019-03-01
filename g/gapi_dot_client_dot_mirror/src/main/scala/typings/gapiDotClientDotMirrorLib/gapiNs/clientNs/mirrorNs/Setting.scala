package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setting extends js.Object {
  /**
    * The setting's ID. The following IDs are valid:
    * - locale - The key to the user’s language/locale (BCP 47 identifier) that Glassware should use to render localized content.
    * - timezone - The key to the user’s current time zone region as defined in the tz database. Example: America/Los_Angeles.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The type of resource. This is always mirror#setting. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The setting value, as a string. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Setting {
  @scala.inline
  def apply(id: java.lang.String = null, kind: java.lang.String = null, value: java.lang.String = null): Setting = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Setting]
  }
}

