package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options defining BigQuery table and row identifiers.
  */
@js.native
trait Schema$GooglePrivacyDlpV2BigQueryOptions extends js.Object {
  /**
    * References to fields excluded from scanning. This allows you to skip
    * inspection of entire columns which you know have no findings.
    */
  var excludedFields: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2FieldId]] = js.native
  /**
    * References to fields uniquely identifying rows within the table. Nested
    * fields in the format, like `person.birthdate.year`, are allowed.
    */
  var identifyingFields: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2FieldId]] = js.native
  /**
    * Max number of rows to scan. If the table has more rows than this value,
    * the rest of the rows are omitted. If not set, or if set to 0, all rows
    * will be scanned. Only one of rows_limit and rows_limit_percent can be
    * specified. Cannot be used in conjunction with TimespanConfig.
    */
  var rowsLimit: js.UndefOr[String] = js.native
  /**
    * Max percentage of rows to scan. The rest are omitted. The number of rows
    * scanned is rounded down. Must be between 0 and 100, inclusively. Both 0
    * and 100 means no limit. Defaults to 0. Only one of rows_limit and
    * rows_limit_percent can be specified. Cannot be used in conjunction with
    * TimespanConfig.
    */
  var rowsLimitPercent: js.UndefOr[Double] = js.native
  var sampleMethod: js.UndefOr[String] = js.native
  /**
    * Complete BigQuery table reference.
    */
  var tableReference: js.UndefOr[Schema$GooglePrivacyDlpV2BigQueryTable] = js.native
}

object Schema$GooglePrivacyDlpV2BigQueryOptions {
  @scala.inline
  def apply(
    excludedFields: js.Array[Schema$GooglePrivacyDlpV2FieldId] = null,
    identifyingFields: js.Array[Schema$GooglePrivacyDlpV2FieldId] = null,
    rowsLimit: String = null,
    rowsLimitPercent: Int | Double = null,
    sampleMethod: String = null,
    tableReference: Schema$GooglePrivacyDlpV2BigQueryTable = null
  ): Schema$GooglePrivacyDlpV2BigQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (excludedFields != null) __obj.updateDynamic("excludedFields")(excludedFields.asInstanceOf[js.Any])
    if (identifyingFields != null) __obj.updateDynamic("identifyingFields")(identifyingFields.asInstanceOf[js.Any])
    if (rowsLimit != null) __obj.updateDynamic("rowsLimit")(rowsLimit.asInstanceOf[js.Any])
    if (rowsLimitPercent != null) __obj.updateDynamic("rowsLimitPercent")(rowsLimitPercent.asInstanceOf[js.Any])
    if (sampleMethod != null) __obj.updateDynamic("sampleMethod")(sampleMethod.asInstanceOf[js.Any])
    if (tableReference != null) __obj.updateDynamic("tableReference")(tableReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2BigQueryOptions]
  }
}

