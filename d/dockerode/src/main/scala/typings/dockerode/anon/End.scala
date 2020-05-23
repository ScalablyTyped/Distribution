package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var End: String
  var ExitCode: Double
  var Output: String
  var Start: String
}

object End {
  @scala.inline
  def apply(End: String, ExitCode: Double, Output: String, Start: String): End = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], ExitCode = ExitCode.asInstanceOf[js.Any], Output = Output.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

