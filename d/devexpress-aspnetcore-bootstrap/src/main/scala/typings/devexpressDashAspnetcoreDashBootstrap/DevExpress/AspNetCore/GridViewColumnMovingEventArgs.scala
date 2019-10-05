package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewColumnMovingEventArgs extends EventArgs {
  var allow: Boolean
  val destinationColumn: BootstrapGridViewColumn
  val isDropBefore: Boolean
  val isGroupPanel: Boolean
  val sourceColumn: BootstrapGridViewColumn
}

object GridViewColumnMovingEventArgs {
  @scala.inline
  def apply(
    allow: Boolean,
    destinationColumn: BootstrapGridViewColumn,
    isDropBefore: Boolean,
    isGroupPanel: Boolean,
    sender: Control,
    sourceColumn: BootstrapGridViewColumn
  ): GridViewColumnMovingEventArgs = {
    val __obj = js.Dynamic.literal(allow = allow, destinationColumn = destinationColumn, isDropBefore = isDropBefore, isGroupPanel = isGroupPanel, sender = sender, sourceColumn = sourceColumn)
  
    __obj.asInstanceOf[GridViewColumnMovingEventArgs]
  }
}

