package typings.frctlFractal.mod.fractal.web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebBuilderUrls extends js.Object {
  var ext: js.UndefOr[String] = js.native
}

object WebBuilderUrls {
  @scala.inline
  def apply(): WebBuilderUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebBuilderUrls]
  }
  @scala.inline
  implicit class WebBuilderUrlsOps[Self <: WebBuilderUrls] (val x: Self) extends AnyVal {
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
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
  }
  
}

