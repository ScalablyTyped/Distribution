package typings.diagnosticChannelPublishers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.Array[_]
  var text: String
}

object Args {
  @scala.inline
  def apply(args: js.Array[_], text: String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

