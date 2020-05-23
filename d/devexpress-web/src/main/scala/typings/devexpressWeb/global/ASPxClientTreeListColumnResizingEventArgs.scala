package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.ColumnResizing event.
  */
@JSGlobal("ASPxClientTreeListColumnResizingEventArgs")
@js.native
class ASPxClientTreeListColumnResizingEventArgs ()
  extends typings.devexpressWeb.ASPxClientTreeListColumnResizingEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the processed client column.
    */
  /* CompleteClass */
  override var column: typings.devexpressWeb.ASPxClientTreeListColumn = js.native
}

