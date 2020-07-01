package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAdministratorWebTokenSpecPrivateApps extends js.Object {
  /**
    * Whether the Private Apps page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaAdministratorWebTokenSpecPrivateApps {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SchemaAdministratorWebTokenSpecPrivateApps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpecPrivateApps]
  }
}

