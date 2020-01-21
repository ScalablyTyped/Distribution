package typings.freedom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStream extends js.Object {
  var stream: Double
}

object AnonStream {
  @scala.inline
  def apply(stream: Double): AnonStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStream]
  }
}

