package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobConfigurationLoad extends StObject {
  
  var allowJaggedRows: js.UndefOr[Boolean] = js.undefined
  
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.undefined
  
  var autodetect: js.UndefOr[Boolean] = js.undefined
  
  var clustering: js.UndefOr[Clustering] = js.undefined
  
  var createDisposition: js.UndefOr[String] = js.undefined
  
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  
  var destinationTable: js.UndefOr[TableReference] = js.undefined
  
  var destinationTableProperties: js.UndefOr[DestinationTableProperties] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var fieldDelimiter: js.UndefOr[String] = js.undefined
  
  var hivePartitioningMode: js.UndefOr[String] = js.undefined
  
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined
  
  var maxBadRecords: js.UndefOr[Double] = js.undefined
  
  var nullMarker: js.UndefOr[String] = js.undefined
  
  var projectionFields: js.UndefOr[js.Array[String]] = js.undefined
  
  var quote: js.UndefOr[String] = js.undefined
  
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.undefined
  
  var schema: js.UndefOr[TableSchema] = js.undefined
  
  var schemaInline: js.UndefOr[String] = js.undefined
  
  var schemaInlineFormat: js.UndefOr[String] = js.undefined
  
  var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.undefined
  
  var skipLeadingRows: js.UndefOr[Double] = js.undefined
  
  var sourceFormat: js.UndefOr[String] = js.undefined
  
  var sourceUris: js.UndefOr[js.Array[String]] = js.undefined
  
  var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
  
  var useAvroLogicalTypes: js.UndefOr[Boolean] = js.undefined
  
  var writeDisposition: js.UndefOr[String] = js.undefined
}
object JobConfigurationLoad {
  
  @scala.inline
  def apply(): JobConfigurationLoad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationLoad]
  }
  
  @scala.inline
  implicit class JobConfigurationLoadMutableBuilder[Self <: JobConfigurationLoad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowJaggedRows(value: Boolean): Self = StObject.set(x, "allowJaggedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowJaggedRowsUndefined: Self = StObject.set(x, "allowJaggedRows", js.undefined)
    
    @scala.inline
    def setAllowQuotedNewlines(value: Boolean): Self = StObject.set(x, "allowQuotedNewlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowQuotedNewlinesUndefined: Self = StObject.set(x, "allowQuotedNewlines", js.undefined)
    
    @scala.inline
    def setAutodetect(value: Boolean): Self = StObject.set(x, "autodetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutodetectUndefined: Self = StObject.set(x, "autodetect", js.undefined)
    
    @scala.inline
    def setClustering(value: Clustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
    
    @scala.inline
    def setCreateDisposition(value: String): Self = StObject.set(x, "createDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDispositionUndefined: Self = StObject.set(x, "createDisposition", js.undefined)
    
    @scala.inline
    def setDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "destinationEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationEncryptionConfigurationUndefined: Self = StObject.set(x, "destinationEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setDestinationTable(value: TableReference): Self = StObject.set(x, "destinationTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationTableProperties(value: DestinationTableProperties): Self = StObject.set(x, "destinationTableProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationTablePropertiesUndefined: Self = StObject.set(x, "destinationTableProperties", js.undefined)
    
    @scala.inline
    def setDestinationTableUndefined: Self = StObject.set(x, "destinationTable", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFieldDelimiter(value: String): Self = StObject.set(x, "fieldDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDelimiterUndefined: Self = StObject.set(x, "fieldDelimiter", js.undefined)
    
    @scala.inline
    def setHivePartitioningMode(value: String): Self = StObject.set(x, "hivePartitioningMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHivePartitioningModeUndefined: Self = StObject.set(x, "hivePartitioningMode", js.undefined)
    
    @scala.inline
    def setIgnoreUnknownValues(value: Boolean): Self = StObject.set(x, "ignoreUnknownValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnknownValuesUndefined: Self = StObject.set(x, "ignoreUnknownValues", js.undefined)
    
    @scala.inline
    def setMaxBadRecords(value: Double): Self = StObject.set(x, "maxBadRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBadRecordsUndefined: Self = StObject.set(x, "maxBadRecords", js.undefined)
    
    @scala.inline
    def setNullMarker(value: String): Self = StObject.set(x, "nullMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullMarkerUndefined: Self = StObject.set(x, "nullMarker", js.undefined)
    
    @scala.inline
    def setProjectionFields(value: js.Array[String]): Self = StObject.set(x, "projectionFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionFieldsUndefined: Self = StObject.set(x, "projectionFields", js.undefined)
    
    @scala.inline
    def setProjectionFieldsVarargs(value: String*): Self = StObject.set(x, "projectionFields", js.Array(value :_*))
    
    @scala.inline
    def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    @scala.inline
    def setRangePartitioning(value: RangePartitioning): Self = StObject.set(x, "rangePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangePartitioningUndefined: Self = StObject.set(x, "rangePartitioning", js.undefined)
    
    @scala.inline
    def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaInline(value: String): Self = StObject.set(x, "schemaInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaInlineFormat(value: String): Self = StObject.set(x, "schemaInlineFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaInlineFormatUndefined: Self = StObject.set(x, "schemaInlineFormat", js.undefined)
    
    @scala.inline
    def setSchemaInlineUndefined: Self = StObject.set(x, "schemaInline", js.undefined)
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSchemaUpdateOptions(value: js.Array[String]): Self = StObject.set(x, "schemaUpdateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUpdateOptionsUndefined: Self = StObject.set(x, "schemaUpdateOptions", js.undefined)
    
    @scala.inline
    def setSchemaUpdateOptionsVarargs(value: String*): Self = StObject.set(x, "schemaUpdateOptions", js.Array(value :_*))
    
    @scala.inline
    def setSkipLeadingRows(value: Double): Self = StObject.set(x, "skipLeadingRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipLeadingRowsUndefined: Self = StObject.set(x, "skipLeadingRows", js.undefined)
    
    @scala.inline
    def setSourceFormat(value: String): Self = StObject.set(x, "sourceFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFormatUndefined: Self = StObject.set(x, "sourceFormat", js.undefined)
    
    @scala.inline
    def setSourceUris(value: js.Array[String]): Self = StObject.set(x, "sourceUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUrisUndefined: Self = StObject.set(x, "sourceUris", js.undefined)
    
    @scala.inline
    def setSourceUrisVarargs(value: String*): Self = StObject.set(x, "sourceUris", js.Array(value :_*))
    
    @scala.inline
    def setTimePartitioning(value: TimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
    
    @scala.inline
    def setUseAvroLogicalTypes(value: Boolean): Self = StObject.set(x, "useAvroLogicalTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAvroLogicalTypesUndefined: Self = StObject.set(x, "useAvroLogicalTypes", js.undefined)
    
    @scala.inline
    def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
  }
}
