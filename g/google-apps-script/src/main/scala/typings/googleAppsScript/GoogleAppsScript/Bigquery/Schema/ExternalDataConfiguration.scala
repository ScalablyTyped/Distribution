package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalDataConfiguration extends js.Object {
  var autodetect: js.UndefOr[Boolean] = js.undefined
  var bigtableOptions: js.UndefOr[BigtableOptions] = js.undefined
  var compression: js.UndefOr[String] = js.undefined
  var csvOptions: js.UndefOr[CsvOptions] = js.undefined
  var googleSheetsOptions: js.UndefOr[GoogleSheetsOptions] = js.undefined
  var hivePartitioningMode: js.UndefOr[String] = js.undefined
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined
  var maxBadRecords: js.UndefOr[Double] = js.undefined
  var schema: js.UndefOr[TableSchema] = js.undefined
  var sourceFormat: js.UndefOr[String] = js.undefined
  var sourceUris: js.UndefOr[js.Array[String]] = js.undefined
}

object ExternalDataConfiguration {
  @scala.inline
  def apply(
    autodetect: js.UndefOr[Boolean] = js.undefined,
    bigtableOptions: BigtableOptions = null,
    compression: String = null,
    csvOptions: CsvOptions = null,
    googleSheetsOptions: GoogleSheetsOptions = null,
    hivePartitioningMode: String = null,
    ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined,
    maxBadRecords: js.UndefOr[Double] = js.undefined,
    schema: TableSchema = null,
    sourceFormat: String = null,
    sourceUris: js.Array[String] = null
  ): ExternalDataConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autodetect)) __obj.updateDynamic("autodetect")(autodetect.get.asInstanceOf[js.Any])
    if (bigtableOptions != null) __obj.updateDynamic("bigtableOptions")(bigtableOptions.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (csvOptions != null) __obj.updateDynamic("csvOptions")(csvOptions.asInstanceOf[js.Any])
    if (googleSheetsOptions != null) __obj.updateDynamic("googleSheetsOptions")(googleSheetsOptions.asInstanceOf[js.Any])
    if (hivePartitioningMode != null) __obj.updateDynamic("hivePartitioningMode")(hivePartitioningMode.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnknownValues)) __obj.updateDynamic("ignoreUnknownValues")(ignoreUnknownValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBadRecords)) __obj.updateDynamic("maxBadRecords")(maxBadRecords.get.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (sourceFormat != null) __obj.updateDynamic("sourceFormat")(sourceFormat.asInstanceOf[js.Any])
    if (sourceUris != null) __obj.updateDynamic("sourceUris")(sourceUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalDataConfiguration]
  }
}

