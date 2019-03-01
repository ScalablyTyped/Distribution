package typings
package dialogflowLib.dialogflowMod.entitiesNs.DateTimeVariantsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTime
  extends dialogflowLib.dialogflowMod.entitiesNs._DateTime {
  var date_time: java.lang.String
}

object DateTime {
  @scala.inline
  def apply(date_time: java.lang.String): DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date_time")(date_time)
    __obj.asInstanceOf[DateTime]
  }
}

