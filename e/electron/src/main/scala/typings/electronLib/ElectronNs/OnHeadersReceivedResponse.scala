package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHeadersReceivedResponse extends js.Object {
  var cancel: scala.Boolean
  /**
    * When provided, the server is assumed to have responded with these headers.
    */
  var responseHeaders: js.UndefOr[ResponseHeaders] = js.undefined
  /**
    * Should be provided when overriding responseHeaders to change header status
    * otherwise original response header's status will be used.
    */
  var statusLine: js.UndefOr[java.lang.String] = js.undefined
}

