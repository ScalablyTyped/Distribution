package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base class for classes that provide data for client-side events related to dashboard items.
  */
@JSGlobal("ASPxClientDashboardItemEventArgs")
@js.native
class ASPxClientDashboardItemEventArgs ()
  extends typings.devexpressWeb.ASPxClientDashboardItemEventArgs {
  /**
    * Gets the component name of the dashboard item.
    */
  /* CompleteClass */
  override var ItemName: String = js.native
  /**
    * Returns whether the specified value is null. true, if the specified value is null; otherwise, false.
    * @param value The specified value.
    */
  /* CompleteClass */
  override def IsNullValue(value: js.Any): Boolean = js.native
  /**
    * Returns whether the specified value is 'others'. true, if the specified value is 'others'; otherwise, false.
    * @param value The specified value.
    */
  /* CompleteClass */
  override def IsOthersValue(value: js.Any): Boolean = js.native
}

