package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  /** [Output-only] The time when this table was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /** [Optional] A user-friendly description of this table. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Experimental] Custom encryption configuration (e.g., Cloud KMS keys). */
  var encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  /** [Output-only] A hash of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will
    * be deleted and their storage reclaimed.
    */
  var expirationTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Optional] Describes the data format, location, and other properties of a table stored outside of BigQuery. By defining these properties, the data
    * source can then be queried as if it were a standard BigQuery table.
    */
  var externalDataConfiguration: js.UndefOr[ExternalDataConfiguration] = js.undefined
  /** [Optional] A descriptive name for this table. */
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] An opaque ID uniquely identifying the table. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] The type of the resource. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Experimental] The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than
    * 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are
    * optional. Label keys must start with a letter and each label in the list must have a different key.
    */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** [Output-only] The time when this table was last modified, in milliseconds since the epoch. */
  var lastModifiedTime: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] The geographic location where the table resides. This value is inherited from the dataset. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] The size of this table in bytes, excluding any data in the streaming buffer. */
  var numBytes: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] The number of bytes in the table that are considered "long-term storage". */
  var numLongTermBytes: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] The number of rows of data in this table, excluding any data in the streaming buffer. */
  var numRows: js.UndefOr[java.lang.String] = js.undefined
  /** [Optional] Describes the schema of this table. */
  var schema: js.UndefOr[TableSchema] = js.undefined
  /** [Output-only] A URL that can be used to access this resource again. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
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
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** [Optional] The view definition. */
  var view: js.UndefOr[ViewDefinition] = js.undefined
}

