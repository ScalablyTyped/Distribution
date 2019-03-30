package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnitFeedAdsSettings extends js.Object {
  var adPosition: js.UndefOr[java.lang.String] = js.undefined
  var frequency: js.UndefOr[scala.Double] = js.undefined
  var minimumWordCount: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AdUnitFeedAdsSettings {
  @scala.inline
  def apply(
    adPosition: java.lang.String = null,
    frequency: scala.Int | scala.Double = null,
    minimumWordCount: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): AdUnitFeedAdsSettings = {
    val __obj = js.Dynamic.literal()
    if (adPosition != null) __obj.updateDynamic("adPosition")(adPosition)
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (minimumWordCount != null) __obj.updateDynamic("minimumWordCount")(minimumWordCount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AdUnitFeedAdsSettings]
  }
}

