package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientTimeIntervalStatic extends js.Object {
  /**
    * Calculates the time interval duration.
    * @param start A DateTime value that specifies the start date time value.
    * @param end A DateTime value that specifies the end date time value.
    */
  def CalculateDuration(start: Date, end: Date): Double
}

object ASPxClientTimeIntervalStatic {
  @scala.inline
  def apply(CalculateDuration: (Date, Date) => Double): ASPxClientTimeIntervalStatic = {
    val __obj = js.Dynamic.literal(CalculateDuration = js.Any.fromFunction2(CalculateDuration))
  
    __obj.asInstanceOf[ASPxClientTimeIntervalStatic]
  }
}

