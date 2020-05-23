package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigtableColumnFamily extends js.Object {
  /**
    * [Optional] Lists of columns that should be exposed as individual fields as opposed to a list of (column name, value) pairs. All columns whose qualifier
    * matches a qualifier in this list can be accessed as .. Other columns can be accessed as a list through .Column field.
    */
  var columns: js.UndefOr[js.Array[BigtableColumn]] = js.undefined
  /**
    * [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text
    * strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. This can be overridden for a specific column by listing
    * that column in 'columns' and specifying an encoding for it.
    */
  var encoding: js.UndefOr[String] = js.undefined
  /** Identifier of the column family. */
  var familyId: js.UndefOr[String] = js.undefined
  /**
    * [Optional] If this is set only the latest version of value are exposed for all columns in this column family. This can be overridden for a specific
    * column by listing that column in 'columns' and specifying a different setting for that column.
    */
  var onlyReadLatest: js.UndefOr[Boolean] = js.undefined
  /**
    * [Optional] The type to convert the value in cells of this column family. The values are expected to be encoded using HBase Bytes.toBytes function when
    * using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. This
    * can be overridden for a specific column by listing that column in 'columns' and specifying a type for it.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BigtableColumnFamily {
  @scala.inline
  def apply(
    columns: js.Array[BigtableColumn] = null,
    encoding: String = null,
    familyId: String = null,
    onlyReadLatest: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): BigtableColumnFamily = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (familyId != null) __obj.updateDynamic("familyId")(familyId.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyReadLatest)) __obj.updateDynamic("onlyReadLatest")(onlyReadLatest.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigtableColumnFamily]
  }
}

