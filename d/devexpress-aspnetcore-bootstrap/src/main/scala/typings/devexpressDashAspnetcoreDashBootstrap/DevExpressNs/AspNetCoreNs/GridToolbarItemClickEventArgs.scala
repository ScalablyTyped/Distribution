package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal(item = item, processOnServer = processOnServer, sender = sender, toolbarIndex = toolbarIndex, toolbarName = toolbarName, usePostBack = usePostBack)
  
    __obj.asInstanceOf[GridToolbarItemClickEventArgs]
  }
}

