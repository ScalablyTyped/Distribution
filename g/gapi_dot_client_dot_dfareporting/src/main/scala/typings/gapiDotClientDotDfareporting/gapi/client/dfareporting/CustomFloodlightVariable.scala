package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFloodlightVariable extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customFloodlightVariable". */
  var kind: js.UndefOr[String] = js.undefined
  /** The type of custom floodlight variable to supply a value for. These map to the "u[1-20]=" in the tags. */
  var `type`: js.UndefOr[String] = js.undefined
  /** The value of the custom floodlight variable. The length of string must not exceed 50 characters. */
  var value: js.UndefOr[String] = js.undefined
}

object CustomFloodlightVariable {
  @scala.inline
  def apply(kind: String = null, `type`: String = null, value: String = null): CustomFloodlightVariable = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CustomFloodlightVariable]
  }
}

