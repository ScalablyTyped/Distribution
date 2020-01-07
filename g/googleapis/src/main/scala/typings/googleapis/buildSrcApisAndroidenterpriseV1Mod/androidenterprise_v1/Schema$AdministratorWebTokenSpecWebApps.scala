package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AdministratorWebTokenSpecWebApps extends js.Object {
  /**
    * Whether the Web Apps page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object Schema$AdministratorWebTokenSpecWebApps {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): Schema$AdministratorWebTokenSpecWebApps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AdministratorWebTokenSpecWebApps]
  }
}

