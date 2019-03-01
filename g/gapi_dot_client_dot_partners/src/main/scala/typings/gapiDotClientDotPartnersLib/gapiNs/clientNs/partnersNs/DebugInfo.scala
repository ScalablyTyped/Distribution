package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugInfo extends js.Object {
  /** Info about the server that serviced this request. */
  var serverInfo: js.UndefOr[java.lang.String] = js.undefined
  /** Server-side debug stack trace. */
  var serverTraceInfo: js.UndefOr[java.lang.String] = js.undefined
  /** URL of the service that handled this request. */
  var serviceUrl: js.UndefOr[java.lang.String] = js.undefined
}

object DebugInfo {
  @scala.inline
  def apply(
    serverInfo: java.lang.String = null,
    serverTraceInfo: java.lang.String = null,
    serviceUrl: java.lang.String = null
  ): DebugInfo = {
    val __obj = js.Dynamic.literal()
    if (serverInfo != null) __obj.updateDynamic("serverInfo")(serverInfo)
    if (serverTraceInfo != null) __obj.updateDynamic("serverTraceInfo")(serverTraceInfo)
    if (serviceUrl != null) __obj.updateDynamic("serviceUrl")(serviceUrl)
    __obj.asInstanceOf[DebugInfo]
  }
}

