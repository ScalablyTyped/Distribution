package typings.frctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: js.Array[String]
  var command: String
  var opts: js.Any
}

object AnonArgs {
  @scala.inline
  def apply(args: js.Array[String], command: String, opts: js.Any): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

