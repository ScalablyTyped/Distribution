package typings.gapiPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetails extends js.Object {
  /**
    * List of entries that provide additional details about a single URL. Optional.
    */
  var details: js.Array[AnonArgs]
  /**
    * A format string that gives information about the URL, and a list of arguments for that format string.
    */
  var result: AnonArgs
}

object AnonDetails {
  @scala.inline
  def apply(details: js.Array[AnonArgs], result: AnonArgs): AnonDetails = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetails]
  }
}

