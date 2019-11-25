package typings.gapiDotClientDotDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterPair extends js.Object {
  /** Filter type. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Filter value. */
  var value: js.UndefOr[String] = js.undefined
}

object FilterPair {
  @scala.inline
  def apply(`type`: String = null, value: String = null): FilterPair = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterPair]
  }
}

