package typings.giraffe.Giraffe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentOptions extends js.Object {
  var forceRender: js.UndefOr[Boolean] = js.native
  var method: js.UndefOr[String] = js.native
  var suppressRender: js.UndefOr[Boolean] = js.native
}

object AttachmentOptions {
  @scala.inline
  def apply(): AttachmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentOptions]
  }
  @scala.inline
  implicit class AttachmentOptionsOps[Self <: AttachmentOptions] (val x: Self) extends AnyVal {
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
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceRender: Self = this.set("forceRender", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setSuppressRender(value: Boolean): Self = this.set("suppressRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressRender: Self = this.set("suppressRender", js.undefined)
  }
  
}

