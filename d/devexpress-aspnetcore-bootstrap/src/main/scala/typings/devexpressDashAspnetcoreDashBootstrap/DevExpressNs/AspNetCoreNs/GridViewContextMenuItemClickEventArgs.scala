package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal(elementIndex = elementIndex, handled = handled, item = item, objectType = objectType, processOnServer = processOnServer, sender = sender, usePostBack = usePostBack)
  
    __obj.asInstanceOf[GridViewContextMenuItemClickEventArgs]
  }
}

