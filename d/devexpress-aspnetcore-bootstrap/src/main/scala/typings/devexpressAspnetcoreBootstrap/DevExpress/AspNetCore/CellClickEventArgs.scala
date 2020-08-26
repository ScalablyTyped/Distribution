package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellClickEventArgs extends EventArgs {
  val htmlElement: js.Object = js.native
  val interval: BootstrapTimeInterval = js.native
  val resource: String = js.native
}

object CellClickEventArgs {
  @scala.inline
  def apply(htmlElement: js.Object, interval: BootstrapTimeInterval, resource: String, sender: Control): CellClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellClickEventArgs]
  }
  @scala.inline
  implicit class CellClickEventArgsOps[Self <: CellClickEventArgs] (val x: Self) extends AnyVal {
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
    def setHtmlElement(value: js.Object): Self = this.set("htmlElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: BootstrapTimeInterval): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
  }
  
}

