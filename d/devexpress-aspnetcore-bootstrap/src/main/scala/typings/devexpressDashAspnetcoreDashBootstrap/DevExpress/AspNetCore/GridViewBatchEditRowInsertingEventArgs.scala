package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditRowInsertingEventArgs extends CancelEventArgs {
  val visibleIndex: Double
}

object GridViewBatchEditRowInsertingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, sender: Control, visibleIndex: Double): GridViewBatchEditRowInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[GridViewBatchEditRowInsertingEventArgs]
  }
}

