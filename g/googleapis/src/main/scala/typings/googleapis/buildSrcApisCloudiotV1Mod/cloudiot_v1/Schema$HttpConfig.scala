package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration of the HTTP bridge for a device registry.
  */
@js.native
trait Schema$HttpConfig extends js.Object {
  /**
    * If enabled, allows devices to use DeviceService via the HTTP protocol.
    * Otherwise, any requests to DeviceService will fail for this registry.
    */
  var httpEnabledState: js.UndefOr[String] = js.native
}

object Schema$HttpConfig {
  @scala.inline
  def apply(httpEnabledState: String = null): Schema$HttpConfig = {
    val __obj = js.Dynamic.literal()
    if (httpEnabledState != null) __obj.updateDynamic("httpEnabledState")(httpEnabledState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HttpConfig]
  }
}

