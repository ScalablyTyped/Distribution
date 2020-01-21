package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on groups.
  */
@JSGlobal("ASPxClientNavBarGroupEventArgs")
@js.native
class ASPxClientNavBarGroupEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the ASPxClientNavBarGroupEventArgs type with the specified value.
    * @param group An ASPxClientNavBarGroup object representing the group related to the event.
    */
  def this(group: ASPxClientNavBarGroup) = this()
  /**
    * Gets the group object related to the event.
    */
  var group: ASPxClientNavBarGroup = js.native
}

