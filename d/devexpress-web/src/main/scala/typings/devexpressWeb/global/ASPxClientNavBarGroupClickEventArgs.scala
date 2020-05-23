package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern clicking on the control's group headers.
  */
@JSGlobal("ASPxClientNavBarGroupClickEventArgs")
@js.native
class ASPxClientNavBarGroupClickEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientNavBarGroupClickEventArgs {
  /**
    * Initializes a new object of the ASPxClientNavBarGroupClickEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param group An ASPxClientNavBarGroup object that represents a group related to the event.
    * @param htmlElement An HTML object that contains the processed navbar group.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(
    processOnServer: Boolean,
    group: typings.devexpressWeb.ASPxClientNavBarGroup,
    htmlElement: js.Any,
    htmlEvent: js.Any
  ) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the group object related to the event.
    */
  /* CompleteClass */
  override var group: typings.devexpressWeb.ASPxClientNavBarGroup = js.native
  /**
    * Gets the HTML object that contains the processed group.
    */
  /* CompleteClass */
  override var htmlElement: js.Any = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  override var htmlEvent: js.Any = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
}

