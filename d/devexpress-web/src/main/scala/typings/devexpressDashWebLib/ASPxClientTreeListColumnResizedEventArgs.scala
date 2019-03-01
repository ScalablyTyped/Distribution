package typings
package devexpressDashWebLib

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
  def apply(column: ASPxClientTreeListColumn, processOnServer: scala.Boolean): ASPxClientTreeListColumnResizedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.asInstanceOf[ASPxClientTreeListColumnResizedEventArgs]
  }
}

