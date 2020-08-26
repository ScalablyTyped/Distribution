package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceRowsAdvancedFilter extends js.Object {
  /** Allows you to set the filtering type while performing the advanced filtering.
    */
  var advancedFilterType: js.UndefOr[String] = js.native
  /** Allows you to set the operator to perform the label filtering.
    * @Default {none}
    */
  var labelFilterOperator: js.UndefOr[String] = js.native
  /** In value filtering, this property contains the measure name to which the filter is applied.
    */
  var measure: js.UndefOr[String] = js.native
  /** Allows you to provide a level unique name to perform the advanced filtering.
    */
  var name: js.UndefOr[String] = js.native
  /** Allows you to set the operator to perform the value filtering.
    * @Default {none}
    */
  var valueFilterOperator: js.UndefOr[String] = js.native
  /** Allows you to hold the filter operand values in the advanced filtering.
    */
  var values: js.UndefOr[js.Array[_]] = js.native
}

object DataSourceRowsAdvancedFilter {
  @scala.inline
  def apply(): DataSourceRowsAdvancedFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRowsAdvancedFilter]
  }
  @scala.inline
  implicit class DataSourceRowsAdvancedFilterOps[Self <: DataSourceRowsAdvancedFilter] (val x: Self) extends AnyVal {
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
    def setAdvancedFilterType(value: String): Self = this.set("advancedFilterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedFilterType: Self = this.set("advancedFilterType", js.undefined)
    @scala.inline
    def setLabelFilterOperator(value: String): Self = this.set("labelFilterOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFilterOperator: Self = this.set("labelFilterOperator", js.undefined)
    @scala.inline
    def setMeasure(value: String): Self = this.set("measure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasure: Self = this.set("measure", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValueFilterOperator(value: String): Self = this.set("valueFilterOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueFilterOperator: Self = this.set("valueFilterOperator", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

