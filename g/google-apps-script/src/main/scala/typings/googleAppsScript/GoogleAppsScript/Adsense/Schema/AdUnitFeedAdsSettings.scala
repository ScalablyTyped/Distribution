package typings.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnitFeedAdsSettings extends js.Object {
  var adPosition: js.UndefOr[String] = js.undefined
  var frequency: js.UndefOr[Double] = js.undefined
  var minimumWordCount: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AdUnitFeedAdsSettings {
  @scala.inline
  def apply(
    adPosition: String = null,
    frequency: js.UndefOr[Double] = js.undefined,
    minimumWordCount: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): AdUnitFeedAdsSettings = {
    val __obj = js.Dynamic.literal()
    if (adPosition != null) __obj.updateDynamic("adPosition")(adPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumWordCount)) __obj.updateDynamic("minimumWordCount")(minimumWordCount.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdUnitFeedAdsSettings]
  }
}

