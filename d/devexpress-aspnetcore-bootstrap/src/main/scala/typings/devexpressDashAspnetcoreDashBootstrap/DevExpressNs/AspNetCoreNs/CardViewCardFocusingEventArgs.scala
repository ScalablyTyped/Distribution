package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewCardFocusingEventArgs extends CancelEventArgs {
  val htmlEvent: js.Any
  val visibleIndex: Double
}

object CardViewCardFocusingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, sender: Control, visibleIndex: Double): CardViewCardFocusingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlEvent = htmlEvent, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[CardViewCardFocusingEventArgs]
  }
}

