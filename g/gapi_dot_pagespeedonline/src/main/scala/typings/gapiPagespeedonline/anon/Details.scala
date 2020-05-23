package typings.gapiPagespeedonline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  /**
    * List of entries that provide additional details about a single URL. Optional.
    */
  var details: js.Array[Args]
  /**
    * A format string that gives information about the URL, and a list of arguments for that format string.
    */
  var result: Args
}

object Details {
  @scala.inline
  def apply(details: js.Array[Args], result: Args): Details = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
}

