package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewColumnCancelEventArgs extends CancelEventArgs {
  val column: BootstrapGridViewColumn
}

object GridViewColumnCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, column: BootstrapGridViewColumn, sender: Control): GridViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewColumnCancelEventArgs]
  }
}

