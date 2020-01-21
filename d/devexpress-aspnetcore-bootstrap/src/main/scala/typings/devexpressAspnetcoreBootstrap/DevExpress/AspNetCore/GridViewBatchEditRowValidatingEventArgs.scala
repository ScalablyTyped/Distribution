package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any], validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridViewBatchEditRowValidatingEventArgs]
  }
}

