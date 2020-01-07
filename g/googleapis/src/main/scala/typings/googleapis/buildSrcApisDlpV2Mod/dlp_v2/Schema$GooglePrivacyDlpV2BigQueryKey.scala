package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Row key for identifying a record in BigQuery table.
  */
@js.native
trait Schema$GooglePrivacyDlpV2BigQueryKey extends js.Object {
  /**
    * Absolute number of the row from the beginning of the table at the time of
    * scanning.
    */
  var rowNumber: js.UndefOr[String] = js.native
  /**
    * Complete BigQuery table reference.
    */
  var tableReference: js.UndefOr[Schema$GooglePrivacyDlpV2BigQueryTable] = js.native
}

object Schema$GooglePrivacyDlpV2BigQueryKey {
  @scala.inline
  def apply(rowNumber: String = null, tableReference: Schema$GooglePrivacyDlpV2BigQueryTable = null): Schema$GooglePrivacyDlpV2BigQueryKey = {
    val __obj = js.Dynamic.literal()
    if (rowNumber != null) __obj.updateDynamic("rowNumber")(rowNumber.asInstanceOf[js.Any])
    if (tableReference != null) __obj.updateDynamic("tableReference")(tableReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2BigQueryKey]
  }
}

