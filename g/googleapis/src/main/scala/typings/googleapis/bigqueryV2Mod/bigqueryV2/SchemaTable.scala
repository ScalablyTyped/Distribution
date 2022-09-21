package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTable extends StObject {
  
  /**
    * [Output-only] Clone definition.
    */
  var cloneDefinition: js.UndefOr[SchemaCloneDefinition] = js.undefined
  
  /**
    * [Beta] Clustering specification for the table. Must be specified with partitioning, data in the table will be first partitioned and subsequently clustered.
    */
  var clustering: js.UndefOr[SchemaClustering] = js.undefined
  
  /**
    * [Output-only] The time when this table was created, in milliseconds since the epoch.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] The default collation of the table.
    */
  var defaultCollation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] A user-friendly description of this table.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom encryption configuration (e.g., Cloud KMS keys).
    */
  var encryptionConfiguration: js.UndefOr[SchemaEncryptionConfiguration] = js.undefined
  
  /**
    * [Output-only] A hash of the table metadata. Used to ensure there were no concurrent modifications to the resource when attempting an update. Not guaranteed to change when the table contents or the fields numRows, numBytes, numLongTermBytes or lastModifiedTime change.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their storage reclaimed. The defaultTableExpirationMs property of the encapsulating dataset can be used to set a default expirationTime on newly created tables.
    */
  var expirationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] Describes the data format, location, and other properties of a table stored outside of BigQuery. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
    */
  var externalDataConfiguration: js.UndefOr[SchemaExternalDataConfiguration] = js.undefined
  
  /**
    * [Optional] A descriptive name for this table.
    */
  var friendlyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] An opaque ID uniquely identifying the table.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] The type of the resource.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * [Output-only] The time when this table was last modified, in milliseconds since the epoch.
    */
  var lastModifiedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] The geographic location where the table resides. This value is inherited from the dataset.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] Materialized view definition.
    */
  var materializedView: js.UndefOr[SchemaMaterializedViewDefinition] = js.undefined
  
  /**
    * [Optional] Max staleness of data that could be returned when table or materialized view is queried (formatted as Google SQL Interval type).
    */
  var maxStaleness: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only, Beta] Present iff this table represents a ML model. Describes the training information for the model, and it is required to run 'PREDICT' queries.
    */
  var model: js.UndefOr[SchemaModelDefinition] = js.undefined
  
  /**
    * [Output-only] The size of this table in bytes, excluding any data in the streaming buffer.
    */
  var numBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] The number of bytes in the table that are considered "long-term storage".
    */
  var numLongTermBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] [TrustedTester] The physical size of this table in bytes, excluding any data in the streaming buffer. This includes compression and storage used for time travel.
    */
  var numPhysicalBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] The number of rows of data in this table, excluding any data in the streaming buffer.
    */
  var numRows: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Number of logical bytes that are less than 90 days old.
    */
  var num_active_logical_bytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Number of physical bytes less than 90 days old. This data is not kept in real time, and might be delayed by a few seconds to a few minutes.
    */
  var num_active_physical_bytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Number of logical bytes that are more than 90 days old.
    */
  var num_long_term_logical_bytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Number of physical bytes more than 90 days old. This data is not kept in real time, and might be delayed by a few seconds to a few minutes.
    */
  var num_long_term_physical_bytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] The number of partitions present in the table or materialized view. This data is not kept in real time, and might be delayed by a few seconds to a few minutes.
    */
  var num_partitions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Number of physical bytes used by time travel storage (deleted or changed data). This data is not kept in real time, and might be delayed by a few seconds to a few minutes.
    */
  var num_time_travel_physical_bytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Total number of logical bytes in the table or materialized view.
    */
  var num_total_logical_bytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] The physical size of this table in bytes. This also includes storage used for time travel. This data is not kept in real time, and might be delayed by a few seconds to a few minutes.
    */
  var num_total_physical_bytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
    */
  var rangePartitioning: js.UndefOr[SchemaRangePartitioning] = js.undefined
  
  /**
    * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified.
    */
  var requirePartitionFilter: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Optional] Describes the schema of this table.
    */
  var schema: js.UndefOr[SchemaTableSchema] = js.undefined
  
  /**
    * [Output-only] A URL that can be used to access this resource again.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Snapshot definition.
    */
  var snapshotDefinition: js.UndefOr[SchemaSnapshotDefinition] = js.undefined
  
  /**
    * [Output-only] Contains information regarding this table's streaming buffer, if one is present. This field will be absent if the table is not being streamed to or if there is no data in the streaming buffer.
    */
  var streamingBuffer: js.UndefOr[SchemaStreamingbuffer] = js.undefined
  
  /**
    * [Required] Reference describing the ID of this table.
    */
  var tableReference: js.UndefOr[SchemaTableReference] = js.undefined
  
  /**
    * Time-based partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
    */
  var timePartitioning: js.UndefOr[SchemaTimePartitioning] = js.undefined
  
  /**
    * [Output-only] Describes the table type. The following values are supported: TABLE: A normal BigQuery table. VIEW: A virtual table defined by a SQL query. SNAPSHOT: An immutable, read-only table that is a copy of another table. [TrustedTester] MATERIALIZED_VIEW: SQL query whose result is persisted. EXTERNAL: A table that references data stored in an external storage system, such as Google Cloud Storage. The default value is TABLE.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] The view definition.
    */
  var view: js.UndefOr[SchemaViewDefinition] = js.undefined
}
object SchemaTable {
  
