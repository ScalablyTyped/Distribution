package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.ColumnResized event.
  */
@JSGlobal("ASPxClientTreeListColumnResizedEventArgs")
@js.native
class ASPxClientTreeListColumnResizedEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListColumnResizedEventArgs class with the specified setting.
    * @param column A ASPxClientTreeListColumn object that is the column related to the event.
    */
  def this(column: ASPxClientTreeListColumn) = this()
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientTreeListColumn = js.native
}

