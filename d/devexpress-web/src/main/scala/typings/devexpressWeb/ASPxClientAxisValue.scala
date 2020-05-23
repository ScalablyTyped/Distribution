package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the information about an axis value.
  */
trait ASPxClientAxisValue extends js.Object {
  /**
    * Gets the axis value, if the axis scale type is date-time.
    */
  var dateTimeValue: Date
  /**
    * Gets the axis value, if the axis scale type is numerical.
    */
  var numericalValue: Double
  /**
    * Gets the axis value, if the axis scale type is qualitative.
    */
  var qualitativeValue: String
  /**
    * Gets the axis scale type.
    */
  var scaleType: String
  var timeSpanValue: js.Any
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
}

