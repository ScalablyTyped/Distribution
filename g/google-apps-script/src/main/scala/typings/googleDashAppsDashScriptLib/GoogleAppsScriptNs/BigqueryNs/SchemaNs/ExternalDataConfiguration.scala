package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalDataConfiguration extends js.Object {
  var autodetect: js.UndefOr[scala.Boolean] = js.undefined
  var bigtableOptions: js.UndefOr[BigtableOptions] = js.undefined
  var compression: js.UndefOr[java.lang.String] = js.undefined
  var csvOptions: js.UndefOr[CsvOptions] = js.undefined
  var googleSheetsOptions: js.UndefOr[GoogleSheetsOptions] = js.undefined
  var hivePartitioningMode: js.UndefOr[java.lang.String] = js.undefined
  var ignoreUnknownValues: js.UndefOr[scala.Boolean] = js.undefined
  var maxBadRecords: js.UndefOr[scala.Double] = js.undefined
  var schema: js.UndefOr[TableSchema] = js.undefined
  var sourceFormat: js.UndefOr[java.lang.String] = js.undefined
  var sourceUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ExternalDataConfiguration {
  @scala.inline
  def apply(
    autodetect: js.UndefOr[scala.Boolean] = js.undefined,
    bigtableOptions: BigtableOptions = null,
    compression: java.lang.String = null,
    csvOptions: CsvOptions = null,
    googleSheetsOptions: GoogleSheetsOptions = null,
    hivePartitioningMode: java.lang.String = null,
    ignoreUnknownValues: js.UndefOr[scala.Boolean] = js.undefined,
    maxBadRecords: scala.Int | scala.Double = null,
    schema: TableSchema = null,
    sourceFormat: java.lang.String = null,
    sourceUris: js.Array[java.lang.String] = null
  ): ExternalDataConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autodetect)) __obj.updateDynamic("autodetect")(autodetect)
    if (bigtableOptions != null) __obj.updateDynamic("bigtableOptions")(bigtableOptions)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (csvOptions != null) __obj.updateDynamic("csvOptions")(csvOptions)
    if (googleSheetsOptions != null) __obj.updateDynamic("googleSheetsOptions")(googleSheetsOptions)
    if (hivePartitioningMode != null) __obj.updateDynamic("hivePartitioningMode")(hivePartitioningMode)
    if (!js.isUndefined(ignoreUnknownValues)) __obj.updateDynamic("ignoreUnknownValues")(ignoreUnknownValues)
    if (maxBadRecords != null) __obj.updateDynamic("maxBadRecords")(maxBadRecords.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (sourceFormat != null) __obj.updateDynamic("sourceFormat")(sourceFormat)
    if (sourceUris != null) __obj.updateDynamic("sourceUris")(sourceUris)
    __obj.asInstanceOf[ExternalDataConfiguration]
  }
}

