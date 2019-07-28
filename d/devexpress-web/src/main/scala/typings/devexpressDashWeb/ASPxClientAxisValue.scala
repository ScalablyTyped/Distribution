package typings.devexpressDashWeb

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
    * Value: A DateTime value, specifying the axis value.
    */
  var dateTimeValue: Date
  /**
    * Gets the axis value, if the axis scale type is numerical.
    * Value: A Double value, specifying the axis value.
    */
  var numericalValue: Double
  /**
    * Gets the axis value, if the axis scale type is qualitative.
    * Value: A String value, specifying the axis value.
    */
  var qualitativeValue: String
  /**
    * Gets the axis scale type.
    * Value: A String value, specifying the axis scale type.
    */
  var scaleType: String
}

object ASPxClientAxisValue {
  @scala.inline
  def apply(dateTimeValue: Date, numericalValue: Double, qualitativeValue: String, scaleType: String): ASPxClientAxisValue = {
    val __obj = js.Dynamic.literal(dateTimeValue = dateTimeValue, numericalValue = numericalValue, qualitativeValue = qualitativeValue, scaleType = scaleType)
  
    __obj.asInstanceOf[ASPxClientAxisValue]
  }
}

