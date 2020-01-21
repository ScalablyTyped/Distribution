package typings.googleProtobuf.durationPbMod.Duration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var nanos: Double
  var seconds: Double
}

object AsObject {
  @scala.inline
  def apply(nanos: Double, seconds: Double): AsObject = {
    val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

