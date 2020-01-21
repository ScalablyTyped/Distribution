package typings.googleAppsScript.GoogleAppsScript.DataStudio

import typings.googleAppsScript.googleAppsScriptStrings.BETWEEN
import typings.googleAppsScript.googleAppsScriptStrings.CONTAINS
import typings.googleAppsScript.googleAppsScriptStrings.EQUALS
import typings.googleAppsScript.googleAppsScriptStrings.EXCLUDE
import typings.googleAppsScript.googleAppsScriptStrings.INCLUDE
import typings.googleAppsScript.googleAppsScriptStrings.IN_LIST
import typings.googleAppsScript.googleAppsScriptStrings.IS_NULL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionsFilters extends js.Object {
  /** The name of the field to be filtered */
  var fieldName: String
  /** The operator to apply. */
  var operator: EQUALS | CONTAINS | RegexpOperator | IN_LIST | IS_NULL | BETWEEN | NumericOperator
  /** Whether data matching this filter should be included or excluded from the getData() response. */
  var `type`: INCLUDE | EXCLUDE
  /** An array of values to use for the operator. */
  var values: js.Array[String]
}

object DimensionsFilters {
  @scala.inline
  def apply(
    fieldName: String,
    operator: EQUALS | CONTAINS | RegexpOperator | IN_LIST | IS_NULL | BETWEEN | NumericOperator,
    `type`: INCLUDE | EXCLUDE,
    values: js.Array[String]
  ): DimensionsFilters = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionsFilters]
  }
}

