package typings
package atGoogleDashCloudPreciseDashDateLib.atGoogleDashCloudPreciseDashDateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateStruct extends js.Object {
  var nanos: scala.Double
  var seconds: scala.Double
}

object DateStruct {
  @scala.inline
  def apply(nanos: scala.Double, seconds: scala.Double): DateStruct = {
    val __obj = js.Dynamic.literal(nanos = nanos, seconds = seconds)
  
    __obj.asInstanceOf[DateStruct]
  }
}

