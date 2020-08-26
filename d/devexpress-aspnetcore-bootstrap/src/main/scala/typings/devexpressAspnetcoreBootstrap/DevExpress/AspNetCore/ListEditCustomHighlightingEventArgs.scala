package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEditCustomHighlightingEventArgs extends EventArgs {
  val filter: String = js.native
  var highlighting: js.Any = js.native
}

object ListEditCustomHighlightingEventArgs {
  @scala.inline
  def apply(filter: String, highlighting: js.Any, sender: Control): ListEditCustomHighlightingEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], highlighting = highlighting.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEditCustomHighlightingEventArgs]
  }
  @scala.inline
  implicit class ListEditCustomHighlightingEventArgsOps[Self <: ListEditCustomHighlightingEventArgs] (val x: Self) extends AnyVal {
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
    def setHighlighting(value: js.Any): Self = this.set("highlighting", value.asInstanceOf[js.Any])
  }
  
}

