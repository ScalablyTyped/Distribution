package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewFocusEventArgs extends ProcessingModeEventArgs {
  val isChangedOnServer: scala.Boolean
}

object GridViewFocusEventArgs {
  @scala.inline
  def apply(isChangedOnServer: scala.Boolean, processOnServer: scala.Boolean, sender: Control): GridViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[GridViewFocusEventArgs]
  }
}

