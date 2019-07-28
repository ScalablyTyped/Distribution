package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditRowValidatingEventArgs extends EventArgs {
  val validationInfo: js.Any
  val visibleIndex: Double
}

object GridViewBatchEditRowValidatingEventArgs {
  @scala.inline
  def apply(sender: Control, validationInfo: js.Any, visibleIndex: Double): GridViewBatchEditRowValidatingEventArgs = {
    val __obj = js.Dynamic.literal(sender = sender, validationInfo = validationInfo, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[GridViewBatchEditRowValidatingEventArgs]
  }
}

