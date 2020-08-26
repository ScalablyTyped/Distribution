package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderTemplateRenderingEventArgs extends js.Object {
  /** Returns drilldown header.
    */
  var originalEvent: js.UndefOr[js.Any] = js.native
}

object HeaderTemplateRenderingEventArgs {
  @scala.inline
  def apply(): HeaderTemplateRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderTemplateRenderingEventArgs]
  }
  @scala.inline
  implicit class HeaderTemplateRenderingEventArgsOps[Self <: HeaderTemplateRenderingEventArgs] (val x: Self) extends AnyVal {
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
    def setOriginalEvent(value: js.Any): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
  }
  
}

