package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  /** [Output-only] The time when this table was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[String] = js.undefined
  /** [Optional] A user-friendly description of this table. */
  var description: js.UndefOr[String] = js.undefined
  /** [Experimental] Custom encryption configuration (e.g., Cloud KMS keys). */
  var encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  /** [Output-only] A hash of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /**
    * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will
    * be deleted and their storage reclaimed.
    */
  var expirationTime: js.UndefOr[String] = js.undefined
  /**
    * [Optional] Describes the data format, location, and other properties of a table stored outside of BigQuery. By defining these properties, the data
    * source can then be queried as if it were a standard BigQuery table.
    */
  var externalDataConfiguration: js.UndefOr[ExternalDataConfiguration] = js.undefined
  /** [Optional] A descriptive name for this table. */
  var friendlyName: js.UndefOr[String] = js.undefined
  /** [Output-only] An opaque ID uniquely identifying the table. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output-only] The type of the resource. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * [Experimental] The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than
    * 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are
    * optional. Label keys must start with a letter and each label in the list must have a different key.
    */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /** [Output-only] The time when this table was last modified, in milliseconds since the epoch. */
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  /** [Output-only] The geographic location where the table resides. This value is inherited from the dataset. */
  var location: js.UndefOr[String] = js.undefined
  /** [Output-only] The size of this table in bytes, excluding any data in the streaming buffer. */
  var numBytes: js.UndefOr[String] = js.undefined
  /** [Output-only] The number of bytes in the table that are considered "long-term storage". */
  var numLongTermBytes: js.UndefOr[String] = js.undefined
  /** [Output-only] The number of rows of data in this table, excluding any data in the streaming buffer. */
  var numRows: js.UndefOr[String] = js.undefined
  /** [Optional] Describes the schema of this table. */
  var schema: js.UndefOr[TableSchema] = js.undefined
  /** [Output-only] A URL that can be used to access this resource again. */
  var selfLink: js.UndefOr[String] = js.undefined
  /**
    * [Output-only] Contains information regarding this table's streaming buffer, if one is present. This field will be absent if the table is not being
    * streamed to or if there is no data in the streaming buffer.
    */
  var streamingBuffer: js.UndefOr[Streamingbuffer] = js.undefined
  /** [Required] Reference describing the ID of this table. */
  var tableReference: js.UndefOr[TableReference] = js.undefined
  /** [Experimental] If specified, configures time-based partitioning for this table. */
  var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
  /**
    * [Output-only] Describes the table type. The following values are supported: TABLE: A normal BigQuery table. VIEW: A virtual table defined by a SQL
    * query. EXTERNAL: A table that references data stored in an external storage system, such as Google Cloud Storage. The default value is TABLE.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** [Optional] The view definition. */
  var view: js.UndefOr[ViewDefinition] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    creationTime: String = null,
    description: String = null,
    encryptionConfiguration: EncryptionConfiguration = null,
    etag: String = null,
    expirationTime: String = null,
    externalDataConfiguration: ExternalDataConfiguration = null,
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    labels: Record[String, String] = null,
    lastModifiedTime: String = null,
    location: String = null,
    numBytes: String = null,
    numLongTermBytes: String = null,
    numRows: String = null,
    schema: TableSchema = null,
    selfLink: String = null,
    streamingBuffer: Streamingbuffer = null,
    tableReference: TableReference = null,
    timePartitioning: TimePartitioning = null,
    `type`: String = null,
    view: ViewDefinition = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime)
    if (externalDataConfiguration != null) __obj.updateDynamic("externalDataConfiguration")(externalDataConfiguration)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime)
    if (location != null) __obj.updateDynamic("location")(location)
    if (numBytes != null) __obj.updateDynamic("numBytes")(numBytes)
    if (numLongTermBytes != null) __obj.updateDynamic("numLongTermBytes")(numLongTermBytes)
    if (numRows != null) __obj.updateDynamic("numRows")(numRows)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (streamingBuffer != null) __obj.updateDynamic("streamingBuffer")(streamingBuffer)
    if (tableReference != null) __obj.updateDynamic("tableReference")(tableReference)
    if (timePartitioning != null) __obj.updateDynamic("timePartitioning")(timePartitioning)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Table]
  }
}

