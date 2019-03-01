package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeSendHeadersFilter extends js.Object {
  /**
    * Array of URL patterns that will be used to filter out the requests that do not
    * match the URL patterns.
    */
  var urls: js.Array[java.lang.String]
}

object OnBeforeSendHeadersFilter {
  @scala.inline
  def apply(urls: js.Array[java.lang.String]): OnBeforeSendHeadersFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[OnBeforeSendHeadersFilter]
  }
}

