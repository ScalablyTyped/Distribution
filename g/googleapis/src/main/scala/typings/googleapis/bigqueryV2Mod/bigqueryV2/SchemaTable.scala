package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTable extends StObject {
  
  /**
    * [Beta] Clustering specification for the table. Must be specified with
    * partitioning, data in the table will be first partitioned and
    * subsequently clustered.
    */
  var clustering: js.UndefOr[SchemaClustering] = js.native
  
  /**
    * [Output-only] The time when this table was created, in milliseconds since
    * the epoch.
    */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * [Optional] A user-friendly description of this table.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Custom encryption configuration (e.g., Cloud KMS keys).
    */
  var encryptionConfiguration: js.UndefOr[SchemaEncryptionConfiguration] = js.native
  
  /**
    * [Output-only] A hash of the table metadata. Used to ensure there were no
    * concurrent modifications to the resource when attempting an update. Not
    * guaranteed to change when the table contents or the fields numRows,
    * numBytes, numLongTermBytes or lastModifiedTime change.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The time when this table expires, in milliseconds since the
    * epoch. If not present, the table will persist indefinitely. Expired
    * tables will be deleted and their storage reclaimed. The
    * defaultTableExpirationMs property of the encapsulating dataset can be
    * used to set a default expirationTime on newly created tables.
    */
  var expirationTime: js.UndefOr[String] = js.native
  
  /**
    * [Optional] Describes the data format, location, and other properties of a
    * table stored outside of BigQuery. By defining these properties, the data
    * source can then be queried as if it were a standard BigQuery table.
    */
  var externalDataConfiguration: js.UndefOr[SchemaExternalDataConfiguration] = js.native
  
  /**
    * [Optional] A descriptive name for this table.
    */
  var friendlyName: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] An opaque ID uniquely identifying the table.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] The type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The labels associated with this table. You can use these to organize and
    * group your tables. Label keys and values can be no longer than 63
    * characters, can only contain lowercase letters, numeric characters,
    * underscores and dashes. International characters are allowed. Label
    * values are optional. Label keys must start with a letter and each label
    * in the list must have a different key.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * [Output-only] The time when this table was last modified, in milliseconds
    * since the epoch.
    */
  var lastModifiedTime: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] The geographic location where the table resides. This value
    * is inherited from the dataset.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * [Optional] Materialized view definition.
    */
  var materializedView: js.UndefOr[SchemaMaterializedViewDefinition] = js.native
  
  /**
    * [Output-only, Beta] Present iff this table represents a ML model.
    * Describes the training information for the model, and it is required to
    * run &#39;PREDICT&#39; queries.
    */
  var model: js.UndefOr[SchemaModelDefinition] = js.native
  
  /**
    * [Output-only] The size of this table in bytes, excluding any data in the
    * streaming buffer.
    */
  var numBytes: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] The number of bytes in the table that are considered
    * &quot;long-term storage&quot;.
    */
  var numLongTermBytes: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] [TrustedTester] The physical size of this table in bytes,
    * excluding any data in the streaming buffer. This includes compression and
    * storage used for time travel.
    */
  var numPhysicalBytes: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] The number of rows of data in this table, excluding any
    * data in the streaming buffer.
    */
  var numRows: js.UndefOr[String] = js.native
  
  /**
    * [TrustedTester] Range partitioning specification for this table. Only one
    * of timePartitioning and rangePartitioning should be specified.
    */
  var rangePartitioning: js.UndefOr[SchemaRangePartitioning] = js.native
  
  /**
    * [Beta] [Optional] If set to true, queries over this table require a
    * partition filter that can be used for partition elimination to be
    * specified.
    */
  var requirePartitionFilter: js.UndefOr[Boolean] = js.native
  
  /**
    * [Optional] Describes the schema of this table.
    */
  var schema: js.UndefOr[SchemaTableSchema] = js.native
  
  /**
    * [Output-only] A URL that can be used to access this resource again.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] Contains information regarding this table&#39;s streaming
    * buffer, if one is present. This field will be absent if the table is not
    * being streamed to or if there is no data in the streaming buffer.
    */
  var streamingBuffer: js.UndefOr[SchemaStreamingbuffer] = js.native
  
  /**
    * [Required] Reference describing the ID of this table.
    */
  var tableReference: js.UndefOr[SchemaTableReference] = js.native
  
  /**
    * Time-based partitioning specification for this table. Only one of
    * timePartitioning and rangePartitioning should be specified.
    */
  var timePartitioning: js.UndefOr[SchemaTimePartitioning] = js.native
  
  /**
    * [Output-only] Describes the table type. The following values are
    * supported: TABLE: A normal BigQuery table. VIEW: A virtual table defined
    * by a SQL query. [TrustedTester] MATERIALIZED_VIEW: SQL query whose result
    * is persisted. EXTERNAL: A table that references data stored in an
    * external storage system, such as Google Cloud Storage. The default value
    * is TABLE.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The view definition.
    */
  var view: js.UndefOr[SchemaViewDefinition] = js.native
}
object SchemaTable {
  
  @scala.inline
  def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  
  @scala.inline
  implicit class SchemaTableMutableBuilder[Self <: SchemaTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClustering(value: SchemaClustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEncryptionConfiguration(value: SchemaEncryptionConfiguration): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    @scala.inline
    def setExternalDataConfiguration(value: SchemaExternalDataConfiguration): Self = StObject.set(x, "externalDataConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDataConfigurationUndefined: Self = StObject.set(x, "externalDataConfiguration", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMaterializedView(value: SchemaMaterializedViewDefinition): Self = StObject.set(x, "materializedView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializedViewUndefined: Self = StObject.set(x, "materializedView", js.undefined)
    
    @scala.inline
    def setModel(value: SchemaModelDefinition): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setNumBytes(value: String): Self = StObject.set(x, "numBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumBytesUndefined: Self = StObject.set(x, "numBytes", js.undefined)
    
    @scala.inline
    def setNumLongTermBytes(value: String): Self = StObject.set(x, "numLongTermBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumLongTermBytesUndefined: Self = StObject.set(x, "numLongTermBytes", js.undefined)
    
    @scala.inline
    def setNumPhysicalBytes(value: String): Self = StObject.set(x, "numPhysicalBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPhysicalBytesUndefined: Self = StObject.set(x, "numPhysicalBytes", js.undefined)
    
    @scala.inline
    def setNumRows(value: String): Self = StObject.set(x, "numRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumRowsUndefined: Self = StObject.set(x, "numRows", js.undefined)
    
    @scala.inline
    def setRangePartitioning(value: SchemaRangePartitioning): Self = StObject.set(x, "rangePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangePartitioningUndefined: Self = StObject.set(x, "rangePartitioning", js.undefined)
    
    @scala.inline
    def setRequirePartitionFilter(value: Boolean): Self = StObject.set(x, "requirePartitionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirePartitionFilterUndefined: Self = StObject.set(x, "requirePartitionFilter", js.undefined)
    
    @scala.inline
    def setSchema(value: SchemaTableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStreamingBuffer(value: SchemaStreamingbuffer): Self = StObject.set(x, "streamingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingBufferUndefined: Self = StObject.set(x, "streamingBuffer", js.undefined)
    
    @scala.inline
    def setTableReference(value: SchemaTableReference): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
    
    @scala.inline
    def setTimePartitioning(value: SchemaTimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setView(value: SchemaViewDefinition): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
