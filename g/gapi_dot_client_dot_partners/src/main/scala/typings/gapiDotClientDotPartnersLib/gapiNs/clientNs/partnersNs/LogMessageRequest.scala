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

object LogMessageRequest {
  @scala.inline
  def apply(
    clientInfo: stdLib.Record[java.lang.String, java.lang.String] = null,
    details: java.lang.String = null,
    level: java.lang.String = null,
    requestMetadata: RequestMetadata = null
  ): LogMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (clientInfo != null) __obj.updateDynamic("clientInfo")(clientInfo)
    if (details != null) __obj.updateDynamic("details")(details)
    if (level != null) __obj.updateDynamic("level")(level)
    if (requestMetadata != null) __obj.updateDynamic("requestMetadata")(requestMetadata)
    __obj.asInstanceOf[LogMessageRequest]
  }
}

