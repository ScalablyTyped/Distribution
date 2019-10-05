package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditCardValidatingEventArgs extends EventArgs {
  val validationInfo: js.Any
  val visibleIndex: Double
}

object CardViewBatchEditCardValidatingEventArgs {
  @scala.inline
  def apply(sender: Control, validationInfo: js.Any, visibleIndex: Double): CardViewBatchEditCardValidatingEventArgs = {
    val __obj = js.Dynamic.literal(sender = sender, validationInfo = validationInfo, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[CardViewBatchEditCardValidatingEventArgs]
  }
}

