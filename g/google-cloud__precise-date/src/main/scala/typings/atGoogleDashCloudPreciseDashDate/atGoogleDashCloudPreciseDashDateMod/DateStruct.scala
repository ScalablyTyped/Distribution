package typings.atGoogleDashCloudPreciseDashDate.atGoogleDashCloudPreciseDashDateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateStruct extends js.Object {
  var nanos: Double
  var seconds: Double
}

object DateStruct {
  @scala.inline
  def apply(nanos: Double, seconds: Double): DateStruct = {
    val __obj = js.Dynamic.literal(nanos = nanos, seconds = seconds)
  
    __obj.asInstanceOf[DateStruct]
  }
}

