package typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var baseColumn: js.UndefOr[ColumnBaseColumn] = js.undefined
  var columnId: js.UndefOr[Double] = js.undefined
  var columnJsonSchema: js.UndefOr[String] = js.undefined
  var columnPropertiesJson: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var formatPattern: js.UndefOr[String] = js.undefined
  var graphPredicate: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var validValues: js.UndefOr[js.Array[String]] = js.undefined
  var validateData: js.UndefOr[Boolean] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    baseColumn: ColumnBaseColumn = null,
    columnId: Int | Double = null,
    columnJsonSchema: String = null,
    columnPropertiesJson: String = null,
    description: String = null,
    formatPattern: String = null,
    graphPredicate: String = null,
    kind: String = null,
    name: String = null,
    `type`: String = null,
    validValues: js.Array[String] = null,
    validateData: js.UndefOr[Boolean] = js.undefined
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (baseColumn != null) __obj.updateDynamic("baseColumn")(baseColumn.asInstanceOf[js.Any])
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (columnJsonSchema != null) __obj.updateDynamic("columnJsonSchema")(columnJsonSchema.asInstanceOf[js.Any])
    if (columnPropertiesJson != null) __obj.updateDynamic("columnPropertiesJson")(columnPropertiesJson.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (formatPattern != null) __obj.updateDynamic("formatPattern")(formatPattern.asInstanceOf[js.Any])
    if (graphPredicate != null) __obj.updateDynamic("graphPredicate")(graphPredicate.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validValues != null) __obj.updateDynamic("validValues")(validValues.asInstanceOf[js.Any])
    if (!js.isUndefined(validateData)) __obj.updateDynamic("validateData")(validateData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

