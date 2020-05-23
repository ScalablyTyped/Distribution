package typings.gapiPagespeedonline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  /**
    * List of arguments for the format string.
    */
  var args: js.Array[Type]
  /**
    * A localized format string with $N placeholders, where N is the 1-indexed argument number.
    */
  var format: String
}

object Args {
  @scala.inline
  def apply(args: js.Array[Type], format: String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

