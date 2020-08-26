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

@js.native
trait DimensionsFilters extends js.Object {
  /** The name of the field to be filtered */
  var fieldName: String = js.native
  /** The operator to apply. */
  var operator: EQUALS | CONTAINS | RegexpOperator | IN_LIST | IS_NULL | BETWEEN | NumericOperator = js.native
  /** Whether data matching this filter should be included or excluded from the getData() response. */
  var `type`: INCLUDE | EXCLUDE = js.native
  /** An array of values to use for the operator. */
  var values: js.Array[String] = js.native
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
  @scala.inline
  implicit class DimensionsFiltersOps[Self <: DimensionsFilters] (val x: Self) extends AnyVal {
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: EQUALS | CONTAINS | RegexpOperator | IN_LIST | IS_NULL | BETWEEN | NumericOperator): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: INCLUDE | EXCLUDE): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

