package typings.gapiDotPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  /**
    * Heading to be displayed with the list of URLs.
    */
  var header: Anon_Args
  /**
    * List of entries that provide information about URLs in the URL block. Optional.
    */
  var urls: js.Array[Anon_Details]
}

object Anon_Header {
  @scala.inline
  def apply(header: Anon_Args, urls: js.Array[Anon_Details]): Anon_Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Header]
  }
}

