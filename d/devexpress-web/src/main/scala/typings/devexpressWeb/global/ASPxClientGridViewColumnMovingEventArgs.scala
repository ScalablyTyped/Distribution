package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.ColumnMoving event.
  */
@JSGlobal("ASPxClientGridViewColumnMovingEventArgs")
@js.native
class ASPxClientGridViewColumnMovingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientGridViewColumnMovingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewColumnMovingEventArgs class.
    * @param sourceColumn An ASPxClientGridViewColumn object that represents the column currently being dragged by an end-user. This value is assigned to the ASPxClientGridViewColumnMovingEventArgs.sourceColumn property.
    * @param destinationColumn An ASPxClientGridViewColumn object that represents the target column. This value is assigned to the ASPxClientGridViewColumnMovingEventArgs.destinationColumn property.
    * @param isDropBefore true if the source column will be inserted before the target column (if dropped); otherwise, false. This value is assigned to the ASPxClientGridViewColumnMovingEventArgs.isDropBefore property.
    * @param isGroupPanel true if the source column is currently over the Group Panel; otherwise, false. This value is assigned to the ASPxClientGridViewColumnMovingEventArgs.isGroupPanel property.
    */
  def this(
    sourceColumn: typings.devexpressWeb.ASPxClientGridViewColumn,
    destinationColumn: typings.devexpressWeb.ASPxClientGridViewColumn,
    isDropBefore: Boolean,
    isGroupPanel: Boolean
  ) = this()
  /**
    * Gets or sets whether a column is allowed to be moved.
    */
  /* CompleteClass */
  override var allow: Boolean = js.native
  /**
    * Gets the target column, before or after which the source column will be inserted (if dropped).
    */
  /* CompleteClass */
  override var destinationColumn: typings.devexpressWeb.ASPxClientGridViewColumn = js.native
  /**
    * Gets whether the source column will be inserted before the target column (if dropped).
    */
  /* CompleteClass */
  override var isDropBefore: Boolean = js.native
  /**
    * Gets whether the source column is currently over the Group Panel.
    */
  /* CompleteClass */
  override var isGroupPanel: Boolean = js.native
  /**
    * Gets the column currently being dragged by an end-user.
    */
  /* CompleteClass */
  override var sourceColumn: typings.devexpressWeb.ASPxClientGridViewColumn = js.native
}

