package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.CustomButtonClick event.
  */
@JSGlobal("ASPxClientVerticalGridCustomButtonEventArgs")
@js.native
class ASPxClientVerticalGridCustomButtonEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientVerticalGridCustomButtonEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridCustomButtonEventArgs class.
    * @param visibleIndex An integer value that identifies the record whose custom button has been clicked. This value is assigned to the ASPxClientVerticalGridCustomButtonEventArgs.visibleIndex property.
    * @param buttonID An integer value that identifies the clicked custom button. This value is assigned to the ASPxClientVerticalGridCustomButtonEventArgs.buttonID property.
    */
  def this(visibleIndex: Double, buttonID: String) = this()
  /**
    * Gets the value which identifies the custom button.
    */
  /* CompleteClass */
  override var buttonID: String = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
  /**
    * Gets the value which identifies the record whose custom button has been clicked.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

