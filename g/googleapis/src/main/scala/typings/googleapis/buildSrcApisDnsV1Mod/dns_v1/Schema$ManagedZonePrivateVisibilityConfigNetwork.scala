package typings.googleapis.buildSrcApisDnsV1Mod.dns_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ManagedZonePrivateVisibilityConfigNetwork extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePrivateVisibilityConfigNetwork&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var networkUrl: js.UndefOr[String] = js.native
}

object Schema$ManagedZonePrivateVisibilityConfigNetwork {
  @scala.inline
  def apply(kind: String = null, networkUrl: String = null): Schema$ManagedZonePrivateVisibilityConfigNetwork = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (networkUrl != null) __obj.updateDynamic("networkUrl")(networkUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedZonePrivateVisibilityConfigNetwork]
  }
}

