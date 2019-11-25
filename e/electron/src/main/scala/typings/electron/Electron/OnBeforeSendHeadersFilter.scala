package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeSendHeadersFilter extends js.Object {
  /**
    * Array of URL patterns that will be used to filter out the requests that do not
    * match the URL patterns.
    */
  var urls: js.Array[String]
}

object OnBeforeSendHeadersFilter {
  @scala.inline
  def apply(urls: js.Array[String]): OnBeforeSendHeadersFilter = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnBeforeSendHeadersFilter]
  }
}

