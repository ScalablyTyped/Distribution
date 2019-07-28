package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var attributionLink: js.UndefOr[String] = js.undefined
  var baseTableIds: js.UndefOr[js.Array[String]] = js.undefined
  var columnPropertiesJsonSchema: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var isExportable: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var sql: js.UndefOr[String] = js.undefined
  var tableId: js.UndefOr[String] = js.undefined
  var tablePropertiesJson: js.UndefOr[String] = js.undefined
  var tablePropertiesJsonSchema: js.UndefOr[String] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    attribution: String = null,
    attributionLink: String = null,
    baseTableIds: js.Array[String] = null,
    columnPropertiesJsonSchema: String = null,
    columns: js.Array[Column] = null,
    description: String = null,
    isExportable: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    name: String = null,
    sql: String = null,
    tableId: String = null,
    tablePropertiesJson: String = null,
    tablePropertiesJsonSchema: String = null
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

