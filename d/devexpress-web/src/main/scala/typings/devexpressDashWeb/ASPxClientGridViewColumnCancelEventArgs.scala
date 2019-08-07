package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancelable events of a client ASPxGridView column.
  */
@JSGlobal("ASPxClientGridViewColumnCancelEventArgs")
@js.native
class ASPxClientGridViewColumnCancelEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new isntance of the ASPxClientGridViewColumnCancelEventArgs class.
    * @param column An ASPxClientGridViewColumn object that represents the processed column.
    */
  def this(column: ASPxClientGridViewColumn) = this()
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientGridViewColumn = js.native
}

