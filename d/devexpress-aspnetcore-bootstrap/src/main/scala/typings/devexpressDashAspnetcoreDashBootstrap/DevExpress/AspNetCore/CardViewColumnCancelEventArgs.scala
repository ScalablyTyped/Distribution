package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewColumnCancelEventArgs extends CancelEventArgs {
  val column: BootstrapCardViewColumn
}

object CardViewColumnCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, column: BootstrapCardViewColumn, sender: Control): CardViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, column = column, sender = sender)
  
    __obj.asInstanceOf[CardViewColumnCancelEventArgs]
  }
}

