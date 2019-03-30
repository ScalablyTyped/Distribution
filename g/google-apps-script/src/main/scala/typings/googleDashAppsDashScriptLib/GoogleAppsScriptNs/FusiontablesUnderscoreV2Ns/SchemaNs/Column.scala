package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var baseColumn: js.UndefOr[ColumnBaseColumn] = js.undefined
  var columnId: js.UndefOr[scala.Double] = js.undefined
  var columnJsonSchema: js.UndefOr[java.lang.String] = js.undefined
  var columnPropertiesJson: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var formatPattern: js.UndefOr[java.lang.String] = js.undefined
  var graphPredicate: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var validValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var validateData: js.UndefOr[scala.Boolean] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    baseColumn: ColumnBaseColumn = null,
    columnId: scala.Int | scala.Double = null,
    columnJsonSchema: java.lang.String = null,
    columnPropertiesJson: java.lang.String = null,
    description: java.lang.String = null,
    formatPattern: java.lang.String = null,
    graphPredicate: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    `type`: java.lang.String = null,
    validValues: js.Array[java.lang.String] = null,
    validateData: js.UndefOr[scala.Boolean] = js.undefined
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (baseColumn != null) __obj.updateDynamic("baseColumn")(baseColumn)
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (columnJsonSchema != null) __obj.updateDynamic("columnJsonSchema")(columnJsonSchema)
    if (columnPropertiesJson != null) __obj.updateDynamic("columnPropertiesJson")(columnPropertiesJson)
    if (description != null) __obj.updateDynamic("description")(description)
    if (formatPattern != null) __obj.updateDynamic("formatPattern")(formatPattern)
    if (graphPredicate != null) __obj.updateDynamic("graphPredicate")(graphPredicate)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validValues != null) __obj.updateDynamic("validValues")(validValues)
    if (!js.isUndefined(validateData)) __obj.updateDynamic("validateData")(validateData)
    __obj.asInstanceOf[Column]
  }
}

