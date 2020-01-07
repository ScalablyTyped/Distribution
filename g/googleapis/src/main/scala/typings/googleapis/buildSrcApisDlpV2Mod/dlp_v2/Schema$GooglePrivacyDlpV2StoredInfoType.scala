package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StoredInfoType resource message that contains information about the current
  * version and any pending updates.
  */
@js.native
trait Schema$GooglePrivacyDlpV2StoredInfoType extends js.Object {
  /**
    * Current version of the stored info type.
    */
  var currentVersion: js.UndefOr[Schema$GooglePrivacyDlpV2StoredInfoTypeVersion] = js.native
  /**
    * Resource name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Pending versions of the stored info type. Empty if no versions are
    * pending.
    */
  var pendingVersions: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2StoredInfoTypeVersion]] = js.native
}

object Schema$GooglePrivacyDlpV2StoredInfoType {
  @scala.inline
  def apply(
    currentVersion: Schema$GooglePrivacyDlpV2StoredInfoTypeVersion = null,
    name: String = null,
    pendingVersions: js.Array[Schema$GooglePrivacyDlpV2StoredInfoTypeVersion] = null
  ): Schema$GooglePrivacyDlpV2StoredInfoType = {
    val __obj = js.Dynamic.literal()
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pendingVersions != null) __obj.updateDynamic("pendingVersions")(pendingVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2StoredInfoType]
  }
}

