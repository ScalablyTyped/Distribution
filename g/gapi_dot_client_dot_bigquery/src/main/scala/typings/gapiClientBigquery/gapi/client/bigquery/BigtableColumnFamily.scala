package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigtableColumnFamily extends js.Object {
  /**
    * [Optional] Lists of columns that should be exposed as individual fields as opposed to a list of (column name, value) pairs. All columns whose qualifier
    * matches a qualifier in this list can be accessed as .. Other columns can be accessed as a list through .Column field.
    */
  var columns: js.UndefOr[js.Array[BigtableColumn]] = js.native
  /**
    * [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text
    * strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. This can be overridden for a specific column by listing
    * that column in 'columns' and specifying an encoding for it.
    */
  var encoding: js.UndefOr[String] = js.native
  /** Identifier of the column family. */
  var familyId: js.UndefOr[String] = js.native
  /**
    * [Optional] If this is set only the latest version of value are exposed for all columns in this column family. This can be overridden for a specific
    * column by listing that column in 'columns' and specifying a different setting for that column.
    */
  var onlyReadLatest: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] The type to convert the value in cells of this column family. The values are expected to be encoded using HBase Bytes.toBytes function when
    * using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. This
    * can be overridden for a specific column by listing that column in 'columns' and specifying a type for it.
    */
  var `type`: js.UndefOr[String] = js.native
}

object BigtableColumnFamily {
  @scala.inline
  def apply(): BigtableColumnFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableColumnFamily]
  }
  @scala.inline
  implicit class BigtableColumnFamilyOps[Self <: BigtableColumnFamily] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: BigtableColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[BigtableColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFamilyId(value: String): Self = this.set("familyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamilyId: Self = this.set("familyId", js.undefined)
    @scala.inline
    def setOnlyReadLatest(value: Boolean): Self = this.set("onlyReadLatest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyReadLatest: Self = this.set("onlyReadLatest", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

