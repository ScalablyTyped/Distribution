package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ColumnResized event.
  */
trait ASPxClientTreeListColumnResizedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the processed client column.
    * Value: An <see cref="ASPxClientTreeListColumn" /> object that is the processed column.
    */
  var column: ASPxClientTreeListColumn
}

object ASPxClientTreeListColumnResizedEventArgs {
  @scala.inline
  def apply(column: ASPxClientTreeListColumn, processOnServer: Boolean): ASPxClientTreeListColumnResizedEventArgs = {
    val __obj = js.Dynamic.literal(column = column, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientTreeListColumnResizedEventArgs]
  }
}

