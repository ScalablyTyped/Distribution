package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for a StoredInfoType.
  */
@js.native
trait Schema$GooglePrivacyDlpV2StoredInfoTypeConfig extends js.Object {
  /**
    * Description of the StoredInfoType (max 256 characters).
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Display name of the StoredInfoType (max 256 characters).
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * StoredInfoType where findings are defined by a dictionary of phrases.
    */
  var largeCustomDictionary: js.UndefOr[Schema$GooglePrivacyDlpV2LargeCustomDictionaryConfig] = js.native
}

object Schema$GooglePrivacyDlpV2StoredInfoTypeConfig {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    largeCustomDictionary: Schema$GooglePrivacyDlpV2LargeCustomDictionaryConfig = null
  ): Schema$GooglePrivacyDlpV2StoredInfoTypeConfig = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (largeCustomDictionary != null) __obj.updateDynamic("largeCustomDictionary")(largeCustomDictionary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2StoredInfoTypeConfig]
  }
}

