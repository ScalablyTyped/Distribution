package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.RowCollapsing and ASPxClientGridView.RowExpanding events.
  */
@JSGlobal("ASPxClientGridViewRowCancelEventArgs")
@js.native
class ASPxClientGridViewRowCancelEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientGridViewRowCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewRowCancelEventArgs class.
    * @param visibleIndex An integer value that identifies the processed row. This value is assigned to the ASPxClientGridViewRowCancelEventArgs.visibleIndex property.
    */
  def this(visibleIndex: Double) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the processed row's visible index.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

