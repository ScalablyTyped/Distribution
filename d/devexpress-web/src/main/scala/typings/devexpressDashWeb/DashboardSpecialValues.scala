package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides access to dashboard special values.
  */
@JSGlobal("DashboardSpecialValues")
@js.native
class DashboardSpecialValues () extends js.Object

/* static members */
@JSGlobal("DashboardSpecialValues")
@js.native
object DashboardSpecialValues extends js.Object {
  /**
    * Represents an error value (for instance, this can be a calculated field value that cannot be evaluated).
    */
  val ErrorValue: String = js.native
  /**
    * Represents a null value.
    */
  val NullValue: String = js.native
  /**
    * Represents a null value in OLAP mode.
    */
  val OlapNullValue: String = js.native
  /**
    * Represents an Others value.
    */
  val OthersValue: String = js.native
  /**
    * Returns whether the specified value is an DashboardSpecialValues.ErrorValue. true, if the specified value is an DashboardSpecialValues.ErrorValue; otherwise, false.
    * @param value The specified value.
    */
  def IsErrorValue(value: js.Any): Boolean = js.native
  /**
    * Returns whether the specified value is an DashboardSpecialValues.NullValue. true, if the specified value is an DashboardSpecialValues.NullValue; otherwise, false.
    * @param value The specified value.
    */
  def IsNullValue(value: js.Any): Boolean = js.native
  /**
    * Returns whether the specified value is an DashboardSpecialValues.OlapNullValue. true, if the specified value is an DashboardSpecialValues.OlapNullValue; otherwise, false.
    * @param value The specified value.
    */
  def IsOlapNullValue(value: js.Any): Boolean = js.native
  /**
    * Returns whether the specified value is an DashboardSpecialValues.OthersValue. true, if the specified value is an DashboardSpecialValues.OthersValue; otherwise, false.
    * @param value The specified value.
    */
  def IsOthersValue(value: js.Any): Boolean = js.native
}

