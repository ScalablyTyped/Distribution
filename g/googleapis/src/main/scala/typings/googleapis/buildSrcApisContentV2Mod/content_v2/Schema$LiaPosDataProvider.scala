package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiaPosDataProvider extends js.Object {
  /**
    * The ID of the POS data provider.
    */
  var posDataProviderId: js.UndefOr[String] = js.native
  /**
    * The account ID by which this merchant is known to the POS data provider.
    */
  var posExternalAccountId: js.UndefOr[String] = js.native
}

object Schema$LiaPosDataProvider {
  @scala.inline
  def apply(posDataProviderId: String = null, posExternalAccountId: String = null): Schema$LiaPosDataProvider = {
    val __obj = js.Dynamic.literal()
    if (posDataProviderId != null) __obj.updateDynamic("posDataProviderId")(posDataProviderId.asInstanceOf[js.Any])
    if (posExternalAccountId != null) __obj.updateDynamic("posExternalAccountId")(posExternalAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiaPosDataProvider]
  }
}

