package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PosDataProviders extends js.Object {
  /**
    * Country code.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * A list of POS data providers.
    */
  var posDataProviders: js.UndefOr[js.Array[Schema$PosDataProvidersPosDataProvider]] = js.native
}

object Schema$PosDataProviders {
  @scala.inline
  def apply(country: String = null, posDataProviders: js.Array[Schema$PosDataProvidersPosDataProvider] = null): Schema$PosDataProviders = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (posDataProviders != null) __obj.updateDynamic("posDataProviders")(posDataProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PosDataProviders]
  }
}

