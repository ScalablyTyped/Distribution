package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for cancellable events which concern manipulations on groups.
  */
@JSGlobal("ASPxClientNavBarGroupCancelEventArgs")
@js.native
class ASPxClientNavBarGroupCancelEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientNavBarGroupCancelEventArgs {
  /**
    * Initializes a new object of the ASPxClientNavBarGroupCancelEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param group An ASPxClientNavBarGroup object that represents a group related to the event.
    */
  def this(processOnServer: Boolean, group: typings.devexpressWeb.ASPxClientNavBarGroup) = this()
}

