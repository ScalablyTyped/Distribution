package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewFocusEventArgs extends ProcessingModeEventArgs {
  val isChangedOnServer: scala.Boolean
}

object CardViewFocusEventArgs {
  @scala.inline
  def apply(isChangedOnServer: scala.Boolean, processOnServer: scala.Boolean, sender: Control): CardViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[CardViewFocusEventArgs]
  }
}

