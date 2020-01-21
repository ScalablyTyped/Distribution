package typings.googleCloudPreciseDate.mod

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
    val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateStruct]
  }
}

