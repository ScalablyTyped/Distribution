package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFilterValueRange extends js.Object {
  var dataFilter: js.UndefOr[DataFilter] = js.native
  var majorDimension: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object DataFilterValueRange {
  @scala.inline
  def apply(): DataFilterValueRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFilterValueRange]
  }
  @scala.inline
  implicit class DataFilterValueRangeOps[Self <: DataFilterValueRange] (val x: Self) extends AnyVal {
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
    def setDataFilter(value: DataFilter): Self = this.set("dataFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFilter: Self = this.set("dataFilter", js.undefined)
    @scala.inline
    def setMajorDimension(value: String): Self = this.set("majorDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorDimension: Self = this.set("majorDimension", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[js.Array[_]]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

