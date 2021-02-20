package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to dashboard special values.
  */
@JSGlobal("DashboardSpecialValues")
@js.native
class DashboardSpecialValues ()
  extends typings.devexpressWeb.DashboardSpecialValues
object DashboardSpecialValues {
  
  /**
    * Represents an error value (for instance, this can be a calculated field value that cannot be evaluated).
    */
  /* static member */
  @JSGlobal("DashboardSpecialValues.ErrorValue")
  @js.native
  val ErrorValue: String = js.native
  
  /**
    * Returns whether the specified value is an DashboardSpecialValues.ErrorValue. true, if the specified value is an DashboardSpecialValues.ErrorValue; otherwise, false.
    * @param value The specified value.
    */
  /* static member */
  @JSGlobal("DashboardSpecialValues.IsErrorValue")
  @js.native
  def IsErrorValue(value: js.Any): Boolean = js.native
  
  /**
    * Returns whether the specified value is an DashboardSpecialValues.NullValue. true, if the specified value is an DashboardSpecialValues.NullValue; otherwise, false.
    * @param value The specified value.
    */
  /* static member */
  @JSGlobal("DashboardSpecialValues.IsNullValue")
  @js.native
  def IsNullValue(value: js.Any): Boolean = js.native
  
  /**
    * Returns whether the specified value is an DashboardSpecialValues.OlapNullValue. true, if the specified value is an DashboardSpecialValues.OlapNullValue; otherwise, false.
    * @param value The specified value.
    */
  /* static member */
  @JSGlobal("DashboardSpecialValues.IsOlapNullValue")
  @js.native
  def IsOlapNullValue(value: js.Any): Boolean = js.native
  
  /**
    * Returns whether the specified value is an DashboardSpecialValues.OthersValue. true, if the specified value is an DashboardSpecialValues.OthersValue; otherwise, false.
    * @param value The specified value.
    */
  /* static member */
  @JSGlobal("DashboardSpecialValues.IsOthersValue")
  @js.native
  def IsOthersValue(value: js.Any): Boolean = js.native
  
  /**
    * Represents a null value.
    */
  /* static member */
  @JSGlobal("DashboardSpecialValues.NullValue")
  @js.native
  val NullValue: String = js.native
  
  /**
    * Represents a null value in OLAP mode.
    */
  /* static member */
  @JSGlobal("DashboardSpecialValues.OlapNullValue")
  @js.native
  val OlapNullValue: String = js.native
  
  /**
    * Represents an Others value.
    */
  /* static member */
  @JSGlobal("DashboardSpecialValues.OthersValue")
  @js.native
  val OthersValue: String = js.native
}
