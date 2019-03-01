package typings
package dialogflowLib.dialogflowMod.entitiesNs.DateTimeVariantsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePeriod
  extends dialogflowLib.dialogflowMod.entitiesNs._DateTime {
  var endDate: dialogflowLib.dialogflowMod.entitiesNs.Date
  var startDate: dialogflowLib.dialogflowMod.entitiesNs.Date
}

object DatePeriod {
  @scala.inline
  def apply(
    endDate: dialogflowLib.dialogflowMod.entitiesNs.Date,
    startDate: dialogflowLib.dialogflowMod.entitiesNs.Date
  ): DatePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endDate")(endDate)
    __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[DatePeriod]
  }
}

