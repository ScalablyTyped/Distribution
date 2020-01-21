package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the dimension metadata.
  */
@JSGlobal("ASPxClientDashboardItemDataDimension")
@js.native
class ASPxClientDashboardItemDataDimension () extends js.Object {
  /**
    * Gets the data member identifier for the current dimension.
    */
  var DataMember: String = js.native
  /**
    * Gets the group interval for date-time values for the current dimension.
    */
  var DateTimeGroupInterval: String = js.native
  /**
    * Gets the dimension identifier.
    */
  var Id: String = js.native
  /**
    * Gets or sets the name of the dimension.
    */
  var Name: String = js.native
  /**
    * Gets the group interval for string values.
    */
  var TextGroupInterval: String = js.native
  /**
    * Formats the specified value using format settings of the current dimension. A String that represents the formatted value.
    * @param value A value to be formatted.
    */
  def Format(value: js.Any): String = js.native
}

