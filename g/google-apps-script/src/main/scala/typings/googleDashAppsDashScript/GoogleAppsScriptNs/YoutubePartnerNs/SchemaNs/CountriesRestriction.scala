package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesRestriction extends js.Object {
  var adFormats: js.UndefOr[js.Array[String]] = js.undefined
  var territories: js.UndefOr[js.Array[String]] = js.undefined
}

object CountriesRestriction {
  @scala.inline
  def apply(adFormats: js.Array[String] = null, territories: js.Array[String] = null): CountriesRestriction = {
    val __obj = js.Dynamic.literal()
    if (adFormats != null) __obj.updateDynamic("adFormats")(adFormats)
    if (territories != null) __obj.updateDynamic("territories")(territories)
    __obj.asInstanceOf[CountriesRestriction]
  }
}

