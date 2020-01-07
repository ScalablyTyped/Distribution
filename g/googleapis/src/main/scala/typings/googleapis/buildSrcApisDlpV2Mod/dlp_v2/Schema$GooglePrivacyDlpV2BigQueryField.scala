package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message defining a field of a BigQuery table.
  */
@js.native
trait Schema$GooglePrivacyDlpV2BigQueryField extends js.Object {
  /**
    * Designated field in the BigQuery table.
    */
  var field: js.UndefOr[Schema$GooglePrivacyDlpV2FieldId] = js.native
  /**
    * Source table of the field.
    */
  var table: js.UndefOr[Schema$GooglePrivacyDlpV2BigQueryTable] = js.native
}

object Schema$GooglePrivacyDlpV2BigQueryField {
  @scala.inline
  def apply(
    field: Schema$GooglePrivacyDlpV2FieldId = null,
    table: Schema$GooglePrivacyDlpV2BigQueryTable = null
  ): Schema$GooglePrivacyDlpV2BigQueryField = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2BigQueryField]
  }
}

