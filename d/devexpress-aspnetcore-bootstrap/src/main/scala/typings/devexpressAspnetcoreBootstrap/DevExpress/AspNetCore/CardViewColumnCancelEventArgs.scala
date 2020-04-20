package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewColumnCancelEventArgs extends CancelEventArgs {
  val column: BootstrapCardViewColumn
}

object CardViewColumnCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, column: BootstrapCardViewColumn, sender: Control): CardViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewColumnCancelEventArgs]
  }
}

