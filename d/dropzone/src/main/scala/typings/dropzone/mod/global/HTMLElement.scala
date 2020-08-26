package typings.dropzone.mod.global

import typings.dropzone.mod.Dropzone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends js.Object {
  var dropzone: Dropzone = js.native
}

object HTMLElement {
  @scala.inline
  def apply(dropzone: Dropzone): HTMLElement = {
    val __obj = js.Dynamic.literal(dropzone = dropzone.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElement]
  }
  @scala.inline
  implicit class HTMLElementOps[Self <: HTMLElement] (val x: Self) extends AnyVal {
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
    def setDropzone(value: Dropzone): Self = this.set("dropzone", value.asInstanceOf[js.Any])
  }
  
}

