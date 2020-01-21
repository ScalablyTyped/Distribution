package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.RowCollapsing and ASPxClientGridView.RowExpanding events.
  */
@JSGlobal("ASPxClientGridViewRowCancelEventArgs")
@js.native
class ASPxClientGridViewRowCancelEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewRowCancelEventArgs class.
    * @param visibleIndex An integer value that identifies the processed row. This value is assigned to the ASPxClientGridViewRowCancelEventArgs.visibleIndex property.
    */
  def this(visibleIndex: Double) = this()
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double = js.native
}

