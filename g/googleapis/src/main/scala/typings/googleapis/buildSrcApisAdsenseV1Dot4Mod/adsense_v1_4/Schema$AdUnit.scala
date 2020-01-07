package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.googleapis.Anon_AdPosition
import typings.googleapis.Anon_BackupOption
import typings.googleapis.Anon_MarkupLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AdUnit extends js.Object {
  /**
    * Identity code of this ad unit, not necessarily unique across ad clients.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Settings specific to content ads (AFC) and highend mobile content ads
    * (AFMC - deprecated).
    */
  var contentAdsSettings: js.UndefOr[Anon_BackupOption] = js.native
  /**
    * Custom style information specific to this ad unit.
    */
  var customStyle: js.UndefOr[Schema$AdStyle] = js.native
  /**
    * Settings specific to feed ads (AFF) - deprecated.
    */
  var feedAdsSettings: js.UndefOr[Anon_AdPosition] = js.native
  /**
    * Unique identifier of this ad unit. This should be considered an opaque
    * identifier; it is not safe to rely on it being in any particular format.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is, in this case adsense#adUnit.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Settings specific to WAP mobile content ads (AFMC) - deprecated.
    */
  var mobileContentAdsSettings: js.UndefOr[Anon_MarkupLanguage] = js.native
  /**
    * Name of this ad unit.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * ID of the saved ad style which holds this ad unit&#39;s style
    * information.
    */
  var savedStyleId: js.UndefOr[String] = js.native
  /**
    * Status of this ad unit. Possible values are: NEW: Indicates that the ad
    * unit was created within the last seven days and does not yet have any
    * activity associated with it.  ACTIVE: Indicates that there has been
    * activity on this ad unit in the last seven days.  INACTIVE: Indicates
    * that there has been no activity on this ad unit in the last seven days.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$AdUnit {
  @scala.inline
  def apply(
    code: String = null,
    contentAdsSettings: Anon_BackupOption = null,
    customStyle: Schema$AdStyle = null,
    feedAdsSettings: Anon_AdPosition = null,
    id: String = null,
    kind: String = null,
    mobileContentAdsSettings: Anon_MarkupLanguage = null,
    name: String = null,
    savedStyleId: String = null,
    status: String = null
  ): Schema$AdUnit = {
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
    __obj.asInstanceOf[Schema$AdUnit]
  }
}

