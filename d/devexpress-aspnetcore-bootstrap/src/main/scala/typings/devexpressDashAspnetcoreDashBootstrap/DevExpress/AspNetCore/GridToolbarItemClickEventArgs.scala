package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridToolbarItemClickEventArgs extends ProcessingModeEventArgs {
  val item: BootstrapMenuItem
  val toolbarIndex: Double
  val toolbarName: String
  var usePostBack: Boolean
}

object GridToolbarItemClickEventArgs {
  @scala.inline
  def apply(
    item: BootstrapMenuItem,
    processOnServer: Boolean,
    sender: Control,
    toolbarIndex: Double,
    toolbarName: String,
    usePostBack: Boolean
  ): GridToolbarItemClickEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], toolbarIndex = toolbarIndex.asInstanceOf[js.Any], toolbarName = toolbarName.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridToolbarItemClickEventArgs]
  }
}

