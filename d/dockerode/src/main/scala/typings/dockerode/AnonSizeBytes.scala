package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSizeBytes extends js.Object {
  var Mode: Double
  var SizeBytes: Double
}

object AnonSizeBytes {
  @scala.inline
  def apply(Mode: Double, SizeBytes: Double): AnonSizeBytes = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], SizeBytes = SizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSizeBytes]
  }
}

