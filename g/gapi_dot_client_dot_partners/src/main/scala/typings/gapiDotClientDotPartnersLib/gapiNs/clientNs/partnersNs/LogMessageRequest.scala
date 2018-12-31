package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogMessageRequest extends js.Object {
  /** Map of client info, such as URL, browser navigator, browser platform, etc. */
  var clientInfo: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** Details about the client message. */
  var details: js.UndefOr[java.lang.String] = js.undefined
  /** Message level of client message. */
  var level: js.UndefOr[java.lang.String] = js.undefined
  /** Current request metadata. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.undefined
}

