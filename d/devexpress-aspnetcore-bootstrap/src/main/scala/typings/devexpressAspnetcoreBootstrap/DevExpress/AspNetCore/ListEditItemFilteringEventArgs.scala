package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEditItemFilteringEventArgs extends EventArgs {
  val filter: String = js.native
  var isFit: Boolean = js.native
  val item: BootstrapListBoxItem = js.native
}

object ListEditItemFilteringEventArgs {
  @scala.inline
  def apply(filter: String, isFit: Boolean, item: BootstrapListBoxItem, sender: Control): ListEditItemFilteringEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], isFit = isFit.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEditItemFilteringEventArgs]
  }
  @scala.inline
  implicit class ListEditItemFilteringEventArgsOps[Self <: ListEditItemFilteringEventArgs] (val x: Self) extends AnyVal {
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFit(value: Boolean): Self = this.set("isFit", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: BootstrapListBoxItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

