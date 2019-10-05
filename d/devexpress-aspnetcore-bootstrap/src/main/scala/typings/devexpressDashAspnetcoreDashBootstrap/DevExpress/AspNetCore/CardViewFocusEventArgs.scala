package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewFocusEventArgs extends ProcessingModeEventArgs {
  val isChangedOnServer: Boolean
}

object CardViewFocusEventArgs {
  @scala.inline
  def apply(isChangedOnServer: Boolean, processOnServer: Boolean, sender: Control): CardViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[CardViewFocusEventArgs]
  }
}

