package typings
package dialogflowLib.dialogflowMod.entitiesNs.DateTimeVariantsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimePeriod
  extends dialogflowLib.dialogflowMod.entitiesNs._DateTime {
  var endDateTime: java.lang.String
  var startDateTime: java.lang.String
}

object DateTimePeriod {
  @scala.inline
  def apply(endDateTime: java.lang.String, startDateTime: java.lang.String): DateTimePeriod = {
    val __obj = js.Dynamic.literal(endDateTime = endDateTime, startDateTime = startDateTime)
  
    __obj.asInstanceOf[DateTimePeriod]
  }
}

