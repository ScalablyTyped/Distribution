package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanCondition extends js.Object {
  /** The type of condition. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
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
  def apply(`type`: java.lang.String = null, values: js.Array[ConditionValue] = null): BooleanCondition = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[BooleanCondition]
  }
}

