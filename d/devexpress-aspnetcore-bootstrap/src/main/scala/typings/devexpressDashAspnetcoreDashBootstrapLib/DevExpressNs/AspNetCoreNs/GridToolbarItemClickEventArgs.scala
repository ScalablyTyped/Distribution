package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridToolbarItemClickEventArgs extends ProcessingModeEventArgs {
  val item: BootstrapMenuItem
  val toolbarIndex: scala.Double
  val toolbarName: java.lang.String
  var usePostBack: scala.Boolean
}

object GridToolbarItemClickEventArgs {
  @scala.inline
  def apply(
    item: BootstrapMenuItem,
    processOnServer: scala.Boolean,
    sender: Control,
    toolbarIndex: scala.Double,
    toolbarName: java.lang.String,
    usePostBack: scala.Boolean
  ): GridToolbarItemClickEventArgs = {
    val __obj = js.Dynamic.literal(item = item, processOnServer = processOnServer, sender = sender, toolbarIndex = toolbarIndex, toolbarName = toolbarName, usePostBack = usePostBack)
  
    __obj.asInstanceOf[GridToolbarItemClickEventArgs]
  }
}

