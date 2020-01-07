package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of a finding within a row or record.
  */
@js.native
trait Schema$GooglePrivacyDlpV2RecordLocation extends js.Object {
  /**
    * Field id of the field containing the finding.
    */
  var fieldId: js.UndefOr[Schema$GooglePrivacyDlpV2FieldId] = js.native
  /**
    * Key of the finding.
    */
  var recordKey: js.UndefOr[Schema$GooglePrivacyDlpV2RecordKey] = js.native
  /**
    * Location within a `ContentItem.Table`.
    */
  var tableLocation: js.UndefOr[Schema$GooglePrivacyDlpV2TableLocation] = js.native
}

object Schema$GooglePrivacyDlpV2RecordLocation {
  @scala.inline
  def apply(
    fieldId: Schema$GooglePrivacyDlpV2FieldId = null,
    recordKey: Schema$GooglePrivacyDlpV2RecordKey = null,
    tableLocation: Schema$GooglePrivacyDlpV2TableLocation = null
  ): Schema$GooglePrivacyDlpV2RecordLocation = {
    val __obj = js.Dynamic.literal()
    if (fieldId != null) __obj.updateDynamic("fieldId")(fieldId.asInstanceOf[js.Any])
    if (recordKey != null) __obj.updateDynamic("recordKey")(recordKey.asInstanceOf[js.Any])
    if (tableLocation != null) __obj.updateDynamic("tableLocation")(tableLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2RecordLocation]
  }
}

