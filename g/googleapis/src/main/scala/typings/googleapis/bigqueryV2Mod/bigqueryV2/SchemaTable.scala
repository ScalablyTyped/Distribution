package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTable extends js.Object {
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
  def apply(
    clustering: SchemaClustering = null,
    creationTime: String = null,
    description: String = null,
    encryptionConfiguration: SchemaEncryptionConfiguration = null,
    etag: String = null,
    expirationTime: String = null,
    externalDataConfiguration: SchemaExternalDataConfiguration = null,
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    labels: StringDictionary[String] = null,
    lastModifiedTime: String = null,
    location: String = null,
    materializedView: SchemaMaterializedViewDefinition = null,
    model: SchemaModelDefinition = null,
    numBytes: String = null,
    numLongTermBytes: String = null,
    numPhysicalBytes: String = null,
    numRows: String = null,
    rangePartitioning: SchemaRangePartitioning = null,
    requirePartitionFilter: js.UndefOr[Boolean] = js.undefined,
    schema: SchemaTableSchema = null,
    selfLink: String = null,
    streamingBuffer: SchemaStreamingbuffer = null,
    tableReference: SchemaTableReference = null,
    timePartitioning: SchemaTimePartitioning = null,
    `type`: String = null,
    view: SchemaViewDefinition = null
  ): SchemaTable = {
    val __obj = js.Dynamic.literal()
    if (clustering != null) __obj.updateDynamic("clustering")(clustering.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (externalDataConfiguration != null) __obj.updateDynamic("externalDataConfiguration")(externalDataConfiguration.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (materializedView != null) __obj.updateDynamic("materializedView")(materializedView.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (numBytes != null) __obj.updateDynamic("numBytes")(numBytes.asInstanceOf[js.Any])
    if (numLongTermBytes != null) __obj.updateDynamic("numLongTermBytes")(numLongTermBytes.asInstanceOf[js.Any])
    if (numPhysicalBytes != null) __obj.updateDynamic("numPhysicalBytes")(numPhysicalBytes.asInstanceOf[js.Any])
    if (numRows != null) __obj.updateDynamic("numRows")(numRows.asInstanceOf[js.Any])
    if (rangePartitioning != null) __obj.updateDynamic("rangePartitioning")(rangePartitioning.asInstanceOf[js.Any])
    if (!js.isUndefined(requirePartitionFilter)) __obj.updateDynamic("requirePartitionFilter")(requirePartitionFilter.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (streamingBuffer != null) __obj.updateDynamic("streamingBuffer")(streamingBuffer.asInstanceOf[js.Any])
    if (tableReference != null) __obj.updateDynamic("tableReference")(tableReference.asInstanceOf[js.Any])
    if (timePartitioning != null) __obj.updateDynamic("timePartitioning")(timePartitioning.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTable]
  }
}

