package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAdministratorWebTokenSpecWebApps extends js.Object {
  /**
    * Whether the Web Apps page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaAdministratorWebTokenSpecWebApps {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SchemaAdministratorWebTokenSpecWebApps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpecWebApps]
  }
}

