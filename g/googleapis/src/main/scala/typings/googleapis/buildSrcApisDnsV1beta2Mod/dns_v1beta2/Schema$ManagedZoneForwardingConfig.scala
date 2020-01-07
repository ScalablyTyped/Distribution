package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ManagedZoneForwardingConfig extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneForwardingConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var targetNameServers: js.UndefOr[js.Array[Schema$ManagedZoneForwardingConfigNameServerTarget]] = js.native
}

object Schema$ManagedZoneForwardingConfig {
  @scala.inline
  def apply(
    kind: String = null,
    targetNameServers: js.Array[Schema$ManagedZoneForwardingConfigNameServerTarget] = null
  ): Schema$ManagedZoneForwardingConfig = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (targetNameServers != null) __obj.updateDynamic("targetNameServers")(targetNameServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedZoneForwardingConfig]
  }
}

