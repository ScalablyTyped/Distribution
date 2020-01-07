package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiasettingsListPosDataProvidersResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsListPosDataProvidersResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The list of POS data providers for each eligible country
    */
  var posDataProviders: js.UndefOr[js.Array[Schema$PosDataProviders]] = js.native
}

object Schema$LiasettingsListPosDataProvidersResponse {
  @scala.inline
  def apply(kind: String = null, posDataProviders: js.Array[Schema$PosDataProviders] = null): Schema$LiasettingsListPosDataProvidersResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (posDataProviders != null) __obj.updateDynamic("posDataProviders")(posDataProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiasettingsListPosDataProvidersResponse]
  }
}

