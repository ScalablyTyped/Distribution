package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeSendHeadersResponse extends js.Object {
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When provided, request will be made with these headers.
    */
  var requestHeaders: js.UndefOr[RequestHeaders] = js.undefined
}

