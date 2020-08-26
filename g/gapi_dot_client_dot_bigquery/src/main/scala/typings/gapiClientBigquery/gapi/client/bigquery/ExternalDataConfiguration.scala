package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalDataConfiguration extends js.Object {
  /** Try to detect schema and format options automatically. Any option specified explicitly will be honored. */
  var autodetect: js.UndefOr[Boolean] = js.native
  /** [Optional] Additional options if sourceFormat is set to BIGTABLE. */
  var bigtableOptions: js.UndefOr[BigtableOptions] = js.native
  /**
    * [Optional] The compression type of the data source. Possible values include GZIP and NONE. The default value is NONE. This setting is ignored for
    * Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.
    */
  var compression: js.UndefOr[String] = js.native
  /** Additional properties to set if sourceFormat is set to CSV. */
  var csvOptions: js.UndefOr[CsvOptions] = js.native
  /** [Optional] Additional options if sourceFormat is set to GOOGLE_SHEETS. */
  var googleSheetsOptions: js.UndefOr[GoogleSheetsOptions] = js.native
  /**
    * [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If
    * false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result.
    * The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that
    * don't match any column names Google Cloud Bigtable: This setting is ignored. Google Cloud Datastore backups: This setting is ignored. Avro: This
    * setting is ignored.
    */
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] The maximum number of bad records that BigQuery can ignore when reading data. If the number of bad records exceeds this value, an invalid
    * error is returned in the job result. The default value is 0, which requires that all records are valid. This setting is ignored for Google Cloud
    * Bigtable, Google Cloud Datastore backups and Avro formats.
    */
  var maxBadRecords: js.UndefOr[Double] = js.native
  /**
    * [Optional] The schema for the data. Schema is required for CSV and JSON formats. Schema is disallowed for Google Cloud Bigtable, Cloud Datastore
    * backups, and Avro formats.
    */
  var schema: js.UndefOr[TableSchema] = js.native
  /**
    * [Required] The data format. For CSV files, specify "CSV". For Google sheets, specify "GOOGLE_SHEETS". For newline-delimited JSON, specify
    * "NEWLINE_DELIMITED_JSON". For Avro files, specify "AVRO". For Google Cloud Datastore backups, specify "DATASTORE_BACKUP". [Beta] For Google Cloud
    * Bigtable, specify "BIGTABLE".
    */
  var sourceFormat: js.UndefOr[String] = js.native
  /**
    * [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '&#42;' wildcard
    * character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs:
    * Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore
    * backups, exactly one URI can be specified. Also, the '&#42;' wildcard character is not allowed.
    */
  var sourceUris: js.UndefOr[js.Array[String]] = js.native
}

object ExternalDataConfiguration {
  @scala.inline
  def apply(): ExternalDataConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDataConfiguration]
  }
  @scala.inline
  implicit class ExternalDataConfigurationOps[Self <: ExternalDataConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutodetect(value: Boolean): Self = this.set("autodetect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutodetect: Self = this.set("autodetect", js.undefined)
    @scala.inline
    def setBigtableOptions(value: BigtableOptions): Self = this.set("bigtableOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigtableOptions: Self = this.set("bigtableOptions", js.undefined)
    @scala.inline
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setCsvOptions(value: CsvOptions): Self = this.set("csvOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvOptions: Self = this.set("csvOptions", js.undefined)
    @scala.inline
    def setGoogleSheetsOptions(value: GoogleSheetsOptions): Self = this.set("googleSheetsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleSheetsOptions: Self = this.set("googleSheetsOptions", js.undefined)
    @scala.inline
    def setIgnoreUnknownValues(value: Boolean): Self = this.set("ignoreUnknownValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnknownValues: Self = this.set("ignoreUnknownValues", js.undefined)
    @scala.inline
    def setMaxBadRecords(value: Double): Self = this.set("maxBadRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBadRecords: Self = this.set("maxBadRecords", js.undefined)
    @scala.inline
    def setSchema(value: TableSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSourceFormat(value: String): Self = this.set("sourceFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFormat: Self = this.set("sourceFormat", js.undefined)
    @scala.inline
    def setSourceUrisVarargs(value: String*): Self = this.set("sourceUris", js.Array(value :_*))
    @scala.inline
    def setSourceUris(value: js.Array[String]): Self = this.set("sourceUris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceUris: Self = this.set("sourceUris", js.undefined)
  }
  
}

