package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewContextMenuItemClickEventArgs extends ProcessingModeEventArgs {
  val elementIndex: Double
  var handled: Boolean
  val item: BootstrapMenuItem
  val objectType: String
  var usePostBack: Boolean
}

object GridViewContextMenuItemClickEventArgs {
  @scala.inline
  def apply(
    elementIndex: Double,
    handled: Boolean,
    item: BootstrapMenuItem,
    objectType: String,
    processOnServer: Boolean,
    sender: Control,
    usePostBack: Boolean
  ): GridViewContextMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(elementIndex = elementIndex.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridViewContextMenuItemClickEventArgs]
  }
}

