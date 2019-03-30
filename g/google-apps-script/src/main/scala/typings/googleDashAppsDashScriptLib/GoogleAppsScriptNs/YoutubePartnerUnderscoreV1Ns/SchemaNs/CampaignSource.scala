package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignSource extends js.Object {
  var sourceType: js.UndefOr[java.lang.String] = js.undefined
  var sourceValue: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object CampaignSource {
  @scala.inline
  def apply(sourceType: java.lang.String = null, sourceValue: js.Array[java.lang.String] = null): CampaignSource = {
    val __obj = js.Dynamic.literal()
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    if (sourceValue != null) __obj.updateDynamic("sourceValue")(sourceValue)
    __obj.asInstanceOf[CampaignSource]
  }
}

