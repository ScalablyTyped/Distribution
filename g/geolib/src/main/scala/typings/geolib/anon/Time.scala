package typings.geolib.anon

import typings.geolib.typesMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var time: Timestamp
}

object Time {
  @scala.inline
  def apply(time: Timestamp): Time = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
}

