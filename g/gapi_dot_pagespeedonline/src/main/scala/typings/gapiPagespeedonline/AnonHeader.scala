package typings.gapiPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeader extends js.Object {
  /**
    * Heading to be displayed with the list of URLs.
    */
  var header: AnonArgs
  /**
    * List of entries that provide information about URLs in the URL block. Optional.
    */
  var urls: js.Array[AnonDetails]
}

object AnonHeader {
  @scala.inline
  def apply(header: AnonArgs, urls: js.Array[AnonDetails]): AnonHeader = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeader]
  }
}

