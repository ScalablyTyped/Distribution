package typings.gapiDotClientDotAdsensehost.gapi.client.adsensehost

import typings.gapiDotClientDotAdsensehost.Anon_BackupOption
import typings.gapiDotClientDotAdsensehost.Anon_MarkupLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnit extends js.Object {
  /** Identity code of this ad unit, not necessarily unique across ad clients. */
  var code: js.UndefOr[String] = js.undefined
  /** Settings specific to content ads (AFC) and highend mobile content ads (AFMC - deprecated). */
  var contentAdsSettings: js.UndefOr[Anon_BackupOption] = js.undefined
  /** Custom style information specific to this ad unit. */
  var customStyle: js.UndefOr[AdStyle] = js.undefined
  /** Unique identifier of this ad unit. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[String] = js.undefined
  /** Kind of resource this is, in this case adsensehost#adUnit. */
  var kind: js.UndefOr[String] = js.undefined
  /** Settings specific to WAP mobile content ads (AFMC - deprecated). */
  var mobileContentAdsSettings: js.UndefOr[Anon_MarkupLanguage] = js.undefined
  /** Name of this ad unit. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Status of this ad unit. Possible values are:
    * NEW: Indicates that the ad unit was created within the last seven days and does not yet have any activity associated with it.
    *
    * ACTIVE: Indicates that there has been activity on this ad unit in the last seven days.
    *
    * INACTIVE: Indicates that there has been no activity on this ad unit in the last seven days.
    */
  var status: js.UndefOr[String] = js.undefined
}

object AdUnit {
  @scala.inline
  def apply(
    code: String = null,
    contentAdsSettings: Anon_BackupOption = null,
    customStyle: AdStyle = null,
    id: String = null,
    kind: String = null,
    mobileContentAdsSettings: Anon_MarkupLanguage = null,
    name: String = null,
    status: String = null
  ): AdUnit = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (contentAdsSettings != null) __obj.updateDynamic("contentAdsSettings")(contentAdsSettings)
    if (customStyle != null) __obj.updateDynamic("customStyle")(customStyle)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (mobileContentAdsSettings != null) __obj.updateDynamic("mobileContentAdsSettings")(mobileContentAdsSettings)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[AdUnit]
  }
}

