package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientTimeIntervalStatic extends js.Object {
  /**
    * Calculates the time interval duration.
    * @param start A DateTime value that specifies the start date time value.
    * @param end A DateTime value that specifies the end date time value.
    */
  def CalculateDuration(start: stdLib.Date, end: stdLib.Date): scala.Double
}

object ASPxClientTimeIntervalStatic {
  @scala.inline
  def apply(CalculateDuration: (stdLib.Date, stdLib.Date) => scala.Double): ASPxClientTimeIntervalStatic = {
    val __obj = js.Dynamic.literal(CalculateDuration = js.Any.fromFunction2(CalculateDuration))
  
    __obj.asInstanceOf[ASPxClientTimeIntervalStatic]
  }
}

