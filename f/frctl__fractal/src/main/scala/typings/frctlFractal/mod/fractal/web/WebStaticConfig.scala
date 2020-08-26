package typings.frctlFractal.mod.fractal.web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebStaticConfig extends js.Object {
  var mount: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
}

object WebStaticConfig {
  @scala.inline
  def apply(): WebStaticConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebStaticConfig]
  }
  @scala.inline
  implicit class WebStaticConfigOps[Self <: WebStaticConfig] (val x: Self) extends AnyVal {
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
    def setMount(value: String): Self = this.set("mount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMount: Self = this.set("mount", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

