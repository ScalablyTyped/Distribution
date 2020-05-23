package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

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
    if (!js.isUndefined(adsOnEmbeds)) __obj.updateDynamic("adsOnEmbeds")(adsOnEmbeds.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (licAdFormats != null) __obj.updateDynamic("licAdFormats")(licAdFormats.asInstanceOf[js.Any])
    if (ugcAdFormats != null) __obj.updateDynamic("ugcAdFormats")(ugcAdFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedAdvertisingOptions]
  }
}

