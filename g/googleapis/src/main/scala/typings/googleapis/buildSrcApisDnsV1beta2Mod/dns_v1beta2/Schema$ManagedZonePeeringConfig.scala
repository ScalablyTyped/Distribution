package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ManagedZonePeeringConfig extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePeeringConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var targetNetwork: js.UndefOr[Schema$ManagedZonePeeringConfigTargetNetwork] = js.native
}

object Schema$ManagedZonePeeringConfig {
  @scala.inline
  def apply(kind: String = null, targetNetwork: Schema$ManagedZonePeeringConfigTargetNetwork = null): Schema$ManagedZonePeeringConfig = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (targetNetwork != null) __obj.updateDynamic("targetNetwork")(targetNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedZonePeeringConfig]
  }
}

