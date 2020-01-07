package typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a table. Specifies the name, whether it is exportable,
  * description, attribution, and attribution link.
  */
@js.native
trait Schema$Table extends js.Object {
  /**
    * Optional attribution assigned to the table.
    */
  var attribution: js.UndefOr[String] = js.native
  /**
    * Optional link for attribution.
    */
  var attributionLink: js.UndefOr[String] = js.native
  /**
    * Optional base table identifier if this table is a view or merged table.
    */
  var baseTableIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Columns in the table.
    */
  var columns: js.UndefOr[js.Array[Schema$Column]] = js.native
  /**
    * Optional description assigned to the table.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Variable for whether table is exportable.
    */
  var isExportable: js.UndefOr[Boolean] = js.native
  /**
    * Type name: a template for an individual table.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name assigned to a table.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional sql that encodes the table definition for derived tables.
    */
  var sql: js.UndefOr[String] = js.native
  /**
    * Encrypted unique alphanumeric identifier for the table.
    */
  var tableId: js.UndefOr[String] = js.native
}

object Schema$Table {
  @scala.inline
  def apply(
    attribution: String = null,
    attributionLink: String = null,
    baseTableIds: js.Array[String] = null,
    columns: js.Array[Schema$Column] = null,
    description: String = null,
    isExportable: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    name: String = null,
    sql: String = null,
    tableId: String = null
  ): Schema$Table = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (attributionLink != null) __obj.updateDynamic("attributionLink")(attributionLink.asInstanceOf[js.Any])
    if (baseTableIds != null) __obj.updateDynamic("baseTableIds")(baseTableIds.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isExportable)) __obj.updateDynamic("isExportable")(isExportable.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sql != null) __obj.updateDynamic("sql")(sql.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Table]
  }
}

