package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.ColumnResized event.
  */
trait ASPxClientTreeListColumnResizedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientTreeListColumn
}

object ASPxClientTreeListColumnResizedEventArgs {
  @scala.inline
  def apply(column: ASPxClientTreeListColumn, processOnServer: Boolean): ASPxClientTreeListColumnResizedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListColumnResizedEventArgs]
  }
}

