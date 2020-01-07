package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Version of a StoredInfoType, including the configuration used to build it,
  * create timestamp, and current state.
  */
@js.native
trait Schema$GooglePrivacyDlpV2StoredInfoTypeVersion extends js.Object {
  /**
    * StoredInfoType configuration.
    */
  var config: js.UndefOr[Schema$GooglePrivacyDlpV2StoredInfoTypeConfig] = js.native
  /**
    * Create timestamp of the version. Read-only, determined by the system when
    * the version is created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Errors that occurred when creating this storedInfoType version, or
    * anomalies detected in the storedInfoType data that render it unusable.
    * Only the five most recent errors will be displayed, with the most recent
    * error appearing first. &lt;p&gt;For example, some of the data for stored
    * custom dictionaries is put in the user&#39;s Google Cloud Storage bucket,
    * and if this data is modified or deleted by the user or another system,
    * the dictionary becomes invalid. &lt;p&gt;If any errors occur, fix the
    * problem indicated by the error message and use the UpdateStoredInfoType
    * API method to create another version of the storedInfoType to continue
    * using it, reusing the same `config` if it was not the source of the
    * error.
    */
  var errors: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2Error]] = js.native
  /**
    * Stored info type version state. Read-only, updated by the system during
    * dictionary creation.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2StoredInfoTypeVersion {
  @scala.inline
  def apply(
    config: Schema$GooglePrivacyDlpV2StoredInfoTypeConfig = null,
    createTime: String = null,
    errors: js.Array[Schema$GooglePrivacyDlpV2Error] = null,
    state: String = null
  ): Schema$GooglePrivacyDlpV2StoredInfoTypeVersion = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2StoredInfoTypeVersion]
  }
}

