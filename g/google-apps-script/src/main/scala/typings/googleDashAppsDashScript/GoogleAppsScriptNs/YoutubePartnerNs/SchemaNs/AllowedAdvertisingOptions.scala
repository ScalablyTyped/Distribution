package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowedAdvertisingOptions extends js.Object {
  var adsOnEmbeds: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var licAdFormats: js.UndefOr[js.Array[String]] = js.undefined
  var ugcAdFormats: js.UndefOr[js.Array[String]] = js.undefined
}

object AllowedAdvertisingOptions {
  @scala.inline
  def apply(
    adsOnEmbeds: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    licAdFormats: js.Array[String] = null,
    ugcAdFormats: js.Array[String] = null
  ): AllowedAdvertisingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adsOnEmbeds)) __obj.updateDynamic("adsOnEmbeds")(adsOnEmbeds)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (licAdFormats != null) __obj.updateDynamic("licAdFormats")(licAdFormats)
    if (ugcAdFormats != null) __obj.updateDynamic("ugcAdFormats")(ugcAdFormats)
    __obj.asInstanceOf[AllowedAdvertisingOptions]
  }
}

