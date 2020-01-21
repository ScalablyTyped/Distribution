package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration of the HTTP bridge for a device registry.
  */
@js.native
trait SchemaHttpConfig extends js.Object {
  /**
    * If enabled, allows devices to use DeviceService via the HTTP protocol.
    * Otherwise, any requests to DeviceService will fail for this registry.
    */
  var httpEnabledState: js.UndefOr[String] = js.native
}

object SchemaHttpConfig {
  @scala.inline
  def apply(httpEnabledState: String = null): SchemaHttpConfig = {
    val __obj = js.Dynamic.literal()
    if (httpEnabledState != null) __obj.updateDynamic("httpEnabledState")(httpEnabledState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHttpConfig]
  }
}

