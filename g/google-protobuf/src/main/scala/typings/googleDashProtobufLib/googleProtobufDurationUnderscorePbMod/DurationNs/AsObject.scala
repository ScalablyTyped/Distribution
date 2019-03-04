package typings
package googleDashProtobufLib.googleProtobufDurationUnderscorePbMod.DurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var nanos: scala.Double
  var seconds: scala.Double
}

object AsObject {
  @scala.inline
  def apply(nanos: scala.Double, seconds: scala.Double): AsObject = {
    val __obj = js.Dynamic.literal(nanos = nanos, seconds = seconds)
  
    __obj.asInstanceOf[AsObject]
  }
}

