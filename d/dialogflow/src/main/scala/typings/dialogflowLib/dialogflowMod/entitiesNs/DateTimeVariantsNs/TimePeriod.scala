package typings
package dialogflowLib.dialogflowMod.entitiesNs.DateTimeVariantsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePeriod
  extends dialogflowLib.dialogflowMod.entitiesNs._DateTime {
  var endTime: java.lang.String
  var startTime: java.lang.String
}

object TimePeriod {
  @scala.inline
  def apply(endTime: java.lang.String, startTime: java.lang.String): TimePeriod = {
    val __obj = js.Dynamic.literal(endTime = endTime, startTime = startTime)
  
    __obj.asInstanceOf[TimePeriod]
  }
}

