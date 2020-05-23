package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancelable events of a client ASPxVerticalGrid row.
  */
@JSGlobal("ASPxClientVerticalGridRowCancelEventArgs")
@js.native
class ASPxClientVerticalGridRowCancelEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientVerticalGridRowCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridRowCancelEventArgs class.
    * @param row An ASPxClientVerticalGridRowCancelEventArgs object that represents the processed row.
    */
  def this(row: typings.devexpressWeb.ASPxClientVerticalGridRow) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the processed client row.
    */
  /* CompleteClass */
  override var row: typings.devexpressWeb.ASPxClientVerticalGridRow = js.native
}

