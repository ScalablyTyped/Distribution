package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.ColumnResized event.
  */
@JSGlobal("ASPxClientTreeListColumnResizedEventArgs")
@js.native
class ASPxClientTreeListColumnResizedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTreeListColumnResizedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListColumnResizedEventArgs class with the specified setting.
    * @param column A ASPxClientTreeListColumn object that is the column related to the event.
    */
  def this(column: typings.devexpressWeb.ASPxClientTreeListColumn) = this()
  /**
    * Gets the processed client column.
    */
  /* CompleteClass */
  override var column: typings.devexpressWeb.ASPxClientTreeListColumn = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
}

