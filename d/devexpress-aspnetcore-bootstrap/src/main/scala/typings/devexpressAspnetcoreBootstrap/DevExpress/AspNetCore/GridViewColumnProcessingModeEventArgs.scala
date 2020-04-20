package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewColumnProcessingModeEventArgs extends ProcessingModeEventArgs {
  val column: BootstrapGridViewColumn
}

object GridViewColumnProcessingModeEventArgs {
  @scala.inline
  def apply(column: BootstrapGridViewColumn, processOnServer: Boolean, sender: Control): GridViewColumnProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewColumnProcessingModeEventArgs]
  }
}

