package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to dashboard special values.
  */
@JSGlobal("DashboardSpecialValues")
@js.native
open class DashboardSpecialValues ()
  extends StObject
     with typings.devexpressWeb.DashboardSpecialValues
object DashboardSpecialValues {
  
  @JSGlobal("DashboardSpecialValues")
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def IsErrorValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsErrorValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns whether the specified value is an DashboardSpecialValues.NullValue. true, if the specified value is an DashboardSpecialValues.NullValue; otherwise, false.
    * @param value The specified value.
    */
  /* static member */
  inline def IsNullValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNullValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns whether the specified value is an DashboardSpecialValues.OlapNullValue. true, if the specified value is an DashboardSpecialValues.OlapNullValue; otherwise, false.
    * @param value The specified value.
    */
  /* static member */
  inline def IsOlapNullValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsOlapNullValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns whether the specified value is an DashboardSpecialValues.OthersValue. true, if the specified value is an DashboardSpecialValues.OthersValue; otherwise, false.
    * @param value The specified value.
    */
  /* static member */
  inline def IsOthersValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsOthersValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
