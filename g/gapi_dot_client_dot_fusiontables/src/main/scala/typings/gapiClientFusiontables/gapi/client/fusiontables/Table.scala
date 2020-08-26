package typings.gapiClientFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  /** Attribution assigned to the table. */
  var attribution: js.UndefOr[String] = js.native
  /** Optional link for attribution. */
  var attributionLink: js.UndefOr[String] = js.native
  /** Base table identifier if this table is a view or merged table. */
  var baseTableIds: js.UndefOr[js.Array[String]] = js.native
  /** Default JSON schema for validating all JSON column properties. */
  var columnPropertiesJsonSchema: js.UndefOr[String] = js.native
  /** Columns in the table. */
  var columns: js.UndefOr[js.Array[Column]] = js.native
  /** Description assigned to the table. */
  var description: js.UndefOr[String] = js.native
  /** Variable for whether table is exportable. */
  var isExportable: js.UndefOr[Boolean] = js.native
  /** The kind of item this is. For a table, this is always fusiontables#table. */
  var kind: js.UndefOr[String] = js.native
  /** Name assigned to a table. */
  var name: js.UndefOr[String] = js.native
  /** SQL that encodes the table definition for derived tables. */
  var sql: js.UndefOr[String] = js.native
  /** Encrypted unique alphanumeric identifier for the table. */
  var tableId: js.UndefOr[String] = js.native
  /** JSON object containing custom table properties. */
  var tablePropertiesJson: js.UndefOr[String] = js.native
  /** JSON schema for validating the JSON table properties. */
  var tablePropertiesJsonSchema: js.UndefOr[String] = js.native
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
    def setAttribution(value: String): Self = this.set("attribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    @scala.inline
    def setAttributionLink(value: String): Self = this.set("attributionLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributionLink: Self = this.set("attributionLink", js.undefined)
    @scala.inline
    def setBaseTableIdsVarargs(value: String*): Self = this.set("baseTableIds", js.Array(value :_*))
    @scala.inline
    def setBaseTableIds(value: js.Array[String]): Self = this.set("baseTableIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseTableIds: Self = this.set("baseTableIds", js.undefined)
    @scala.inline
    def setColumnPropertiesJsonSchema(value: String): Self = this.set("columnPropertiesJsonSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnPropertiesJsonSchema: Self = this.set("columnPropertiesJsonSchema", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIsExportable(value: Boolean): Self = this.set("isExportable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExportable: Self = this.set("isExportable", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSql(value: String): Self = this.set("sql", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSql: Self = this.set("sql", js.undefined)
    @scala.inline
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableId: Self = this.set("tableId", js.undefined)
    @scala.inline
    def setTablePropertiesJson(value: String): Self = this.set("tablePropertiesJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTablePropertiesJson: Self = this.set("tablePropertiesJson", js.undefined)
    @scala.inline
    def setTablePropertiesJsonSchema(value: String): Self = this.set("tablePropertiesJsonSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTablePropertiesJsonSchema: Self = this.set("tablePropertiesJsonSchema", js.undefined)
  }
  
}

