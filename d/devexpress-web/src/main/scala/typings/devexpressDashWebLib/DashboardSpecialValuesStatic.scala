package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardSpecialValuesStatic extends js.Object {
  /**
    * Represents an error value (for instance, this can be a calculated field value that cannot be evaluated).
    */
  var ErrorValue: java.lang.String
  /**
    * Represents a null value.
    */
  var NullValue: java.lang.String
  /**
    * Represents a null value in OLAP mode.
    */
  var OlapNullValue: java.lang.String
  /**
    * Represents an Others value.
    */
  var OthersValue: java.lang.String
  /**
    * Returns whether or not the specified value is an ErrorValue.
    * @param value The specified value.
    */
  def IsErrorValue(value: js.Object): scala.Boolean
  /**
    * Returns whether or not the specified value is an NullValue.
    * @param value The specified value.
    */
  def IsNullValue(value: js.Object): scala.Boolean
  /**
    * Returns whether or not the specified value is an OlapNullValue.
    * @param value The specified value.
    */
  def IsOlapNullValue(value: js.Object): scala.Boolean
  /**
    * Returns whether or not the specified value is an OthersValue.
    * @param value The specified value.
    */
  def IsOthersValue(value: js.Object): scala.Boolean
}

object DashboardSpecialValuesStatic {
  @scala.inline
  def apply(
    ErrorValue: java.lang.String,
    IsErrorValue: js.Object => scala.Boolean,
    IsNullValue: js.Object => scala.Boolean,
    IsOlapNullValue: js.Object => scala.Boolean,
    IsOthersValue: js.Object => scala.Boolean,
    NullValue: java.lang.String,
    OlapNullValue: java.lang.String,
    OthersValue: java.lang.String
  ): DashboardSpecialValuesStatic = {
    val __obj = js.Dynamic.literal(ErrorValue = ErrorValue, IsErrorValue = js.Any.fromFunction1(IsErrorValue), IsNullValue = js.Any.fromFunction1(IsNullValue), IsOlapNullValue = js.Any.fromFunction1(IsOlapNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), NullValue = NullValue, OlapNullValue = OlapNullValue, OthersValue = OthersValue)
  
    __obj.asInstanceOf[DashboardSpecialValuesStatic]
  }
}

