package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.RowFocusing event.
  */
@JSGlobal("ASPxClientGridViewRowFocusingEventArgs")
@js.native
class ASPxClientGridViewRowFocusingEventArgs protected () extends ASPxClientGridViewRowCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewRowFocusingEventArgs class.
    * @param visibleIndex An integer value specifying the row visible index.
    * @param htmlEvent An object specifying the HTML event.
    */
  def this(visibleIndex: Double, htmlEvent: js.Any) = this()
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.RowFocusing event.
    */
  var htmlEvent: js.Any = js.native
}

