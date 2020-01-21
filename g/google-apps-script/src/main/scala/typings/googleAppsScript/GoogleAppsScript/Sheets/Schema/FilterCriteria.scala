package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCriteria extends js.Object {
  var condition: js.UndefOr[BooleanCondition] = js.undefined
  var hiddenValues: js.UndefOr[js.Array[String]] = js.undefined
}

object FilterCriteria {
  @scala.inline
  def apply(condition: BooleanCondition = null, hiddenValues: js.Array[String] = null): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (hiddenValues != null) __obj.updateDynamic("hiddenValues")(hiddenValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
}

