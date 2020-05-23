package typings.gapiPagespeedonline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  /**
    * Heading to be displayed with the list of URLs.
    */
  var header: Args
  /**
    * List of entries that provide information about URLs in the URL block. Optional.
    */
  var urls: js.Array[Details]
}

object Header {
  @scala.inline
  def apply(header: Args, urls: js.Array[Details]): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

