package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewCardClickEventArgs extends CancelEventArgs {
  val htmlEvent: js.Any
  val visibleIndex: Double
}

object CardViewCardClickEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, sender: Control, visibleIndex: Double): CardViewCardClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlEvent = htmlEvent, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[CardViewCardClickEventArgs]
  }
}

