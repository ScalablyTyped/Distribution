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

