package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnit extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var contentAdsSettings: js.UndefOr[AdUnitContentAdsSettings] = js.undefined
  var customStyle: js.UndefOr[AdStyle] = js.undefined
  var feedAdsSettings: js.UndefOr[AdUnitFeedAdsSettings] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var mobileContentAdsSettings: js.UndefOr[AdUnitMobileContentAdsSettings] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var savedStyleId: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object AdUnit {
  @scala.inline
  def apply(
    code: String = null,
    contentAdsSettings: AdUnitContentAdsSettings = null,
    customStyle: AdStyle = null,
    feedAdsSettings: AdUnitFeedAdsSettings = null,
    id: String = null,
    kind: String = null,
    mobileContentAdsSettings: AdUnitMobileContentAdsSettings = null,
    name: String = null,
    savedStyleId: String = null,
    status: String = null
  ): AdUnit = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contentAdsSettings != null) __obj.updateDynamic("contentAdsSettings")(contentAdsSettings.asInstanceOf[js.Any])
    if (customStyle != null) __obj.updateDynamic("customStyle")(customStyle.asInstanceOf[js.Any])
    if (feedAdsSettings != null) __obj.updateDynamic("feedAdsSettings")(feedAdsSettings.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mobileContentAdsSettings != null) __obj.updateDynamic("mobileContentAdsSettings")(mobileContentAdsSettings.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (savedStyleId != null) __obj.updateDynamic("savedStyleId")(savedStyleId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdUnit]
  }
}

