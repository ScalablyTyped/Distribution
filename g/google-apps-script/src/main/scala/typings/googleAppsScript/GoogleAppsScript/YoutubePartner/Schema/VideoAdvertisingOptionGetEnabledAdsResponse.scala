package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAdvertisingOptionGetEnabledAdsResponse extends js.Object {
  var adBreaks: js.UndefOr[js.Array[AdBreak]] = js.undefined
  var adsOnEmbeds: js.UndefOr[Boolean] = js.undefined
  var countriesRestriction: js.UndefOr[js.Array[CountriesRestriction]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object VideoAdvertisingOptionGetEnabledAdsResponse {
  @scala.inline
  def apply(
    adBreaks: js.Array[AdBreak] = null,
    adsOnEmbeds: js.UndefOr[Boolean] = js.undefined,
    countriesRestriction: js.Array[CountriesRestriction] = null,
    id: String = null,
    kind: String = null
  ): VideoAdvertisingOptionGetEnabledAdsResponse = {
    val __obj = js.Dynamic.literal()
    if (adBreaks != null) __obj.updateDynamic("adBreaks")(adBreaks.asInstanceOf[js.Any])
    if (!js.isUndefined(adsOnEmbeds)) __obj.updateDynamic("adsOnEmbeds")(adsOnEmbeds.asInstanceOf[js.Any])
    if (countriesRestriction != null) __obj.updateDynamic("countriesRestriction")(countriesRestriction.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoAdvertisingOptionGetEnabledAdsResponse]
  }
}

