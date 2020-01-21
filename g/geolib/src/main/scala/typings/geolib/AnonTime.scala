package typings.geolib

import typings.geolib.typesMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTime extends js.Object {
  var time: Timestamp
}

object AnonTime {
  @scala.inline
  def apply(time: Timestamp): AnonTime = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTime]
  }
}

