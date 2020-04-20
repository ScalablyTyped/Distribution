package typings.diagnosticChannelPublishers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: js.Array[_]
  var text: String
}

object AnonArgs {
  @scala.inline
  def apply(args: js.Array[_], text: String): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

