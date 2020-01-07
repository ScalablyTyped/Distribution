package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PosDataProvidersPosDataProvider extends js.Object {
  /**
    * The display name of Pos data Provider.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The full name of this POS data Provider.
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * The ID of the account.
    */
  var providerId: js.UndefOr[String] = js.native
}

object Schema$PosDataProvidersPosDataProvider {
  @scala.inline
  def apply(displayName: String = null, fullName: String = null, providerId: String = null): Schema$PosDataProvidersPosDataProvider = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (providerId != null) __obj.updateDynamic("providerId")(providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PosDataProvidersPosDataProvider]
  }
}

