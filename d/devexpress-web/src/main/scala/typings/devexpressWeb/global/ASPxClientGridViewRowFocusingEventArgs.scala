package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.RowFocusing event.
  */
@JSGlobal("ASPxClientGridViewRowFocusingEventArgs")
@js.native
class ASPxClientGridViewRowFocusingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientGridViewRowFocusingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewRowFocusingEventArgs class.
    * @param visibleIndex An integer value specifying the row visible index.
    * @param htmlEvent An object specifying the HTML event.
    */
  def this(visibleIndex: Double, htmlEvent: js.Any) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.RowFocusing event.
    */
  /* CompleteClass */
  override var htmlEvent: js.Any = js.native
  /**
    * Gets the processed row's visible index.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

