package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardSpecialValuesStatic extends js.Object {
  /**
    * Represents an error value (for instance, this can be a calculated field value that cannot be evaluated).
    */
  var ErrorValue: String
  /**
    * Represents a null value.
    */
  var NullValue: String
  /**
    * Represents a null value in OLAP mode.
    */
  var OlapNullValue: String
  /**
    * Represents an Others value.
    */
  var OthersValue: String
  /**
    * Returns whether or not the specified value is an ErrorValue.
    * @param value The specified value.
    */
  def IsErrorValue(value: js.Object): Boolean
  /**
    * Returns whether or not the specified value is an NullValue.
    * @param value The specified value.
    */
  def IsNullValue(value: js.Object): Boolean
  /**
    * Returns whether or not the specified value is an OlapNullValue.
    * @param value The specified value.
    */
  def IsOlapNullValue(value: js.Object): Boolean
  /**
    * Returns whether or not the specified value is an OthersValue.
    * @param value The specified value.
    */
  def IsOthersValue(value: js.Object): Boolean
}

object DashboardSpecialValuesStatic {
  @scala.inline
  def apply(
    ErrorValue: String,
    IsErrorValue: js.Object => Boolean,
    IsNullValue: js.Object => Boolean,
    IsOlapNullValue: js.Object => Boolean,
    IsOthersValue: js.Object => Boolean,
    NullValue: String,
    OlapNullValue: String,
    OthersValue: String
  ): DashboardSpecialValuesStatic = {
    val __obj = js.Dynamic.literal(ErrorValue = ErrorValue, IsErrorValue = js.Any.fromFunction1(IsErrorValue), IsNullValue = js.Any.fromFunction1(IsNullValue), IsOlapNullValue = js.Any.fromFunction1(IsOlapNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), NullValue = NullValue, OlapNullValue = OlapNullValue, OthersValue = OthersValue)
  
    __obj.asInstanceOf[DashboardSpecialValuesStatic]
  }
}

