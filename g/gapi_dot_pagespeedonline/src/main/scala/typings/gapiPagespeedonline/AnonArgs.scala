package typings.gapiPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  /**
    * List of arguments for the format string.
    */
  var args: js.Array[AnonType]
  /**
    * A localized format string with $N placeholders, where N is the 1-indexed argument number.
    */
  var format: String
}

object AnonArgs {
  @scala.inline
  def apply(args: js.Array[AnonType], format: String): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgs]
  }
}

