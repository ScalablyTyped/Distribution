package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.Array[String]
  var command: String
  var opts: js.Any
}

object Args {
  @scala.inline
  def apply(args: js.Array[String], command: String, opts: js.Any): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

