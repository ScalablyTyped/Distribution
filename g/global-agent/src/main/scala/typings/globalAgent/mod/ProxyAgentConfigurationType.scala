package typings.globalAgent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyAgentConfigurationType extends js.Object {
  val HTTPS_PROXY: String | Null
  val HTTP_PROXY: String | Null
  val NO_PROXY: String | Null
}

object ProxyAgentConfigurationType {
  @scala.inline
  def apply(HTTPS_PROXY: String = null, HTTP_PROXY: String = null, NO_PROXY: String = null): ProxyAgentConfigurationType = {
    val __obj = js.Dynamic.literal()
    if (HTTPS_PROXY != null) __obj.updateDynamic("HTTPS_PROXY")(HTTPS_PROXY.asInstanceOf[js.Any])
    if (HTTP_PROXY != null) __obj.updateDynamic("HTTP_PROXY")(HTTP_PROXY.asInstanceOf[js.Any])
    if (NO_PROXY != null) __obj.updateDynamic("NO_PROXY")(NO_PROXY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyAgentConfigurationType]
  }
}

