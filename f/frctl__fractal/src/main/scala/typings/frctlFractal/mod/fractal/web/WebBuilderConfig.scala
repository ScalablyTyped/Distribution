package typings.frctlFractal.mod.fractal.web

import typings.frctlFractal.mod.WebTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebBuilderConfig extends js.Object {
  var concurrency: js.UndefOr[Double] = js.native
  var dest: js.UndefOr[String] = js.native
  var ext: js.UndefOr[String] = js.native
  var theme: js.UndefOr[WebTheme | String] = js.native
  var urls: js.UndefOr[WebBuilderUrls] = js.native
}

object WebBuilderConfig {
  @scala.inline
  def apply(): WebBuilderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebBuilderConfig]
  }
  @scala.inline
  implicit class WebBuilderConfigOps[Self <: WebBuilderConfig] (val x: Self) extends AnyVal {
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
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setTheme(value: WebTheme | String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setUrls(value: WebBuilderUrls): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
  
}

