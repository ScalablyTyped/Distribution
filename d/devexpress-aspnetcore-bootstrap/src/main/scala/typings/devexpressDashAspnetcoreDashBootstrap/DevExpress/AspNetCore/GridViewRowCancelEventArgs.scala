package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewRowCancelEventArgs extends CancelEventArgs {
  val visibleIndex: Double
}

object GridViewRowCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, sender: Control, visibleIndex: Double): GridViewRowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[GridViewRowCancelEventArgs]
  }
}

