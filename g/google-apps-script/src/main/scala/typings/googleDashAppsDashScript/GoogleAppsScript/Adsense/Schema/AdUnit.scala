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
    if (code != null) __obj.updateDynamic("code")(code)
    if (contentAdsSettings != null) __obj.updateDynamic("contentAdsSettings")(contentAdsSettings)
    if (customStyle != null) __obj.updateDynamic("customStyle")(customStyle)
    if (feedAdsSettings != null) __obj.updateDynamic("feedAdsSettings")(feedAdsSettings)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (mobileContentAdsSettings != null) __obj.updateDynamic("mobileContentAdsSettings")(mobileContentAdsSettings)
    if (name != null) __obj.updateDynamic("name")(name)
    if (savedStyleId != null) __obj.updateDynamic("savedStyleId")(savedStyleId)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[AdUnit]
  }
}

