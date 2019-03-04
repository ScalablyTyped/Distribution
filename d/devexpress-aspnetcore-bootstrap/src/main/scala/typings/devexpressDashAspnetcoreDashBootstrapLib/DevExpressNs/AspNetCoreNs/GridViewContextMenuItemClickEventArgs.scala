package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewContextMenuItemClickEventArgs extends ProcessingModeEventArgs {
  val elementIndex: scala.Double
  var handled: scala.Boolean
  val item: BootstrapMenuItem
  val objectType: java.lang.String
  var usePostBack: scala.Boolean
}

object GridViewContextMenuItemClickEventArgs {
  @scala.inline
  def apply(
    elementIndex: scala.Double,
    handled: scala.Boolean,
    item: BootstrapMenuItem,
    objectType: java.lang.String,
    processOnServer: scala.Boolean,
    sender: Control,
    usePostBack: scala.Boolean
  ): GridViewContextMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(elementIndex = elementIndex, handled = handled, item = item, objectType = objectType, processOnServer = processOnServer, sender = sender, usePostBack = usePostBack)
  
    __obj.asInstanceOf[GridViewContextMenuItemClickEventArgs]
  }
}