  inline def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  
  extension [Self <: SchemaTable](x: Self) {
    
    inline def setCloneDefinition(value: SchemaCloneDefinition): Self = StObject.set(x, "cloneDefinition", value.asInstanceOf[js.Any])
    
    inline def setCloneDefinitionUndefined: Self = StObject.set(x, "cloneDefinition", js.undefined)
    
    inline def setClustering(value: SchemaClustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
    
    inline def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDefaultCollation(value: String): Self = StObject.set(x, "defaultCollation", value.asInstanceOf[js.Any])
    
    inline def setDefaultCollationNull: Self = StObject.set(x, "defaultCollation", null)
    
    inline def setDefaultCollationUndefined: Self = StObject.set(x, "defaultCollation", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncryptionConfiguration(value: SchemaEncryptionConfiguration): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setExternalDataConfiguration(value: SchemaExternalDataConfiguration): Self = StObject.set(x, "externalDataConfiguration", value.asInstanceOf[js.Any])
    
    inline def setExternalDataConfigurationUndefined: Self = StObject.set(x, "externalDataConfiguration", js.undefined)
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameNull: Self = StObject.set(x, "friendlyName", null)
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeNull: Self = StObject.set(x, "lastModifiedTime", null)
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMaterializedView(value: SchemaMaterializedViewDefinition): Self = StObject.set(x, "materializedView", value.asInstanceOf[js.Any])
    
    inline def setMaterializedViewUndefined: Self = StObject.set(x, "materializedView", js.undefined)
    
    inline def setMaxStaleness(value: String): Self = StObject.set(x, "maxStaleness", value.asInstanceOf[js.Any])
    
    inline def setMaxStalenessNull: Self = StObject.set(x, "maxStaleness", null)
    
    inline def setMaxStalenessUndefined: Self = StObject.set(x, "maxStaleness", js.undefined)
    
    inline def setModel(value: SchemaModelDefinition): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNumBytes(value: String): Self = StObject.set(x, "numBytes", value.asInstanceOf[js.Any])
    
    inline def setNumBytesNull: Self = StObject.set(x, "numBytes", null)
    
    inline def setNumBytesUndefined: Self = StObject.set(x, "numBytes", js.undefined)
    
    inline def setNumLongTermBytes(value: String): Self = StObject.set(x, "numLongTermBytes", value.asInstanceOf[js.Any])
    
    inline def setNumLongTermBytesNull: Self = StObject.set(x, "numLongTermBytes", null)
    
    inline def setNumLongTermBytesUndefined: Self = StObject.set(x, "numLongTermBytes", js.undefined)
    
    inline def setNumPhysicalBytes(value: String): Self = StObject.set(x, "numPhysicalBytes", value.asInstanceOf[js.Any])
    
    inline def setNumPhysicalBytesNull: Self = StObject.set(x, "numPhysicalBytes", null)
    
    inline def setNumPhysicalBytesUndefined: Self = StObject.set(x, "numPhysicalBytes", js.undefined)
    
    inline def setNumRows(value: String): Self = StObject.set(x, "numRows", value.asInstanceOf[js.Any])
    
    inline def setNumRowsNull: Self = StObject.set(x, "numRows", null)
    
    inline def setNumRowsUndefined: Self = StObject.set(x, "numRows", js.undefined)
    
    inline def setNum_active_logical_bytes(value: String): Self = StObject.set(x, "num_active_logical_bytes", value.asInstanceOf[js.Any])
    
    inline def setNum_active_logical_bytesNull: Self = StObject.set(x, "num_active_logical_bytes", null)
    
    inline def setNum_active_logical_bytesUndefined: Self = StObject.set(x, "num_active_logical_bytes", js.undefined)
    
    inline def setNum_active_physical_bytes(value: String): Self = StObject.set(x, "num_active_physical_bytes", value.asInstanceOf[js.Any])
    
    inline def setNum_active_physical_bytesNull: Self = StObject.set(x, "num_active_physical_bytes", null)
    
    inline def setNum_active_physical_bytesUndefined: Self = StObject.set(x, "num_active_physical_bytes", js.undefined)
    
    inline def setNum_long_term_logical_bytes(value: String): Self = StObject.set(x, "num_long_term_logical_bytes", value.asInstanceOf[js.Any])
    
    inline def setNum_long_term_logical_bytesNull: Self = StObject.set(x, "num_long_term_logical_bytes", null)
    
    inline def setNum_long_term_logical_bytesUndefined: Self = StObject.set(x, "num_long_term_logical_bytes", js.undefined)
    
    inline def setNum_long_term_physical_bytes(value: String): Self = StObject.set(x, "num_long_term_physical_bytes", value.asInstanceOf[js.Any])
    
    inline def setNum_long_term_physical_bytesNull: Self = StObject.set(x, "num_long_term_physical_bytes", null)
    
    inline def setNum_long_term_physical_bytesUndefined: Self = StObject.set(x, "num_long_term_physical_bytes", js.undefined)
    
    inline def setNum_partitions(value: String): Self = StObject.set(x, "num_partitions", value.asInstanceOf[js.Any])
    
    inline def setNum_partitionsNull: Self = StObject.set(x, "num_partitions", null)
    
    inline def setNum_partitionsUndefined: Self = StObject.set(x, "num_partitions", js.undefined)
    
    inline def setNum_time_travel_physical_bytes(value: String): Self = StObject.set(x, "num_time_travel_physical_bytes", value.asInstanceOf[js.Any])
    
    inline def setNum_time_travel_physical_bytesNull: Self = StObject.set(x, "num_time_travel_physical_bytes", null)
    
    inline def setNum_time_travel_physical_bytesUndefined: Self = StObject.set(x, "num_time_travel_physical_bytes", js.undefined)
    
    inline def setNum_total_logical_bytes(value: String): Self = StObject.set(x, "num_total_logical_bytes", value.asInstanceOf[js.Any])
    
    inline def setNum_total_logical_bytesNull: Self = StObject.set(x, "num_total_logical_bytes", null)
    
    inline def setNum_total_logical_bytesUndefined: Self = StObject.set(x, "num_total_logical_bytes", js.undefined)
    
    inline def setNum_total_physical_bytes(value: String): Self = StObject.set(x, "num_total_physical_bytes", value.asInstanceOf[js.Any])
    
    inline def setNum_total_physical_bytesNull: Self = StObject.set(x, "num_total_physical_bytes", null)
    
    inline def setNum_total_physical_bytesUndefined: Self = StObject.set(x, "num_total_physical_bytes", js.undefined)
    
    inline def setRangePartitioning(value: SchemaRangePartitioning): Self = StObject.set(x, "rangePartitioning", value.asInstanceOf[js.Any])
    
    inline def setRangePartitioningUndefined: Self = StObject.set(x, "rangePartitioning", js.undefined)
    
    inline def setRequirePartitionFilter(value: Boolean): Self = StObject.set(x, "requirePartitionFilter", value.asInstanceOf[js.Any])
    
    inline def setRequirePartitionFilterNull: Self = StObject.set(x, "requirePartitionFilter", null)
    
    inline def setRequirePartitionFilterUndefined: Self = StObject.set(x, "requirePartitionFilter", js.undefined)
    
    inline def setSchema(value: SchemaTableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSnapshotDefinition(value: SchemaSnapshotDefinition): Self = StObject.set(x, "snapshotDefinition", value.asInstanceOf[js.Any])
    
    inline def setSnapshotDefinitionUndefined: Self = StObject.set(x, "snapshotDefinition", js.undefined)
    
    inline def setStreamingBuffer(value: SchemaStreamingbuffer): Self = StObject.set(x, "streamingBuffer", value.asInstanceOf[js.Any])
    
    inline def setStreamingBufferUndefined: Self = StObject.set(x, "streamingBuffer", js.undefined)
    
    inline def setTableReference(value: SchemaTableReference): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    inline def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
    
    inline def setTimePartitioning(value: SchemaTimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
    
    inline def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setView(value: SchemaViewDefinition): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
