package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What dates/date ranges are expected
  */
@js.native
trait DataRequirementDateFilter extends Element {
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.native
  /**
    * The date-valued attribute of the filter
    */
  var path: String = js.native
  /**
    * The value of the filter, as a Period, DateTime, or Duration value
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  /**
    * The value of the filter, as a Period, DateTime, or Duration value
    */
  var valueDuration: js.UndefOr[Duration] = js.native
  /**
    * The value of the filter, as a Period, DateTime, or Duration value
    */
  var valuePeriod: js.UndefOr[Period] = js.native
}

object DataRequirementDateFilter {
  @scala.inline
  def apply(path: String): DataRequirementDateFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirementDateFilter]
  }
  @scala.inline
  implicit class DataRequirementDateFilterOps[Self <: DataRequirementDateFilter] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def set_path(value: Element): Self = this.set("_path", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_path: Self = this.set("_path", js.undefined)
    @scala.inline
    def set_valueDateTime(value: Element): Self = this.set("_valueDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueDateTime: Self = this.set("_valueDateTime", js.undefined)
    @scala.inline
    def setValueDateTime(value: dateTime): Self = this.set("valueDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDateTime: Self = this.set("valueDateTime", js.undefined)
    @scala.inline
    def setValueDuration(value: Duration): Self = this.set("valueDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDuration: Self = this.set("valueDuration", js.undefined)
    @scala.inline
    def setValuePeriod(value: Period): Self = this.set("valuePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValuePeriod: Self = this.set("valuePeriod", js.undefined)
  }
  
}

