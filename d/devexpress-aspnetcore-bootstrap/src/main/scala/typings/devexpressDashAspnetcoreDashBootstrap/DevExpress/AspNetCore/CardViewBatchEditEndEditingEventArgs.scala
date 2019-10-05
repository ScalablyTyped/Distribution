package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditEndEditingEventArgs extends CancelEventArgs {
  val cardValues: js.Any
  val visibleIndex: Double
}

object CardViewBatchEditEndEditingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cardValues: js.Any, sender: Control, visibleIndex: Double): CardViewBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, cardValues = cardValues, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[CardViewBatchEditEndEditingEventArgs]
  }
}

