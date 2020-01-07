package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AdministratorWebTokenSpecPlaySearch extends js.Object {
  /**
    * Allow access to the iframe in approve mode. Default is false.
    */
  var approveApps: js.UndefOr[Boolean] = js.native
  /**
    * Whether the managed Play Search apps page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object Schema$AdministratorWebTokenSpecPlaySearch {
  @scala.inline
  def apply(approveApps: js.UndefOr[Boolean] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined): Schema$AdministratorWebTokenSpecPlaySearch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(approveApps)) __obj.updateDynamic("approveApps")(approveApps.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AdministratorWebTokenSpecPlaySearch]
  }
}

