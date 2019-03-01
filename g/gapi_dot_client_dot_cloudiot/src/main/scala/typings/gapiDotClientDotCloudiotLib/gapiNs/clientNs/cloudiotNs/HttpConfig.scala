package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpConfig extends js.Object {
  /**
    * If enabled, allows devices to use DeviceService via the HTTP protocol.
    * Otherwise, any requests to DeviceService will fail for this registry.
    */
  var httpEnabledState: js.UndefOr[java.lang.String] = js.undefined
}

object HttpConfig {
  @scala.inline
  def apply(httpEnabledState: java.lang.String = null): HttpConfig = {
    val __obj = js.Dynamic.literal()
    if (httpEnabledState != null) __obj.updateDynamic("httpEnabledState")(httpEnabledState)
    __obj.asInstanceOf[HttpConfig]
  }
}

