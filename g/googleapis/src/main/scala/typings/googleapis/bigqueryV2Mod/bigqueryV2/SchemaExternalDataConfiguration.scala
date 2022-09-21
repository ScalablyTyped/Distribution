package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExternalDataConfiguration extends StObject {
  
  /**
    * Try to detect schema and format options automatically. Any option specified explicitly will be honored.
    */
  var autodetect: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Additional properties to set if sourceFormat is set to Avro.
    */
  var avroOptions: js.UndefOr[SchemaAvroOptions] = js.undefined
  
  /**
    * [Optional] Additional options if sourceFormat is set to BIGTABLE.
    */
  var bigtableOptions: js.UndefOr[SchemaBigtableOptions] = js.undefined
  
  /**
    * [Optional] The compression type of the data source. Possible values include GZIP and NONE. The default value is NONE. This setting is ignored for Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.
    */
  var compression: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional, Trusted Tester] Connection for external data source.
    */
  var connectionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional properties to set if sourceFormat is set to CSV.
    */
  var csvOptions: js.UndefOr[SchemaCsvOptions] = js.undefined
  
  /**
    * [Optional] Defines the list of possible SQL data types to which the source decimal values are converted. This list and the precision and the scale parameters of the decimal field determine the target type. In the order of NUMERIC, BIGNUMERIC, and STRING, a type is picked if it is in the specified list and if it supports the precision and the scale. STRING supports all precision and scale values. If none of the listed types supports the precision and the scale, the type supporting the widest range in the specified list is picked, and if a value exceeds the supported range when reading the data, an error will be thrown. Example: Suppose the value of this field is ["NUMERIC", "BIGNUMERIC"]. If (precision,scale) is: (38,9) -\> NUMERIC; (39,9) -\> BIGNUMERIC (NUMERIC cannot hold 30 integer digits); (38,10) -\> BIGNUMERIC (NUMERIC cannot hold 10 fractional digits); (76,38) -\> BIGNUMERIC; (77,38) -\> BIGNUMERIC (error if value exeeds supported range). This field cannot contain duplicate types. The order of the types in this field is ignored. For example, ["BIGNUMERIC", "NUMERIC"] is the same as ["NUMERIC", "BIGNUMERIC"] and NUMERIC always takes precedence over BIGNUMERIC. Defaults to ["NUMERIC", "STRING"] for ORC and ["NUMERIC"] for the other file formats.
    */
  var decimalTargetTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * [Optional] Additional options if sourceFormat is set to GOOGLE_SHEETS.
    */
  var googleSheetsOptions: js.UndefOr[SchemaGoogleSheetsOptions] = js.undefined
  
  /**
    * [Optional] Options to configure hive partitioning support.
    */
  var hivePartitioningOptions: js.UndefOr[SchemaHivePartitioningOptions] = js.undefined
  
  /**
    * [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don't match any column names Google Cloud Bigtable: This setting is ignored. Google Cloud Datastore backups: This setting is ignored. Avro: This setting is ignored.
    */
  var ignoreUnknownValues: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Optional] The maximum number of bad records that BigQuery can ignore when reading data. If the number of bad records exceeds this value, an invalid error is returned in the job result. This is only valid for CSV, JSON, and Google Sheets. The default value is 0, which requires that all records are valid. This setting is ignored for Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.
    */
  var maxBadRecords: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Additional properties to set if sourceFormat is set to Parquet.
    */
  var parquetOptions: js.UndefOr[SchemaParquetOptions] = js.undefined
  
  /**
    * [Optional] Provide a referencing file with the expected table schema. Enabled for the format: AVRO, PARQUET, ORC.
    */
  var referenceFileSchemaUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] The schema for the data. Schema is required for CSV and JSON formats. Schema is disallowed for Google Cloud Bigtable, Cloud Datastore backups, and Avro formats.
    */
  var schema: js.UndefOr[SchemaTableSchema] = js.undefined
  
  /**
    * [Required] The data format. For CSV files, specify "CSV". For Google sheets, specify "GOOGLE_SHEETS". For newline-delimited JSON, specify "NEWLINE_DELIMITED_JSON". For Avro files, specify "AVRO". For Google Cloud Datastore backups, specify "DATASTORE_BACKUP". [Beta] For Google Cloud Bigtable, specify "BIGTABLE".
    */
  var sourceFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '*' wildcard character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups, exactly one URI can be specified. Also, the '*' wildcard character is not allowed.
    */
  var sourceUris: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaExternalDataConfiguration {
  
  inline def apply(): SchemaExternalDataConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternalDataConfiguration]
  }
  
  extension [Self <: SchemaExternalDataConfiguration](x: Self) {
    
    inline def setAutodetect(value: Boolean): Self = StObject.set(x, "autodetect", value.asInstanceOf[js.Any])
    
    inline def setAutodetectNull: Self = StObject.set(x, "autodetect", null)
    
    inline def setAutodetectUndefined: Self = StObject.set(x, "autodetect", js.undefined)
    
    inline def setAvroOptions(value: SchemaAvroOptions): Self = StObject.set(x, "avroOptions", value.asInstanceOf[js.Any])
    
    inline def setAvroOptionsUndefined: Self = StObject.set(x, "avroOptions", js.undefined)
    
    inline def setBigtableOptions(value: SchemaBigtableOptions): Self = StObject.set(x, "bigtableOptions", value.asInstanceOf[js.Any])
    
    inline def setBigtableOptionsUndefined: Self = StObject.set(x, "bigtableOptions", js.undefined)
    
    inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionNull: Self = StObject.set(x, "compression", null)
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdNull: Self = StObject.set(x, "connectionId", null)
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    inline def setCsvOptions(value: SchemaCsvOptions): Self = StObject.set(x, "csvOptions", value.asInstanceOf[js.Any])
    
    inline def setCsvOptionsUndefined: Self = StObject.set(x, "csvOptions", js.undefined)
    
    inline def setDecimalTargetTypes(value: js.Array[String]): Self = StObject.set(x, "decimalTargetTypes", value.asInstanceOf[js.Any])
    
    inline def setDecimalTargetTypesNull: Self = StObject.set(x, "decimalTargetTypes", null)
    
    inline def setDecimalTargetTypesUndefined: Self = StObject.set(x, "decimalTargetTypes", js.undefined)
    
    inline def setDecimalTargetTypesVarargs(value: String*): Self = StObject.set(x, "decimalTargetTypes", js.Array(value*))
    
    inline def setGoogleSheetsOptions(value: SchemaGoogleSheetsOptions): Self = StObject.set(x, "googleSheetsOptions", value.asInstanceOf[js.Any])
    
    inline def setGoogleSheetsOptionsUndefined: Self = StObject.set(x, "googleSheetsOptions", js.undefined)
    
    inline def setHivePartitioningOptions(value: SchemaHivePartitioningOptions): Self = StObject.set(x, "hivePartitioningOptions", value.asInstanceOf[js.Any])
    
    inline def setHivePartitioningOptionsUndefined: Self = StObject.set(x, "hivePartitioningOptions", js.undefined)
    
    inline def setIgnoreUnknownValues(value: Boolean): Self = StObject.set(x, "ignoreUnknownValues", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnknownValuesNull: Self = StObject.set(x, "ignoreUnknownValues", null)
    
    inline def setIgnoreUnknownValuesUndefined: Self = StObject.set(x, "ignoreUnknownValues", js.undefined)
    
    inline def setMaxBadRecords(value: Double): Self = StObject.set(x, "maxBadRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxBadRecordsNull: Self = StObject.set(x, "maxBadRecords", null)
    
    inline def setMaxBadRecordsUndefined: Self = StObject.set(x, "maxBadRecords", js.undefined)
    
    inline def setParquetOptions(value: SchemaParquetOptions): Self = StObject.set(x, "parquetOptions", value.asInstanceOf[js.Any])
    
    inline def setParquetOptionsUndefined: Self = StObject.set(x, "parquetOptions", js.undefined)
    
    inline def setReferenceFileSchemaUri(value: String): Self = StObject.set(x, "referenceFileSchemaUri", value.asInstanceOf[js.Any])
    
    inline def setReferenceFileSchemaUriNull: Self = StObject.set(x, "referenceFileSchemaUri", null)
    
    inline def setReferenceFileSchemaUriUndefined: Self = StObject.set(x, "referenceFileSchemaUri", js.undefined)
    
    inline def setSchema(value: SchemaTableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSourceFormat(value: String): Self = StObject.set(x, "sourceFormat", value.asInstanceOf[js.Any])
    
    inline def setSourceFormatNull: Self = StObject.set(x, "sourceFormat", null)
    
    inline def setSourceFormatUndefined: Self = StObject.set(x, "sourceFormat", js.undefined)
    
    inline def setSourceUris(value: js.Array[String]): Self = StObject.set(x, "sourceUris", value.asInstanceOf[js.Any])
    
    inline def setSourceUrisNull: Self = StObject.set(x, "sourceUris", null)
    
    inline def setSourceUrisUndefined: Self = StObject.set(x, "sourceUris", js.undefined)
    
    inline def setSourceUrisVarargs(value: String*): Self = StObject.set(x, "sourceUris", js.Array(value*))
  }
}
