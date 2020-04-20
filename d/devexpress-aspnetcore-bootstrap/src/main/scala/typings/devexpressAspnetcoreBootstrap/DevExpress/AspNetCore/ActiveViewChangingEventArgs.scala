package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveViewChangingEventArgs extends EventArgs {
  var cancel: Boolean
  val newView: BootstrapSchedulerViewType
  val oldView: BootstrapSchedulerViewType
}

object ActiveViewChangingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    newView: BootstrapSchedulerViewType,
    oldView: BootstrapSchedulerViewType,
    sender: Control
  ): ActiveViewChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], newView = newView.asInstanceOf[js.Any], oldView = oldView.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveViewChangingEventArgs]
  }
}

