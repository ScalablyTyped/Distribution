package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancelable events of a client ASPxCardView column.
  */
@JSGlobal("ASPxClientCardViewColumnCancelEventArgs")
@js.native
class ASPxClientCardViewColumnCancelEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new isntance of the ASPxClientCardViewColumnCancelEventArgs class.
    * @param column An ASPxClientCardViewColumn object that represents the processed column.
    */
  def this(column: ASPxClientCardViewColumn) = this()
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientCardViewColumn = js.native
}

