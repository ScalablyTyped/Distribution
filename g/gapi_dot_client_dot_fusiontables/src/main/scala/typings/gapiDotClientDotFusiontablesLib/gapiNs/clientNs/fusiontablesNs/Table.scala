package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  /** Attribution assigned to the table. */
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  /** Optional link for attribution. */
  var attributionLink: js.UndefOr[java.lang.String] = js.undefined
  /** Base table identifier if this table is a view or merged table. */
  var baseTableIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Default JSON schema for validating all JSON column properties. */
  var columnPropertiesJsonSchema: js.UndefOr[java.lang.String] = js.undefined
  /** Columns in the table. */
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  /** Description assigned to the table. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Variable for whether table is exportable. */
  var isExportable: js.UndefOr[scala.Boolean] = js.undefined
  /** The kind of item this is. For a table, this is always fusiontables#table. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name assigned to a table. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** SQL that encodes the table definition for derived tables. */
  var sql: js.UndefOr[java.lang.String] = js.undefined
  /** Encrypted unique alphanumeric identifier for the table. */
  var tableId: js.UndefOr[java.lang.String] = js.undefined
  /** JSON object containing custom table properties. */
  var tablePropertiesJson: js.UndefOr[java.lang.String] = js.undefined
  /** JSON schema for validating the JSON table properties. */
  var tablePropertiesJsonSchema: js.UndefOr[java.lang.String] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    attributionLink: java.lang.String = null,
    baseTableIds: js.Array[java.lang.String] = null,
    columnPropertiesJsonSchema: java.lang.String = null,
    columns: js.Array[Column] = null,
    description: java.lang.String = null,
    isExportable: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    sql: java.lang.String = null,
    tableId: java.lang.String = null,
    tablePropertiesJson: java.lang.String = null,
    tablePropertiesJsonSchema: java.lang.String = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (attributionLink != null) __obj.updateDynamic("attributionLink")(attributionLink)
    if (baseTableIds != null) __obj.updateDynamic("baseTableIds")(baseTableIds)
    if (columnPropertiesJsonSchema != null) __obj.updateDynamic("columnPropertiesJsonSchema")(columnPropertiesJsonSchema)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(isExportable)) __obj.updateDynamic("isExportable")(isExportable)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sql != null) __obj.updateDynamic("sql")(sql)
    if (tableId != null) __obj.updateDynamic("tableId")(tableId)
    if (tablePropertiesJson != null) __obj.updateDynamic("tablePropertiesJson")(tablePropertiesJson)
    if (tablePropertiesJsonSchema != null) __obj.updateDynamic("tablePropertiesJsonSchema")(tablePropertiesJsonSchema)
    __obj.asInstanceOf[Table]
  }
}

