package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditCardInsertingEventArgs extends CancelEventArgs {
  val visibleIndex: Double
}

object CardViewBatchEditCardInsertingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, sender: Control, visibleIndex: Double): CardViewBatchEditCardInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[CardViewBatchEditCardInsertingEventArgs]
  }
}

