package typings
package dialogflowLib.dialogflowMod.entitiesNs.DateTimeVariantsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimePeriod
  extends dialogflowLib.dialogflowMod.entitiesNs._DateTime {
  var endDateTime: DateTime
  var startDateTime: DateTime
}

object DateTimePeriod {
  @scala.inline
  def apply(endDateTime: DateTime, startDateTime: DateTime): DateTimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endDateTime")(endDateTime)
    __obj.updateDynamic("startDateTime")(startDateTime)
    __obj.asInstanceOf[DateTimePeriod]
  }
}

