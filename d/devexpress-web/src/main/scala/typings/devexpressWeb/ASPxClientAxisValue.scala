package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the information about an axis value.
  */
@js.native
trait ASPxClientAxisValue extends js.Object {
  /**
    * Gets the axis value, if the axis scale type is date-time.
    */
  var dateTimeValue: Date = js.native
  /**
    * Gets the axis value, if the axis scale type is numerical.
    */
  var numericalValue: Double = js.native
  /**
    * Gets the axis value, if the axis scale type is qualitative.
    */
  var qualitativeValue: String = js.native
  /**
    * Gets the axis scale type.
    */
  var scaleType: String = js.native
  var timeSpanValue: js.Any = js.native
}

object ASPxClientAxisValue {
  @scala.inline
  def apply(
    dateTimeValue: Date,
    numericalValue: Double,
    qualitativeValue: String,
    scaleType: String,
    timeSpanValue: js.Any
  ): ASPxClientAxisValue = {
    val __obj = js.Dynamic.literal(dateTimeValue = dateTimeValue.asInstanceOf[js.Any], numericalValue = numericalValue.asInstanceOf[js.Any], qualitativeValue = qualitativeValue.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any], timeSpanValue = timeSpanValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxisValue]
  }
  @scala.inline
  implicit class ASPxClientAxisValueOps[Self <: ASPxClientAxisValue] (val x: Self) extends AnyVal {
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
    def setDateTimeValue(value: Date): Self = this.set("dateTimeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumericalValue(value: Double): Self = this.set("numericalValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setQualitativeValue(value: String): Self = this.set("qualitativeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleType(value: String): Self = this.set("scaleType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeSpanValue(value: js.Any): Self = this.set("timeSpanValue", value.asInstanceOf[js.Any])
  }
  
}

