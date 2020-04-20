package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var End: String
  var ExitCode: Double
  var Output: String
  var Start: String
}

object AnonEnd {
  @scala.inline
  def apply(End: String, ExitCode: Double, Output: String, Start: String): AnonEnd = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], ExitCode = ExitCode.asInstanceOf[js.Any], Output = Output.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

