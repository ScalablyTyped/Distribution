package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExternalDataConfiguration extends js.Object {
  /**
    * Try to detect schema and format options automatically. Any option
    * specified explicitly will be honored.
    */
  var autodetect: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Additional options if sourceFormat is set to BIGTABLE.
    */
  var bigtableOptions: js.UndefOr[SchemaBigtableOptions] = js.native
  /**
    * [Optional] The compression type of the data source. Possible values
    * include GZIP and NONE. The default value is NONE. This setting is ignored
    * for Google Cloud Bigtable, Google Cloud Datastore backups and Avro
    * formats.
    */
  var compression: js.UndefOr[String] = js.native
  /**
    * Additional properties to set if sourceFormat is set to CSV.
    */
  var csvOptions: js.UndefOr[SchemaCsvOptions] = js.native
  /**
    * [Optional] Additional options if sourceFormat is set to GOOGLE_SHEETS.
    */
  var googleSheetsOptions: js.UndefOr[SchemaGoogleSheetsOptions] = js.native
  /**
    * [Optional, Experimental] If hive partitioning is enabled, which mode to
    * use. Two modes are supported: - AUTO: automatically infer partition key
    * name(s) and type(s). - STRINGS: automatic infer partition key name(s).
    * All types are strings. Not all storage formats support hive partitioning
    * -- requesting hive partitioning on an unsupported format will lead to an
    * error.
    */
  var hivePartitioningMode: js.UndefOr[String] = js.native
  /**
    * [Optional] Indicates if BigQuery should allow extra values that are not
    * represented in the table schema. If true, the extra values are ignored.
    * If false, records with extra columns are treated as bad records, and if
    * there are too many bad records, an invalid error is returned in the job
    * result. The default value is false. The sourceFormat property determines
    * what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named
    * values that don&#39;t match any column names Google Cloud Bigtable: This
    * setting is ignored. Google Cloud Datastore backups: This setting is
    * ignored. Avro: This setting is ignored.
    */
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] The maximum number of bad records that BigQuery can ignore
    * when reading data. If the number of bad records exceeds this value, an
    * invalid error is returned in the job result. This is only valid for CSV,
    * JSON, and Google Sheets. The default value is 0, which requires that all
    * records are valid. This setting is ignored for Google Cloud Bigtable,
    * Google Cloud Datastore backups and Avro formats.
    */
  var maxBadRecords: js.UndefOr[Double] = js.native
  /**
    * [Optional] The schema for the data. Schema is required for CSV and JSON
    * formats. Schema is disallowed for Google Cloud Bigtable, Cloud Datastore
    * backups, and Avro formats.
    */
  var schema: js.UndefOr[SchemaTableSchema] = js.native
  /**
    * [Required] The data format. For CSV files, specify &quot;CSV&quot;. For
    * Google sheets, specify &quot;GOOGLE_SHEETS&quot;. For newline-delimited
    * JSON, specify &quot;NEWLINE_DELIMITED_JSON&quot;. For Avro files, specify
    * &quot;AVRO&quot;. For Google Cloud Datastore backups, specify
    * &quot;DATASTORE_BACKUP&quot;. [Beta] For Google Cloud Bigtable, specify
    * &quot;BIGTABLE&quot;.
    */
  var sourceFormat: js.UndefOr[String] = js.native
  /**
    * [Required] The fully-qualified URIs that point to your data in Google
    * Cloud. For Google Cloud Storage URIs: Each URI can contain one
    * &#39;*&#39; wildcard character and it must come after the
    * &#39;bucket&#39; name. Size limits related to load jobs apply to external
    * data sources. For Google Cloud Bigtable URIs: Exactly one URI can be
    * specified and it has be a fully specified and valid HTTPS URL for a
    * Google Cloud Bigtable table. For Google Cloud Datastore backups, exactly
    * one URI can be specified. Also, the &#39;*&#39; wildcard character is not
    * allowed.
    */
  var sourceUris: js.UndefOr[js.Array[String]] = js.native
}

object SchemaExternalDataConfiguration {
  @scala.inline
  def apply(
    autodetect: js.UndefOr[Boolean] = js.undefined,
    bigtableOptions: SchemaBigtableOptions = null,
    compression: String = null,
    csvOptions: SchemaCsvOptions = null,
    googleSheetsOptions: SchemaGoogleSheetsOptions = null,
    hivePartitioningMode: String = null,
    ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined,
    maxBadRecords: Int | Double = null,
    schema: SchemaTableSchema = null,
    sourceFormat: String = null,
    sourceUris: js.Array[String] = null
  ): SchemaExternalDataConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autodetect)) __obj.updateDynamic("autodetect")(autodetect.asInstanceOf[js.Any])
    if (bigtableOptions != null) __obj.updateDynamic("bigtableOptions")(bigtableOptions.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (csvOptions != null) __obj.updateDynamic("csvOptions")(csvOptions.asInstanceOf[js.Any])
    if (googleSheetsOptions != null) __obj.updateDynamic("googleSheetsOptions")(googleSheetsOptions.asInstanceOf[js.Any])
    if (hivePartitioningMode != null) __obj.updateDynamic("hivePartitioningMode")(hivePartitioningMode.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnknownValues)) __obj.updateDynamic("ignoreUnknownValues")(ignoreUnknownValues.asInstanceOf[js.Any])
    if (maxBadRecords != null) __obj.updateDynamic("maxBadRecords")(maxBadRecords.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (sourceFormat != null) __obj.updateDynamic("sourceFormat")(sourceFormat.asInstanceOf[js.Any])
    if (sourceUris != null) __obj.updateDynamic("sourceUris")(sourceUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExternalDataConfiguration]
  }
}

