package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  var Mode: Double
  var SizeBytes: Double
}

object AnonMode {
  @scala.inline
  def apply(Mode: Double, SizeBytes: Double): AnonMode = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], SizeBytes = SizeBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMode]
  }
}

