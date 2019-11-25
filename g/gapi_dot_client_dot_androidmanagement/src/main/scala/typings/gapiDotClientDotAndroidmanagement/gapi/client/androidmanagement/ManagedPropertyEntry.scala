package typings.gapiDotClientDotAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedPropertyEntry extends js.Object {
  /** The human-readable name of the value. Localized. */
  var name: js.UndefOr[String] = js.undefined
  /** The machine-readable value of the entry, which should be used in the configuration. Not localized. */
  var value: js.UndefOr[String] = js.undefined
}

object ManagedPropertyEntry {
  @scala.inline
  def apply(name: String = null, value: String = null): ManagedPropertyEntry = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedPropertyEntry]
  }
}

