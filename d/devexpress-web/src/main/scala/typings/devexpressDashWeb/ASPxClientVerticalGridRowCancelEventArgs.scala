package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancelable events of a client ASPxVerticalGrid row.
  */
@JSGlobal("ASPxClientVerticalGridRowCancelEventArgs")
@js.native
class ASPxClientVerticalGridRowCancelEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridRowCancelEventArgs class.
    * @param row An ASPxClientVerticalGridRowCancelEventArgs object that represents the processed row.
    */
  def this(row: ASPxClientVerticalGridRow) = this()
  /**
    * Gets the processed client row.
    */
  var row: ASPxClientVerticalGridRow = js.native
}

