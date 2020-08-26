package typings.frctlFractal.mod.fractal.web

import typings.frctlFractal.mod.WebTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebServerConfig extends js.Object {
  var port: js.UndefOr[Double] = js.native
  var sync: js.UndefOr[Boolean] = js.native
  var syncOptions: js.UndefOr[WebServerSyncOptions] = js.native
  var theme: js.UndefOr[WebTheme | String] = js.native
  var watch: js.UndefOr[Boolean] = js.native
}

object WebServerConfig {
  @scala.inline
  def apply(): WebServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebServerConfig]
  }
  @scala.inline
  implicit class WebServerConfigOps[Self <: WebServerConfig] (val x: Self) extends AnyVal {
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
    @scala.inline
    def setSyncOptions(value: WebServerSyncOptions): Self = this.set("syncOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncOptions: Self = this.set("syncOptions", js.undefined)
    @scala.inline
    def setTheme(value: WebTheme | String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
  
}

