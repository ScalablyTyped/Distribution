package typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ManagedZoneDnsSecConfig extends js.Object {
  var defaultKeySpecs: js.UndefOr[js.Array[Schema$DnsKeySpec]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneDnsSecConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var nonExistence: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object Schema$ManagedZoneDnsSecConfig {
  @scala.inline
  def apply(
    defaultKeySpecs: js.Array[Schema$DnsKeySpec] = null,
    kind: String = null,
    nonExistence: String = null,
    state: String = null
  ): Schema$ManagedZoneDnsSecConfig = {
    val __obj = js.Dynamic.literal()
    if (defaultKeySpecs != null) __obj.updateDynamic("defaultKeySpecs")(defaultKeySpecs.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nonExistence != null) __obj.updateDynamic("nonExistence")(nonExistence.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedZoneDnsSecConfig]
  }
}

