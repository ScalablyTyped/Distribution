package typings.gapiDotClientDotPartners.gapi.client.partners

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogMessageRequest extends js.Object {
  /** Map of client info, such as URL, browser navigator, browser platform, etc. */
  var clientInfo: js.UndefOr[Record[String, String]] = js.undefined
  /** Details about the client message. */
  var details: js.UndefOr[String] = js.undefined
  /** Message level of client message. */
  var level: js.UndefOr[String] = js.undefined
  /** Current request metadata. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.undefined
}

object LogMessageRequest {
  @scala.inline
  def apply(
    clientInfo: Record[String, String] = null,
    details: String = null,
    level: String = null,
    requestMetadata: RequestMetadata = null
  ): LogMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (clientInfo != null) __obj.updateDynamic("clientInfo")(clientInfo.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (requestMetadata != null) __obj.updateDynamic("requestMetadata")(requestMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogMessageRequest]
  }
}

