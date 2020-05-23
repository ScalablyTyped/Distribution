package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.ColumnMoving event.
  */
trait ASPxClientGridViewColumnMovingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether a column is allowed to be moved.
    */
  var allow: Boolean
  /**
    * Gets the target column, before or after which the source column will be inserted (if dropped).
    */
  var destinationColumn: ASPxClientGridViewColumn
  /**
    * Gets whether the source column will be inserted before the target column (if dropped).
    */
  var isDropBefore: Boolean
  /**
    * Gets whether the source column is currently over the Group Panel.
    */
  var isGroupPanel: Boolean
  /**
    * Gets the column currently being dragged by an end-user.
    */
  var sourceColumn: ASPxClientGridViewColumn
}

object ASPxClientGridViewColumnMovingEventArgs {
  @scala.inline
  def apply(
    allow: Boolean,
    destinationColumn: ASPxClientGridViewColumn,
    isDropBefore: Boolean,
    isGroupPanel: Boolean,
    sourceColumn: ASPxClientGridViewColumn
  ): ASPxClientGridViewColumnMovingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], destinationColumn = destinationColumn.asInstanceOf[js.Any], isDropBefore = isDropBefore.asInstanceOf[js.Any], isGroupPanel = isGroupPanel.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewColumnMovingEventArgs]
  }
}

