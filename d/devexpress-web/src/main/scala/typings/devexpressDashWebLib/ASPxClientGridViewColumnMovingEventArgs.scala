package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ColumnMoving event.
  */
trait ASPxClientGridViewColumnMovingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether a column is allowed to be moved.
    * Value: true to allow column moving; otherwise, false.
    */
  var allow: scala.Boolean
  /**
    * Gets the target column, before or after which the source column will be inserted (if dropped).
    * Value: An ASPxClientGridViewColumn object that represents the target column. null (Nothing in Visual Basic) if the source column isn't over the column header panel.
    */
  var destinationColumn: ASPxClientGridViewColumn
  /**
    * Gets whether the source column will be inserted before the target column (if dropped).
    * Value: true if the source column will be inserted before the target column (if dropped); otherwise, false.
    */
  var isDropBefore: scala.Boolean
  /**
    * Gets whether the source column is currently over the Group Panel.
    * Value: true if the source column is currently over the Group Panel; otherwise, false.
    */
  var isGroupPanel: scala.Boolean
  /**
    * Gets the column currently being dragged by an end-user.
    * Value: An ASPxClientGridViewColumn object that represents the column currently being dragged by an end-user.
    */
  var sourceColumn: ASPxClientGridViewColumn
}

