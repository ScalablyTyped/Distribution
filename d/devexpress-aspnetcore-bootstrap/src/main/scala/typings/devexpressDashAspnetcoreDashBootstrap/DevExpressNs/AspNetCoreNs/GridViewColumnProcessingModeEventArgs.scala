package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewColumnProcessingModeEventArgs extends ProcessingModeEventArgs {
  val column: BootstrapGridViewColumn
}

object GridViewColumnProcessingModeEventArgs {
  @scala.inline
  def apply(column: BootstrapGridViewColumn, processOnServer: Boolean, sender: Control): GridViewColumnProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(column = column, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[GridViewColumnProcessingModeEventArgs]
  }
}

