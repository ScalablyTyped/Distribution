package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesRestriction extends js.Object {
  var adFormats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var territories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object CountriesRestriction {
  @scala.inline
  def apply(adFormats: js.Array[java.lang.String] = null, territories: js.Array[java.lang.String] = null): CountriesRestriction = {
    val __obj = js.Dynamic.literal()
    if (adFormats != null) __obj.updateDynamic("adFormats")(adFormats)
    if (territories != null) __obj.updateDynamic("territories")(territories)
    __obj.asInstanceOf[CountriesRestriction]
  }
}

