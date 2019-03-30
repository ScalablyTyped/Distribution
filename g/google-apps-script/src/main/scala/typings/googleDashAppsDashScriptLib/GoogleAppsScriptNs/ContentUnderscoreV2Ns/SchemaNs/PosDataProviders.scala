package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosDataProviders extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var posDataProviders: js.UndefOr[js.Array[PosDataProvidersPosDataProvider]] = js.undefined
}

object PosDataProviders {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    posDataProviders: js.Array[PosDataProvidersPosDataProvider] = null
  ): PosDataProviders = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (posDataProviders != null) __obj.updateDynamic("posDataProviders")(posDataProviders)
    __obj.asInstanceOf[PosDataProviders]
  }
}

