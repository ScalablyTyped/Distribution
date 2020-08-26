package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterCriteria extends js.Object {
  var condition: js.UndefOr[BooleanCondition] = js.native
  var hiddenValues: js.UndefOr[js.Array[String]] = js.native
}

object FilterCriteria {
  @scala.inline
  def apply(): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCriteria]
  }
  @scala.inline
  implicit class FilterCriteriaOps[Self <: FilterCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCondition(value: BooleanCondition): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setHiddenValuesVarargs(value: String*): Self = this.set("hiddenValues", js.Array(value :_*))
    @scala.inline
    def setHiddenValues(value: js.Array[String]): Self = this.set("hiddenValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenValues: Self = this.set("hiddenValues", js.undefined)
  }
  
}

