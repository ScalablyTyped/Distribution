package typings.expressStatusMonitor.mod

import typings.expressStatusMonitor.anon.Cpu
import typings.socketIo.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressStatusMonitorConfig extends js.Object {
  var chartVisibility: js.UndefOr[Cpu] = js.native
  var healthChecks: js.UndefOr[js.Array[HealthCheck]] = js.native
  var ignoreStartsWith: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var socketPath: js.UndefOr[String] = js.native
   // References a socket.io instance
  var spans: js.UndefOr[js.Array[RetentionSpan]] = js.native
  var theme: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var websocket: js.UndefOr[Server | Null] = js.native
}

object ExpressStatusMonitorConfig {
  @scala.inline
  def apply(): ExpressStatusMonitorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressStatusMonitorConfig]
  }
  @scala.inline
  implicit class ExpressStatusMonitorConfigOps[Self <: ExpressStatusMonitorConfig] (val x: Self) extends AnyVal {
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
    def setChartVisibility(value: Cpu): Self = this.set("chartVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartVisibility: Self = this.set("chartVisibility", js.undefined)
    @scala.inline
    def setHealthChecksVarargs(value: HealthCheck*): Self = this.set("healthChecks", js.Array(value :_*))
    @scala.inline
    def setHealthChecks(value: js.Array[HealthCheck]): Self = this.set("healthChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthChecks: Self = this.set("healthChecks", js.undefined)
    @scala.inline
    def setIgnoreStartsWith(value: String): Self = this.set("ignoreStartsWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreStartsWith: Self = this.set("ignoreStartsWith", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    @scala.inline
    def setSpansVarargs(value: RetentionSpan*): Self = this.set("spans", js.Array(value :_*))
    @scala.inline
    def setSpans(value: js.Array[RetentionSpan]): Self = this.set("spans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpans: Self = this.set("spans", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWebsocket(value: Server): Self = this.set("websocket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsocket: Self = this.set("websocket", js.undefined)
    @scala.inline
    def setWebsocketNull: Self = this.set("websocket", null)
  }
  
}

