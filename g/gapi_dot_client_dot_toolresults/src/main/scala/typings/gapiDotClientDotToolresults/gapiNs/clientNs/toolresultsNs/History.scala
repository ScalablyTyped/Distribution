package typings.gapiDotClientDotToolresults.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History extends js.Object {
  /**
    * A short human-readable (plain text) name to display in the UI. Maximum of 100 characters.
    *
    * - In response: present if set during create. - In create request: optional
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * A unique identifier within a project for this History.
    *
    * Returns INVALID_ARGUMENT if this field is set or overwritten by the caller.
    *
    * - In response always set - In create request: never set
    */
  var historyId: js.UndefOr[String] = js.undefined
  /**
    * A name to uniquely identify a history within a project. Maximum of 100 characters.
    *
    * - In response always set - In create request: always set
    */
  var name: js.UndefOr[String] = js.undefined
}

object History {
  @scala.inline
  def apply(displayName: String = null, historyId: String = null, name: String = null): History = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (historyId != null) __obj.updateDynamic("historyId")(historyId)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[History]
  }
}

