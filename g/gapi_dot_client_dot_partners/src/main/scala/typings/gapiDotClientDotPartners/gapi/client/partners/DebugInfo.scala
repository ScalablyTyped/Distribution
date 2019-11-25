package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugInfo extends js.Object {
  /** Info about the server that serviced this request. */
  var serverInfo: js.UndefOr[String] = js.undefined
  /** Server-side debug stack trace. */
  var serverTraceInfo: js.UndefOr[String] = js.undefined
  /** URL of the service that handled this request. */
  var serviceUrl: js.UndefOr[String] = js.undefined
}

object DebugInfo {
  @scala.inline
  def apply(serverInfo: String = null, serverTraceInfo: String = null, serviceUrl: String = null): DebugInfo = {
    val __obj = js.Dynamic.literal()
    if (serverInfo != null) __obj.updateDynamic("serverInfo")(serverInfo.asInstanceOf[js.Any])
    if (serverTraceInfo != null) __obj.updateDynamic("serverTraceInfo")(serverTraceInfo.asInstanceOf[js.Any])
    if (serviceUrl != null) __obj.updateDynamic("serviceUrl")(serviceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugInfo]
  }
}

