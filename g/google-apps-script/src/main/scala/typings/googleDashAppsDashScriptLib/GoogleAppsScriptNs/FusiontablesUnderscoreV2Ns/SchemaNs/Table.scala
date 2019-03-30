package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var attributionLink: js.UndefOr[java.lang.String] = js.undefined
  var baseTableIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var columnPropertiesJsonSchema: js.UndefOr[java.lang.String] = js.undefined
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var isExportable: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var sql: js.UndefOr[java.lang.String] = js.undefined
  var tableId: js.UndefOr[java.lang.String] = js.undefined
  var tablePropertiesJson: js.UndefOr[java.lang.String] = js.undefined
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

