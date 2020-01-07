package typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration used for Asset Discovery runs.
  */
@js.native
trait Schema$AssetDiscoveryConfig extends js.Object {
  /**
    * The mode to use for filtering asset discovery.
    */
  var inclusionMode: js.UndefOr[String] = js.native
  /**
    * The project ids to use for filtering asset discovery.
    */
  var projectIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$AssetDiscoveryConfig {
  @scala.inline
  def apply(inclusionMode: String = null, projectIds: js.Array[String] = null): Schema$AssetDiscoveryConfig = {
    val __obj = js.Dynamic.literal()
    if (inclusionMode != null) __obj.updateDynamic("inclusionMode")(inclusionMode.asInstanceOf[js.Any])
    if (projectIds != null) __obj.updateDynamic("projectIds")(projectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AssetDiscoveryConfig]
  }
}

