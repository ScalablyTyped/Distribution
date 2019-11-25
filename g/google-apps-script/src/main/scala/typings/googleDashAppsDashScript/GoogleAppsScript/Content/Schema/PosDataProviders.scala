package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosDataProviders extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var posDataProviders: js.UndefOr[js.Array[PosDataProvidersPosDataProvider]] = js.undefined
}

object PosDataProviders {
  @scala.inline
  def apply(country: String = null, posDataProviders: js.Array[PosDataProvidersPosDataProvider] = null): PosDataProviders = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (posDataProviders != null) __obj.updateDynamic("posDataProviders")(posDataProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosDataProviders]
  }
}

