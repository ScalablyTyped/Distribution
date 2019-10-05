package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.BETWEEN
import typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.CONTAINS
import typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.EQUALS
import typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.EXCLUDE
import typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.INCLUDE
import typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.IN_LIST
import typings.googleDashAppsDashScript.googleDashAppsDashScriptStrings.IS_NULL
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
    val __obj = js.Dynamic.literal(fieldName = fieldName, operator = operator.asInstanceOf[js.Any], values = values)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionsFilters]
  }
}

