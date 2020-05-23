package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeBytes extends js.Object {
  var Mode: Double
  var SizeBytes: Double
}

object SizeBytes {
  @scala.inline
  def apply(Mode: Double, SizeBytes: Double): SizeBytes = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], SizeBytes = SizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeBytes]
  }
}

