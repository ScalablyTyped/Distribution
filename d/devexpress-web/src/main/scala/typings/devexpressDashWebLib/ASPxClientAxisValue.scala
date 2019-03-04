package typings
package devexpressDashWebLib

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
  var dateTimeValue: stdLib.Date
  /**
    * Gets the axis value, if the axis scale type is numerical.
    * Value: A Double value, specifying the axis value.
    */
  var numericalValue: scala.Double
  /**
    * Gets the axis value, if the axis scale type is qualitative.
    * Value: A String value, specifying the axis value.
    */
  var qualitativeValue: java.lang.String
  /**
    * Gets the axis scale type.
    * Value: A String value, specifying the axis scale type.
    */
  var scaleType: java.lang.String
}

object ASPxClientAxisValue {
  @scala.inline
  def apply(
    dateTimeValue: stdLib.Date,
    numericalValue: scala.Double,
    qualitativeValue: java.lang.String,
    scaleType: java.lang.String
  ): ASPxClientAxisValue = {
    val __obj = js.Dynamic.literal(dateTimeValue = dateTimeValue, numericalValue = numericalValue, qualitativeValue = qualitativeValue, scaleType = scaleType)
  
    __obj.asInstanceOf[ASPxClientAxisValue]
  }
}

