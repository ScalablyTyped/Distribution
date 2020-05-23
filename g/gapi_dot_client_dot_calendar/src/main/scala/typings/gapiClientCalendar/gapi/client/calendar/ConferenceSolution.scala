package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceSolution extends js.Object {
  /** The user-visible icon for this solution. */
  var iconUri: js.UndefOr[String] = js.undefined
  /** The key which can uniquely identify the conference solution for this event. */
  var key: js.UndefOr[ConferenceSolutionKey] = js.undefined
  /** The user-visible name of this solution. Not localized. */
  var name: js.UndefOr[String] = js.undefined
}

object ConferenceSolution {
  @scala.inline
  def apply(iconUri: String = null, key: ConferenceSolutionKey = null, name: String = null): ConferenceSolution = {
    val __obj = js.Dynamic.literal()
    if (iconUri != null) __obj.updateDynamic("iconUri")(iconUri.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceSolution]
  }
}

