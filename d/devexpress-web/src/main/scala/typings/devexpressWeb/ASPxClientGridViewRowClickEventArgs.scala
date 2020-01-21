package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.RowClick event.
  */
@JSGlobal("ASPxClientGridViewRowClickEventArgs")
@js.native
class ASPxClientGridViewRowClickEventArgs protected () extends ASPxClientGridViewRowCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewRowClickEventArgs class.
    * @param visibleIndex A zero-based integer index that identifies the clicked row.
    * @param htmlEvent An object that contains parameters associated with the event. This value is assigned to the ASPxClientGridViewRowClickEventArgs.htmlEvent property.
    */
  def this(visibleIndex: Double, htmlEvent: js.Any) = this()
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.RowClick event.
    */
  var htmlEvent: js.Any = js.native
}

