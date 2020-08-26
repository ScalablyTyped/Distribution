package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridViewContextMenuItemClickEventArgs extends ProcessingModeEventArgs {
  val elementIndex: Double = js.native
  var handled: Boolean = js.native
  val item: BootstrapMenuItem = js.native
  val objectType: String = js.native
  var usePostBack: Boolean = js.native
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
  @scala.inline
  implicit class GridViewContextMenuItemClickEventArgsOps[Self <: GridViewContextMenuItemClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElementIndex(value: Double): Self = this.set("elementIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: BootstrapMenuItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsePostBack(value: Boolean): Self = this.set("usePostBack", value.asInstanceOf[js.Any])
  }
  
}

