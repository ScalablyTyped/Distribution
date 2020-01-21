package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAdministratorWebTokenSpecStoreBuilder extends js.Object {
  /**
    * Whether the Organize apps page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaAdministratorWebTokenSpecStoreBuilder {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SchemaAdministratorWebTokenSpecStoreBuilder = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpecStoreBuilder]
  }
}

