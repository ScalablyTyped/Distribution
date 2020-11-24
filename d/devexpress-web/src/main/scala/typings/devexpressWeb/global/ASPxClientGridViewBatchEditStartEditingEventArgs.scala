package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditStartEditing event.
  */
@JSGlobal("ASPxClientGridViewBatchEditStartEditingEventArgs")
@js.native
class ASPxClientGridViewBatchEditStartEditingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientGridViewBatchEditStartEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditStartEditingEventArgs class.
    * @param visibleIndex An integer value that is the row's visible index.
    * @param focusedColumn An  object that is the focused row.
    * @param rowValues An object that provides the row values.
    * @param key An object that provides the row's key.
    */
  def this(
    visibleIndex: Double,
    focusedColumn: typings.devexpressWeb.ASPxClientGridViewColumn,
    rowValues: js.Any,
    key: js.Any
  ) = this()
}
