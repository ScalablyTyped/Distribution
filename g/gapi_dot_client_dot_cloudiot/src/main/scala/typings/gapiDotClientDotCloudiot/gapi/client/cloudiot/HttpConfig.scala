package typings.gapiDotClientDotCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpConfig extends js.Object {
  /**
    * If enabled, allows devices to use DeviceService via the HTTP protocol.
    * Otherwise, any requests to DeviceService will fail for this registry.
    */
  var httpEnabledState: js.UndefOr[String] = js.undefined
}

object HttpConfig {
  @scala.inline
  def apply(httpEnabledState: String = null): HttpConfig = {
    val __obj = js.Dynamic.literal()
    if (httpEnabledState != null) __obj.updateDynamic("httpEnabledState")(httpEnabledState.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpConfig]
  }
}

