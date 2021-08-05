package typings.googleAppsScript.GoogleAppsScript.DataStudio

import typings.googleAppsScript.googleAppsScriptStrings.BETWEEN
import typings.googleAppsScript.googleAppsScriptStrings.CONTAINS
import typings.googleAppsScript.googleAppsScriptStrings.EQUALS
import typings.googleAppsScript.googleAppsScriptStrings.EXCLUDE
import typings.googleAppsScript.googleAppsScriptStrings.INCLUDE
import typings.googleAppsScript.googleAppsScriptStrings.IN_LIST
import typings.googleAppsScript.googleAppsScriptStrings.IS_NULL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionsFilters extends StObject {
  
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
  
  inline def apply(
    fieldName: String,
    operator: EQUALS | CONTAINS | RegexpOperator | IN_LIST | IS_NULL | BETWEEN | NumericOperator,
    `type`: INCLUDE | EXCLUDE,
    values: js.Array[String]
  ): DimensionsFilters = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionsFilters]
  }
  
  extension [Self <: DimensionsFilters](x: Self) {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: EQUALS | CONTAINS | RegexpOperator | IN_LIST | IS_NULL | BETWEEN | NumericOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setType(value: INCLUDE | EXCLUDE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
