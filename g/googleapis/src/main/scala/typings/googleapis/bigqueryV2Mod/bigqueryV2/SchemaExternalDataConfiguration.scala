package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExternalDataConfiguration extends StObject {
  
  /**
    * Try to detect schema and format options automatically. Any option
    * specified explicitly will be honored.
    */
  var autodetect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Optional] Additional options if sourceFormat is set to BIGTABLE.
    */
  var bigtableOptions: js.UndefOr[SchemaBigtableOptions] = js.undefined
  
  /**
    * [Optional] The compression type of the data source. Possible values
    * include GZIP and NONE. The default value is NONE. This setting is ignored
    * for Google Cloud Bigtable, Google Cloud Datastore backups and Avro
    * formats.
    */
  var compression: js.UndefOr[String] = js.undefined
  
  /**
    * Additional properties to set if sourceFormat is set to CSV.
    */
  var csvOptions: js.UndefOr[SchemaCsvOptions] = js.undefined
  
  /**
    * [Optional] Additional options if sourceFormat is set to GOOGLE_SHEETS.
    */
  var googleSheetsOptions: js.UndefOr[SchemaGoogleSheetsOptions] = js.undefined
  
  /**
    * [Optional, Experimental] If hive partitioning is enabled, which mode to
    * use. Two modes are supported: - AUTO: automatically infer partition key
    * name(s) and type(s). - STRINGS: automatic infer partition key name(s).
    * All types are strings. Not all storage formats support hive partitioning
    * -- requesting hive partitioning on an unsupported format will lead to an
    * error.
    */
  var hivePartitioningMode: js.UndefOr[String] = js.undefined
  
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
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Optional] The maximum number of bad records that BigQuery can ignore
    * when reading data. If the number of bad records exceeds this value, an
    * invalid error is returned in the job result. This is only valid for CSV,
    * JSON, and Google Sheets. The default value is 0, which requires that all
    * records are valid. This setting is ignored for Google Cloud Bigtable,
    * Google Cloud Datastore backups and Avro formats.
    */
  var maxBadRecords: js.UndefOr[Double] = js.undefined
  
  /**
    * [Optional] The schema for the data. Schema is required for CSV and JSON
    * formats. Schema is disallowed for Google Cloud Bigtable, Cloud Datastore
    * backups, and Avro formats.
    */
  var schema: js.UndefOr[SchemaTableSchema] = js.undefined
  
  /**
    * [Required] The data format. For CSV files, specify &quot;CSV&quot;. For
    * Google sheets, specify &quot;GOOGLE_SHEETS&quot;. For newline-delimited
    * JSON, specify &quot;NEWLINE_DELIMITED_JSON&quot;. For Avro files, specify
    * &quot;AVRO&quot;. For Google Cloud Datastore backups, specify
    * &quot;DATASTORE_BACKUP&quot;. [Beta] For Google Cloud Bigtable, specify
    * &quot;BIGTABLE&quot;.
    */
  var sourceFormat: js.UndefOr[String] = js.undefined
  
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
  var sourceUris: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaExternalDataConfiguration {
  
  inline def apply(): SchemaExternalDataConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternalDataConfiguration]
  }
  
  extension [Self <: SchemaExternalDataConfiguration](x: Self) {
    
    inline def setAutodetect(value: Boolean): Self = StObject.set(x, "autodetect", value.asInstanceOf[js.Any])
    
    inline def setAutodetectUndefined: Self = StObject.set(x, "autodetect", js.undefined)
    
    inline def setBigtableOptions(value: SchemaBigtableOptions): Self = StObject.set(x, "bigtableOptions", value.asInstanceOf[js.Any])
    
    inline def setBigtableOptionsUndefined: Self = StObject.set(x, "bigtableOptions", js.undefined)
    
    inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setCsvOptions(value: SchemaCsvOptions): Self = StObject.set(x, "csvOptions", value.asInstanceOf[js.Any])
    
    inline def setCsvOptionsUndefined: Self = StObject.set(x, "csvOptions", js.undefined)
    
    inline def setGoogleSheetsOptions(value: SchemaGoogleSheetsOptions): Self = StObject.set(x, "googleSheetsOptions", value.asInstanceOf[js.Any])
    
    inline def setGoogleSheetsOptionsUndefined: Self = StObject.set(x, "googleSheetsOptions", js.undefined)
    
    inline def setHivePartitioningMode(value: String): Self = StObject.set(x, "hivePartitioningMode", value.asInstanceOf[js.Any])
    
    inline def setHivePartitioningModeUndefined: Self = StObject.set(x, "hivePartitioningMode", js.undefined)
    
    inline def setIgnoreUnknownValues(value: Boolean): Self = StObject.set(x, "ignoreUnknownValues", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnknownValuesUndefined: Self = StObject.set(x, "ignoreUnknownValues", js.undefined)
    
    inline def setMaxBadRecords(value: Double): Self = StObject.set(x, "maxBadRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxBadRecordsUndefined: Self = StObject.set(x, "maxBadRecords", js.undefined)
    
    inline def setSchema(value: SchemaTableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSourceFormat(value: String): Self = StObject.set(x, "sourceFormat", value.asInstanceOf[js.Any])
    
    inline def setSourceFormatUndefined: Self = StObject.set(x, "sourceFormat", js.undefined)
    
    inline def setSourceUris(value: js.Array[String]): Self = StObject.set(x, "sourceUris", value.asInstanceOf[js.Any])
    
    inline def setSourceUrisUndefined: Self = StObject.set(x, "sourceUris", js.undefined)
    
    inline def setSourceUrisVarargs(value: String*): Self = StObject.set(x, "sourceUris", js.Array(value :_*))
  }
}
