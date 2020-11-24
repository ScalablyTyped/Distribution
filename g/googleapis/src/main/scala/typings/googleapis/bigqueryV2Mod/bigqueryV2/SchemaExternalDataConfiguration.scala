package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaExternalDataConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternalDataConfiguration]
  }
  
  @scala.inline
  implicit class SchemaExternalDataConfigurationOps[Self <: SchemaExternalDataConfiguration] (val x: Self) extends AnyVal {
    
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
    def setBigtableOptions(value: SchemaBigtableOptions): Self = this.set("bigtableOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigtableOptions: Self = this.set("bigtableOptions", js.undefined)
    
    @scala.inline
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setCsvOptions(value: SchemaCsvOptions): Self = this.set("csvOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvOptions: Self = this.set("csvOptions", js.undefined)
    
    @scala.inline
    def setGoogleSheetsOptions(value: SchemaGoogleSheetsOptions): Self = this.set("googleSheetsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleSheetsOptions: Self = this.set("googleSheetsOptions", js.undefined)
    
    @scala.inline
    def setHivePartitioningMode(value: String): Self = this.set("hivePartitioningMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHivePartitioningMode: Self = this.set("hivePartitioningMode", js.undefined)
    
    @scala.inline
    def setIgnoreUnknownValues(value: Boolean): Self = this.set("ignoreUnknownValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUnknownValues: Self = this.set("ignoreUnknownValues", js.undefined)
    
    @scala.inline
    def setMaxBadRecords(value: Double): Self = this.set("maxBadRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBadRecords: Self = this.set("maxBadRecords", js.undefined)
    
    @scala.inline
    def setSchema(value: SchemaTableSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
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
