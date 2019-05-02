package typings
package dialogflowLib.dialogflowMod.entitiesNs.DateTimeVariantsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePeriod
  extends dialogflowLib.dialogflowMod.entitiesNs._DateTime {
  var endDate: java.lang.String
  var startDate: java.lang.String
}

object DatePeriod {
  @scala.inline
  def apply(endDate: java.lang.String, startDate: java.lang.String): DatePeriod = {
    val __obj = js.Dynamic.literal(endDate = endDate, startDate = startDate)
  
    __obj.asInstanceOf[DatePeriod]
  }
}

