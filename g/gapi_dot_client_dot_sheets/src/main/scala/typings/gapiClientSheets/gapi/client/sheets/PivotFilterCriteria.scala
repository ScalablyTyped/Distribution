package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotFilterCriteria extends js.Object {
  /** Values that should be included.  Values not listed here are excluded. */
  var visibleValues: js.UndefOr[js.Array[String]] = js.native
}

object PivotFilterCriteria {
  @scala.inline
  def apply(): PivotFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFilterCriteria]
  }
  @scala.inline
  implicit class PivotFilterCriteriaOps[Self <: PivotFilterCriteria] (val x: Self) extends AnyVal {
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
    def setVisibleValuesVarargs(value: String*): Self = this.set("visibleValues", js.Array(value :_*))
    @scala.inline
    def setVisibleValues(value: js.Array[String]): Self = this.set("visibleValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleValues: Self = this.set("visibleValues", js.undefined)
  }
  
}

