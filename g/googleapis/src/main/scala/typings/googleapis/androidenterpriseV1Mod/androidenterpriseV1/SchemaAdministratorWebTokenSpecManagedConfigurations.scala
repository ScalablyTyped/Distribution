package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAdministratorWebTokenSpecManagedConfigurations extends js.Object {
  /**
    * Whether the Managed Configuration page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaAdministratorWebTokenSpecManagedConfigurations {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SchemaAdministratorWebTokenSpecManagedConfigurations = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpecManagedConfigurations]
  }
}

