package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterPair extends js.Object {
  /** Filter type. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Filter value. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object FilterPair {
  @scala.inline
  def apply(`type`: java.lang.String = null, value: java.lang.String = null): FilterPair = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FilterPair]
  }
}

