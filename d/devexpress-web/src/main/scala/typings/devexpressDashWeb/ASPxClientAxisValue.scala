package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the information about an axis value.
  */
@JSGlobal("ASPxClientAxisValue")
@js.native
class ASPxClientAxisValue () extends js.Object {
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
}

