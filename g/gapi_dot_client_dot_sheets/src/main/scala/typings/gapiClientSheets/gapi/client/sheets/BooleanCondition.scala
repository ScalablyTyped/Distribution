package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanCondition extends js.Object {
  /** The type of condition. */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The values of the condition. The number of supported values depends
    * on the condition type.  Some support zero values,
    * others one or two values,
    * and ConditionType.ONE_OF_LIST supports an arbitrary number of values.
    */
  var values: js.UndefOr[js.Array[ConditionValue]] = js.undefined
}

object BooleanCondition {
  @scala.inline
  def apply(`type`: String = null, values: js.Array[ConditionValue] = null): BooleanCondition = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanCondition]
  }
}

