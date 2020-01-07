package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A condition that can evaluate to true or false. BooleanConditions are used
  * by conditional formatting, data validation, and the criteria in filters.
  */
@js.native
trait Schema$BooleanCondition extends js.Object {
  /**
    * The type of condition.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The values of the condition. The number of supported values depends on
    * the condition type.  Some support zero values, others one or two values,
    * and ConditionType.ONE_OF_LIST supports an arbitrary number of values.
    */
  var values: js.UndefOr[js.Array[Schema$ConditionValue]] = js.native
}

object Schema$BooleanCondition {
  @scala.inline
  def apply(`type`: String = null, values: js.Array[Schema$ConditionValue] = null): Schema$BooleanCondition = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BooleanCondition]
  }
}

