package typings.gapiClientBigquery.gapi.client.bigquery

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  /** [Output-only] The time when this table was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[String] = js.native
  /** [Optional] A user-friendly description of this table. */
  var description: js.UndefOr[String] = js.native
  /** [Experimental] Custom encryption configuration (e.g., Cloud KMS keys). */
  var encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  /** [Output-only] A hash of this resource. */
  var etag: js.UndefOr[String] = js.native
  /**
    * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will
    * be deleted and their storage reclaimed.
    */
  var expirationTime: js.UndefOr[String] = js.native
  /**
    * [Optional] Describes the data format, location, and other properties of a table stored outside of BigQuery. By defining these properties, the data
    * source can then be queried as if it were a standard BigQuery table.
    */
  var externalDataConfiguration: js.UndefOr[ExternalDataConfiguration] = js.native
  /** [Optional] A descriptive name for this table. */
  var friendlyName: js.UndefOr[String] = js.native
  /** [Output-only] An opaque ID uniquely identifying the table. */
  var id: js.UndefOr[String] = js.native
  /** [Output-only] The type of the resource. */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Experimental] The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than
    * 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are
    * optional. Label keys must start with a letter and each label in the list must have a different key.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** [Output-only] The time when this table was last modified, in milliseconds since the epoch. */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /** [Output-only] The geographic location where the table resides. This value is inherited from the dataset. */
  var location: js.UndefOr[String] = js.native
  /** [Output-only] The size of this table in bytes, excluding any data in the streaming buffer. */
  var numBytes: js.UndefOr[String] = js.native
  /** [Output-only] The number of bytes in the table that are considered "long-term storage". */
  var numLongTermBytes: js.UndefOr[String] = js.native
  /** [Output-only] The number of rows of data in this table, excluding any data in the streaming buffer. */
  var numRows: js.UndefOr[String] = js.native
  /** [Optional] Describes the schema of this table. */
  var schema: js.UndefOr[TableSchema] = js.native
  /** [Output-only] A URL that can be used to access this resource again. */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output-only] Contains information regarding this table's streaming buffer, if one is present. This field will be absent if the table is not being
    * streamed to or if there is no data in the streaming buffer.
    */
  var streamingBuffer: js.UndefOr[Streamingbuffer] = js.native
  /** [Required] Reference describing the ID of this table. */
  var tableReference: js.UndefOr[TableReference] = js.native
  /** [Experimental] If specified, configures time-based partitioning for this table. */
  var timePartitioning: js.UndefOr[TimePartitioning] = js.native
  /**
    * [Output-only] Describes the table type. The following values are supported: TABLE: A normal BigQuery table. VIEW: A virtual table defined by a SQL
    * query. EXTERNAL: A table that references data stored in an external storage system, such as Google Cloud Storage. The default value is TABLE.
    */
  var `type`: js.UndefOr[String] = js.native
  /** [Optional] The view definition. */
  var view: js.UndefOr[ViewDefinition] = js.native
}

object Table {
  @scala.inline
  def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("encryptionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionConfiguration: Self = this.set("encryptionConfiguration", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
    @scala.inline
    def setExternalDataConfiguration(value: ExternalDataConfiguration): Self = this.set("externalDataConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalDataConfiguration: Self = this.set("externalDataConfiguration", js.undefined)
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setNumBytes(value: String): Self = this.set("numBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumBytes: Self = this.set("numBytes", js.undefined)
    @scala.inline
    def setNumLongTermBytes(value: String): Self = this.set("numLongTermBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumLongTermBytes: Self = this.set("numLongTermBytes", js.undefined)
    @scala.inline
    def setNumRows(value: String): Self = this.set("numRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumRows: Self = this.set("numRows", js.undefined)
    @scala.inline
    def setSchema(value: TableSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStreamingBuffer(value: Streamingbuffer): Self = this.set("streamingBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamingBuffer: Self = this.set("streamingBuffer", js.undefined)
    @scala.inline
    def setTableReference(value: TableReference): Self = this.set("tableReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableReference: Self = this.set("tableReference", js.undefined)
    @scala.inline
    def setTimePartitioning(value: TimePartitioning): Self = this.set("timePartitioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePartitioning: Self = this.set("timePartitioning", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setView(value: ViewDefinition): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

