package typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ManagedZonePrivateVisibilityConfig extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePrivateVisibilityConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var networks: js.UndefOr[js.Array[Schema$ManagedZonePrivateVisibilityConfigNetwork]] = js.native
}

object Schema$ManagedZonePrivateVisibilityConfig {
  @scala.inline
  def apply(kind: String = null, networks: js.Array[Schema$ManagedZonePrivateVisibilityConfigNetwork] = null): Schema$ManagedZonePrivateVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (networks != null) __obj.updateDynamic("networks")(networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedZonePrivateVisibilityConfig]
  }
}

